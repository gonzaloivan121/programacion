// Gonzalo Chaparro
// Ejercicio 06 - Capítulo 6
public class Ej06 {
  public static void main(String[] args) {
    
    System.out.println("Este programa piensa un número aleatorio entre");
    System.out.println("0 y 100. El usuario debe adivinarlo y tiene");
    System.out.println("para ello 5 intentos.");
    System.out.println();
    
    String entrada;
    int numAAdivinar = (int)(Math.random() * 100);
    int combIntr = 0;
    
    System.out.print("Adivina el número en el que estoy pensando: ");
    for (int i = 5; i > 0; i--) {
      entrada = System.console().readLine();
      combIntr = Integer.parseInt( entrada );
      
      if (combIntr == numAAdivinar) {
        System.out.println("¡Correcto! Lo has adivinado.");
        i = 0;
        
      } else {
        System.out.println("Lo siento, has fallado. Te quedan " + (i - 1) + " intentos.");
      }
      
      if (combIntr > numAAdivinar) {
        System.out.println("El número es más pequeño.");
      } else if (combIntr < numAAdivinar) {
        System.out.println("El número es más grande.");
      }
    }
  }
}
