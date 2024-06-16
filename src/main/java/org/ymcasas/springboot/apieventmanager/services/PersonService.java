package org.ymcasas.springboot.apieventmanager.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.ymcasas.springboot.apieventmanager.models.Person;
import org.ymcasas.springboot.apieventmanager.repositories.PersonRepository;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public List<Person> findAll() {
        return personRepository.findAll();
    }

    public Person findById(String id) {
        return personRepository.findById(id).orElse(null);
    }

    public Person save(Person person) {
        return personRepository.save(person);
    }

    public void deleteById(String id) {
        personRepository.deleteById(id);
    }
}
