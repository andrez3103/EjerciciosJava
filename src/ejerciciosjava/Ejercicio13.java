/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjava;

/**
 *
 * Reemplaza todas las a del String anterior por una e.
 */
public class Ejercicio13 {
    
    public static void main(String[] args) {
 
        String cadena="La lluvia en Sevilla es una maravilla";
 
        //Aviso, de esta forma no modifica el String original
        System.out.print(cadena.replace('a', 'e'));
 
    }
    
}
