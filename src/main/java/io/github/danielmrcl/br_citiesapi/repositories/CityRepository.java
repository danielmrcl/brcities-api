package io.github.danielmrcl.br_citiesapi.repositories;

import io.github.danielmrcl.br_citiesapi.entities.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {
}
