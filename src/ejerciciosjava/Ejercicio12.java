/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjava;

/**
 *
 *  Del siguiente String “La lluvia en Sevilla es una maravilla” cuenta
 * cuantas vocales hay en total (recorre el String con charAt).
 */
public class Ejercicio12 {
    
    public static void main(String[] args) {
  
        String cadena="La lluvia en Sevilla es una maravilla";
  
        int contador=0;
        for (int i=0;i<cadena.length();i++){
            //Comprobamos si el caracter es una vocal
            if(cadena.charAt(i)=='a' || 
                    cadena.charAt(i)=='e' || 
                    cadena.charAt(i)=='i' || 
                    cadena.charAt(i)=='o' || 
                    cadena.charAt(i)=='u'){
                contador++;
            }
        }
  
        System.out.println("Hay "+contador+" vocales");
    }
    
}
