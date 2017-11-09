// Gonzalo Chaparro
// Ejercicio 22 - Capítulo 4

public class Ej22 {
  public static void main(String[] args) {
    
    String entrada;
    
    System.out.println("Este programa calcula cuántos minutos faltan para");
    System.out.println("el fin de semana (viernes 15:00h) a partir de un");
    System.out.println("día y hora introducida por teclado.");
    System.out.println(" ");
    
    System.out.print("Introduce el día de la semana: ");
    entrada = System.console().readLine();
    String dia = entrada;
    
    System.out.print("Introduce ahora la hora: ");
    entrada = System.console().readLine();
    int hora = Integer.parseInt( entrada );
    
    System.out.print("Por último, introduce los minutos: ");
    entrada = System.console().readLine();
    int min = Integer.parseInt( entrada );
    
    int minRestantes = 0;
    
    switch (dia) {
      case "lunes":
        minRestantes = (6660 - ((hora * 60) + min));
        System.out.println("Desde el Lunes a las " + hora + ":" + min);
        System.out.println("Hasta el Viernes a las 15:00 hay " + minRestantes + " minutos.");
        break;
      case "martes":
        minRestantes = (5220 - ((hora * 60) + min));
        System.out.println("Desde el Martes a las " + hora + ":" + min);
        System.out.println("Hasta el Viernes a las 15:00 quedan " + minRestantes + " minutos.");
        break;
      case "miercoles":
        minRestantes = (3780 - ((hora * 60) + min));
        System.out.println("Desde el Miércoles a las " + hora + ":" + min);
        System.out.println("Hasta el Viernes a las 15:00 quedan " + minRestantes + " minutos.");
        break;
      case "jueves":
        minRestantes = (2340 - ((hora * 60) + min));
        System.out.println("Desde el Jueves a las " + hora + ":" + min);
        System.out.println("Hasta el Viernes a las 15:00 quedan " + minRestantes + " minutos.");
        break;
      case "viernes":
        minRestantes = (900 - ((hora * 60) + min));
        
        if (minRestantes == 1) {
          System.out.println("Desde el Jueves a las " + hora + ":" + min);
          System.out.println("Hasta el Viernes a las 15:00 queda " + minRestantes + " minuto.");
        } else {
          System.out.println("Desde el Jueves a las " + hora + ":" + min);
          System.out.println("Hasta el Viernes a las 15:00 quedan " + minRestantes + " minutos.");
        } 
      break;
      default:
        System.out.println("El máximo es hasta el Viernes a las 14:59.");
    }
  }
}


// 5 días = 120 horas
// 120 horas = 7200 minutos

// viernes = 5760 minutos
// hasta las 3 = 900

// 5760 + 900 = 6660
