import java.util.ArrayList;

public class Ej01 {
  public static void main(String[] args) {

    ArrayList<String> clase = new ArrayList<String>();

    clase.add("Gonzalo");
    clase.add("Jesús");
    clase.add("Alex");
    clase.add("Adri");
    clase.add("Germán");
    clase.add("Carmen");

    System.out.println("6 alumnos de clase: ");
    System.out.println();

    for(String nombre : clase) {
      System.out.println(nombre);
    }
  }
}
