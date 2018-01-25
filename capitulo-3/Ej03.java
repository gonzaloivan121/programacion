//Gonzalo Chaparro
//Ejercicio 03 - Capítulo 3

public class Ej03 {
  public static void main(String[] args) {
    
    String entrada;
    
    System.out.println("Este programa convierte la cantidad de pesetas");
    System.out.println("introducida por pantalla en euros.");
    System.out.println(" ");
    
    System.out.print("Por favor, introduce la cantidad en pesetas: ");
    entrada = System.console().readLine(); 
       
    int pesetas = Integer.parseInt(entrada);
    double euros;
    
    euros = (double)(pesetas / 166.386);
  
    System.out.printf("%d pesetas son %.2f euros.", pesetas, euros);
  }
}
