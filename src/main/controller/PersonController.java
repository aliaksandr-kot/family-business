package main.controller;

import service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("persons")
public class PersonController
{
    @Autowired
    PersonService personService;

    @RequestMapping(method= RequestMethod.DELETE)
    public void deletePerson(Long id)
    {
        personService.deleteById(id);
    }

}
