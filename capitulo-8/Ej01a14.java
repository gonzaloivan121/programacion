// Gonzalo Chaparro
// Ejercicios 01 a 14 FUNCIONES - Capítulo 8

import matematicas.Funciones;

public class Ej01a14 {
  
  /////////// PROGRAMA PRINCIPAL ///////////////////////////////////////
  
  public static void main(String[] args) {
    
    // esCapicua ///////////////////////////////////////////////////

    if (matematicas.Funciones.esCapicua(29)) {
      System.out.println("El 29 es capicúa");
    }

    if (matematicas.Funciones.esCapicua(464)) {
      System.out.println("El 464 es capicúa");
    }

    // esPrimo /////////////////////////////////////////////////////

    if (matematicas.Funciones.esPrimo(29)) {
      System.out.println("El 29 es primo");
    }

    if (matematicas.Funciones.esPrimo(80)) {
      System.out.println("El 80 es primo");
    }

    // siguientePrimo //////////////////////////////////////////////

    System.out.println("El siguiente primo mayor a 23 es " + matematicas.Funciones.siguientePrimo(23));
    System.out.println("El siguiente primo mayor a 100 es " + matematicas.Funciones.siguientePrimo(100));

    // potencia ////////////////////////////////////////////////////

    System.out.println("2^10 = " + matematicas.Funciones.potencia(2, 10));
    System.out.println("5^(-3) = " + matematicas.Funciones.potencia(5, -3));
    System.out.println("10^6 = " + matematicas.Funciones.potencia(10, 6));

    // digitos /////////////////////////////////////////////////////

    System.out.println("El número 0 tiene " + matematicas.Funciones.digitos(0) + " dígito/s.");
    System.out.println("El número 7 tiene " + matematicas.Funciones.digitos(7) + " dígito/s.");
    System.out.println("El número 674893123 tiene " + matematicas.Funciones.digitos(674893123) + " dígito/s.");

    // voltea //////////////////////////////////////////////////////

    System.out.println("El 5 volteado es " + matematicas.Funciones.voltea(5));
    System.out.println("El 398004321 volteado es " + matematicas.Funciones.voltea(398004321));
    System.out.println("El -75839 volteado es " + matematicas.Funciones.voltea(-75839));

    // digitoN /////////////////////////////////////////////////////

    System.out.println("En la posición 0 del 3452 está el " + matematicas.Funciones.digitoN(3452, 0));
    System.out.println("En la posición 6 del 857964034 está el " + matematicas.Funciones.digitoN(857964034, 6));
    System.out.println("En la posición 4 del 857964034 está el " + matematicas.Funciones.digitoN(857964034, 4));

    // posicionDeDigito ////////////////////////////////////////////

    System.out.println("En el 3452, el dígito 4 está en la posición " + matematicas.Funciones.posicionDeDigito(3452, 4));
    System.out.println("En el 78604321, el dígito 1 está en la posición " + matematicas.Funciones.posicionDeDigito(78604321, 1));
    System.out.println("En el 78604321, el dígito 7 está en la posición " + matematicas.Funciones.posicionDeDigito(78604321, 7));
    System.out.println("En el 78604321, el dígito 5 está en la posición " + matematicas.Funciones.posicionDeDigito(78604321, 5));

    // quitaPorDetras //////////////////////////////////////////////

    System.out.println("Si al 78604321 se le quitan por detrás 4 dígitos, se queda como " + matematicas.Funciones.quitaPorDetras(78604321, 4));
    System.out.println("Si al 1000 se le quita por detrás 1 dígito, se queda como " + matematicas.Funciones.quitaPorDetras(1000, 1));

    // quitaPorDelante /////////////////////////////////////////////

    System.out.println("Si al 78604321 se le quitan por delante 4 dígitos, se queda como " + matematicas.Funciones.quitaPorDelante(78604321, 4));
    System.out.println("Si al 78604000 se le quitan por delante 2 dígitos, se queda como " + matematicas.Funciones.quitaPorDelante(78604000, 2));

    // pegaPorDetras ///////////////////////////////////////////////

    System.out.println("Si al 567 se le pega por detrás el 1 da el " + matematicas.Funciones.pegaPorDetras(567, 1));
    System.out.println("Si al 33 se le pega por detrás el 0 da el " + matematicas.Funciones.pegaPorDetras(33, 0));

    // pegaPorDelante //////////////////////////////////////////////

    System.out.println("Si al 567 se le pega por delate el 1 da el " + matematicas.Funciones.pegaPorDelante(567, 1));
    System.out.println("Si al 33 se le pega por delante el 0 da el " + matematicas.Funciones.pegaPorDelante(33, 0));

    // trozoDeNumero ///////////////////////////////////////////////

    System.out.println("Al 78604000 le cojo el trozo que va de la posición 0 a la 3: " + matematicas.Funciones.trozoDeNumero(78604000, 0, 3));
    System.out.println("Al 78604000 le cojo el trozo que va de la posición 4 a la 6: " + matematicas.Funciones.trozoDeNumero(78604000, 4, 6));
    System.out.println("Al 78604000 le cojo el trozo que va de la posición 2 a la 2: " + matematicas.Funciones.trozoDeNumero(78604000, 2, 2));

    // juntaNumeros ////////////////////////////////////////////////

    System.out.println("Juntando el 21 y el 40 da el " + matematicas.Funciones.juntaNumeros(21, 40));
    System.out.println("Juntando el 789 y el 250 da el " + matematicas.Funciones.juntaNumeros(789, 250));
    
  }
}


