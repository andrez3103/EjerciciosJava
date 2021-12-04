/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjava;

import java.util.Scanner;

/**
 *
 * Realiza una aplicación que nos calcule una ecuación de segundo grado. 
 * Debes pedir las variables a, b y c por teclado y comprobar antes que el
 * discriminante (operación en la raíz cuadrada). Para la raíz cuadrada usa 
 * el método sqlrt de Math. Te recomiendo que uses mensajes de traza.
 */
public class Ejercicio4 {
    
    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el valor de a");
        int a=sc.nextInt();
        System.out.println("Introduce el valor de b");
        int b=sc.nextInt();
        System.out.println("Introduce el valor de c");
        int c=sc.nextInt();
  
        double discriminante=Math.pow(b, 2)-(4*a*c);
  
        //Mensaje de traza
        System.out.println(">>"+discriminante);
  
        if (discriminante>0){
            //Tambien se puede hacer por parte si lo ves más facil
            //recuerda que debes tener en cuenta la prioridad de elementos
            double x1=((b*(-1))+Math.sqrt(discriminante))/(2*a);
            double x2=((b*(-1))-Math.sqrt(discriminante))/(2*a);
  
            System.out.println("El valor de x1 es "+x1+" y el valor de x2 es "+x2);
        }else{
            System.out.println("El discriminante es negativo");
        }
    }
    
}
