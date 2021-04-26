package io.github.danielmrcl.br_citiesapi.entities;

import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import lombok.Data;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "estado")
@TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
public class State {
    @Id
    private long id;
    @Column(name = "nome")
    private String name;
    @Column(name = "uf")
    private String abbr;
    @Column(name = "ibge")
    private Integer ibge;
    @ManyToOne
    @JoinColumn(name = "pais", referencedColumnName = "id")
    private Country country;
    @Type(type = "jsonb")
    @Basic(fetch = FetchType.LAZY)
    @Column(name = "ddd", columnDefinition = "jsonb")
    private List<Integer> ddd;
}
