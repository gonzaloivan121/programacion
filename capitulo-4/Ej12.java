// Gonzalo Chaparro
// Ejercicio 12 - Capítulo 4

public class Ej12 {

  public static void main(String[] args) {
    
    System.out.println("Este programa realiza un cuestionario de las");
    System.out.println("asignaturas de 1º de DAW.");
    System.out.println(" ");
    
    
    int puntos = 0;
    String respuesta;
    
    System.out.println("CUESTIONARIO DE DESARROLLO DE APLICACIONES WEB");
    
    System.out.println("1. ¿Cuál de los siguientes tipos de datos de Java tiene más precisión?");
    System.out.println("a) int\nb) double\nc) float"); 
    System.out.print("=> ");
    respuesta = System.console().readLine();  
    if (respuesta.equals("b")) {
      puntos++;
    }

    System.out.println("2. ¿Cuál es el lenguaje que se utiliza para hacer consultas en las bases de datos");
    System.out.println("a) XML\nb) SELECT\nc) SQL"); 
    System.out.print("=> ");
    respuesta = System.console().readLine();  
    if (respuesta.equals("c")) {
      puntos++;
    }

    System.out.println("3. Para insertar un hiperenlace en una página se utiliza la etiqueta...");
    System.out.println("a) href\nb) a\nc) link"); 
    System.out.print("=> ");
    respuesta = System.console().readLine();  
    if (respuesta.equals("b")) {
      puntos++;
    }
    
    System.out.println("4. ¿En qué directorio se encuentran los archivos de configuración de Linux?");
    System.out.println("a) /etc\nb) /config\nc) /cfg"); 
    System.out.print("=> ");
    respuesta = System.console().readLine();  
    if (respuesta.equals("a")) {
      puntos++;
    }
    
    System.out.println("5. ¿Cuál de las siguientes memorias es volátil?");
    System.out.println("a) RAM\nb) EPROM\nc) ROM"); 
    System.out.print("=> ");
    respuesta = System.console().readLine();  
    if (respuesta.equals("a")) {
      puntos++;
    }
    
    System.out.println("\nHa obtenido " + puntos + " puntos.");
  }
}
