/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjava;

import java.util.Scanner;


/**
 *
 * Lee un número por teclado y muestra por consola, el carácter al que pertenece en la tabla ASCII.
 * Por ejemplo: si introduzco un 97, me muestre una a.
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner scanner= new Scanner(System.in);
        String texto=null;
        System.out.println("Ingrese un codigo de la tabla ASCII:");
        texto=scanner.nextLine();

        //Pasamos el String a int
        int codigo=Integer.parseInt(texto);
        
        //Pasamos el codigo a caracter
        char caracter=(char)codigo;
 
        System.out.println(caracter);
    }
    
}
