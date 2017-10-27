//Gonzalo Chaparro
//Ejercicio 09 - Capítulo 3

public class Ej09 {
  public static void main(String[] args) {
    
    String entrada;
    
    System.out.println("Este programa calcula el volumen de un cono.");
    System.out.println(" ");
    
    int radio;
    int altura;
    double volumen;
    
    System.out.print("Introduce el radio del cono en cm: ");
    entrada = System.console().readLine();
    radio = Integer.parseInt(entrada);
    
    System.out.print("Introduce ahora la altura del cono en cm: ");
    entrada = System.console().readLine();
    altura = Integer.parseInt(entrada);
    
    
    volumen = (double)(((altura * 3.14) * (radio * radio)) / 3);
  
    System.out.println("Volumen del cono es de " + volumen + "cm3");
  }
}
