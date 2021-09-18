package com.API.LaMejor.models;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Cacheable(false)
public class Ventas {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ventas_secuencia")
    @Column(name = "venta_id", nullable = false, updatable = false)
    private Long ventaId;
    private Date ventaFecha;
    @Column(nullable = false,updatable = true)
    private double ventaTotal;
    @Column(nullable = false,updatable = true)
    private int ventaEstado;
}