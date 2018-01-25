//Gonzalo Chaparro
//Ejercicio 05 - Capítulo 3

public class Ej05 {
  public static void main(String[] args) {
    
    String entrada;
    
    System.out.println("Este programa calcula el área de un rectángulo.");
    System.out.println(" ");
    
    System.out.print("Introduce la base del rectángulo en cm: ");
    entrada = System.console().readLine();        
    int base = Integer.parseInt(entrada);
    
    System.out.print("Introduce ahora la altura en cm: ");
    entrada = System.console().readLine();        
    int altura = Integer.parseInt(entrada);
    
    int area = base * altura;
  
    System.out.println("El área del rectángulo de " + base + "x" + altura + " es: " + area + "cm2.");
  }
}
