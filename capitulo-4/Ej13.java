// Gonzalo Chaparro
// Ejercicio 13 - Capítulo 4

public class Ej13 {
  public static void main(String[] args) {
    
    String entrada;
    
    System.out.println("Este programa ordena tres números");
    System.out.println("enteros introducidos por teclado.");
    System.out.println(" ");
    
    System.out.print("Introduce el primer número: ");
    entrada = System.console().readLine();
    int n1 = Integer.parseInt( entrada );
    
    System.out.print("Introduce ahora el segundo: ");
    entrada = System.console().readLine();
    int n2 = Integer.parseInt( entrada );
    
    System.out.print("Y por último, el tercero: ");
    entrada = System.console().readLine();
    int n3 = Integer.parseInt( entrada );
    
    int mayor = 0;
    int medio = 0;
    int menor = 0;
    
    if (((n1 > n2) && (n1 > n3)) && ((n2 < n1) && (n2 > n3))) {
      mayor = n1;
      medio = n2;
      menor = n3;
    } else if (((n2 > n1) && (n2 > n3)) && ((n1 < n2) && (n3 < n2))) {
      mayor = n2;
      medio = n1;
      menor = n3;
    } else if (((n3 > n1) && (n3 > n2)) && ((n1 < n3) && (n2 < n3))) {
      mayor = n3;
      medio = n2;
      menor = n1;
    }
    
    System.out.println(mayor + " > " + medio + " > " + menor + ".");
  }
}
