// Gonzalo Chaparro
// Ejercicio 23 - Capítulo 4

public class Ej23 {
  public static void main(String[] args) {
    
    String entrada;
    
    System.out.println("Este programa calcula el precio final de un producto");
    System.out.println("según su base imponible, el tipo de IVA aplicado");
    System.out.println("y el código promocional.");
    System.out.println(" ");
    
    System.out.print("Introduce la base imponible: ");
    entrada = System.console().readLine();
    double bImp = Double.parseDouble( entrada );
    
    System.out.print("Introduce ahora el tipo de IVA (general, reducido o superreducido: ");
    entrada = System.console().readLine();
    String tipoIva = entrada;
    
    System.out.print("Por último, introduce el código promocional (nopro, mitad, meno5 o 5porc): ");
    entrada = System.console().readLine();
    String cProm = entrada;
    
    double total = 0;
    double iva = 0;
    double ivaGeneral = 0.21;
    double ivaReducido = 0.10;
    double ivaSuperreducido = 0.04;
    double precioConIva = 0;
    
    switch (tipoIva) {
      case "general":
        iva = (bImp * ivaGeneral);
        precioConIva = (bImp + iva);
        switch (cProm) {
          case "nopro":
            
          
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
