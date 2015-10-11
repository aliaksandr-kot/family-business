package com.family.business.obj.impl;


import com.family.business.obj.Base;

import javax.persistence.*;

@MappedSuperclass
public abstract class BaseEntity implements Base
{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ID", nullable = false)
    private Long identity;

    @Override
    public Long getIdentity()
    {
        return identity;
    }
}
