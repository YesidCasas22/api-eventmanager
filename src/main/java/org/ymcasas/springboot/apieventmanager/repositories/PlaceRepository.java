package org.ymcasas.springboot.apieventmanager.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.ymcasas.springboot.apieventmanager.models.Person;
import org.ymcasas.springboot.apieventmanager.models.Place;

public interface PlaceRepository extends MongoRepository<Place, String> {
}
