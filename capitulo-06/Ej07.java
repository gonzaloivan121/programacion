// Gonzalo Chaparro
// Ejercicio 07 - Capítulo 6
public class Ej07 {
  public static void main(String[] args) {
    
    System.out.println("Este programa muestra tres apuestas de la quiniela");
    System.out.println("en tres columnas para los 14 partidos y el pleno");
    System.out.println("al quince (15 filas).");
    System.out.println();
    
    for (int i = 1; i <= 14; i++) {
      
      System.out.printf("%3d.  ", i);
      
      for (int columna = 0; columna < 3; columna++) {
        int apuestaNum = ((int)(Math.random() * 3) + 1);
        String apuesta = "";
        
        switch (apuestaNum) {
          case 1:
            apuesta = " 1 ";
            break;
          
          case 2:
            apuesta = " X ";
            break;
          
          case 3:
            apuesta = " 2 ";
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
        
        switch (apuestaNum) {
          case 1:
            apuesta = " 1 ";
            break;
          
          case 2:
            apuesta = " X ";
            break;
          
          case 3:
            apuesta = " 2 ";
            break;
          
          default:
        }
        
        System.out.print("|" + apuesta);
      }
      System.out.println("|");
  }
}
