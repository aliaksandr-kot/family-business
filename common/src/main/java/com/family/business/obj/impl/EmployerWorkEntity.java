package com.family.business.obj.impl;

import com.family.business.obj.EmployerWork;
import com.family.business.obj.Enterprise;
import com.family.business.obj.Person;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "EMPLOYER_WORK")
public class EmployerWorkEntity extends BaseEntity implements EmployerWork
{
    public static final String LINK_PERSON = "person";
    private Enterprise enterprise;
    private Person person;
    private Date workDate;

    @Override
    @ManyToOne(fetch = FetchType.LAZY, targetEntity = EnterpriseEntity.class)
    @JoinColumn(name = "FK_ENTERPRISE_ID")
    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    @Override
    @ManyToOne(fetch = FetchType.LAZY, targetEntity = PersonEntity.class)
    @JoinColumn(name = "FK_PERSON_ID")
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    @Column(name = "WORK_DATE")
    public Date getWorkDate() {
        return workDate;
    }

    public void setWorkDate(Date workDate) {
        this.workDate = workDate;
    }
}
