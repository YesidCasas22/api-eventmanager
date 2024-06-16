package org.ymcasas.springboot.apieventmanager.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.ymcasas.springboot.apieventmanager.models.Place;
import org.ymcasas.springboot.apieventmanager.services.PlaceService;

import java.util.List;

@RestController
@RequestMapping("/places")
public class PlaceController {

    @Autowired
    private PlaceService placeService;

    @GetMapping
    public List<Place> getAllPlaces() {
        return placeService.findAll();
    }

    @GetMapping("/{id}")
    public Place getPlaceById(@PathVariable String id) {
        return placeService.findById(id);
    }

    @PostMapping
    public Place createPlace(@RequestBody Place place) {
        return placeService.save(place);
    }

    @PutMapping("/{id}")
    public Place updatePlace(@PathVariable String id, @RequestBody Place place) {
        place.setId(id);
        return placeService.save(place);
    }

    @DeleteMapping("/{id}")
    public void deletePlace(@PathVariable String id) {
        placeService.deleteById(id);
    }
}
