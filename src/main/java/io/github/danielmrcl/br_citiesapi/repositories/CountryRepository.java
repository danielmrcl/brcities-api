package io.github.danielmrcl.br_citiesapi.repositories;

import io.github.danielmrcl.br_citiesapi.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
