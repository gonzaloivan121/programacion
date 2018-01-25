// Gonzalo Chaparro
// Ejercicio 01 - Capítulo 5
public class Ej01 {
  public static void main(String[] args) {
    
    System.out.println("Este programa muestra los números múltiplos");
    System.out.println("de 5 de 0 a 100 utilizando un bucle 'for'");
    System.out.println(" ");
    
    int multiplo = 0;
    
    for (int i = 0; i < 20; i++) {
      multiplo = multiplo + 5;
      System.out.println(multiplo);
    }
  }
}
