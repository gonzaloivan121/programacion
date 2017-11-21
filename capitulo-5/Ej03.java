// Gonzalo Chaparro
// Ejercicio 03 - Capítulo 5
public class Ej03 {
  public static void main(String[] args) {
    
    System.out.println("Este programa muestra los números múltiplos");
    System.out.println("de 5 de 0 a 100 utilizando un bucle 'do-while'");
    System.out.println(" ");
    
    int i = 0;
    int multiplo = 0;
    
    do {
      multiplo = multiplo + 5;
      System.out.println(multiplo);
      i++;
    } while (i < 20);
  }
}
