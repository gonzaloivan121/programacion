// Gonzalo Chaparro
// Ejercicio 02 - Capítulo 4

public class Ej02 {
  public static void main(String[] args) {
    
    String entrada;
    
    System.out.println("Este programa pide una hora por teclado y");
    System.out.println("dependiendo del intervalo de horas nos dice");
    System.out.println("buenos días, buenas tardes o buenas noches.");
    System.out.println(" ");
    
    System.out.print("Introduce un número entre el 1 y el 100: ");
    entrada = System.console().readLine();
    int n = Integer.parseInt( entrada );

    if ((n < 1) || (n > 100)) {
      System.out.println("El número introducido debe estar en el intervalo 1 - 100.");
      System.out.print("Tienes otra oportunidad, introduce un número: ");
      entrada = System.console().readLine();
      n = Integer.parseInt( entrada );
    }   
  
    if (n == 24) {
      System.out.println("¡Enhorabuena!, ¡has acertado!");
    } else {
      System.out.println("Lo siento, ese no es el número que estoy pensando.");
    }
  }
}
