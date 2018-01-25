// Gonzalo Chaparro
// Ejercicio 09 - Capítulo 7
public class Ej09 {
  public static void main(String[] args) {
    
    System.out.println("Este programa pide 8 números enteros y luego");
    System.out.println("los muestra junto con la palabra 'par' o 'impar'");
    System.out.println("según proceda.");
    System.out.println();
    
    int[] num = new int[8]; // se define num como un array de 8 números enteros.
    
    for (int i = 0; i < 8; i++) {  // se carga el array num con 8 números enteros.
      System.out.print("Introduce un número (" + (i + 1) +"): ");
      num[i] = Integer.parseInt( System.console().readLine() );
    }
    System.out.println();
    
    for (int i = 0; i < 8; i++) {
      if ((num[i] %2) == 0) {
        System.out.println(num[i] + " es par.");
      } else {
        System.out.println(num[i] + " es impar.");
      }
    }
  }
}
