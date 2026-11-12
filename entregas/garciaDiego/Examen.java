package entregas.garciaDiego;

import java.util.Scanner;

class Examen {
    public static void main(String[] args) {
        
        System.out.println("Examen parcial PRG1");
        Scanner edadAlumno = new Scanner(System.in);
        final int MAYOR_EDAD = 18;
        do {
            System.out.println("Introduzca una edad válida: ");
            Scanner edadAlumno = new Scanner(System.in);
        } while (edadAlumno >= MAYOR_EDAD);
        if (edadAlumno >= MAYOR_EDAD) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
        final int NUMERO_ASIGNATURAS;
        System.out.println("Introduce número de asignaturas entre 0 y 10: ");
        do {
            Scanner NUMERO_ASIGNATURAS = new Scanner(System.in);
        } while (NUMERO_ASIGNATURAS>10);
        System.out.println("Está matriculado a: " + NUMERO_ASIGNATURAS + "asignaturas");

    }
    
}
