/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjava;

import java.util.Scanner;

/**
 *
 * Escribe una aplicación con un String que contenga una contraseña cualquiera. 
 * Después se te pedirá que introduzcas la contraseña, con 3 intentos. Cuando aciertes 
 * ya no pedirá mas la contraseña y mostrara un mensaje diciendo “Enhorabuena”. 
 * Piensa bien en la condición de salida (3 intentos y si acierta sale, aunque le queden intentos).
 */
public class Ejercicio6 {
    
    public static void main(String[] args) {
  
        Scanner sc = new Scanner(System.in);
        String contraseña="eureka";
  
        final int INTENTOS = 3;
         
        //Esta variable booleana, nos controlara que en caso de que acierte la condicion cambie
        boolean acierto=false;
  
        String password;
        for (int i=0;i<INTENTOS && !acierto;i++){
            System.out.println("Introduce una contraseña");
            password = sc.next();
  
            //Comprobamos si coincide, no usamos ==, usamos el metodo equals
            if (password.equals(contraseña)){
                System.out.println("Enhorabuena, acertaste");
                acierto=true;
            }
        }
    }
    
}
