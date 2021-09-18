package com.API.LaMejor.repositories;

import com.API.LaMejor.models.VentasContienenProductos;
import com.API.LaMejor.models.VentasContienenProductosId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentasContienenProductosRepositorio extends JpaRepository<VentasContienenProductos, VentasContienenProductosId> {
}
