package org.ymcasas.springboot.apieventmanager.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.ymcasas.springboot.apieventmanager.models.Person;

public interface PersonRepository extends MongoRepository<Person, String> {
}
