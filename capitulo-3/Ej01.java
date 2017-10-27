// Gonzalo Chaparro
// Ejercicio 01 - Capítulo 3

public class Ej01 {
  public static void main(String[] args) {

    String entrada;
    
    System.out.println("Este programa pide dos números enteros y los multiplica.");
    System.out.println(" ");
    
    System.out.print("Por favor, introduce el primer número entero: ");
    entrada = System.console().readLine();
    int num1 = Integer.parseInt(entrada);
    
    System.out.print("Introduce ahora el segundo: ");
    entrada = System.console().readLine();
    
    int num2 = Integer.parseInt(entrada);
    
    int mult = num1 * num2;
    
    System.out.println("El primer número es " + num1);
    System.out.println("El segundo número es " + num2);
    System.out.println("El total es " + mult);
  }
}
