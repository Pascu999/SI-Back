package com.API.LaMejor.models;


import javax.persistence.Embeddable;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable
public final class VentasContienenProductosId implements Serializable {
    @ManyToOne
    @JoinColumn(name = "venta_id",referencedColumnName = "venta_id",foreignKey = @ForeignKey(name = "FK_Venta"))
    private Ventas venta;
    @ManyToOne
    @JoinColumn(name = "producto_id",referencedColumnName = "producto_id",foreignKey = @ForeignKey(name = "FK_Producto"))
    private Productos producto;




}