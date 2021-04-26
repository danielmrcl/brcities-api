package io.github.danielmrcl.br_citiesapi.resources;

import io.github.danielmrcl.br_citiesapi.entities.City;
import io.github.danielmrcl.br_citiesapi.exceptions.CityNotFoundException;
import io.github.danielmrcl.br_citiesapi.repositories.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cities")
public class CityResource {
    @Autowired
    private CityRepository repository;

    @GetMapping
    public Page<City> getAllCities(Pageable page) {
        return repository.findAll(page);
    }

    @GetMapping("/{id}")
    public City getCityById(@PathVariable Long id) throws CityNotFoundException {
        return repository.findById(id).orElseThrow(() -> new CityNotFoundException("Country not founded by ID " + id));
    }
}
