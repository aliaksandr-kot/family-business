package com.family.business.model;

import com.family.business.obj.Base;

public class BaseModel implements Base
{
    private Long identity;

    public BaseModel()
    {

    }

    public BaseModel(Base base)
    {
        setIdentity(base.getIdentity());
    }

    @Override
    public Long getIdentity()
    {
        return identity;
    }


    public void setIdentity(Long identity)
    {
        if (identity == null || identity <= 0l)
        {
            this.identity = null;
        }
        else
        {
            this.identity = identity;
        }
    }
}
