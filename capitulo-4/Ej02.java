// Gonzalo Chaparro
// Ejercicio 02 - Capítulo 4

public class Ej02 {
  public static void main(String[] args) {
    
    String entrada;
    
    System.out.println("Este programa pide una hora por teclado y");
    System.out.println("dependiendo del intervalo de horas nos dice");
    System.out.println("buenos días, buenas tardes o buenas noches.");
    System.out.println(" ");
    
    System.out.print("Introduce una hora entre las 0 y las 23: ");
    entrada = System.console().readLine();
    int hora = Integer.parseInt( entrada );

    if ((hora < 0) || (hora > 23)) {
      System.out.println("Lo siento, la hora introducida no es correcta (0 - 23).");
    } else if ((hora >= 0) && (hora <= 5)) {
      System.out.println("Buenas noches.");
    } else if ((hora >= 6) && (hora <= 12)) {
      System.out.println("Buenos días.");
    } else if ((hora >= 13) && (hora <= 20)) {
      System.out.println("Buenas tardes.");
    } else if ((hora >= 21) && (hora <= 23)) {
      System.out.println("Buenas noches.");
    }
  }
}
