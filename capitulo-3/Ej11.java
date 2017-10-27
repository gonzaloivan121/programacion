//Gonzalo Chaparro
//Ejercicio 11 - Capítulo 3

public class Ej11 {
  public static void main(String[] args) {
    
    String entrada;
    
    System.out.println("Este programa convierte Kb a Mb.");
    System.out.println(" ");
    
    System.out.print("Por favor, introduce los Kb: ");
    entrada = System.console().readLine();
    int kb = Integer.parseInt(entrada);
    
    
    int mb = (kb / 1024);
  
    System.out.println(kb + "Kb son " + mb + "Mb.");
  }
}
