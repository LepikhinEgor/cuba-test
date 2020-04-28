-- begin EG_ORDER
create table EG_ORDER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CUSTOMER_ID varchar(36),
    DATE date,
    AMOUNT decimal(19, 2),
    --
    primary key (ID)
)^
-- end EG_ORDER
-- begin EG_CUSTOMER
create table EG_CUSTOMER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(100) not null,
    email varchar(50),
    --
    primary key (ID)
)^
-- end EG_CUSTOMER
