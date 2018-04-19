// Gonzalo Chaparro
// Ejercicio 14 - Capítulo 4

public class Ej14 {
  public static void main(String[] args) {
    
    String entrada;
    
    System.out.println("Este programa dice si un número introducido");
    System.out.println("por teclado es par y/o divisible entre 5.");
    System.out.println(" ");
    
    System.out.print("Por favor, introduce un número: ");
    entrada = System.console().readLine();
    int numero = Integer.parseInt( entrada );
    
    
    if ((numero %2 == 0) && (numero %5 == 0)) {
      System.out.println("El número introducido es par y divisible entre 5.");
    } else if ((numero %2 != 0) && (numero %5 == 0)) {
      System.out.println("El número introducido divisible entre 5, pero no es par.");
    } else if ((numero %2 == 0) && (numero %5 != 0)) {
      System.out.println("El número introducido es par, pero no divisible entre 5.");
    }
  }
}
