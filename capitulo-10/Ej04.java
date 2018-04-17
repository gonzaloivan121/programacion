import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ej04 {
  public static void main(String[] args) {

    ArrayList<String> a = new ArrayList<String>();
    
    System.out.println("A continuación, introduzca 10 palabras seguidas de Intro: ");
    
    for (int i = 0; i < 10; i++) {
      Scanner s = new Scanner(System.in);
      String n = s.nextLine();;
      a.add(n);
      System.out.println(a + "\n");
    }

    System.out.println();
    System.out.println("Su array sin ordenar es:\n " + a);
    
    Collections.sort(a);
    
    System.out.println();
    System.out.println("Su array ordenado es:\n " + a);
  }
}
