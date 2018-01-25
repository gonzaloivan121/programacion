//Gonzalo Chaparro
//Ejercicio 02 - Capítulo 3

public class Ej02 {
  public static void main(String[] args) {
    
    String entrada;
    
    System.out.println("Este programa convierte la cantidad de euros");
    System.out.println("introducida por pantalla en pesetas.");
    System.out.println(" ");
    
    System.out.print("Por favor, introduce la cantidad en euros: ");
    entrada = System.console().readLine(); 
       
    double euros = Double.parseDouble(entrada);
    int pesetas = (int)(euros * 166.386);
  
    System.out.printf("%.2f euros son %d pesetas.", euros, pesetas);
  }
}
