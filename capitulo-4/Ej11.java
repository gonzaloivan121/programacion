// Gonzalo Chaparro
// Ejercicio 11 - Capítulo 4

public class Ej11 {
  public static void main(String[] args) {
    
    String entrada;
    
    System.out.println("Este programa calcula los segundos que faltan para");
    System.out.println("llegar a medianoche a partir de la hora y los minutos.");
    System.out.println(" ");
    
    System.out.print("Introduce la hora: ");
    entrada = System.console().readLine();
    int hora = Integer.parseInt( entrada );
    
    System.out.print("Introduce ahora los minutos: ");
    entrada = System.console().readLine();
    int minuto = Integer.parseInt( entrada );
    
    int segundosEnUnDia = (24 * 60) * 60;
    int segundosQueHanPasado = ((hora * 60) * 60) - (minuto * 60);
    int segundosRestantes = segundosEnUnDia - segundosQueHanPasado;
    
    System.out.println("Los segundos restantes hasta medianoche son: " + segundosRestantes);
  }
}
