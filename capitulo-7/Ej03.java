// Gonzalo Chaparro
// Ejercicio 03 - Capítulo 7
public class Ej03 {
  public static void main(String[] args) {
    
    System.out.println("Este programa pide 10 números por teclado");
    System.out.println("y luego los muestra en orden inverso.");
    System.out.println();
    
    double[] num; // se define num como un array de números
    num = new double[10]; // se reserva espacio para 12 enteros
    
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
