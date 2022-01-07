/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.averis.inventory.service.impl;

import com.averis.inventory.model.Request;
import com.averis.inventory.service.base.RequestLocalServiceBaseImpl;
import com.liferay.asset.kernel.model.AssetEntry;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.search.Indexer;
import com.liferay.portal.kernel.search.IndexerRegistryUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.ContentTypes;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.kernel.workflow.WorkflowHandlerRegistryUtil;

import java.util.Date;

import org.osgi.service.component.annotations.Component;

/**
 * The implementation of the request local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * <code>com.averis.inventory.service.RequestLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RequestLocalServiceBaseImpl
 */
@Component(property = "model.class.name=com.averis.inventory.model.Request", service = AopService.class)
public class RequestLocalServiceImpl extends RequestLocalServiceBaseImpl {
	Log logger = LogFactoryUtil.getLog(getClass());

	@Override
	public Request addRequest(ServiceContext serviceContext, String productName, long groupId, long userId,
			int quantity, long companyId, Date createDate) {
		long requestId = counterLocalService.increment();

		Request request = requestLocalService.createRequest(requestId);
		try {
			User user = userLocalService.getUser(userId);
			request.setUserId(userId);
			request.setGroupId(groupId);
			request.setCreateDate(createDate);
			request.setCompanyId(companyId);
			request.setProductName(productName);
			request.setQuantity(quantity);

			request.setStatus(WorkflowConstants.STATUS_DRAFT);
			request.setStatusByUserId(user.getUserId());
			request.setStatusDate(new Date());
			request.setStatusByUserName(user.getFullName());
			request.setStatusByUserUuid(user.getUserUuid());
			request = requestLocalService.addRequest(request);

			AssetEntry assetEntry = assetEntryLocalService.updateEntry(user.getUserId(),
					serviceContext.getScopeGroupId(), new Date(), new Date(), Request.class.getName(),
					request.getRequestId(), request.getUuid(), 0, null, null, true, false, new Date(), null, new Date(),
					null, ContentTypes.TEXT_HTML, request.getProductName(), request.getProductName(), null, null, null,
					0, 0, null);
			Indexer<Request> indexer = IndexerRegistryUtil.nullSafeGetIndexer(Request.class);
			indexer.reindex(request);
			System.out.println("add request");
			WorkflowHandlerRegistryUtil.startWorkflowInstance(request.getCompanyId(), request.getGroupId(),
					request.getUserId(), Request.class.getName(), request.getPrimaryKey(), request, serviceContext);
		} catch (PortalException e) {
			e.printStackTrace();
		}

		return request;
	}

	public Request updateStatus(long userId, long requestId, int status, ServiceContext serviceContext) {

		logger.info("requestId" + requestId);

		Request request = requestPersistence.fetchByPrimaryKey(requestId);
		logger.info("request" + request);
		request.setStatus(status);
		request.setStatusByUserId(userId);
		request.setStatusDate(new Date());
		User user = null;
		try {
			user = userLocalService.getUser(userId);
			request.setStatusByUserName(user.getFullName());
			request.setStatusByUserUuid(user.getUserUuid());
		} catch (PortalException e) {
			logger.info("dsd" + e.getMessage());
		}

		try {
			logger.info("dsd");
			request = requestPersistence.update(request);
			if (status == WorkflowConstants.STATUS_APPROVED) {
				// update the asset status to visibile
				assetEntryLocalService.updateEntry(Request.class.getName(), requestId, new Date(), null, true, true);
			} else {
				// set request entity status to false
				assetEntryLocalService.updateVisible(Request.class.getName(), requestId, false);
			}
		} catch (Exception e) {
			logger.info("sfs" + e.getMessage());
		}
		return request;
	}

	@Override
	public int getRequestCount(long userId) {
		return requestPersistence.countByuserId(userId);
	}

}