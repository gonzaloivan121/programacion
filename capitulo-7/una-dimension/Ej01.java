// Gonzalo Chaparro
// Ejercicio 01 - Capítulo 7
public class Ej01 {
  public static void main(String[] args) {
    
    System.out.println("Este programa define un array de 12 números enteros");
    System.out.println("y asigna valores a los elementos según una tabla.");
    System.out.println();
    
    int[] num; // se define num como un array de enteros
    num = new int[12]; // se reserva espacio para 12 enteros
            
    num[0] = 39;
    num[1] = -2;
    num[4] = 0;
    num[6] = 14;
    num[8] = 5;
    num[9] = 120;
    
    for (int i = 0; i <= 11; i++) {
      System.out.println("Indice: " + i);
      System.out.println("Valor: " + num[i]);
      System.out.println();
    }
  }
}

// Los valores de los elementos que no han sido inicializados
// se inicializan automáticamente a 0.
