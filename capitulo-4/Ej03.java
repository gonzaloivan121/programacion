// Gonzalo Chaparro
// Ejercicio 03 - Capítulo 4

public class Ej03 {
  public static void main(String[] args) {
    
    String entrada;
    
    System.out.println("Este programa escribe el correspondiente");
    System.out.println("nombre del día de la semana dado un");
    System.out.println("número del 1 al 7.");
    System.out.println("----------------------------------------");
    
    System.out.print("Introduce el día: ");
    entrada = System.console().readLine();
    int numDia = Integer.parseInt( entrada );
    
    switch(numDia) {
      case 1:
        System.out.println("Lunes.");
        break;
      
      case 2:
        System.out.println("Martes.");
        break;
        
      case 3:
        System.out.println("Miércoles.");
        break;
      
      case 4:
        System.out.println("Jueves.");
        break;
        
      case 5:
        System.out.println("Viernes.");
        break;
        
      case 6:
        System.out.println("Sábado.");
        break;
        
      case 7:
        System.out.println("Domingo.");
        break;
        
      default:
        System.out.println("Lo siento, el número introducido no es ");
        System.out.println("válido, no existem más de 7 días.");
    }
  }
}
