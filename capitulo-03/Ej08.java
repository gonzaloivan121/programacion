//Gonzalo Chaparro
//Ejercicio 08 - Capítulo 3

public class Ej08 {
  public static void main(String[] args) {
    
    String entrada;
    
    System.out.println("Este programa calcula el salario semanal de un empleado");
    System.out.println("en base a las horas trabajadas, a razón de 12Ꞓ la hora.");
    System.out.println(" ");
    
    int total;
    
    System.out.print("Introduce las horas trabajadas esta semana: ");
    entrada = System.console().readLine();
    int horasTrabajadas = Integer.parseInt(entrada);

    total = (horasTrabajadas * 12);
  
    System.out.println("El salario semanal es de " + total + "Ꞓ");
  }
}
