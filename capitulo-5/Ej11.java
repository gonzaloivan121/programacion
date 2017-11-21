// Gonzalo Chaparro
// Ejercicio 11 - Capítulo 5
public class Ej11 {
  public static void main(String[] args) {
    
    System.out.println("Este programa muestra en tres columnas, el cuadrado");
    System.out.println("y el cubo de los 5 primeros números enteros a partir");
    System.out.println("de uno que se introduce por teclado.");
    System.out.println(" ");
    
    String entrada;
    int num = 0;
    
    System.out.print("Introduce un número: ");
    entrada = System.console().readLine();
    num = Integer.parseInt( entrada );
    
    for (int i = num; i < num + 5; i++) {
      System.out.printf("%3d %5d %7d\n", i, i * i, i * i * i);
    }
  }
}
