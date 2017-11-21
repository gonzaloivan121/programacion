// Gonzalo Chaparro
// Ejercicio 10 - Capítulo 5
public class Ej10 {
  public static void main(String[] args) {
    
    System.out.println("Este programa calcula la media de un conjunto");
    System.out.println("de números positivos introducidos por teclado.");
    System.out.println(" ");
    
    String entrada;
    double i = 0;
    double num = 0;
    double suma = 0;
    double media = 0;
    
    System.out.println("Introduce números enteros positivos intercalados por Enter.");
    System.out.println("Para terminar, introduce un número negativo: ");
    
    while (num >= 0) {
    entrada = System.console().readLine();
    num = Integer.parseInt( entrada );
    i++;
    suma += num; //le asigna el valor y al mismo tiempo lo suma
    }
    
    media = (suma - num)/(i - 1);
    System.out.println("La media de los números introducidos es: " + media);
  }
}
