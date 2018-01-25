// Gonzalo Chaparro
// Ejercicio 07 - Capítulo 7
public class Ej07 {
  public static void main(String[] args) {
    
    System.out.println("Este programa genera 100 números aleatorios");
    System.out.println("entre 0 y 20 y sustituye todas las ocurrencias");
    System.out.println("de un primer valor pedido por teclado por un");
    System.out.println("segundo valor también pedido por teclado.");
    System.out.println();
    
    int[] num; // se define num como un array de números
    num = new int[100]; // se reserva espacio para 100 números
    
    for (int i = 0; i < 100; i++) {  // se carga el array numero con 10 números por teclado.
      num[i] = (int)(Math.random() * 21);
      System.out.print(num[i] + " ");
    }
    System.out.println("\n");
    
    System.out.print("Introduce el número a cambiar: ");
    int nACambiar = Integer.parseInt( System.console().readLine() );
    
    System.out.print("Introduce el valor a ser cambiado: ");
    int nCambiado = Integer.parseInt( System.console().readLine() );
    
    System.out.println("\n");
    for (int i = 0; i < 100; i++) {
      if (num[i] == nACambiar) {
        num[i] = nCambiado;
        System.out.print("'" + num[i] + "' ");
      } else {
        System.out.print(num[i] + " ");
      }
    }
  }
}
