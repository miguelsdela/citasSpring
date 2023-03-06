package com.babel.citasSpring.service;

import com.babel.citasSpring.models.Cita;

import java.util.List;

public interface CitasService {
    void alta(Cita cita);

    void baja(int id);

    List<Cita> listar();
}
