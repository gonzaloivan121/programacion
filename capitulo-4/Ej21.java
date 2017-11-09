// Gonzalo Chaparro
// Ejercicio 21 - Capítulo 4

public class Ej21 {
  public static void main(String[] args) {
    
    String entrada;
    
    System.out.println("Este programa calcula la nota de un trimestre.");
    System.out.println("Pide dos notas y si da más de 5 está aprobado,");
    System.out.println("si da menos de 5 debe hacer recuperación,la cual");
    System.out.println("se puntúa en apto/no apto.");
    System.out.println(" ");
    
    System.out.print("Introduce la nota del primer control: ");
    entrada = System.console().readLine();
    double n1 = Double.parseDouble( entrada );
    
    System.out.print("Introduce ahora la nota del segundo control: ");
    entrada = System.console().readLine();
    double n2 = Double.parseDouble( entrada );
    
    double media = ((n1 + n2) / 2);
    
    if (media >= 5) {
      System.out.println("Felicidades, has aprobado.");
    } else if (media < 5) {
      System.out.println("Has suspendido, tienes que hacer recuperación.");
      System.out.print("¿Cuál ha sido el resultado de la recuperación? (apto/no apto): ");
      entrada = System.console().readLine();
      String rec = entrada;
      if (rec.equals("apto")) {
        media = 5;
      }
    }
    System.out.println("Tu nota de programación es: " + media);
  }
}
