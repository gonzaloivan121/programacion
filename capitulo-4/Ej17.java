// Gonzalo Chaparro
// Ejercicio 17 - Capítulo 4

public class Ej17 {
  public static void main(String[] args) {
    
    String entrada;
    int n = 0;
    int ultCifra = 0;
    
    System.out.println("Este programa nos dice cuál es la última cifra");
    System.out.println("de un número entero introducido por teclado.");
    System.out.println(" ");
    
    System.out.print("Por favor, introduce el número (más de 2 cifras): ");
    entrada = System.console().readLine();
    n = Integer.parseInt( entrada );
    
    ultCifra = n %10;
    
    System.out.println("La última cifra de " + n + " es: " + ultCifra);
  }
}
