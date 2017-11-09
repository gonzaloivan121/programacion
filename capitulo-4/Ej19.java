// Gonzalo Chaparro
// Ejercicio 19 - Capítulo 4

public class Ej19 {
  public static void main(String[] args) {
    
    String entrada;
    int n = 0;
    int cuentaDigitos = 0;
    
    System.out.println("Este programa nos dice cuántos dígitos tiene");
    System.out.println("un número entero positivo o negativo.");
    System.out.println("(SE PERMITEN NÚMEROS DE HASTA 5 CIFRAS)");
    System.out.println(" ");
    
    System.out.print("Por favor, introduce el número (hasta 5 cifras): ");
    entrada = System.console().readLine();
    n = Integer.parseInt( entrada );
    
    if ((n <= -100000) && (n >= 100000)) {
      System.out.println("¡El número debe tener menos de 5 cifras!");
    } else if ((n > -10) && (n < 10)) {
      cuentaDigitos = 1;
      System.out.println("El número " + n + " tiene " + cuentaDigitos + " dígito.");
    } else if ((n > -100) && (n < 100)) {
      cuentaDigitos = 2;
      System.out.println("El número " + n + " tiene " + cuentaDigitos + " dígitos.");
    } else if ((n > -1000) && (n < 1000)) {
      cuentaDigitos = 3;
      System.out.println("El número " + n + " tiene " + cuentaDigitos + " dígitos.");
    } else if ((n > -10000) && (n < 10000)) {
      cuentaDigitos = 4;
      System.out.println("El número " + n + " tiene " + cuentaDigitos + " dígitos.");
    } else if ((n > -100000) && (n < 100000)) {
      cuentaDigitos = 5;
      System.out.println("El número " + n + " tiene " + cuentaDigitos + " dígitos.");
    } else {
      System.out.println("Lo siento, el número introducido es mayor de 5 cifras.");
    }
  }
}
