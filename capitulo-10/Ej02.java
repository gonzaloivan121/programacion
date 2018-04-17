import java.util.ArrayList;
import java.util.Collections;

public class Ej02 {
  public static void main(String[] args) {

    ArrayList<Integer> a = new ArrayList<Integer>();

    int tamano = (int)(Math.random() * 11 + 10);
    
    System.out.println("Tamaño de la lista: " + tamano);
    
    for (int i = 0; i < tamano; i++) {
      int n = (int)(Math.random() * 100);
      a.add(n);
    }

    System.out.println();
    System.out.println(a);
    
    int suma = 0;
    for (int s : a) {
      suma += s;
    }
    
    int media = 0;
    for (int s : a) {
      suma += s;
      media = suma / a.size();
    }
    
    int max = 0;
    for (int s : a) {
      if (s >= max) {
        max = s;
        
      } else {
        max = max;
      } 
    }
    
    int min = 101;
    for (int s : a) {
      if (s <= min) {
        min = s;
        
      } else {
        min = min;
      } 
    }
    
    //int max = Collections.max(a);
    //int min = Collections.min(a);
    
    System.out.println();
    System.out.println("La suma de la lista es: " + suma);
    System.out.println("La media de la lista es: " + media);
    System.out.println("El máximo de la lista es: " + max);
    System.out.println("El mínimo de la lista es: " + min);
    
  }
}
