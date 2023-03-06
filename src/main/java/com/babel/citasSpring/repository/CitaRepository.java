package com.babel.citasSpring.repository;

import com.babel.citasSpring.models.Cita;

import java.util.List;

public interface CitaRepository {
    void alta(Cita cita);

    void baja(int id);

    List<Cita> listar();
}
