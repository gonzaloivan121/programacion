// Gonzalo Chaparro
// Ejercicio 02 - Capítulo 7
public class Ej02 {
  public static void main(String[] args) {
    
    System.out.println("Este programa define un array de 10 caracteres y");
    System.out.println("asigna valores a los elementos según una tabla.");
    System.out.println();
    
    char[] simbolo; // se define simbolo como un array de caracteres
    simbolo = new char[10]; // se reserva espacio para 10 caracteres
            
    simbolo[0] = 'a';
    simbolo[1] = 'x';
    simbolo[4] = '@';
    simbolo[6] = ' ';
    simbolo[7] = '+';
    simbolo[8] = 'Q';
    
    for (int i = 0; i <= 9; i++) {
      System.out.println("Indice: " + i);
      System.out.println("Valor: " + simbolo[i]);
      System.out.println();
    }
  }
}

// Los valores de los elementos que no han sido inicializados
// se inicializan automáticamente a un espacio en blanco.
