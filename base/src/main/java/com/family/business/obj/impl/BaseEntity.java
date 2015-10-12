package com.family.business.obj.impl;


import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import com.family.business.obj.Base;


@MappedSuperclass
public abstract class BaseEntity implements Base
{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ID", unique = true, nullable = false)
    private Long identity;

    @Override
    public Long getIdentity()
    {
        return identity;
    }
}
