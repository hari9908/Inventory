create index IX_A5BEA58C on inventory_Request (userId);
create index IX_AA40D0C6 on inventory_Request (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_6532D0C8 on inventory_Request (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_BAFA65AC on inventory_request (userId);
create index IX_D462E8E6 on inventory_request (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_EB3C70E8 on inventory_request (uuid_[$COLUMN_LENGTH:75$], groupId);