/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjava;

import java.util.Scanner;

/**
 *
 * Convertir una frase a mayúsculas o minúsculas, que daremos opción a que el usuario lo 
 * pida y mostraremos el resultado por pantalla.
 */
public class Ejercicio20 {
    
    public static void main(String[] args) {
        
        Scanner scanner =new Scanner(System.in);
        String frase;
        String cadenaFinal;
        System.out.println("Ingrese frase:");
        frase=scanner.nextLine();
        boolean salir=false;
        int opcion;
  
        
          do{
           System.out.println("1. Convertir a Mayusculas");
           System.out.println("2. Convertir a Minusculas");
           System.out.println("3. Salir");
           System.out.println("Escribe una de las opciones");
           opcion = scanner.nextInt();
           switch(opcion){
               case 1:
                    cadenaFinal=frase.toUpperCase();
                    System.out.println(cadenaFinal);
                   break;
               case 2:
                    cadenaFinal=frase.toLowerCase();
                    System.out.println(cadenaFinal);
                   break;
                case 3:
                   salir=true;
                   break;
                default:
                   System.out.println("Solo números entre 1 y 3");
           }
       }
      while(!salir);
    

    }
        
       
        
    }
    

