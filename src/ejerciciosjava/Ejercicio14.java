/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjava;

/**
 *
 * Recorre el String del ejercicio 22 y transforma cada carácter a su código ASCII. 
 * Muestralos en linea recta, separados por un espacio entre cada carácter.
 */
public class Ejercicio14 {
    
    public static void main(String[] args) {
 
        String cadena="La lluvia en Sevilla es una maravilla";
 
        for (int i=0;i<cadena.length();i++){
            //Hacemos un casting para convertir el char a int
            System.out.print((int)cadena.charAt(i)+" ");
        }
    }
    
}
