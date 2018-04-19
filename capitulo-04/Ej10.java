// Gonzalo Chaparro
// Ejercicio 10 - Capítulo 4

public class Ej10 {
  public static void main(String[] args) {
    
    String entrada;
    
    System.out.println("Este programa nos dice el horóscopo a partir");
    System.out.println("del día y el mes de nacimiento.");
    System.out.println(" ");
    
    System.out.print("Introduce tu mes de nacimiento: ");
    entrada = System.console().readLine();
    String mes = entrada.toLowerCase();
    
    System.out.print("Introduce ahora el día en el que naciste: ");
    entrada = System.console().readLine();
    int dia = Integer.parseInt( entrada );
    
    switch (mes) {
      case "enero":
        if ((dia >= 1) && (dia < 20)) {
          System.out.println("Tu horóscopo es Capricornio.");
        } else if ((dia >= 20) && (dia < 32)) {
          System.out.println("Tu horóscopo es Acuario.");
        } 
        break;
        
      case "febrero":
        if ((dia >= 1) && (dia < 19)) {
          System.out.println("Tu horóscopo es Acuario.");
        } else if ((dia >= 19) && (dia < 29)) {
          System.out.println("Tu horóscopo es Piscis.");
        } 
        break;
        
      case "marzo":
        if ((dia >= 1) && (dia < 21)) {
          System.out.println("Tu horóscopo es Piscis.");
        } else if ((dia >= 21) && (dia < 32)) {
          System.out.println("Tu horóscopo es Aries.");
        } 
        break;
      
      case "abril":
        if ((dia >= 1) && (dia < 21)) {
          System.out.println("Tu horóscopo es Aries.");
        } else if ((dia >= 21) && (dia < 31)) {
          System.out.println("Tu horóscopo es Tauro.");
        } 
        break;
        
      case "mayo":
        if ((dia >= 1) && (dia < 21)) {
          System.out.println("Tu horóscopo es Tauro.");
        } else if ((dia >= 21) && (dia < 32)) {
          System.out.println("Tu horóscopo es Géminis.");
        } 
        break;
        
      case "junio":
        if ((dia >= 1) && (dia < 21)) {
          System.out.println("Tu horóscopo es Géminis.");
        } else if ((dia >= 21) && (dia < 31)) {
          System.out.println("Tu horóscopo es Cáncer.");
        } 
        break;
        
      case "julio":
        if ((dia >= 1) && (dia < 21)) {
          System.out.println("Tu horóscopo es Cáncer.");
        } else if ((dia >= 21) && (dia < 32)) {
          System.out.println("Tu horóscopo es Leo.");
        } 
        break;
        
      case "agosto":
        if ((dia >= 1) && (dia < 22)) {
          System.out.println("Tu horóscopo es Leo.");
        } else if ((dia >= 22) && (dia < 32)) {
          System.out.println("Tu horóscopo es Virgo.");
        } 
        break;
        
      case ("septiembre"):
        if ((dia >= 1) && (dia < 23)) {
          System.out.println("Tu horóscopo es Virgo.");
        } else if ((dia >= 23) && (dia < 31)) {
          System.out.println("Tu horóscopo es Libra.");
        } 
        break;
        
      case ("octubre"):
        if ((dia >= 1) && (dia < 23)) {
          System.out.println("Tu horóscopo es Libra.");
        } else if ((dia >= 23) && (dia < 32)) {
          System.out.println("Tu horóscopo es Escorpio.");
        } 
        break;
        
      case ("noviembre"):
        if ((dia >= 1) && (dia < 23)) {
          System.out.println("Tu horóscopo es Escorpio.");
        } else if ((dia >= 23) && (dia < 31)) {
          System.out.println("Tu horóscopo es Sagitario.");
        } 
        break;
        
      case ("diciembre"):
        if ((dia >= 1) && (dia < 21)) {
          System.out.println("Tu horóscopo es Sagitario.");
        } else if ((dia >= 21) && (dia < 32)) {
          System.out.println("Tu horóscopo es Capricornio.");
        } 
        break;
    }
  }
}
