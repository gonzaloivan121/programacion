//Gonzalo Chaparro
//Ejercicio 06 - Capítulo 2

public class Ej06 {
  public static void main(String[] args) {
    
    double bImp;
    double iva;
    double total;
    
    bImp = 35.99;
    iva = (bImp * 0.21);
    total = (bImp + iva);    
  
    System.out.printf("La base imponible es: %.2fꞒ\n", bImp);
    System.out.printf("El IVA es: %.2fꞒ\n", iva );
    System.out.printf("El precio total es: %.2fꞒ\n", total);
  }
}
