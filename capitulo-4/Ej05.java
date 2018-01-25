// Gonzalo Chaparro
// Ejercicio 05 - Capítulo 4

public class Ej05 {
  public static void main(String[] args) {
    
    String entrada;
    
    System.out.println("Este programa resuelve una ecucación de primer grado.");
    System.out.println(" ");
    
    System.out.print("Introduce el valor de a: ");
    entrada = System.console().readLine();
    double a = Double.parseDouble( entrada );
    
    System.out.print("Introduce ahora el valor de b: ");
    entrada = System.console().readLine();
    double b = Double.parseDouble( entrada );
    
    double division = 0;
    
    if (a == 0) {
      System.out.println("La ecuación no tiene un resultado real.");
    } else {
      division = -b / a;
      
    }
    System.out.println("x vale " + division + ".");
  }
}
