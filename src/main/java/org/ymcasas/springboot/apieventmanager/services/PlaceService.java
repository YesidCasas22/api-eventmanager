package org.ymcasas.springboot.apieventmanager.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.ymcasas.springboot.apieventmanager.models.Place;
import org.ymcasas.springboot.apieventmanager.repositories.PlaceRepository;

import java.util.List;

@Service
public class PlaceService {

    @Autowired
    private PlaceRepository placeRepository;

    public List<Place> findAll() {
        return placeRepository.findAll();
    }

    public Place findById(String id) {
        return placeRepository.findById(id).orElse(null);
    }

    public Place save(Place place) {
        return placeRepository.save(place);
    }

    public void deleteById(String id) {
        placeRepository.deleteById(id);
    }
}
