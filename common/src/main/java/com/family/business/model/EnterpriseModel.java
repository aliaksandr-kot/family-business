package com.family.business.model;

import com.family.business.obj.Enterprise;
import com.family.business.obj.Owner;

public class EnterpriseModel extends BaseModel implements Enterprise
{
    private String name;
    private String address;
    private String phone;
    private Owner owner;

    public EnterpriseModel()
    {
        super();
    }
    public EnterpriseModel(Enterprise enterprise)
    {
        super(enterprise);
        setName(enterprise.getName());
        setAddress(enterprise.getAddress());
        setPhone(enterprise.getPhone());
        if(enterprise.getOwner() != null)
        {
            setOwner(new OwnerModel(enterprise.getOwner()));
        }
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}
