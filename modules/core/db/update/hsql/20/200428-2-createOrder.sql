alter table EG_ORDER add constraint FK_EG_ORDER_ON_CUSTOMER foreign key (CUSTOMER_ID) references EG_CUSTOMER(ID);
create index IDX_EG_ORDER_ON_CUSTOMER on EG_ORDER (CUSTOMER_ID);
