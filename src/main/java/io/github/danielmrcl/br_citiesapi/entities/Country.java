package io.github.danielmrcl.br_citiesapi.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "pais")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Country {
    @Id
    @GeneratedValue
    private long id;
    @Column(name = "nome")
    private String name;
    @Column(name = "nome_pt")
    private String namePortuguese;
    @Column(name = "sigla")
    private String abbr;
    @Column(name = "bacen")
    private int codeBacen;
}
