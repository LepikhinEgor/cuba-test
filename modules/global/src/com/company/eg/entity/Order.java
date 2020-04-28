package com.company.eg.entity;

import com.esotericsoftware.kryo.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;

@Table(name = "EG_ORDER")
@Entity(name = "eg_Order")
public class Order extends StandardEntity {
    private static final long serialVersionUID = 7428635773339092483L;

    @ManyToOne
    @JoinColumn(name = "CUSTOMER_ID")
    private Customer customer;

    @NotNull
    @Column(name = "DATE")
    private Date date;

    @Column(name = "AMOUNT")
    private BigDecimal amount;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}