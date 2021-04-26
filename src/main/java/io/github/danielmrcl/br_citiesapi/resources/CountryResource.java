package io.github.danielmrcl.br_citiesapi.resources;

import io.github.danielmrcl.br_citiesapi.entities.Country;
import io.github.danielmrcl.br_citiesapi.exceptions.CountryNotFoundException;
import io.github.danielmrcl.br_citiesapi.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/countries")
public class CountryResource {
    @Autowired
    private CountryRepository repository;

    @GetMapping
    public Page<Country> getCountries(Pageable page) {
        return repository.findAll(page);
    }

    @GetMapping("/{id}")
    public Country getCountry(@PathVariable Long id) throws CountryNotFoundException {
        return repository.findById(id)
                .orElseThrow(() -> new CountryNotFoundException("Country not founded by ID " + id));
    }
}
