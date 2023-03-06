package com.babel.citasSpring.infra.console;

import com.babel.citasSpring.models.Cita;
import com.babel.citasSpring.service.CitasService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ConsoleReader {
    SimpleDateFormat fechaFormateador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss", Locale.forLanguageTag("es_ES"));
    CitasService citasService;

    public ConsoleReader(CitasService citasService) {
        this.citasService = citasService;
    }

    public void ini() {
        Scanner sc = new Scanner(System.in);
        String entradaConsola;
        int opcion = 1;
        do {
            System.out.println("Menu por consola");
            System.out.println("1.- Registrar cita");
            System.out.println("2.- Modificar cita");
            System.out.println("3.- Borrar cita");
            System.out.println("4.- Listar cita");
            System.out.println("0.- Salir");
            System.out.println("Ingrese la accion a realizar: ");
            entradaConsola = sc.next();
            try {
                opcion = Integer.parseInt(entradaConsola);
            } catch (Exception e) {
                System.out.println("Opcion no valida, ingresa un numero");
            }
            switch (opcion) {
                case 0:
                    System.out.println("Hasta pronto!!");
                    break;
                case 1:
                    System.out.println("Ingrese nombre: ");
                    String nombre = sc.next();
                    System.out.println("Ingrese apellidos: ");
                    String apellidos = sc.next();
                    System.out.println("Ingrese fecha (dd-MM-YYYY HH:mm:ss): ");
                    String fecha = sc.nextLine();

                    Date fechaCita;
                    try {
                        fechaCita = fechaFormateador.parse(sc.nextLine());
                        citasService.alta(new Cita(nombre, apellidos, fechaCita));
                    } catch (ParseException e) {
                        //throw new RuntimeException(e);
                        System.out.println("Formato de fecha no valido.");
                    }
                    break;
                case 2:
                    //TODO por desarrollar
                    break;
                case 3:
                    //TODO por desarrollar
                    break;
                case 4:
                    List<Cita> citas = citasService.listar();
                    for (Cita cita : citas) {
                        System.out.printf("Id %s, nombre: %s, apellidos: %s, fecha: %s", citas.indexOf(cita), cita.getNombre(), cita.getApellidos(), fechaFormateador.format(cita.getFecha()));
                        System.out.println();
                    }
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (opcion != 0);
    }
}
