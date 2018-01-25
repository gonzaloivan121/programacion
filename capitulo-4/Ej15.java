// Gonzalo Chaparro
// Ejercicio 15 - Capítulo 4

public class Ej15 {
  public static void main(String[] args) {
    
    String entrada;
    
    System.out.println("Este programa pinta una pirámida con el caracter");
    System.out.println("que el usuario desee mediante un menú que de a");
    System.out.println("elegir la orientación de ésta.");
    System.out.println(" ");
    
    System.out.print("Por favor, introduce el caracter con el que desee pintar la pirámide: ");
    entrada = System.console().readLine();
    String c = entrada;
    
    System.out.println("Introduce ahora la orientación de la pirámide:");
    System.out.println("1. Arriba.");
    System.out.println("2. Abajo.");
    System.out.println("3. Izquierda.");
    System.out.println("4. Derecha.");
    System.out.print("=> ");
    entrada = System.console().readLine();
    int orientacion = Integer.parseInt( entrada );
    String e = " ";
    
    switch (orientacion) {
      case 1:
        System.out.println("Pirámide hacia arriba:");
        System.out.println(e+e+e+e+c+e+e+e+e);
        System.out.println(e+e+e+c+c+c+e+e+e);
        System.out.println(e+e+c+c+c+c+c+e+e);
        System.out.println(e+c+c+c+c+c+c+c+e);
        System.out.println(c+c+c+c+c+c+c+c+c);
      break;
      case 2:
        System.out.println("Pirámide hacia abajo:");
        System.out.println(c+c+c+c+c+c+c+c+c);
        System.out.println(e+c+c+c+c+c+c+c+e);
        System.out.println(e+e+c+c+c+c+c+e+e);
        System.out.println(e+e+e+c+c+c+e+e+e);
        System.out.println(e+e+e+e+c+e+e+e+e);
      break;
      case 3:
        System.out.println("Pirámide hacia la izquierda:");
        System.out.println(e+e+e+e+c);
        System.out.println(e+e+e+c+c);
        System.out.println(e+e+c+c+c);
        System.out.println(e+c+c+c+c);
        System.out.println(c+c+c+c+c);
        System.out.println(e+c+c+c+c);
        System.out.println(e+e+c+c+c);
        System.out.println(e+e+e+c+c);
        System.out.println(e+e+e+e+c);
      break;
      case 4:
        System.out.println("Pirámide hacia la derecha:");
        System.out.println(c+e+e+e+e);
        System.out.println(c+c+e+e+e);
        System.out.println(c+c+c+e+e);
        System.out.println(c+c+c+c+e);
        System.out.println(c+c+c+c+c);
        System.out.println(c+c+c+c+e);
        System.out.println(c+c+c+e+e);
        System.out.println(c+c+e+e+e);
        System.out.println(c+e+e+e+e);
      break;
      default:
      System.out.println("La opción elegida no es correcta. (1-4)");
    }    
  }
}
