package com.family.business.service;

import com.family.business.obj.Person;

public interface PersonService
{
    Person create();

    Person save(Person person);

    Person findById(Long id);

    void deleteById(Long id);
}
