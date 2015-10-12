package com.family.business.repositories;

import com.family.business.obj.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long>
{

}
