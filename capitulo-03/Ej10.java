//Gonzalo Chaparro
//Ejercicio 10 - Capítulo 3

public class Ej10 {
  public static void main(String[] args) {
    
    String entrada;
    
    System.out.println("Este programa convierte Mb a Kb.");
    System.out.println(" ");
    
    System.out.print("Por favor, introduce los Mb: ");
    entrada = System.console().readLine();
    int mb = Integer.parseInt(entrada);
    
    
    int kb = (mb * 1024);
  
    System.out.println(mb + "Mb son " + kb + "Kb.");
  }
}
