package io.zipcoder.crudapp.services;

import io.zipcoder.crudapp.models.Person;
import io.zipcoder.crudapp.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Person createPerson(Person p){
        return personRepository.save(p);
    }

    public Person getPerson(Integer id){
        return personRepository.findOne(id);
    }

    public Iterable<Person> getPersonList(){
        return personRepository.findAll();
    }

    public Person updatePerson(Integer id, Person pData) {
        Person personToUpdate = personRepository.findOne(id);
        personToUpdate.setFirstName(pData.getFirstName());
        personToUpdate.setLastName(pData.getLastName());
        return personRepository.save(personToUpdate);
    }

    public Boolean deletePerson(Integer id){
        personRepository.delete(id);
        return true;
    }
}
