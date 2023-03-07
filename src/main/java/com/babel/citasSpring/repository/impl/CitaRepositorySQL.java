package com.babel.citasSpring.repository.impl;

import com.babel.citasSpring.models.Cita;
import com.babel.citasSpring.repository.CitaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("SQL")
public class CitaRepositorySQL implements CitaRepository {

    //Aqui declarariamos la libreria para manejar las consultas SQL
    private List<Cita> citas;

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
