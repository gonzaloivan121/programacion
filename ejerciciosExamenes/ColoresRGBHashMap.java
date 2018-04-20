import java.util.HashMap;
import java.util.Map;

public class ColoresRGBHashMap {
  public static void main(String[] args) {

    HashMap<String, String> nombreColorEI = new HashMap<String, String>();
    HashMap<String, String> nombreECodCol = new HashMap<String, String>();

    nombreColorEI.put("azul", "Blue");
    nombreColorEI.put("negro", "Black");
    nombreColorEI.put("rojo", "Red");
    nombreColorEI.put("blanco", "White");
    nombreColorEI.put("verde", "Green");
    nombreColorEI.put("morado", "Purple");
    nombreColorEI.put("amarillo", "Yellow");
    nombreColorEI.put("naranja", "Orange");
    nombreColorEI.put("rosa", "Violet");
    
    nombreECodCol.put("azul", "#0000FF");
    nombreECodCol.put("negro", "#000000");
    nombreECodCol.put("rojo", "#FF0000");
    nombreECodCol.put("blanco", "#FFFFFF");
    nombreECodCol.put("verde", "#008000");
    nombreECodCol.put("morado", "#800080");
    nombreECodCol.put("amarillo", "#FFFF00");
    nombreECodCol.put("naranja", "#FFA500");
    nombreECodCol.put("rosa", "#EE82EE");
    
    System.out.print("Por favor, introduzca un color: ");
    String color = System.console().readLine();
    
    if (nombreColorEI.containsKey(color) && nombreECodCol.containsKey(color)) {
      System.out.print("El color " + color + ", en inglés es ");
      System.out.print(nombreColorEI.get(color) + " y su código RGB es ");
      System.out.println(nombreECodCol.get(color));
            
    } else {
      System.out.print("Lo siento, ese color no existe.");
    }
  }
}
