// Gonzalo Chaparro
// Ejercicio 06 - Capítulo 4

public class Ej06 {
  public static void main(String[] args) {
    
    String entrada;
    
    System.out.println("Este programa calcula el tiempo que tardará en ");
    System.out.println("caer un objeto desde una altura h.");
    System.out.println(" ");
    
    System.out.print("Introduce el valor de h: ");
    entrada = System.console().readLine();
    double h = Double.parseDouble( entrada );
    double t = 0;
    
    if (h <= 0) {
      System.out.println("Lo siento, la altura no puede ser negativa o igual a 0.");
    } else {
      t = Math.sqrt((2 * h) / 9.81);
    } 
    System.out.printf("El tiempo que tardará en caer el objeto desde %.2fm es de: %.2f segundos.", h, t);
  }
}


