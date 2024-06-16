package org.ymcasas.springboot.apieventmanager.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.ymcasas.springboot.apieventmanager.models.Event;
import org.ymcasas.springboot.apieventmanager.models.Person;
import org.ymcasas.springboot.apieventmanager.models.Place;
import org.ymcasas.springboot.apieventmanager.services.EventService;
import org.ymcasas.springboot.apieventmanager.services.PersonService;
import org.ymcasas.springboot.apieventmanager.services.PlaceService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/events")
public class EventController {

    @Autowired
    private EventService eventService;
    @Autowired
    private PlaceService placeService;
    @Autowired
    private PersonService personService;

    @GetMapping
    public List<Event> getAllEvents() {
        return eventService.findAll();
    }

    @GetMapping("/{id}")
    public Event getEventById(@PathVariable String id) {
        return eventService.findById(id);
    }

    @PostMapping
    public Event createEvent(@RequestBody Event event) {
        return eventService.save(event);
    }

    @PutMapping("/{id}")
    public Event updateEvent(@PathVariable String id, @RequestBody Event event) {
        event.setId(id);
        return eventService.save(event);
    }

    @DeleteMapping("/{id}")
    public void deleteEvent(@PathVariable String id) {
        eventService.deleteById(id);
    }
}
