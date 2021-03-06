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

package com.averis.inventory.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;
import com.liferay.portal.kernel.model.WorkflowedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the Request service. Represents a row in the &quot;inventory_Request&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.averis.inventory.model.impl.RequestModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.averis.inventory.model.impl.RequestImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Request
 * @generated
 */
@ProviderType
public interface RequestModel
	extends BaseModel<Request>, GroupedModel, ShardedModel, StagedAuditedModel,
			WorkflowedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a request model instance should use the {@link Request} interface instead.
	 */

	/**
	 * Returns the primary key of this request.
	 *
	 * @return the primary key of this request
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this request.
	 *
	 * @param primaryKey the primary key of this request
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this request.
	 *
	 * @return the uuid of this request
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this request.
	 *
	 * @param uuid the uuid of this request
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the request ID of this request.
	 *
	 * @return the request ID of this request
	 */
	public long getRequestId();

	/**
	 * Sets the request ID of this request.
	 *
	 * @param requestId the request ID of this request
	 */
	public void setRequestId(long requestId);

	/**
	 * Returns the group ID of this request.
	 *
	 * @return the group ID of this request
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this request.
	 *
	 * @param groupId the group ID of this request
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this request.
	 *
	 * @return the company ID of this request
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this request.
	 *
	 * @param companyId the company ID of this request
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this request.
	 *
	 * @return the user ID of this request
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this request.
	 *
	 * @param userId the user ID of this request
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this request.
	 *
	 * @return the user uuid of this request
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this request.
	 *
	 * @param userUuid the user uuid of this request
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this request.
	 *
	 * @return the user name of this request
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this request.
	 *
	 * @param userName the user name of this request
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this request.
	 *
	 * @return the create date of this request
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this request.
	 *
	 * @param createDate the create date of this request
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this request.
	 *
	 * @return the modified date of this request
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this request.
	 *
	 * @param modifiedDate the modified date of this request
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the product name of this request.
	 *
	 * @return the product name of this request
	 */
	@AutoEscape
	public String getProductName();

	/**
	 * Sets the product name of this request.
	 *
	 * @param productName the product name of this request
	 */
	public void setProductName(String productName);

	/**
	 * Returns the quantity of this request.
	 *
	 * @return the quantity of this request
	 */
	public int getQuantity();

	/**
	 * Sets the quantity of this request.
	 *
	 * @param quantity the quantity of this request
	 */
	public void setQuantity(int quantity);

	/**
	 * Returns the status of this request.
	 *
	 * @return the status of this request
	 */
	@Override
	public int getStatus();

	/**
	 * Sets the status of this request.
	 *
	 * @param status the status of this request
	 */
	@Override
	public void setStatus(int status);

	/**
	 * Returns the status by user ID of this request.
	 *
	 * @return the status by user ID of this request
	 */
	@Override
	public long getStatusByUserId();

	/**
	 * Sets the status by user ID of this request.
	 *
	 * @param statusByUserId the status by user ID of this request
	 */
	@Override
	public void setStatusByUserId(long statusByUserId);

	/**
	 * Returns the status by user uuid of this request.
	 *
	 * @return the status by user uuid of this request
	 */
	@Override
	public String getStatusByUserUuid();

	/**
	 * Sets the status by user uuid of this request.
	 *
	 * @param statusByUserUuid the status by user uuid of this request
	 */
	@Override
	public void setStatusByUserUuid(String statusByUserUuid);

	/**
	 * Returns the status by user name of this request.
	 *
	 * @return the status by user name of this request
	 */
	@AutoEscape
	@Override
	public String getStatusByUserName();

	/**
	 * Sets the status by user name of this request.
	 *
	 * @param statusByUserName the status by user name of this request
	 */
	@Override
	public void setStatusByUserName(String statusByUserName);

	/**
	 * Returns the status date of this request.
	 *
	 * @return the status date of this request
	 */
	@Override
	public Date getStatusDate();

	/**
	 * Sets the status date of this request.
	 *
	 * @param statusDate the status date of this request
	 */
	@Override
	public void setStatusDate(Date statusDate);

	/**
	 * Returns <code>true</code> if this request is approved.
	 *
	 * @return <code>true</code> if this request is approved; <code>false</code> otherwise
	 */
	@Override
	public boolean isApproved();

	/**
	 * Returns <code>true</code> if this request is denied.
	 *
	 * @return <code>true</code> if this request is denied; <code>false</code> otherwise
	 */
	@Override
	public boolean isDenied();

	/**
	 * Returns <code>true</code> if this request is a draft.
	 *
	 * @return <code>true</code> if this request is a draft; <code>false</code> otherwise
	 */
	@Override
	public boolean isDraft();

	/**
	 * Returns <code>true</code> if this request is expired.
	 *
	 * @return <code>true</code> if this request is expired; <code>false</code> otherwise
	 */
	@Override
	public boolean isExpired();

	/**
	 * Returns <code>true</code> if this request is inactive.
	 *
	 * @return <code>true</code> if this request is inactive; <code>false</code> otherwise
	 */
	@Override
	public boolean isInactive();

	/**
	 * Returns <code>true</code> if this request is incomplete.
	 *
	 * @return <code>true</code> if this request is incomplete; <code>false</code> otherwise
	 */
	@Override
	public boolean isIncomplete();

	/**
	 * Returns <code>true</code> if this request is pending.
	 *
	 * @return <code>true</code> if this request is pending; <code>false</code> otherwise
	 */
	@Override
	public boolean isPending();

	/**
	 * Returns <code>true</code> if this request is scheduled.
	 *
	 * @return <code>true</code> if this request is scheduled; <code>false</code> otherwise
	 */
	@Override
	public boolean isScheduled();

}