// Gonzalo Chaparro
// Ejercicio 05 - Capítulo 5
public class Ej05 {
  public static void main(String[] args) {
    
    System.out.println("Este programa muestra los números del 320 al 160");
    System.out.println("contando hacia atrás de 20 en 20 utilizando un bucle 'while'");
    System.out.println(" ");
    
    int i = 0;
    int multiplo = 340;
    
    while (i < 9) {
      multiplo = multiplo - 20;
      System.out.println(multiplo);
      i++;
    }
  }
}
