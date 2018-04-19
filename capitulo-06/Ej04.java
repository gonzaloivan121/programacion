// Gonzalo Chaparro
// Ejercicio 04 - Capítulo 6
public class Ej04 {
  public static void main(String[] args) {
    
    System.out.println("Este programa muestra 20 números al azar");
    System.out.println("entre 0 y 10 (ambos incluídos) separados.");
    System.out.println();
        
    for (int i = 0; i < 20; i++) {
      int n = (int)(Math.random() * 11);
      System.out.print(n + " ");
    }
  }
}
