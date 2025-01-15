package edu.carlos.castillo.actividades.actividad1.ui;

import java.util.Scanner;

public class CLI {
    public static void mostrarMenu() {
        System.out.println("1. Crear un nuevo estudiante");
        System.out.println("2. Listar estudiantes");
        System.out.println("3. Salir");
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void mostrarError(String mensaje) {
        System.out.println("Error: " + mensaje);
    }

    public void mostrarEstudiantes(String[] estudiantes) {
        for (String estudiante : estudiantes) {
            System.out.println(estudiante);
        }
    }

    public static void launch() {
        mostrarMenu();
        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();
        while (opcion != 3) {
            switch (opcion) {
                case 1:
                    System.out.println("Crear un nuevo estudiante");
                    break;
                case 2:
                    System.out.println("Listar estudiantes");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
            /**
             * 
             * logica de creacion del objeto estudiante
             * 
             */

            mostrarMenu();
            opcion = scanner.nextInt();
        }
    }

}
