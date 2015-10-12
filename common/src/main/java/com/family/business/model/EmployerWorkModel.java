package com.family.business.model;

import com.family.business.obj.EmployerWork;
import com.family.business.obj.Enterprise;
import com.family.business.obj.Person;

import java.util.Date;

public class EmployerWorkModel extends BaseModel implements EmployerWork
{
    public EmployerWorkModel()
    {
        super();
    }

    public EmployerWorkModel(EmployerWork employerWork)
    {
        super(employerWork);
    }

    @Override
    public Enterprise getEnterprise() {
        return null;
    }

    @Override
    public Person getPerson() {
        return null;
    }

    @Override
    public Date getWorkDate() {
        return null;
    }
}
