// Gonzalo Chaparro
// Ejercicio 03 - Capítulo 6
public class Ej03 {
  public static void main(String[] args) {
    
    System.out.println("Este programa muestra al azar el nombre");
    System.out.println("de una carta de la baraja española.");
    System.out.println();
    
    String sPalo = "";
    String sCarta = "";
    int palo = (int)(Math.random() * 4);
    int carta = (int)(Math.random() * 11) + 1;
    
    switch (palo) {
      case 0:
        sPalo = "Copas";
        break;
      case 1:
        sPalo = "Oro";
        break;
      case 2:
        sPalo = "Espadas";
        break;
      case 3:
        sPalo = "Basto";
      default:
    }
    
    if (carta == 1) {
      sCarta = "As";
    } else if (carta == 8) {
      sCarta = "Sota";
    } else if (carta == 9) {
      sCarta = "Caballo";
    } else if (carta == 10) {
      sCarta = "Rey";
    } else {
      sCarta = String.valueOf(carta);
    }
    
    System.out.println("La carta es el: " + sCarta + " de " + sPalo);
  }
}
