package com.babel.citasSpring.infra.config;

import com.babel.citasSpring.infra.console.ConsoleReader;
import com.babel.citasSpring.repository.CitaRepository;
import com.babel.citasSpring.repository.impl.CitaRepositoryMemory;
import com.babel.citasSpring.service.CitasService;
import com.babel.citasSpring.service.impl.CitasServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CitasConf {
    @Bean
    CitaRepository getCitaRespository() {
        return new CitaRepositoryMemory();
    }

    @Bean
    CitasService getCitaService() {
        return new CitasServiceImpl(getCitaRespository());
    }

    @Bean
    ConsoleReader getConsoleReader() {
        return new ConsoleReader(getCitaService());
    }
}
