// Gonzalo Chaparro
// Ejercicio 04 - Capítulo 7
public class Ej04 {
  public static void main(String[] args) {
    
    System.out.println("Este programa define tres arrays de 20 números");
    System.out.println("enteros diferentes.");
    System.out.println();
    
    int[] numero; // se define numero como un array de números enteros
    numero = new int[20]; // se reserva espacio para 20 enteros
    
    int[] cuadrado;
    cuadrado = new int[20];
    
    int[] cubo;
    cubo = new int[20];
    
    
    for (int i = 0; i <= 19; i++) {  // se carga el array numero con 20 números aleatorios.
      numero[i] = (int)(Math.random() * 100);
    }
    
    for (int i = 0; i <= 19; i++) {  // se carga el array cuarado con los cuadrados de numero.
      cuadrado[i] = (numero[i] * numero[i]);
    }
    
    for (int i = 0; i <= 19; i++) {  // se carga el array cubo con los cubos de numero.
      cubo[i] = (numero[i] * numero[i] * numero[i]);
    }
    System.out.println("I    n    I   n^2   I   n^3   I");
    System.out.println("-------------------------------");
    
    for (int i = 0; i <= 19; i++) {
      System.out.printf("I %4d    I %5d   I %6d  I\n", numero[i], cuadrado[i], cubo[i]);
    }
  }
}
