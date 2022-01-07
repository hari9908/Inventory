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

package com.averis.inventory.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link RequestLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see RequestLocalService
 * @generated
 */
public class RequestLocalServiceWrapper
	implements RequestLocalService, ServiceWrapper<RequestLocalService> {

	public RequestLocalServiceWrapper(RequestLocalService requestLocalService) {
		_requestLocalService = requestLocalService;
	}

	/**
	 * Adds the request to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RequestLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param request the request
	 * @return the request that was added
	 */
	@Override
	public com.averis.inventory.model.Request addRequest(
		com.averis.inventory.model.Request request) {

		return _requestLocalService.addRequest(request);
	}

	@Override
	public com.averis.inventory.model.Request addRequest(
		com.liferay.portal.kernel.service.ServiceContext serviceContext,
		String productName, long groupId, long userId, int quantity,
		long companyId, java.util.Date createDate) {

		return _requestLocalService.addRequest(
			serviceContext, productName, groupId, userId, quantity, companyId,
			createDate);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _requestLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new request with the primary key. Does not add the request to the database.
	 *
	 * @param requestId the primary key for the new request
	 * @return the new request
	 */
	@Override
	public com.averis.inventory.model.Request createRequest(long requestId) {
		return _requestLocalService.createRequest(requestId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _requestLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the request with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RequestLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param requestId the primary key of the request
	 * @return the request that was removed
	 * @throws PortalException if a request with the primary key could not be found
	 */
	@Override
	public com.averis.inventory.model.Request deleteRequest(long requestId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _requestLocalService.deleteRequest(requestId);
	}

	/**
	 * Deletes the request from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RequestLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param request the request
	 * @return the request that was removed
	 */
	@Override
	public com.averis.inventory.model.Request deleteRequest(
		com.averis.inventory.model.Request request) {

		return _requestLocalService.deleteRequest(request);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _requestLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _requestLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.averis.inventory.model.impl.RequestModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _requestLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.averis.inventory.model.impl.RequestModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _requestLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _requestLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _requestLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.averis.inventory.model.Request fetchRequest(long requestId) {
		return _requestLocalService.fetchRequest(requestId);
	}

	/**
	 * Returns the request matching the UUID and group.
	 *
	 * @param uuid the request's UUID
	 * @param groupId the primary key of the group
	 * @return the matching request, or <code>null</code> if a matching request could not be found
	 */
	@Override
	public com.averis.inventory.model.Request fetchRequestByUuidAndGroupId(
		String uuid, long groupId) {

		return _requestLocalService.fetchRequestByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _requestLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _requestLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _requestLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _requestLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _requestLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the request with the primary key.
	 *
	 * @param requestId the primary key of the request
	 * @return the request
	 * @throws PortalException if a request with the primary key could not be found
	 */
	@Override
	public com.averis.inventory.model.Request getRequest(long requestId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _requestLocalService.getRequest(requestId);
	}

	/**
	 * Returns the request matching the UUID and group.
	 *
	 * @param uuid the request's UUID
	 * @param groupId the primary key of the group
	 * @return the matching request
	 * @throws PortalException if a matching request could not be found
	 */
	@Override
	public com.averis.inventory.model.Request getRequestByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _requestLocalService.getRequestByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public int getRequestCount(long userId) {
		return _requestLocalService.getRequestCount(userId);
	}

	/**
	 * Returns a range of all the requests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.averis.inventory.model.impl.RequestModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of requests
	 * @param end the upper bound of the range of requests (not inclusive)
	 * @return the range of requests
	 */
	@Override
	public java.util.List<com.averis.inventory.model.Request> getRequests(
		int start, int end) {

		return _requestLocalService.getRequests(start, end);
	}

	/**
	 * Returns all the requests matching the UUID and company.
	 *
	 * @param uuid the UUID of the requests
	 * @param companyId the primary key of the company
	 * @return the matching requests, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.averis.inventory.model.Request>
		getRequestsByUuidAndCompanyId(String uuid, long companyId) {

		return _requestLocalService.getRequestsByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of requests matching the UUID and company.
	 *
	 * @param uuid the UUID of the requests
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of requests
	 * @param end the upper bound of the range of requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching requests, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.averis.inventory.model.Request>
		getRequestsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.averis.inventory.model.Request> orderByComparator) {

		return _requestLocalService.getRequestsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of requests.
	 *
	 * @return the number of requests
	 */
	@Override
	public int getRequestsCount() {
		return _requestLocalService.getRequestsCount();
	}

	/**
	 * Updates the request in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RequestLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param request the request
	 * @return the request that was updated
	 */
	@Override
	public com.averis.inventory.model.Request updateRequest(
		com.averis.inventory.model.Request request) {

		return _requestLocalService.updateRequest(request);
	}

	@Override
	public com.averis.inventory.model.Request updateStatus(
		long userId, long leaveId, int status,
		com.liferay.portal.kernel.service.ServiceContext serviceContext) {

		return _requestLocalService.updateStatus(
			userId, leaveId, status, serviceContext);
	}

	@Override
	public RequestLocalService getWrappedService() {
		return _requestLocalService;
	}

	@Override
	public void setWrappedService(RequestLocalService requestLocalService) {
		_requestLocalService = requestLocalService;
	}

	private RequestLocalService _requestLocalService;

}