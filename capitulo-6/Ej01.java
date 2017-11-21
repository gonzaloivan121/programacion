// Gonzalo Chaparro
// Ejercicio 01 - Capítulo 6
public class Ej01 {
  public static void main(String[] args) {
    
    System.out.println("Este programa muestra la tirada de tres dados.");
    System.out.println("Se muestra también la suma total de los puntos.");
    System.out.println();
    
    int d1 = (int)(Math.random() * 6) + 1;
    int d2 = (int)(Math.random() * 6) + 1;
    int d3 = (int)(Math.random() * 6) + 1;
    
    System.out.println("Dado 1: " + d1);
    System.out.println("Dado 2: " + d2);
    System.out.println("Dado 3: " + d3);
    System.out.println();
    System.out.println("La suma del resultado de los dados es: " + (d1+d2+d3));
  }
}
