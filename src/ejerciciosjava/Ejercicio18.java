/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjava;

import java.util.Scanner;


/**
 *
 * Eliminar los espacios de una frase pasada por consola por el usuario.
 */
public class Ejercicio18 {
    
     public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String texto;
        System.out.println("Inserta una frase:");
        texto=scanner.nextLine();
       
        //usado para almacenar el texto final
        String texto_sin_espacios="";
         
        char caracterActual;
         
        //recorro el array
        for(int i=0;i<texto.length();i++){
             
            caracterActual=texto.charAt(i);
             
            //Cuando es un espacio no lo copia a la cadena
            if(caracterActual!=' '){
                texto_sin_espacios+=String.valueOf(caracterActual);   
            }
             
        }
         System.out.println("La frase sin espacios es "+ texto_sin_espacios);
     }
    
}
