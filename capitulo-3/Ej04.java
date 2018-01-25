// Gonzalo Chaparro
// Ejercicio 04 - Capítulo 3

public class Ej04 {
  public static void main(String[] args) {

    String entrada;
    
    System.out.println("Este programa suma, resta, multiplica y divide dos");
    System.out.println("números enteros introducidos por teclado.");
    System.out.println(" ");
    
    System.out.print("Introduzca el primer número entero: ");
    entrada = System.console().readLine();
    int num1 = Integer.parseInt(entrada);
    
    System.out.print("Introduzca ahora el segundo: ");
    entrada = System.console().readLine();
    int num2 = Integer.parseInt(entrada);
    
    System.out.println("El primer número es " + num1 + ", el segundo, " + num2);
    
    int sum = num1 + num2;
    System.out.println("La suma de mis variables es " + sum + ".");
    
    int res = num1 - num2;
    System.out.println("La resta de mis variables es " + res + ".");
    
    int div = num1 / num2;
    System.out.println("La división de mis variables es " + div + ".");
    
    int mul = num1 * num2;
    System.out.println("La multiplicación de mis variables es " + mul + ".");   
  }
}
