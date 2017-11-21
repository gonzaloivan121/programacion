// Gonzalo Chaparro
// Ejercicio 14 - Capítulo 5
public class Ej14 {
  public static void main(String[] args) {
    
    System.out.println("Este programa pide una base y un exponente");
    System.out.println("y calcula la potencia.");
    System.out.println(" ");
    
    String entrada;
    int base1 = 0;
    int base2 = 0;
    int exponente = 0;
    int potencia = 0;
    
    System.out.print("Introduzca la base: ");
    entrada = System.console().readLine();
    base1 = Integer.parseInt( entrada );
    base2 = base1;
     
    System.out.print("Introduzca ahora el exponente: ");
    entrada = System.console().readLine();
    exponente = Integer.parseInt( entrada );
    
    for (int i = exponente; i > 1; i--) {
      potencia = base1 * base2;
      base1 = potencia;
    }
    System.out.println("El resultado de la potencia " + base2 + "^" + exponente + " es: " + potencia);
  }
}
