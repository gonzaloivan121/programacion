// Gonzalo Chaparro
// Ejercicio 05 - Capítulo 6
public class Ej05 {
  public static void main(String[] args) {
    
    System.out.println("Este programa muestra 50 números al azar");
    System.out.println("entre 100 y 199 (ambos incluídos) separados.");
    System.out.println("Muestra también el máximo, mínimo y media.");
    System.out.println();
    
    int max = 0;
    int min = 200;
    int media = 0;
    
    for (int i = 0; i < 50; i++) {
      int n = (int)(Math.random() * 100) + 100;
      System.out.print(n + " ");
      
      if (n > max) {
        max = n;
      }
      
      if (n < min) {
        min = n;
      }
      
      media += n / 50;
    }
    
    System.out.println("\n");
    System.out.println("El mayor es: " + max);
    System.out.println("El menor es: " + min);
    System.out.println("La media es: " + media);
  }
}
