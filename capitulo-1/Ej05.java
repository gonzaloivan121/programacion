//Gonzalo Chaparro
//Ejercicio 05- Capítulo 1

public class Ej05{
  public static void main(String[] args) {
    String rojo = "\033[31m";
    String verde = "\033[32m";
    
    System.out.println("\tLunes\tMartes\tMiérc.\tJueves.\tViernes");
    System.out.println("\t======\t=======\t======\t======\t======");
    System.out.println("8:15\t\t" + rojo+"PROG\t\tPROG\tPROG");
    System.out.println("9:15\t\tPROG\t\tPROG\tPROG");
    System.out.println("10:15\t\tPROG\t\t\tPROG");
    System.out.println("11:45\t\tSIS\t\t\t");
    System.out.println("12:45\t\tSIS\t\t\t");
    System.out.println("13:45\t\tSIS\t\t\t");
  }
}
