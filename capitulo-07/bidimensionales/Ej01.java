// Gonzalo Chaparro
// Ejercicio 01 - Capítulo 7.2
public class Ej01 {
  public static void main(String[] args) {
    
    System.out.println("Este programa define un array de 12 números enteros");
    System.out.println("y asigna valores a los elementos según una tabla.");
    System.out.println();
    
    int[][] nue = new int[3][6]; // se define nue como un array bidimensional de String
            
    nue[0][0] = 0;
    nue[0][1] = 30;
    nue[0][2] = 2;
    nue[0][3] = 5;
    
    nue[1][0] = 75;
    nue[1][4] = 0;
    
    nue[2][2] = -2;
    nue[2][3] = 9;
    nue[2][3] = 11;
    
    int fila, columna;
    
    for (fila = 0; fila < 3; fila++) {
      
      System.out.print("Fila " + fila + ": ");
    
      for (columna = 0; columna < 6; columna++) {
        System.out.printf("%10d ", nue[fila][columna]);
      }
      System.out.println();
    }
  }
}
