package com.babel.citasSpring.repository.impl;

import com.babel.citasSpring.models.Cita;
import com.babel.citasSpring.repository.CitaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CitaRepositoryMemory implements CitaRepository {

    private List<Cita> citas;

    public CitaRepositoryMemory() {
        citas = new ArrayList<>();
    }

    @Override
    public void alta(Cita cita) {
        citas.add(cita);
    }

    @Override
    public void baja(int indice) {
        citas.remove(indice);
    }

    @Override
    public List<Cita> listar() {
        return citas;
    }
}
