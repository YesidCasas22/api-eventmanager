package org.ymcasas.springboot.apieventmanager.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.ymcasas.springboot.apieventmanager.models.Event;

public interface EventRepository extends MongoRepository<Event, String> {
}
