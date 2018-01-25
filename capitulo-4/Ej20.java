// Gonzalo Chaparro
// Ejercicio 20 - Capítulo 4

public class Ej20 {
  public static void main(String[] args) {
    
    String entrada;
    int n = 0;
    boolean esCapicua = false;
    
    System.out.println("Este programa nos dice si un número entero");
    System.out.println("positivo introducido por teclado es capicúa.");
    System.out.println("(SE PERMITEN NÚMEROS DE HASTA 5 CIFRAS)");
    System.out.println(" ");
    
    System.out.print("Por favor, introduce un número entero positivo (hasta 5 cifras): ");
    entrada = System.console().readLine();
    n = Integer.parseInt( entrada );
    
    if ((n <= 0) || (n >= 100000)) { //comprobación de errores
      System.out.println("¡El número debe ser positivo y debe tener menos de 5 cifras!");
    } else if (n < 10) { //una cifra
      esCapicua = true;
      
    } else if ((n >= 10) && (n < 100)) { //dos cifras
      if ((n / 10) == (n % 10)) {
        esCapicua = true;
      }
      
    } else if ((n >= 100) && (n < 1000)) { //tres cifras
      if ((n / 100) == (n % 10)) {
        esCapicua = true;
      }
      
    } else if ((n >= 1000) && (n < 10000)) { //cuatro cifras
      if (((n / 1000) == (n % 10)) && ((( n / 100 ) % 10)== (( n / 10) % 10))) {
        esCapicua = true;
      }
        
    } else if ((n >= 10000) && (n < 100000)) { //cinco cifras
      if (((n / 10000) == (n % 10) ) && ((((n / 1000) % 10)) == ((n / 10) % 10))) {
        esCapicua = true;
      }
    }
      
    if (esCapicua) {
      System.out.println("El número " + n + " es capicúa.");
    } else {
      System.out.println("El número " + n + " no es capicúa.");
    }
  }
}
