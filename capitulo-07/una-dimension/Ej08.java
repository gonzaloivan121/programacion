// Gonzalo Chaparro
// Ejercicio 08 - Capítulo 7
public class Ej08 {
  public static void main(String[] args) {
    
    System.out.println("Este programa pide la temperatura media que ha");
    System.out.println("hecho en cada mes de un determinado año y que");
    System.out.println("muestre un diagrama de barra con esos datos.");
    System.out.println();
    
    String[] meses = {
      "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio",
      "agosto", "septiembre", "octubre", "noviembre", "diciembre"
    }; // se define meses como un array de String (nombres de meses).
    
    int[] temp = new int[12]; // se define temp como un array de 12 números enteros.
    
    for (int i = 0; i < 12; i++) {  // se carga el array meses con 12 temperaturas.
      System.out.print("Introduce la temperatura media de " + meses[i] + ": ");
      temp[i] = Integer.parseInt( System.console().readLine() );
    }
    System.out.println();
    
    for (int i = 0; i < 12; i++) {
      System.out.printf("%12s I", meses[i]);
      for (int j = 0; j < temp[i]; j++) {
        System.out.print("*");
      }
      System.out.println(" " + temp[i] + " C");
    }
  }
}
