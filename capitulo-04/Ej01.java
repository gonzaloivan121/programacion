// Gonzalo Chaparro
// Ejercicio 01 - Capítulo 4
import java.util.Scanner;

public class Ej01 {
  public static void main(String[] args) {   
    
    Scanner entrada = new Scanner(System.in);
    String leerPantalla;
    int dia;

    System.out.println("Este programa pide un día de la semana y");
    System.out.println("muestra la primera asignatura del día.");
    System.out.println(" ");
       
    System.out.print("Por favor, introduce un numero de día (1-5): ");
    dia = entrada.nextInt();
    //dia = Integer.parseInt(leerPantalla);
    
    String nombreAsignatura;
    
    switch (dia) {
      case 1:
        nombreAsignatura = "Trabajo";
        break;
      case 2:
        nombreAsignatura = "Programación";
        break;
      case 3:
        nombreAsignatura = "Trabajo";
        break;
      case 4:
        nombreAsignatura = "Programación";
        break;
      case 5:
        nombreAsignatura = "Programación";
        break; 
      default:
        nombreAsignatura = "O es fin de semana o no existe ese día.";
    }

    System.out.println("La primera asignatura del día " + dia + " es: " + nombreAsignatura);
  }
}
