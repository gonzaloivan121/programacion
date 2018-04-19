// Gonzalo Chaparro
// Ejercicio 06 - Capítulo 5
public class Ej06 {
  public static void main(String[] args) {
    
    System.out.println("Este programa muestra los números del 320 al 160");
    System.out.println("contando hacia atrás de 20 en 20 utilizando un bucle 'do-while'");
    System.out.println(" ");
    
    int i = 0;
    int multiplo = 340;
    
    do {
      multiplo = multiplo - 20;
      System.out.println(multiplo);
      i++;
    } while (i < 9);
  }
}
