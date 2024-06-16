package org.ymcasas.springboot.apieventmanager.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.ymcasas.springboot.apieventmanager.models.City;
import org.ymcasas.springboot.apieventmanager.services.CityService;

import java.util.List;

@RestController
@RequestMapping("/cities")
public class CityController {

    @Autowired
    private CityService cityService;

    @GetMapping
    public List<City> getAllCities() {
        return cityService.findAll();
    }

    @GetMapping("/{id}")
    public City getCityById(@PathVariable String id) {
        return cityService.findById(id);
    }

    @PostMapping
    public City createCity(@RequestBody City city) {
        return cityService.save(city);
    }

    @PutMapping("/{id}")
    public City updateCity(@PathVariable String id, @RequestBody City city) {
        city.setId(id); // Aseguramos que el ID sea el correcto
        return cityService.save(city);
    }

    @DeleteMapping("/{id}")
    public void deleteCity(@PathVariable String id) {
        cityService.deleteById(id);
    }
}
