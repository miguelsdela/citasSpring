package com.babel.citasSpring.service.impl;

import com.babel.citasSpring.models.Cita;
import com.babel.citasSpring.repository.CitaRepository;
import com.babel.citasSpring.service.CitasService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CitasServiceImpl implements CitasService { //Aqui generamos el uso para el modelo que se defina en models

    CitaRepository citaRepository;

    public CitasServiceImpl(CitaRepository citaRepository) {
        this.citaRepository = citaRepository;
    }

    @Override
    public void alta(Cita cita) {
        citaRepository.alta(cita);
    }

    @Override
    public void baja(int indice) {
        citaRepository.baja(indice);
    }

    @Override
    public List<Cita> listar() {
        return citaRepository.listar();
    }
}
