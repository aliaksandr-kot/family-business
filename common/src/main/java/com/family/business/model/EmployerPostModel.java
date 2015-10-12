package com.family.business.model;

import com.family.business.obj.Base;
import com.family.business.obj.EmployerPost;
import com.family.business.obj.Enterprise;
import com.family.business.obj.Person;

import java.util.Date;

public class EmployerPostModel extends BaseModel implements EmployerPost
{
    private Enterprise enterprise;
    private Person person;
    private Date startWorkDate;
    private Date endWorkDate;
    private String post;

    public EmployerPostModel()
    {

    }

    public EmployerPostModel(EmployerPost employerPost)
    {
        super(employerPost);
        setPost(employerPost.getPost());
        setStartWorkDate(employerPost.getStartWorkDate());
        setEndWorkDate(employerPost.getEndWorkDate());
        if(employerPost.getPerson() != null)
        {
            setPerson(new PersonModel(employerPost.getPerson()));
        }
        if(employerPost.getEnterprise() != null)
        {
            setEnterprise(new EnterpriseModel(employerPost.getEnterprise()));
        }
    }

    @Override
    public Enterprise getEnterprise()
    {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    @Override
    public Person getPerson()
    {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public Date getStartWorkDate() {
        return startWorkDate;
    }

    public void setStartWorkDate(Date startWorkDate) {
        this.startWorkDate = startWorkDate;
    }

    @Override
    public Date getEndWorkDate() {
        return endWorkDate;
    }

    public void setEndWorkDate(Date endWorkDate) {
        this.endWorkDate = endWorkDate;
    }

    @Override
    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }
}
