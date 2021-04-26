package io.github.danielmrcl.br_citiesapi.services;

import io.github.danielmrcl.br_citiesapi.entities.City;
import io.github.danielmrcl.br_citiesapi.repositories.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class DistanceService {
    @Autowired
    private CityRepository repository;

    public Double distanceByPoints(Long cityFrom, Long cityTo) {
        return repository.distanceByPoints(cityFrom, cityTo);
    }

    public Double distanceByCube(Long cityFrom, Long cityTo) {
        List<City> cities = repository.findAllById(Arrays.asList(cityFrom, cityTo));

        Double cityFromLat = cities.get(0).getLatitude();
        Double cityFromLon = cities.get(0).getLongitude();
        Double cityToLat = cities.get(1).getLatitude();
        Double cityToLon = cities.get(1).getLongitude();

        return repository.distanceByCube(cityFromLat, cityFromLon, cityToLat, cityToLon);
    }
}
