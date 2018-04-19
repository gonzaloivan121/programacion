// Gonzalo Chaparro
// Ejercicio 08 - Capítulo 4

public class Ej08 {
  public static void main(String[] args) {
    
    String entrada;
    
    System.out.println("Este programa calcula la media de tres notas");
    System.out.println("y además dice la nota del boletín.");
    System.out.println(" ");
    
    System.out.print("Introduce la primera nota: ");
    entrada = System.console().readLine();
    double n1 = Double.parseDouble( entrada );
    
    System.out.print("Introduce ahora la segunda nota: ");
    entrada = System.console().readLine();
    double n2 = Double.parseDouble( entrada );
    
    System.out.print("Y ahora la tercera: ");
    entrada = System.console().readLine();
    double n3 = Double.parseDouble( entrada );
    
    System.out.println(" ");
    
    double media = (n1 + n2 + n3) / 3;
    System.out.printf("La media de %.2f, %.2f y %.2f es de: %.2f\n", n1, n2, n3, media);
    
    
    if (media < 4) {
      System.out.println("Lo siento, tienes un insuficiente.");
    } else if ((media >= 5) && (media <= 6)) {
      System.out.println("Has aprobado, tienes un bien.");
    } else if ((media >= 7) && (media <= 8)) {
      System.out.println("Genial, tienes un notable.");
    } else if (media >= 9) {
      System.out.println("¡Enhorabuena, tienes un sobresaliente!.");
    } 
    
    if (media == 10) {
      System.out.println("¡Y además matrícula de honor!");
    }
  }
}


