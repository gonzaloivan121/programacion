// Gonzalo Chaparro
// Ejercicio 02 - Capítulo 6
public class Ej02 {
  public static void main(String[] args) {
    
    System.out.println("Este programa muestra al azar el nombre");
    System.out.println("de una carta de la baraja francesa.");
    System.out.println();
    
    String sPalo = "";
    String sCarta = "";
    int palo = (int)(Math.random() * 4);
    int carta = (int)(Math.random() * 13) + 1;
    
    switch (palo) {
      case 0:
        sPalo = "Picas";
        break;
      case 1:
        sPalo = "Corazones";
        break;
      case 2:
        sPalo = "Diamantes";
        break;
      case 3:
        sPalo = "Tréboles";
      default:
    }
    
    if (carta == 1) {
      sCarta = "A";
    } else if (carta == 11) {
      sCarta = "J";
    } else if (carta == 12) {
      sCarta = "Q";
    } else if (carta == 13) {
      sCarta = "K";
    } else {
      sCarta = String.valueOf(carta);
    }
    
    System.out.println("La carta es el: " + sCarta + " de " + sPalo);
  }
}
