package com.family.business.service.impl;

import com.family.business.model.PersonModel;
import com.family.business.obj.Person;
import com.family.business.repositories.PersonRepository;
import com.family.business.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService
{
    @Autowired
    PersonRepository personRepository;

    @Override
    public Person create()
    {
        return new PersonModel();
    }

    public Person save(Person person)
    {
        return new PersonModel(personRepository.save(person));
    }

    @Override
    public void deleteById(Long id) {
        try
        {
            personRepository.delete(id);
        } catch (EmptyResultDataAccessException e) {


        }
    }
}
