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

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for Request. This utility wraps
 * <code>com.averis.inventory.service.impl.RequestLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see RequestLocalService
 * @generated
 */
public class RequestLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.averis.inventory.service.impl.RequestLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

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
	public static com.averis.inventory.model.Request addRequest(
		com.averis.inventory.model.Request request) {

		return getService().addRequest(request);
	}

	public static com.averis.inventory.model.Request addRequest(
		com.liferay.portal.kernel.service.ServiceContext serviceContext,
		String productName, long groupId, long userId, int quantity,
		long companyId, java.util.Date createDate) {

		return getService().addRequest(
			serviceContext, productName, groupId, userId, quantity, companyId,
			createDate);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			createPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new request with the primary key. Does not add the request to the database.
	 *
	 * @param requestId the primary key for the new request
	 * @return the new request
	 */
	public static com.averis.inventory.model.Request createRequest(
		long requestId) {

		return getService().createRequest(requestId);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			deletePersistedModel(
				com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deletePersistedModel(persistedModel);
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
	public static com.averis.inventory.model.Request deleteRequest(
			long requestId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteRequest(requestId);
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
	public static com.averis.inventory.model.Request deleteRequest(
		com.averis.inventory.model.Request request) {

		return getService().deleteRequest(request);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery
		dynamicQuery() {

		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQuery(dynamicQuery);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.averis.inventory.model.Request fetchRequest(
		long requestId) {

		return getService().fetchRequest(requestId);
	}

	/**
	 * Returns the request matching the UUID and group.
	 *
	 * @param uuid the request's UUID
	 * @param groupId the primary key of the group
	 * @return the matching request, or <code>null</code> if a matching request could not be found
	 */
	public static com.averis.inventory.model.Request
		fetchRequestByUuidAndGroupId(String uuid, long groupId) {

		return getService().fetchRequestByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			getPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the request with the primary key.
	 *
	 * @param requestId the primary key of the request
	 * @return the request
	 * @throws PortalException if a request with the primary key could not be found
	 */
	public static com.averis.inventory.model.Request getRequest(long requestId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getRequest(requestId);
	}

	/**
	 * Returns the request matching the UUID and group.
	 *
	 * @param uuid the request's UUID
	 * @param groupId the primary key of the group
	 * @return the matching request
	 * @throws PortalException if a matching request could not be found
	 */
	public static com.averis.inventory.model.Request getRequestByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getRequestByUuidAndGroupId(uuid, groupId);
	}

	public static int getRequestCount(long userId) {
		return getService().getRequestCount(userId);
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
	public static java.util.List<com.averis.inventory.model.Request>
		getRequests(int start, int end) {

		return getService().getRequests(start, end);
	}

	/**
	 * Returns all the requests matching the UUID and company.
	 *
	 * @param uuid the UUID of the requests
	 * @param companyId the primary key of the company
	 * @return the matching requests, or an empty list if no matches were found
	 */
	public static java.util.List<com.averis.inventory.model.Request>
		getRequestsByUuidAndCompanyId(String uuid, long companyId) {

		return getService().getRequestsByUuidAndCompanyId(uuid, companyId);
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
	public static java.util.List<com.averis.inventory.model.Request>
		getRequestsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.averis.inventory.model.Request> orderByComparator) {

		return getService().getRequestsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of requests.
	 *
	 * @return the number of requests
	 */
	public static int getRequestsCount() {
		return getService().getRequestsCount();
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
	public static com.averis.inventory.model.Request updateRequest(
		com.averis.inventory.model.Request request) {

		return getService().updateRequest(request);
	}

	public static com.averis.inventory.model.Request updateStatus(
		long userId, long leaveId, int status,
		com.liferay.portal.kernel.service.ServiceContext serviceContext) {

		return getService().updateStatus(
			userId, leaveId, status, serviceContext);
	}

	public static RequestLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<RequestLocalService, RequestLocalService>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(RequestLocalService.class);

		ServiceTracker<RequestLocalService, RequestLocalService>
			serviceTracker =
				new ServiceTracker<RequestLocalService, RequestLocalService>(
					bundle.getBundleContext(), RequestLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}