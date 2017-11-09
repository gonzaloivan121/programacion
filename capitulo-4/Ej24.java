// Gonzalo Chaparro
// Ejercicio 24 - Capítulo 4

public class Ej24 {
  public static void main(String[] args) {
    
    String entrada;
    
    System.out.println("Este programa genera una nómina según el cargo");
    System.out.println("del empleado, los días que ha estado de viaje y");
    System.out.println("su estado civil.");
    System.out.println("-----------------------------------------------");
    System.out.println(" ");
    
    System.out.println("1 - Programador junior.");
    System.out.println("2 - Programador senior.");
    System.out.println("3 - Jefe de proyecto.");
    System.out.print("Introduce el cargo del empleado (1 - 3): ");
    entrada = System.console().readLine();
    int cargo = Integer.parseInt( entrada );
    
    System.out.print("¿Cuántos días ha estado de viaje visitando clientes?: ");
    entrada = System.console().readLine();
    int dias = Integer.parseInt( entrada );
    
    System.out.println(" ");
    System.out.println("1 - Soltero.");
    System.out.println("2 - Casado.");
    System.out.print("Introduce el estado civil (1 o 2): ");
    entrada = System.console().readLine();
    int estCivil = Integer.parseInt( entrada );
    System.out.println(" ");    
    
    double sBase = 0;
    double dietas = 0;
    double sBruto = 0;
    double irpf = 0;
    double sNeto = 0;
    
    switch (cargo) {
      case 1:
        sBase = 950;
        dietas = (double)(30 * dias);
        sBruto = sBase + dietas;
        if (estCivil == 1) { //soltero
          irpf = sBruto * 0.25;
        } else if (estCivil == 2) { //casado
          irpf = sBruto * 0.20;
        } else {
          System.out.println("El estado civil tiene que ser Soltero o Casado.");
        }
        sNeto = sBruto - irpf;
        
        System.out.println("Sueldo base:            " + sBase);
        System.out.println("Dietas (" + dias + " viajes):      " + dietas);
        System.out.println("                       ----------");
        System.out.println("Sueldo bruto:           " + sBruto);
        System.out.println("Retención IRPF (25%):  " + irpf);
        System.out.println("                       ----------");
        System.out.println("Sueldo neto:            " + sNeto);
      break;
      case 2:
        sBase = 1200;
        dietas = (double)(30 * dias);
        sBruto = sBase + dietas;
        if (estCivil == 1) { //soltero
          irpf = sBruto * 0.25;
        } else if (estCivil == 2) { //casado
          irpf = sBruto * 0.20;
        } else {
          System.out.println("El estado civil tiene que ser Soltero o Casado.");
        }
        sNeto = sBruto - irpf;
        System.out.println("Sueldo base:            " + sBase);
        System.out.println("Dietas (" + dias + " viajes):      " + dietas);
        System.out.println("                       ----------");
        System.out.println("Sueldo bruto:           " + sBruto);
        System.out.println("Retención IRPF:  " + irpf);
        System.out.println("                       ----------");
        System.out.println("Sueldo neto:            " + sNeto);
      break;
      case 3:
        sBase = 1600;
        dietas = (double)(30 * dias);
        sBruto = sBase + dietas;
        if (estCivil == 1) { //soltero
          irpf = sBruto * 0.25;
        } else if (estCivil == 2) { //casado
          irpf = sBruto * 0.20;
        } else {
          System.out.println("El estado civil tiene que ser Soltero o Casado.");
        }
        sNeto = sBruto - irpf;
        System.out.println("Sueldo base:            " + sBase);
        System.out.println("Dietas (" + dias + " viajes):      " + dietas);
        System.out.println("                       ----------");
        System.out.println("Sueldo bruto:           " + sBruto);
        System.out.println("Retención IRPF (25%):  " + irpf);
        System.out.println("                       ----------");
        System.out.println("Sueldo neto:            " + sNeto);
      break;
      default:
        System.out.println("El cargo debe ser 1 - Programador junior, 2 - Programador senior o 3 - Jefe de proyecto.");
    }
  }
}
