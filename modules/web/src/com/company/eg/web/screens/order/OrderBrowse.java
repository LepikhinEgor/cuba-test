package com.company.eg.web.screens.order;

import com.haulmont.cuba.gui.screen.*;
import com.company.eg.entity.Order;

@UiController("eg_Order.browse")
@UiDescriptor("order-browse.xml")
@LookupComponent("ordersTable")
@LoadDataBeforeShow
public class OrderBrowse extends StandardLookup<Order> {
}