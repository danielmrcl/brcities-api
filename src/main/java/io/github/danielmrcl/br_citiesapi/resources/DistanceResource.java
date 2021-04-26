package io.github.danielmrcl.br_citiesapi.resources;

import io.github.danielmrcl.br_citiesapi.services.DistanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/distances")
public class DistanceResource {
    @Autowired
    private DistanceService service;

    @GetMapping
    public Double getDistance(@RequestParam(name = "from") final Long cityFrom,
                                    @RequestParam(name = "to") final Long cityTo,
                                    @RequestParam(name = "by", defaultValue = "cube") final String calcMethod) {
        if (calcMethod.equals("points")) {
            return service.distanceByPoints(cityFrom, cityTo);
        }

        return service.distanceByCube(cityFrom, cityTo);
    }
}
