package com.family.business.model;


import com.family.business.obj.Person;

import java.util.Date;

public class PersonModel extends BaseModel implements Person
{

    public PersonModel() {

    }

    public PersonModel(Person save) {

    }

    public void setName(String name)

    {

    }

    @Override
    public String getFirstName() {
        return null;
    }

    @Override
    public String getMiddleName() {
        return null;
    }

    @Override
    public String getLastName() {
        return null;
    }

    @Override
    public Date getBirthDay() {
        return null;
    }

    @Override
    public String getPassportShort() {
        return null;
    }

    @Override
    public String getPassportLong() {
        return null;
    }

    @Override
    public String getAddress() {
        return null;
    }

    @Override
    public String getPhone() {
        return null;
    }

    @Override
    public String getPhoto() {
        return null;
    }
}
