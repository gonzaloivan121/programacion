// Gonzalo Chaparro
// Ejercicio 13 - Capítulo 5
public class Ej13 {
  public static void main(String[] args) {
    
    System.out.println("Este programa lee una lista de 10 números y");
    System.out.println("determina cuántos son positivos y negativos.");
    System.out.println(" ");
    
    String entrada;
    int n = 0;
    int positivos = 0;
    int negativos = 0;
    
    System.out.println("Introduzca 10 números intercalados por Enter: ");
    
    for (int i = 0; i < 10; i++) {
      entrada = System.console().readLine();
      n = Integer.parseInt( entrada );
      if (n >= 0) {
        positivos++;        
      } else if (n < 0) {
        negativos++;
      }
    }
    System.out.println("Ha introducido " + positivos + " números positivos y " + negativos + " números negativos.");
  }
}
