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

package com.averis.inventory.model.impl;

import com.averis.inventory.model.Request;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Request in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class RequestCacheModel implements CacheModel<Request>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof RequestCacheModel)) {
			return false;
		}

		RequestCacheModel requestCacheModel = (RequestCacheModel)object;

		if (requestId == requestCacheModel.requestId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, requestId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", requestId=");
		sb.append(requestId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", productName=");
		sb.append(productName);
		sb.append(", quantity=");
		sb.append(quantity);
		sb.append(", status=");
		sb.append(status);
		sb.append(", statusByUserId=");
		sb.append(statusByUserId);
		sb.append(", statusByUserName=");
		sb.append(statusByUserName);
		sb.append(", statusDate=");
		sb.append(statusDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Request toEntityModel() {
		RequestImpl requestImpl = new RequestImpl();

		if (uuid == null) {
			requestImpl.setUuid("");
		}
		else {
			requestImpl.setUuid(uuid);
		}

		requestImpl.setRequestId(requestId);
		requestImpl.setGroupId(groupId);
		requestImpl.setCompanyId(companyId);
		requestImpl.setUserId(userId);

		if (userName == null) {
			requestImpl.setUserName("");
		}
		else {
			requestImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			requestImpl.setCreateDate(null);
		}
		else {
			requestImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			requestImpl.setModifiedDate(null);
		}
		else {
			requestImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (productName == null) {
			requestImpl.setProductName("");
		}
		else {
			requestImpl.setProductName(productName);
		}

		requestImpl.setQuantity(quantity);
		requestImpl.setStatus(status);
		requestImpl.setStatusByUserId(statusByUserId);

		if (statusByUserName == null) {
			requestImpl.setStatusByUserName("");
		}
		else {
			requestImpl.setStatusByUserName(statusByUserName);
		}

		if (statusDate == Long.MIN_VALUE) {
			requestImpl.setStatusDate(null);
		}
		else {
			requestImpl.setStatusDate(new Date(statusDate));
		}

		requestImpl.resetOriginalValues();

		return requestImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		requestId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		productName = objectInput.readUTF();

		quantity = objectInput.readInt();

		status = objectInput.readInt();

		statusByUserId = objectInput.readLong();
		statusByUserName = objectInput.readUTF();
		statusDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(requestId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (productName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(productName);
		}

		objectOutput.writeInt(quantity);

		objectOutput.writeInt(status);

		objectOutput.writeLong(statusByUserId);

		if (statusByUserName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(statusByUserName);
		}

		objectOutput.writeLong(statusDate);
	}

	public String uuid;
	public long requestId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String productName;
	public int quantity;
	public int status;
	public long statusByUserId;
	public String statusByUserName;
	public long statusDate;

}