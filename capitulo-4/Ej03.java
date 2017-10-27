// Gonzalo Chaparro
// Ejercicio 03 - Capítulo 4

public class Ej03 {
  public static void main(String[] args) {
    
    String entrada;
    
    System.out.println("Este programa resuelve una ecuación de");
    System.out.println("primer grado (del tipo ax + b = 0)");
    System.out.println("----------------------------------------");
    
    System.out.print("Introduce el valor de a: ");
    entrada = System.console().readLine();
    int a = Integer.parseInt( entrada );
    
    System.out.print("Introduce ahora el valor de b: ");
    entrada = System.console().readLine();
    int b = Integer.parseInt( entrada );

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
