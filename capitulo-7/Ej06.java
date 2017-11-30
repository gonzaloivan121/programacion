// Gonzalo Chaparro
// Ejercicio 06 - Capítulo 7
public class Ej06 {
  public static void main(String[] args) {
    
    System.out.println("Este programa pide 15 números por teclado y los almacena");
    System.out.println("en un array. El elemento de la posición 0 debe pasar a");
    System.out.println("la posición 1, el de la 1 a la 2, etc.");
    System.out.println();
    
    int[] num; // se define num como un array de números
    num = new int[15]; // se reserva espacio para 10 números
    
    int[] aux; // se define aux como un array de intercambio
    aux = new int[15]; // se reserva espacio para 10 números
    
    System.out.println("Introduce 15 números intercalados por Enter.");
    for (int i = 0; i < 15; i++) {  // se carga el array numero con 10 números por teclado.
      num[i] = Integer.parseInt( System.console().readLine() );
    }
    System.out.println();
    
    for (int i = 0; i < 15; i++) { // se intercambian los valores.
      aux[0] = num[14];
      if ((i > 0) && (i <= 14)) {
        aux[i] = num[i - 1];
      }
    }
    
    for (int i = 0; i <= 14; i++) {
      System.out.println("Indice: " + i);
      System.out.println("Valor: " + aux[i]);
      System.out.println();
    }
  }
}
