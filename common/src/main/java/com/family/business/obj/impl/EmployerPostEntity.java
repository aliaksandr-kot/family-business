package com.family.business.obj.impl;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.family.business.obj.EmployerPost;
import com.family.business.obj.Enterprise;
import com.family.business.obj.Person;

@Entity
@Table(name = "EMPLOYER_POST")
public class EmployerPostEntity extends BaseEntity implements EmployerPost
{
	private Enterprise enterprise;
	private Person person;
	private Date startWorkDate;
	private Date endWorkDate;
	private String post;

	@Override
	@ManyToOne(fetch = FetchType.LAZY, targetEntity = EnterpriseEntity.class)
	@JoinColumn(name = "FK_ENTERPRISE_ID")
	public Enterprise getEnterprise()
	{
		return enterprise;
	}

	public void setEnterprise(Enterprise enterprise)
	{
		this.enterprise = enterprise;
	}

	@Override
	@ManyToOne(fetch = FetchType.LAZY, targetEntity = PersonEntity.class)
	@JoinColumn(name = "FK_PERSON_ID")
	public Person getPerson()
	{
		return person;
	}

	public void setPerson(Person person)
	{
		this.person = person;
	}

	@Override
	@Column(name = "START_WORK_DATE")
	public Date getStartWorkDate()
	{
		return startWorkDate;
	}

	public void setStartWorkDate(Date startWorkDate)
	{
		this.startWorkDate = startWorkDate;
	}

	@Override
	@Column(name = "END_WORK_DATE")
	public Date getEndWorkDate()
	{
		return endWorkDate;
	}

	public void setEndWorkDate(Date endWorkDate)
	{
		this.endWorkDate = endWorkDate;
	}

	@Override
	@Column(name = "POST")
	public String getPost()
	{
		return post;
	}

	public void setPost(String post)
	{
		this.post = post;
	}
}
