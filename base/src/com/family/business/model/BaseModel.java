package com.family.business.model;

import com.family.business.obj.Base;

public class BaseModel implements Base
{
    private Long identity;

    @Override
    public Long getIdentity()
    {
        return identity;
    }

    public BaseModel(Base base)
    {
        this.identity = base.getIdentity();
    }
}
