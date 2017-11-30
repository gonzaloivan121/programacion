// Gonzalo Chaparro
// Ejercicio 08 - Capítulo 7
public class Ej08 {
  public static void main(String[] args) {
    
    System.out.println("Este programa pide la temperatura media que ha");
    System.out.println("hecho en cada mes de un determinado año y que");
    System.out.println("muestre un diagrama de barra con esos datos.");
    System.out.println();
    
    String[] meses; // se define meses como un array de String (asteriscos).
    meses = new String[12]; // se reserva espacio para los 12 meses.
    
    int[] temp; // se define temp como un array de números.
    temp = new int[12]; // se reserva espacio las 12 temperaturas.
    
    System.out.println("Introduce las temperaturas de cada mes intercaladas por Enter: ");
    for (int i = 0; i < 12; i++) {  // se carga el array meses con 12 temperaturas.
      System.out.print((i + 1) + ". ");
      temp[i] = Integer.parseInt( System.console().readLine() );
    }
    
    for (int i = 0; i < 12; i++) {
      //for () {
        
      //}
    }
  }
}
