//Gonzalo Chaparro
//Ejercicio 04 - Capítulo 4

public class Ej04 {
  public static void main(String[] args) {
    
    String entrada;
    
    System.out.println("Este programa calcula el salario semanal de un empleado");
    System.out.println("en base a las horas trabajadas, a razón de 12Ꞓ la hora");
    System.out.println("hasta las 40 primeras horas, luego será a 16Ꞓ la hora.");
    System.out.println(" ");
    
    int total;
    
    System.out.print("Introduce las horas trabajadas esta semana: ");
    entrada = System.console().readLine();
    int horasTrabajadas = Integer.parseInt(entrada);
    
    if (horasTrabajadas <= 40) {
      total = (horasTrabajadas * 12);
      } else {
        total = (horasTrabajadas * 16);
      }
    System.out.println("El salario semanal es de " + total + "Ꞓ");
  }
}
