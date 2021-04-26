package io.github.danielmrcl.br_citiesapi.repositories;

import io.github.danielmrcl.br_citiesapi.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
