import java.util.Scanner;

class Examen {
    public static void main(String[] args) {
        
        System.out.println("Examen parcial PRG1");
        int edadAlumno;
        Scanner edadAlumno = new Scanner(System.in);
        final int MAYOR_EDAD = 18;
        if (edadAlumno >= MAYOR_EDAD) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }


    }
    
}
