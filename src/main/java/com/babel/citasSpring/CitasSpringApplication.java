package com.babel.citasSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CitasSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(CitasSpringApplication.class, args);
        //ConsoleReader consoleReader = new ConsoleReader(new CitasServiceImpl(new CitaRepositoryMemory()));
        //consoleReader.ini();
    }

}
