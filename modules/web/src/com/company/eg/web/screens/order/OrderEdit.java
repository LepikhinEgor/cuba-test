package com.company.eg.web.screens.order;

import com.haulmont.cuba.gui.screen.*;
import com.company.eg.entity.Order;

@UiController("eg_Order.edit")
@UiDescriptor("order-edit.xml")
@EditedEntityContainer("orderDc")
@LoadDataBeforeShow
public class OrderEdit extends StandardEditor<Order> {
}