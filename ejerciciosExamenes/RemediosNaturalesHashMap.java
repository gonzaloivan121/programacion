import java.util.HashMap;
import java.util.Map;

public class RemediosNaturalesHashMap {
  public static void main(String[] args) {

    HashMap<String, String> nombrePlanta = new HashMap<String, String>();
    HashMap<String, String> ppdesPlanta = new HashMap<String, String>();

    nombrePlanta.put("ortiga", "urtica dioica");
    nombrePlanta.put("romero", "rosmarinus officinalis");
    nombrePlanta.put("aloe vera", "aloe barbadensis miller");
    nombrePlanta.put("ayahuasca", "banisteriopsis caapi");
    
    ppdesPlanta.put("ortiga", "Es diurética y depurativa. Baja los niveles de colesterol.");
    ppdesPlanta.put("romero", "Tiene efectos estimulantes y tónicos, favorece en la recuperación de las enfermedades respiratorias y del aparato digestivo.");
    ppdesPlanta.put("aloe vera", "Regenera las células de la piel e incluso las de tejidos internos. Elimina hongos y virus. Protege el sistema inmunitario.");
    ppdesPlanta.put("ayahuasca", "Se usa en el tratamiento de la depresión y la ansiedad así como en los problemas de personalidad y esquizofrenia.");
    
    System.out.print("Por favor, introduzca el nombre de una planta: ");
    String planta = System.console().readLine();
    System.out.println();
    
    if (nombrePlanta.containsKey(planta) && ppdesPlanta.containsKey(planta)) {
      System.out.println("Nombre científico: " + nombrePlanta.get(planta) + "\n");
      System.out.println("Propiedades: " + ppdesPlanta.get(planta));
            
    } else {
      System.out.print("Lo siento, esa planta no existe.");
    }
  }
}
