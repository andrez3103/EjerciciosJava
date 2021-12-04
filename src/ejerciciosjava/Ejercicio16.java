/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjava;

import java.util.Scanner;

/**
 *
 * Realizar la suma del 1 al numero que indiquemos, este debe ser mayor que 1.
 */
public class Ejercicio16 {
    
    public static void main(String[] args) {
         
        Scanner sn=new Scanner(System.in);
         
         
        System.out.println("Inserta un numero entero mayor que 1");
        int num;
         
        do{
           //Pedimos el primer número
           num=sn.nextInt();
            
           if(num<=1){
               System.out.println("Error. No has introducido un valor correcto."
                       + "Vuelve a intentarlo");
           }
             
        }while(!(num>=1)); //condición para salir
         
        int suma=0;
         
        //Realizamos la suma
        for(int contador=1;contador<=num;contador++){
            suma+=contador;
        } 
             
        System.out.println("La suma es: "+suma);
         
    }
    
}
