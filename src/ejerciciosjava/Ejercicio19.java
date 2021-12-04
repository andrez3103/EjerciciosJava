/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjava;

import java.util.Scanner;

/**
 *
 *Pedir al usuario que nos escriba frases de forma infinita hasta 
 * que insertemos una cadena vacia. Mostrar la cadena resultante
 */
public class Ejercicio19 {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        String texto="";
        System.out.println("Introduce un texto:");
        texto=scanner.nextLine();
        String cadenaResultante="";
         
        //Mientras no este vacio la cadena escrita continuo
        while(!texto.isEmpty()){
             
            //Concatenamos el texto
            cadenaResultante+=texto;
             
            //Reintroducimos de nuevo una cadena
            texto="";
            System.out.println("Introduce un texto:");
            texto=scanner.nextLine();
                                         
        }
         
        System.out.println(cadenaResultante);
                      
         
    }
}
