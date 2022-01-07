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

package com.averis.inventory.service.persistence;

import com.averis.inventory.exception.NoSuchRequestException;
import com.averis.inventory.model.Request;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the request service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RequestUtil
 * @generated
 */
@ProviderType
public interface RequestPersistence extends BasePersistence<Request> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link RequestUtil} to access the request persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the requests where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching requests
	 */
	public java.util.List<Request> findByUuid(String uuid);

	/**
	 * Returns a range of all the requests where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RequestModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of requests
	 * @param end the upper bound of the range of requests (not inclusive)
	 * @return the range of matching requests
	 */
	public java.util.List<Request> findByUuid(String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the requests where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RequestModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of requests
	 * @param end the upper bound of the range of requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching requests
	 */
	public java.util.List<Request> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Request>
			orderByComparator);

	/**
	 * Returns an ordered range of all the requests where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RequestModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of requests
	 * @param end the upper bound of the range of requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching requests
	 */
	public java.util.List<Request> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Request>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first request in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching request
	 * @throws NoSuchRequestException if a matching request could not be found
	 */
	public Request findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Request>
				orderByComparator)
		throws NoSuchRequestException;

	/**
	 * Returns the first request in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching request, or <code>null</code> if a matching request could not be found
	 */
	public Request fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Request>
			orderByComparator);

	/**
	 * Returns the last request in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching request
	 * @throws NoSuchRequestException if a matching request could not be found
	 */
	public Request findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Request>
				orderByComparator)
		throws NoSuchRequestException;

	/**
	 * Returns the last request in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching request, or <code>null</code> if a matching request could not be found
	 */
	public Request fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Request>
			orderByComparator);

	/**
	 * Returns the requests before and after the current request in the ordered set where uuid = &#63;.
	 *
	 * @param requestId the primary key of the current request
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next request
	 * @throws NoSuchRequestException if a request with the primary key could not be found
	 */
	public Request[] findByUuid_PrevAndNext(
			long requestId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Request>
				orderByComparator)
		throws NoSuchRequestException;

	/**
	 * Removes all the requests where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of requests where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching requests
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the request where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchRequestException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching request
	 * @throws NoSuchRequestException if a matching request could not be found
	 */
	public Request findByUUID_G(String uuid, long groupId)
		throws NoSuchRequestException;

	/**
	 * Returns the request where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching request, or <code>null</code> if a matching request could not be found
	 */
	public Request fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the request where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching request, or <code>null</code> if a matching request could not be found
	 */
	public Request fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the request where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the request that was removed
	 */
	public Request removeByUUID_G(String uuid, long groupId)
		throws NoSuchRequestException;

	/**
	 * Returns the number of requests where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching requests
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the requests where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching requests
	 */
	public java.util.List<Request> findByUuid_C(String uuid, long companyId);

	/**
	 * Returns a range of all the requests where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RequestModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of requests
	 * @param end the upper bound of the range of requests (not inclusive)
	 * @return the range of matching requests
	 */
	public java.util.List<Request> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the requests where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RequestModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of requests
	 * @param end the upper bound of the range of requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching requests
	 */
	public java.util.List<Request> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Request>
			orderByComparator);

	/**
	 * Returns an ordered range of all the requests where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RequestModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of requests
	 * @param end the upper bound of the range of requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching requests
	 */
	public java.util.List<Request> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Request>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first request in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching request
	 * @throws NoSuchRequestException if a matching request could not be found
	 */
	public Request findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Request>
				orderByComparator)
		throws NoSuchRequestException;

	/**
	 * Returns the first request in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching request, or <code>null</code> if a matching request could not be found
	 */
	public Request fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Request>
			orderByComparator);

	/**
	 * Returns the last request in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching request
	 * @throws NoSuchRequestException if a matching request could not be found
	 */
	public Request findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Request>
				orderByComparator)
		throws NoSuchRequestException;

	/**
	 * Returns the last request in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching request, or <code>null</code> if a matching request could not be found
	 */
	public Request fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Request>
			orderByComparator);

	/**
	 * Returns the requests before and after the current request in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param requestId the primary key of the current request
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next request
	 * @throws NoSuchRequestException if a request with the primary key could not be found
	 */
	public Request[] findByUuid_C_PrevAndNext(
			long requestId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Request>
				orderByComparator)
		throws NoSuchRequestException;

	/**
	 * Removes all the requests where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of requests where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching requests
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the requests where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching requests
	 */
	public java.util.List<Request> findByuserId(long userId);

	/**
	 * Returns a range of all the requests where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RequestModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of requests
	 * @param end the upper bound of the range of requests (not inclusive)
	 * @return the range of matching requests
	 */
	public java.util.List<Request> findByuserId(
		long userId, int start, int end);

	/**
	 * Returns an ordered range of all the requests where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RequestModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of requests
	 * @param end the upper bound of the range of requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching requests
	 */
	public java.util.List<Request> findByuserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Request>
			orderByComparator);

	/**
	 * Returns an ordered range of all the requests where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RequestModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of requests
	 * @param end the upper bound of the range of requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching requests
	 */
	public java.util.List<Request> findByuserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Request>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first request in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching request
	 * @throws NoSuchRequestException if a matching request could not be found
	 */
	public Request findByuserId_First(
			long userId,
			com.liferay.portal.kernel.util.OrderByComparator<Request>
				orderByComparator)
		throws NoSuchRequestException;

	/**
	 * Returns the first request in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching request, or <code>null</code> if a matching request could not be found
	 */
	public Request fetchByuserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Request>
			orderByComparator);

	/**
	 * Returns the last request in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching request
	 * @throws NoSuchRequestException if a matching request could not be found
	 */
	public Request findByuserId_Last(
			long userId,
			com.liferay.portal.kernel.util.OrderByComparator<Request>
				orderByComparator)
		throws NoSuchRequestException;

	/**
	 * Returns the last request in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching request, or <code>null</code> if a matching request could not be found
	 */
	public Request fetchByuserId_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Request>
			orderByComparator);

	/**
	 * Returns the requests before and after the current request in the ordered set where userId = &#63;.
	 *
	 * @param requestId the primary key of the current request
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next request
	 * @throws NoSuchRequestException if a request with the primary key could not be found
	 */
	public Request[] findByuserId_PrevAndNext(
			long requestId, long userId,
			com.liferay.portal.kernel.util.OrderByComparator<Request>
				orderByComparator)
		throws NoSuchRequestException;

	/**
	 * Removes all the requests where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 */
	public void removeByuserId(long userId);

	/**
	 * Returns the number of requests where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching requests
	 */
	public int countByuserId(long userId);

	/**
	 * Caches the request in the entity cache if it is enabled.
	 *
	 * @param request the request
	 */
	public void cacheResult(Request request);

	/**
	 * Caches the requests in the entity cache if it is enabled.
	 *
	 * @param requests the requests
	 */
	public void cacheResult(java.util.List<Request> requests);

	/**
	 * Creates a new request with the primary key. Does not add the request to the database.
	 *
	 * @param requestId the primary key for the new request
	 * @return the new request
	 */
	public Request create(long requestId);

	/**
	 * Removes the request with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param requestId the primary key of the request
	 * @return the request that was removed
	 * @throws NoSuchRequestException if a request with the primary key could not be found
	 */
	public Request remove(long requestId) throws NoSuchRequestException;

	public Request updateImpl(Request request);

	/**
	 * Returns the request with the primary key or throws a <code>NoSuchRequestException</code> if it could not be found.
	 *
	 * @param requestId the primary key of the request
	 * @return the request
	 * @throws NoSuchRequestException if a request with the primary key could not be found
	 */
	public Request findByPrimaryKey(long requestId)
		throws NoSuchRequestException;

	/**
	 * Returns the request with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param requestId the primary key of the request
	 * @return the request, or <code>null</code> if a request with the primary key could not be found
	 */
	public Request fetchByPrimaryKey(long requestId);

	/**
	 * Returns all the requests.
	 *
	 * @return the requests
	 */
	public java.util.List<Request> findAll();

	/**
	 * Returns a range of all the requests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RequestModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of requests
	 * @param end the upper bound of the range of requests (not inclusive)
	 * @return the range of requests
	 */
	public java.util.List<Request> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the requests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RequestModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of requests
	 * @param end the upper bound of the range of requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of requests
	 */
	public java.util.List<Request> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Request>
			orderByComparator);

	/**
	 * Returns an ordered range of all the requests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RequestModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of requests
	 * @param end the upper bound of the range of requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of requests
	 */
	public java.util.List<Request> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Request>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the requests from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of requests.
	 *
	 * @return the number of requests
	 */
	public int countAll();

}