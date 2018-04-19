// Gonzalo Chaparro
// Ejercicio 11 - Capítulo 7
public class Ej11 {
  public static void main(String[] args) {
    
    System.out.println("Este programa pide 10 números por teclado");
    System.out.println("y los almacena en un array. Pasando los");
    System.out.println("números primos a las primeras posiciones.");
    
    double[] num; // se define num como un array de números
    num = new double[10]; // se reserva espacio para 10 enteros
    
    System.out.println("Introduce 10 números intercalados por Enter.");
    for (int i = 0; i <= 9; i++) {
      num[i] = Double.parseDouble( System.console().readLine() );
    }
    
    for (int i = 9; i >= 0; i--) {
      System.out.println("Indice: " + i);
      System.out.println("Valor: " + num[i]);
      System.out.println();
    }
  }
}
