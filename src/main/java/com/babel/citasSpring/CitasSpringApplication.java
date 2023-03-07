package com.babel.citasSpring;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CitasSpringApplication {

    public static void main(String[] args) {
        //SpringApplication.run(CitasSpringApplication.class, args);
        //Para no mostrar el Banner de Spring se puede hacer así
        SpringApplication app = new SpringApplication(CitasSpringApplication.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
        //ConsoleReader consoleReader = new ConsoleReader(new CitasServiceImpl(new CitaRepositoryMemory()));
    }

}
