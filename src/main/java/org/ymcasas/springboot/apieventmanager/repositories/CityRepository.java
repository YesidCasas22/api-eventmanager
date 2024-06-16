package org.ymcasas.springboot.apieventmanager.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.ymcasas.springboot.apieventmanager.models.City;

public interface CityRepository extends MongoRepository<City, String> {
}
