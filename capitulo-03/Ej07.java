//Gonzalo Chaparro
//Ejercicio 07 - Capítulo 3

public class Ej07 {
  public static void main(String[] args) {
    
    String entrada;
    
    System.out.println("Este programa calcula el total de una");
    System.out.println("factura a partir de la base imponible.");
    System.out.println(" ");
    
    double iva;
    double total;
    
    System.out.print("Introduce la base imponible: ");
    entrada = System.console().readLine();        
    double bImp = Double.parseDouble(entrada);

    iva = (bImp * 0.21);
    total = (bImp + iva);    
  
    System.out.printf("La base imponible es: %.2fꞒ\n", bImp);
    System.out.printf("El IVA es: %.2fꞒ\n", iva );
    System.out.printf("El precio total es: %.2fꞒ\n", total);
  }
}
