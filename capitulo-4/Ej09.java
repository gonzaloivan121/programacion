// Gonzalo Chaparro
// Ejercicio 09 - Capítulo 4

public class Ej09 {
  public static void main(String[] args) {
    
    String entrada;
    
    System.out.println("Este programa resuelve una ecucación de segundo grado.");
    System.out.println(" ");
    
    System.out.print("Introduce el valor de a: ");
    entrada = System.console().readLine();
    double a = Double.parseDouble( entrada );
    
    System.out.print("Introduce ahora el valor de b: ");
    entrada = System.console().readLine();
    double b = Double.parseDouble( entrada );
    
    System.out.print("Introduce por último el valor de c: ");
    entrada = System.console().readLine();
    double c = Double.parseDouble( entrada );
    
    double discriminante = 0;
    double x1 = 0;
    double x2 = 0;
    
    if ((a == 0) && (b == 0) && (c == 0)) { //0x^2 + 0x + 0 = 0
      System.out.println("La ecuación tiene infinitas soluciones.");
    } else if ((a == 0) && (b == 0) && (c != 0)) {
      System.out.println("La ecuación no tiene solución.");
    } else if ((a != 0) && (b != 0) && (c == 0)) { //tiene dos soluciones, una x = 0 y luego se convierte en una eciación de primer grado.
      System.out.println("x1 = 0");
      System.out.println("x2 = " + (-b / a));
    } else if ((a == 0) && (b != 0) && (c != 0)) {
      System.out.println("x1 es igual a x2 y x2 = " + (-c / b));
    } else if ((a != 0) && (b != 0) && (c != 0)) {
      discriminante = ((b * b) - (4 * a * c));
      
      if (discriminante < 0) {
        System.out.println("La ecuación no tiene solución en los números R");
      } else {
        x1 = (-b + Math.sqrt(discriminante))/(2 * a);
        x2 = (-b - Math.sqrt(discriminante))/(2 * a);
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
      }
    }  
  }
}

// x = -b +- raiz cuadrada de (b^2 - 4*a*c)
//     ----------------------------------------------
//                         2 * a
