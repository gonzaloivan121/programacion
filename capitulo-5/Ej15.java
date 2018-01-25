// Gonzalo Chaparro
// Ejercicio 15 - Capítulo 5
public class Ej15 {
  public static void main(String[] args) {
    
    System.out.println("Este programa pide una base y un exponente y saca");
    System.out.println("por pantalla todas las potencias con base el");
    System.out.println("número dado y exponentes entre uno y el introducido.");
    System.out.println(" ");
    
    String entrada;
    double base = 0;
    int exponente = 0;
    int exFinal = 0;
    double potencia = 0;
    
    System.out.print("Introduce un número real para la base: ");
    entrada = System.console().readLine();
    base = Integer.parseInt( entrada );
     
    System.out.print("Introduce ahora el exponente: ");
    entrada = System.console().readLine();
    exFinal = Integer.parseInt( entrada );
    
    for (int i = 1; i <= exFinal; i++) {
      potencia = 1;
      exponente = i;
      
      for (int j = 0; j < exponente; j++) {
        potencia *= base;
      }
      System.out.println(base + "^" + i + " = " + potencia);
    }
  }
}
