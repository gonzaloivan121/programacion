// Gonzalo Chaparro
// Ejercicio 12 - Capítulo 5
public class Ej12 {
  public static void main(String[] args) {
    
    System.out.println("Este programa muestra los n primeros términos de");
    System.out.println("la serie de Fibonacci.");
    System.out.println(" ");
    
    String entrada;
    int n = 0;
    int primero = 0;
    int segundo = 1;
    int intercambio = 0;
    
    System.out.print("Introduce un número: ");
    entrada = System.console().readLine();
    n = Integer.parseInt( entrada );
    
    System.out.print(primero + " ");
    System.out.print(segundo + " ");
    for (int i = n; i > 0; i--) {
      intercambio = primero + segundo;
      primero = segundo;
      segundo = intercambio;
      System.out.print(intercambio + " ");
    }
  }
}
