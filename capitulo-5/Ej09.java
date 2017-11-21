// Gonzalo Chaparro
// Ejercicio 09 - Capítulo 5
public class Ej09 {
  public static void main(String[] args) {
    
    System.out.println("Este programa nos dice cuántos dígitos");
    System.out.println("tiene un número introducido por teclado.");
    System.out.println(" ");
    
    String entrada;
    int i = 0;
    int num = 0;
    int aux = 0;
    int cuentaDigitos = 0;
    int numCortado = 0;
    
    System.out.print("Introduce un número para mostrar cuántos dígitos tiene: ");
    entrada = System.console().readLine();
    num = Integer.parseInt( entrada );
    aux = num;
    
    while (i < 11){
      numCortado = num / 10;
      num = numCortado;
      cuentaDigitos++;
      i++;
      if (numCortado == 0){
        i = 11;
      }
    }
    System.out.println("El número " + aux + " tiene " + cuentaDigitos + " dígito(s).");
  }
}
