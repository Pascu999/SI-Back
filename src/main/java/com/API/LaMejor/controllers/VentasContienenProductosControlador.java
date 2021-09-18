package com.API.LaMejor.controllers;

import com.API.LaMejor.services.VentasContienenProductosServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ventasContienenProductos")
public class VentasContienenProductosControlador {

    private final VentasContienenProductosServicios ventasContienenProductosServicios;

    @Autowired
    public VentasContienenProductosControlador(VentasContienenProductosServicios ventasContienenProductosServicios){
        this.ventasContienenProductosServicios = ventasContienenProductosServicios;
    }
}
