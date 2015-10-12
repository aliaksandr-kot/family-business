package com.family.business.obj.impl;

import com.family.business.obj.EmployerWork;
import com.family.business.obj.Person;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

@Entity
@Table(name = "PERSON")
public class PersonEntity extends BaseEntity implements Person
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

    @Override
    @Column(name = "FIRST_NAME")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    @Column(name = "MIDDLE_NAME")
    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    @Override
    @Column(name = "LAST_NAME")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    @Column(name = "BIRTH_DAY")
    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    @Override
    @Column(name = "PASSPORT_SHORT")
    public String getPassportShort() {
        return passportShort;
    }

    public void setPassportShort(String passportShort) {
        this.passportShort = passportShort;
    }

    @Override
    @Column(name = "PASSPORT_LONG")
    public String getPassportLong() {
        return passportLong;
    }

    public void setPassportLong(String passportLong) {
        this.passportLong = passportLong;
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
    @Column(name = "PHOTO")
    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    @OneToMany(mappedBy = EmployerWorkEntity.LINK_PERSON, cascade = {CascadeType.ALL}, orphanRemoval = true)
    public Collection<EmployerWork> getEmployerWorks()
    {
        if(employerWorks == null)
        {
            employerWorks = new ArrayList<>();
        }
        return employerWorks;
    }

    public void setEmployerWorks(Collection<EmployerWork> employerWorks) {
        this.employerWorks = employerWorks;
    }
}
