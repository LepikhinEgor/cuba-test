package com.company.eg.entity;

import com.esotericsoftware.kryo.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "EG_CUSTOMER")
@Entity(name = "eg_Customer")
public class Customer extends StandardEntity {
    private static final long serialVersionUID = 7694091935388474259L;

    @NotNull
    @Column(name = "NAME", length = 100, nullable = false)
    private String name;

    @Column(name = "email", length = 50)
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}