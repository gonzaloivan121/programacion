// Gonzalo Chaparro
// Ejercicio 17 - Capítulo 5
public class Ej17 {
  public static void main(String[] args) {
    
    System.out.println("Este programa pide un número entero positivo");
    System.out.println("por teclado y le suma los 100 números siguientes.");
    System.out.println(" ");
    
    String entrada;
    int n = 0;
    int suma = 0;
    
    System.out.print("Introduce un número entero positivo: ");
    entrada = System.console().readLine();
    n = Integer.parseInt( entrada );
    
    if (n >= 0) {
      for (int i = n; i < n + 100; i++) {
        suma += i;
      }
      System.out.println("La suma total a partir de " + n + " es: " + suma);
    } else {
      System.out.println("El número introducido no es entero positivo.");
    }
  }
}
