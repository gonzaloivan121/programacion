import java.util.HashMap;
import java.util.Map;

public class Ej06 {
  public static void main(String[] args) {

    HashMap<String, String> acceso = new HashMap<String, String>();
    
    acceso.put("admin", "admin");
    acceso.put("usuario", "usuario");
    acceso.put("gonzalo", "psychosphere123");
    acceso.put("invitado", "");
    acceso.put("boss", "boss123");
    
    for (int i = 3; i > 0; i--) {
      System.out.print("Usuario: ");
      String usuario = System.console().readLine();
    
      System.out.print("Contraseña: ");
      String contrasena = System.console().readLine();
      
      if (!acceso.containsKey(usuario)) {
        System.out.println("El usuario especificado no existe.\n");
        
      } else {
      
        if (acceso.containsKey(usuario) && contrasena.equals(acceso.get(usuario))) {
          System.out.println("Ha accedido al área restringida.");
          i = 0;
          
        } else {
          System.out.println("La contraseña no coincide.");
          
          switch (i) {
            case 3:
              System.out.println("Le quedan 2 intentos.\n");
              break;
              
            case 2:
              System.out.println("Le queda 1 intento.\n");
              break;
              
            case 1:
              System.out.println("Lo siento, no tiene acceso al área restringida.");
              break;
              
            default:
            break;
          }
                  
        }
      }
    }    
    
  }
}
