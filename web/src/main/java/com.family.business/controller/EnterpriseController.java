package com.family.business.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.family.business.obj.Enterprise;

@RestController
@RequestMapping("enterprises")
public class EnterpriseController
{
    @Autowired
    EnterpriseController enterpriseController;

    @RequestMapping(method=RequestMethod.GET)
    public void findEnterprise(Long id)
    {

    }

    @RequestMapping(method= RequestMethod.POST)
    public void addEnterprise(@RequestBody Enterprise enterprise)
    {

    }

    @RequestMapping(method= RequestMethod.PUT)
    public void updateEnterprise(@RequestBody Enterprise enterprise)
    {

    }

    @RequestMapping(method=RequestMethod.DELETE)
    public void deleteEnterprise(Long id)
    {

    }
}
