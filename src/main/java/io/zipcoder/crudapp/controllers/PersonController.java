package io.zipcoder.crudapp.controllers;

import io.zipcoder.crudapp.models.Person;
import io.zipcoder.crudapp.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/people")


public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @PostMapping
    public Person createPerson(Person person){
        return null;
    }

    @GetMapping("/{id}")
    public Person getPerson(Integer id){
        return null;
    }

    @GetMapping()
    public List<Person> getPersonList(){
        return null;
    }

    @PutMapping("/{id}")
    public Person updatePerson(Integer id, Person p){
        return null;
    }
    @DeleteMapping("/{id}")
    public void deletePerson(Integer id){

    }

}
