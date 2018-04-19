//Gonzalo Chaparro
//Ejercicio 12- Capítulo 3

public class Ej12 {
  public static void main(String[] args) {
    
    String entrada;
    
    System.out.println("Este programa calcula la nota que se necesita sacar");
    System.out.println("en el segundo examen de la asignatura a partir de");
    System.out.println("la nota del primer examen y la nota final deseada.");
    System.out.println(" ");
    
    System.out.print("Por favor, introduce la nota del primer examen: ");
    entrada = System.console().readLine();
    double primerExamen = Double.parseDouble(entrada);
    
    System.out.println("¿Qué nota quieres sacar en el trimestre?");
    entrada = System.console().readLine();
    double notaFinal = Double.parseDouble(entrada);
    
    double segundoExamen = (((notaFinal * 100) - (primerExamen * 40)) / 60);
      
    System.out.println("Para sacar un " + notaFinal + " en el trimestre,");
    System.out.println("necesitas sacar un " + segundoExamen + " en el segundo examen.");
  }
}
