//Gonzalo Chaparro
//Ejercicio 06 - Capítulo 3

public class Ej06 {
  public static void main(String[] args) {
    
    String entrada;
    
    System.out.println("Este programa calcula el área de un triángulo.");
    System.out.println(" ");
    
    System.out.print("Introduce la base del triángulo en cm: ");
    entrada = System.console().readLine();        
    int base = Integer.parseInt(entrada);
    
    System.out.print("Introduce ahora la altura en cm: ");
    entrada = System.console().readLine();        
    int altura = Integer.parseInt(entrada);
    
    int area = (base * altura)/2;
  
    System.out.println("El área del rectángulo de " + base + "x" + altura + " es: " + area + "cm2.");
  }
}
