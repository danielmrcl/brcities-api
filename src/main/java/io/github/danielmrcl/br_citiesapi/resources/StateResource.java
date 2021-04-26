package io.github.danielmrcl.br_citiesapi.resources;

import io.github.danielmrcl.br_citiesapi.entities.State;
import io.github.danielmrcl.br_citiesapi.exceptions.StateNotFoundException;
import io.github.danielmrcl.br_citiesapi.repositories.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/states")
public class StateResource {
    @Autowired
    private StateRepository repository;

    @GetMapping
    public Page<State> getAllStates(Pageable page) {
        return repository.findAll(page);
    }

    @GetMapping("/{id}")
    public State getStateById(@PathVariable Long id) throws StateNotFoundException {
        return repository.findById(id).orElseThrow(() -> new StateNotFoundException("State not founded by ID " + id));
    }
}
