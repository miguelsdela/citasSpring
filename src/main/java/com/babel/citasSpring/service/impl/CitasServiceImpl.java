package com.babel.citasSpring.service.impl;

import com.babel.citasSpring.models.Cita;
import com.babel.citasSpring.repository.CitaRepository;
import com.babel.citasSpring.service.CitasService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CitasServiceImpl implements CitasService { //Aqui generamos el uso para el modelo que se defina en models

    private CitaRepository citaRepositoryMemory;
    private CitaRepository citaRepositorySQL;

    public CitasServiceImpl(@Qualifier("Memory") CitaRepository citaRepositoryMemory, @Qualifier("SQL") CitaRepository citaRepositorySQL) {
        this.citaRepositoryMemory = citaRepositoryMemory;
        this.citaRepositorySQL = citaRepositorySQL;
    }

    @Override
    public void alta(Cita cita) {
        /* Esta es la forma de definir dos implementaciones de una interfaz usando el @Qualifier
        Esto se haria en todos los metodos restantes de la clase, funciona de forma que si hay conexion
        en la base de datos lo guarda en la base de datos (citaRepositorySQL) y en la clase citaRepositoryMemory,
        si no hay conexion solo lo guarda en la clase citaRepositoryMemory
        if(tenemosConexionBBDD()){
            citaRepositorySQL.alta(cita);
        }
            citaRepositoryMemory.alta(cita);

         */
        citaRepositoryMemory.alta(cita);
    }

    @Override
    public void baja(int indice) {
        citaRepositoryMemory.baja(indice);
    }

    @Override
    public List<Cita> listar() {
        return citaRepositoryMemory.listar();
    }
}
