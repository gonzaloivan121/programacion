// Gonzalo Chaparro
// Ejercicio 05 - Capítulo 7
public class Ej05 {
  public static void main(String[] args) {
    
    System.out.println("Este programa pide 10 números por teclado y luego");
    System.out.println("muestra los números introducidos junto con las palabras");
    System.out.println("máximo al lado del máximo y mínimo al lado del mínimo.");
    System.out.println();
    
    double[] num; // se define num como un array de números
    num = new double[10]; // se reserva espacio para 10 números
    
    double maximo = 0;
    double minimo = 9999;
    
    System.out.println("Introduce 10 números intercalados por Enter.");
    for (int i = 0; i <= 9; i++) {  // se carga el array numero con 10 números por teclado.
      num[i] = Double.parseDouble( System.console().readLine() );
    }
    System.out.println();
    
    for (int i = 0; i <= 9; i++) {
      if (num[i] > maximo) {
        maximo = num[i];
      }
    }
    
    for (int i = 0; i <= 9; i++) {
      if (num[i] < minimo) {
        minimo = num[i];
      }
    }
    
    for (int i = 0; i <= 9; i++) {
      System.out.println(i + ". " + num[i]);
    }
    System.out.println();
    System.out.println("Maximo: " + maximo);
    System.out.println("Minimo: " + minimo);
    System.out.println();
  }
}
