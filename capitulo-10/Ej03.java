import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ej03 {
  public static void main(String[] args) {

    ArrayList<Integer> a = new ArrayList<Integer>();
    
    System.out.println("A continuación, introduzca 10 números seguidos de Intro: ");
    
    for (int i = 0; i < 10; i++) {
      Scanner s = new Scanner(System.in);
      int n = Integer.parseInt(s.nextLine());;
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
