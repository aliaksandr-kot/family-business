package com.family.business.model;


import com.family.business.obj.EmployerWork;
import com.family.business.obj.Person;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class PersonModel extends BaseModel implements Person
{
    private String firstName;
    private String middleName;
    private String lastName;
    private Date birthDay;
    private String passportShort;
    private String passportLong;
    private String address;
    private String phone;
    private String photo;
    private Collection<EmployerWork> employerWorks;

    public PersonModel()
    {
        super();
    }

    public PersonModel(Person person)
    {
        super(person);
        setFirstName(person.getFirstName());
        setMiddleName(person.getMiddleName());
        setLastName(person.getLastName());
        setAddress(person.getAddress());
        setBirthDay(person.getBirthDay());
        setPassportShort(person.getPassportShort());
        setPassportLong(person.getPassportLong());
        setPhone(person.getPhone());
        setPhoto(person.getPhoto());
        for (EmployerWork employerWork : person.getEmployerWorks())
        {
            getEmployerWorks().add(new EmployerWorkModel(employerWork));
        }
    }

    @Override
    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    @Override
    public String getMiddleName()
    {
        return middleName;
    }

    public void setMiddleName(String middleName)
    {
        this.middleName = middleName;
    }

    @Override
    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    @Override
    public Date getBirthDay()
    {
        return birthDay;
    }

    public void setBirthDay(Date birthDay)
    {
        this.birthDay = birthDay;
    }

    @Override
    public String getPassportShort()
    {
        return passportShort;
    }

    public void setPassportShort(String passportShort)
    {
        this.passportShort = passportShort;
    }

    @Override
    public String getPassportLong()
    {
        return passportLong;
    }

    public void setPassportLong(String passportLong)
    {
        this.passportLong = passportLong;
    }

    @Override
    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    @Override
    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    @Override
    public String getPhoto()
    {
        return photo;
    }

    public void setPhoto(String photo)
    {
        this.photo = photo;
    }

    @Override
    public Collection<EmployerWork> getEmployerWorks()
    {
        if(employerWorks == null)
        {
            employerWorks = new ArrayList<>();
        }
        return employerWorks;
    }
}
