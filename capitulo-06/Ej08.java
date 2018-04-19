// Gonzalo Chaparro
// Ejercicio 08 - Capítulo 6
public class Ej08 {
  public static void main(String[] args) {
    
    System.out.println("Este programa muestra tres apuestas de la quiniela");
    System.out.println("en tres columnas para los 14 partidos y el pleno");
    System.out.println("al quince (15 filas).");
    System.out.println();
    
    for (int i = 1; i <= 14; i++) {
      int random = (int)((Math.random() * 100) + 1);
      
      System.out.printf("%3d.  ", i);
      
      for (int columna = 0; columna < 3; columna++) {
        int apuestaNum = ((int)(Math.random() * 3) + 1);
        String apuesta = "";
        
        switch (apuestaNum) {
          case 1:
            if (random <= 50) {
              apuesta = " o ";
            } else {
              apuesta = " 1 ";
            }
            break;
          
          case 2:
            if (random <= 33) {
              apuesta = " o ";
            } else {
              apuesta = " X ";
            }
            break;
          
          case 3:
            if (random <= 16) {
              apuesta = " o ";
            } else {
              apuesta = " 2 ";
            }
            break;
          
          default:
        }
        
        System.out.print("|" + apuesta);
      }
      System.out.println("|");
    } // for i (lineas
    System.out.println();
    System.out.println(" Pleno al 15.");
    System.out.printf("%3d.  ", 15);
      
      for (int columna = 0; columna < 3; columna++) {
        int apuestaNum = ((int)(Math.random() * 3) + 1);
        String apuesta = "";
        int random = (int)((Math.random() * 100) + 1);
        
        switch (apuestaNum) {
          case 1:
            if (random <= 50) {
              apuesta = " o ";
            } else {
              apuesta = " 1 ";
            }
            break;
          
          case 2:
            if (random <= 33) {
              apuesta = " o ";
            } else {
              apuesta = " X ";
            }
            break;
          
          case 3:
            if (random <= 16) {
              apuesta = " o ";
            } else {
              apuesta = " 2 ";
            }
            break;
          
          default:
        }
        
        System.out.print("|" + apuesta);
      }
      System.out.println("|");
  }
}
