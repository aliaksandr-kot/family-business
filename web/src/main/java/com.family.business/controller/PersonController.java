package com.family.business.controller;

import com.family.business.exception.NotFoundException;
import com.family.business.obj.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.family.business.service.PersonService;

import java.util.Optional;

@RestController
@RequestMapping("persons")
public class PersonController
{
    @Autowired
    PersonService personService;

    @RequestMapping
    public Person findEnterprise(Long id)
    {
        Person person = personService.findById(id);
        if(person != null)
        {
            return person;
        }
        else
        {
            throw new NotFoundException();
        }
    }

    @RequestMapping(method= RequestMethod.DELETE)
    public void deletePerson(Long id)
    {
        personService.deleteById(id);
    }

}
