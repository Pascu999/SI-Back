package com.API.LaMejor.models;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Cacheable(false)
public class VentasContienenProductos implements Serializable {
    //Entidad con una llave primaria formada  por una tupla, por lo que su id es embedido
    @EmbeddedId
    private VentasContienenProductosId ventasContienenProductosId;
    @Column(nullable = false,updatable = false)
    private double ventasContienenProductosUnidades;
    @Column(nullable = false,updatable = true)
    private double ventasContienenProductosValor;
}