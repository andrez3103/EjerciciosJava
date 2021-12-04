/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjava;

import java.util.Scanner;

/**
 *
 * Crear una aplicación que nos permite insertar números hasta 
 * que insertemos un -1. Calcular el numero de números introducidos.
 */
public class Ejercicio17 {
    
     public static void main(String[] args) {
        
        //Pedimos el numero
         Scanner sn=new Scanner(System.in);
       int num=sn.nextInt();
        
       int contador=0;
        
       //Hasta que no se introduzca -1 no se sale
       while(num!=-1){
            
           contador++;
            
           num=sn.nextInt(); //Pedimos de nuevo el número
            
       }
         
       System.out.println("Fin, se ha introducido "+contador+" numeros");
        
    }
}
