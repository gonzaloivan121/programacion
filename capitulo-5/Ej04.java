// Gonzalo Chaparro
// Ejercicio 04 - Capítulo 5
public class Ej04 {
  public static void main(String[] args) {
    
    System.out.println("Este programa muestra los números del 320 al 160");
    System.out.println("contando hacia atrás de 20 en 20 utilizando un bucle 'for'");
    System.out.println(" ");
    
    int multiplo = 340;
    
    for (int i = 1; i < 10; i++) {
      multiplo = multiplo - 20;
      System.out.println(multiplo);
    }
  }
}
