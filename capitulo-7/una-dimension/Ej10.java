// Gonzalo Chaparro
// Ejercicio 10 - Capítulo 7
public class Ej10 {
  public static void main(String[] args) {
    
    System.out.println("Este programa genera 20 números enteros aleatorios");
    System.out.println("entre 0 y 100 y ordena los pares en las primeras");
    System.out.println("posiciones y los impares en las últimas del array");
    System.out.println();
    
    int[] num = new int[20]; // se define num como un array de 20 números.
    int[] par = new int[20]; // se define par como un array de pares.
    int[] impar = new int[20]; // se define impar como un array de impares.
    int pares = 0;
    int impares = 0;
    
    for (int i = 0; i < 20; i++) {  // se carga el array num con 20 números aleatorios entre 0 y 100.
      num[i] = (int)(Math.random() * 101);
      if (num[i] % 2 == 0) {
        par[pares++] = num[i];
      } else {
        impar[impares++] = num[i];
      }
    }
    System.out.println();
    
    System.out.println("Array Original: ");
    for (int i = 0; i < 20; i++) { //muestra el array original.
      System.out.print(num[i] + " ");
    }
    System.out.println();
    
    for (int i = 0; i < pares; i++) { //mete los pares en las primeras posiciones del array.
      num[i] = par[i];
    }
    
    for (int i = pares; i < 20; i++) { //mete los impares en los huecos que quedan.
      num[i] = impar[i - pares];
    }
    System.out.println();
    
    System.out.println("Array Resultante: ");
    for (int i = 0; i < 20; i++) { //muestra el array resultante.
      System.out.print(num[i] + " ");
    }
  }
}
