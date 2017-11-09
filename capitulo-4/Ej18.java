// Gonzalo Chaparro
// Ejercicio 18 - Capítulo 4

public class Ej18 {
  public static void main(String[] args) {
    
    String entrada;
    int n = 0;
    int prCifra = 0;
    
    System.out.println("Este programa nos dice cuál es la primera cifra");
    System.out.println("de un número entero introducido por teclado.");
    System.out.println("(SE PERMITEN NÚMEROS DE HASTA 5 CIFRAS)");
    System.out.println(" ");
    
    System.out.print("Por favor, introduce el número (de 2 a 5 cifras): ");
    entrada = System.console().readLine();
    n = Integer.parseInt( entrada );
    
    if (n < 10) {
      System.out.println("¡El número debe tener entre 2 y 5 cifras!");
    } else if ((n >= 10) && (n < 100)) {
      prCifra = (n / 10) %10;
      System.out.println("La primera cifra de " + n + " es: " + prCifra);
    } else if ((n >= 100) && (n < 1000)) {
      prCifra = (n / 100) %10;
      System.out.println("La primera cifra de " + n + " es: " + prCifra);
    } else if ((n >= 1000) && (n < 10000)) {
      prCifra = (n / 1000) %10;
      System.out.println("La primera cifra de " + n + " es: " + prCifra);
    } else if ((n >= 10000) && (n < 100000)) {
      prCifra = (n / 10000) %10;
      System.out.println("La primera cifra de " + n + " es: " + prCifra);
    } else {
      System.out.println("Lo siento, el número introducido es mayor de 5 cifras.");
    }
  }
}
