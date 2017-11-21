// Gonzalo Chaparro
// Ejercicio 07 - Capítulo 5
public class Ej07 {
  public static void main(String[] args) {
    
    System.out.println("Este programa realiza el control de acceso a");
    System.out.println("una caja fuerte con una combinación de 4 cifras.");
    System.out.println(" ");
    
    String entrada;
    int comb = 2707;
    int combIntr = 0;
    
    for (int i = 5; i > 0; i--) {
      if (i == 5) {
        System.out.print("Introduce la combinación para abrir la caja fuerte: ");
        entrada = System.console().readLine();
        combIntr = Integer.parseInt( entrada );
        
        if (combIntr == comb) { //comprueba si la combinación es correcta a la primera.
          System.out.println("La caja fuerte se ha abierto satisfactoriamente.");
          i = 0;
        } else {
          System.out.println("Lo siento, esa no es la combinación. Te queda(n) " + (i - 2) + " intento(s).");
          System.out.println(" ");
        }
      } else if ((i > 1) && (i < 4)) {
        System.out.print("Vuelve a intentarlo: ");
        entrada = System.console().readLine();
        combIntr = Integer.parseInt( entrada );
        
        if (combIntr == comb) { //comprueba si la combinación es correcta.
          System.out.println("La caja fuerte se ha abierto satisfactoriamente.");
          i = 0;
        } else {
          System.out.println("Lo siento, esa no es la combinación. Te queda(n) " + (i - 1) + " intento(s).");
          System.out.println(" ");
        }
        
      } else if (i == 1) {
        System.out.println("Esta es tu última oportunidad.");
        System.out.print("Vuelve a intentarlo: ");
        entrada = System.console().readLine();
        combIntr = Integer.parseInt( entrada );
        
        if (combIntr == comb) { //comprueba si la combinación es correcta por última vez.
          System.out.println("La caja fuerte se ha abierto satisfactoriamente.");
        } 
      }
    }
  }
}
