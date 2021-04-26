package io.github.danielmrcl.br_citiesapi.entities;

import lombok.Data;
import javax.persistence.*;

@Entity
@Data
@Table(name = "cidade")
public class City {
    @Id
    private Long id;
    @Column(name = "nome")
    private String name;
    @ManyToOne
    @JoinColumn(name = "uf", referencedColumnName = "id")
    private State state;
    @Column(name = "ibge")
    private Integer ibge;
    @Column(name = "lat_lon")
    private String geolocation;
    @Column(name = "latitude")
    private Double latitude;
    @Column(name = "longitude")
    private Double longitude;
    @Column(name = "cod_tom")
    private Integer codTom;
}
