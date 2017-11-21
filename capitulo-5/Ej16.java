// Gonzalo Chaparro
// Ejercicio 16 - Capítulo 5
public class Ej16 {
  public static void main(String[] args) {
    
    System.out.println("Este programa pide un número entero positivo");
    System.out.println("por teclado e indica si es o no un número primo.");
    System.out.println(" ");
    
    String entrada;
    int n = 0;
    boolean esPrimo = true;
    
    System.out.print("Introduce un número entero positivo: ");
    entrada = System.console().readLine();
    n = Integer.parseInt( entrada );
    
    for (int i = 2; i < n; i++) {
      if ((n % i) == 0) {
        esPrimo = false;
      }
    }
    if (esPrimo) {
      System.out.println("El número " + n + " es primo.");
    } else {
      System.out.println("El número " + n + " no es primo.");
    }
  }
}
