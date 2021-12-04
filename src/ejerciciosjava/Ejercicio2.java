/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjava;

import java.util.Scanner;

/**
 *
 * Modifica el ejercicio anterior, para que en lugar de pedir un número,
 * pida un carácter (char) y muestre su código en la tabla ASCII.
 */
public class Ejercicio2 {
    
     public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
    
        System.out.println("Introduce un caracter ASCII");
        char caracter = sc.next().charAt(0);
        int codigo = (int) caracter;
        System.out.println(codigo);
    
     }
}
