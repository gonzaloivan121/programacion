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
    
    System.out.print("Introduce ahora el tipo de IVA (general, reducido o superreducido): ");
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
    double totalDescuento = 0;
    
    switch (tipoIva) {
      case "general":
        iva = (bImp * ivaGeneral);
        precioConIva = (bImp + iva);
        switch (cProm) {
          case "nopro":
            total = precioConIva;
          break;  
          case "mitad":
            total = precioConIva / 2;
          break;
          case "meno5":
            total = precioConIva - 5;
          break;
          case "5porc":
            total = (precioConIva * 0.05) - precioConIva;
          break;
          default:
            System.out.println("La opción seleccionada no existe.");
        }
      break;
      case "reducido":
        iva = (bImp * ivaReducido);
        precioConIva = (bImp + iva);
        switch (cProm) {
          case "nopro":
            total = precioConIva;
          break;  
          case "mitad":
            total = precioConIva / 2;
          break;
          case "meno5":
            total = precioConIva - 5;
          break;
          case "5porc":
            total = (precioConIva * 0.05) - precioConIva;
          break;
          default:
            System.out.println("La opción seleccionada no existe.");
        } 
      break;
      case "superreducido":
        iva = (bImp * ivaSuperreducido);
        precioConIva = (bImp + iva);
        switch (cProm) {
          case "nopro":
            total = precioConIva;
            break;  
          case "mitad":
            total = precioConIva / 2;
            break;
          case "meno5":
            total = precioConIva - 5;
            break;
          case "5porc":
            total = (precioConIva * 0.05) - precioConIva;
            break;
            default:
            System.out.println("La opción seleccionada no existe.");
        }
      break;
      default:
        System.out.println("EL IVA seleccionado no existe.");
    }
    System.out.println("Base imponible:    " + bImp);
    System.out.println("IVA:               " + iva );
    System.out.println("Precio con IVA:    " + precioConIva);
    System.out.println("Cod. Promo:        " + cProm);
    System.out.println("TOTAL:             " + total);
  }
}
