create table inventory_Request (
	uuid_ VARCHAR(75) null,
	requestId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	productName VARCHAR(75) null,
	quantity INTEGER,
	status INTEGER,
	statusByUserId LONG,
	statusByUserName VARCHAR(75) null,
	statusDate DATE null
);

create table inventory_request (
	uuid_ VARCHAR(75) null,
	requestId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	productName VARCHAR(75) null,
	quantity INTEGER
);