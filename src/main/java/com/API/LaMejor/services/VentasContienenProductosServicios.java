package com.API.LaMejor.services;

import com.API.LaMejor.models.Ventas;
import com.API.LaMejor.repositories.VentasContienenProductosRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VentasContienenProductosServicios {

    private final VentasContienenProductosRepositorio ventasContienenProductosRepositorio;

    @Autowired
    public VentasContienenProductosServicios( VentasContienenProductosRepositorio ventasContienenProductosRepositorio){
        this.ventasContienenProductosRepositorio = ventasContienenProductosRepositorio;
    }



}
