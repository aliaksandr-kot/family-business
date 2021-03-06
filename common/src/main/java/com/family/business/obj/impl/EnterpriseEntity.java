package com.family.business.obj.impl;

import com.family.business.obj.Enterprise;
import com.family.business.obj.Owner;

import javax.persistence.*;

@Entity
@Table(name = "ENTERPRISE")
public class EnterpriseEntity extends BaseEntity implements Enterprise
{
    private String name;
    private String address;
    private String phone;
    private Owner owner;

    @Override
    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    @Column(name = "ADDRESS")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    @Column(name = "PHONE")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    @ManyToOne(fetch = FetchType.LAZY, targetEntity = OwnerEntity.class)
    @JoinColumn(name = "FK_OWNER_ID")
    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}
