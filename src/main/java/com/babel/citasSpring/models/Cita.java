package com.babel.citasSpring.models;

import java.util.Date;

/*
@Getter //Te crea los getter
@Setter //Te crea los setter
@Constructor //Te crea el constructor
*/

public class Cita {
    private String nombre;
    private String apellidos;
    private Date fecha;

    public Cita() {
    }

    public Cita(String nombre, String apellidos, Date fecha) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
