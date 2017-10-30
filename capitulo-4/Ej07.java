// Gonzalo Chaparro
// Ejercicio 07 - Capítulo 4

public class Ej07 {
  public static void main(String[] args) {
    
    String entrada;
    
    System.out.println("Este programa calcula la media de tres notas.");
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
    
    double media = (n1 + n2 + n3) / 3;
    
    System.out.printf("La media de %.2f, %.2f y %.2f es de: %.2f", n1, n2, n3, media);
  }
}


