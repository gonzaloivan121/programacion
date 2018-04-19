// Gonzalo Chaparro
// Ejercicio 08 - Capítulo 5
public class Ej08 {
  public static void main(String[] args) {
    
    System.out.println("Este programa muestra la tabla de multiplicar");
    System.out.println("de un número introducido por teclado.");
    System.out.println(" ");
    
    String entrada;
    int num = 0;
    int mult = 0;
    
    System.out.print("Introduce un número para mostrar su tabla de multiplicar: ");
    entrada = System.console().readLine();
    num = Integer.parseInt( entrada );
    
    System.out.println("Tabla del " + num);
    System.out.println(" ");
    for (int i = 1; i < 11; i++) {
      mult = num * i;
      System.out.println(num + " * " + i + " = " + mult);
    }
  }
}
