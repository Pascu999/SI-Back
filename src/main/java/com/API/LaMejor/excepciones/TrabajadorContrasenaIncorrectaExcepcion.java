package com.API.LaMejor.excepciones;

public class TrabajadorContrasenaIncorrectaExcepcion extends RuntimeException {
    public TrabajadorContrasenaIncorrectaExcepcion(String mensaje) {
        super(mensaje);
    }
}