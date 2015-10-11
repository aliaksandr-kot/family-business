package com.family.business.service;

import com.family.business.obj.Person;

public interface PersonService
{
    Person create();

    Person save(Person person);

    void deleteById(Long id);
}
