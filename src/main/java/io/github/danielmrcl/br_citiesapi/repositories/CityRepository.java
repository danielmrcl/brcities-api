package io.github.danielmrcl.br_citiesapi.repositories;

import io.github.danielmrcl.br_citiesapi.entities.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CityRepository extends JpaRepository<City, Long> {
    @Query(value = "SELECT ((SELECT lat_lon FROM cidade WHERE id = ?1) <@> (SELECT lat_lon FROM cidade WHERE id = ?2)) AS distance", nativeQuery = true)
    Double distanceByPoints(Long cityFrom, Long cityTo);
    @Query(value = "SELECT earth_distance(ll_to_earth(?1,?2), ll_to_earth(?3,?4)) AS distance", nativeQuery = true)
    Double distanceByCube(Double cityFromLat, Double cityFromLon, Double cityToLat, Double cityToLon);
}
