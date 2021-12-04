/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjava;

import java.util.Scanner;

/**
 *
 *Modifica el anterior enum para indicar que es día laborable directamente (usar toString).
 */
public class Ejercicio26 {
    
    public enum DiasSemana {
    LUNES(true),
    MARTES(true),
    MIERCOLES(true),
    JUEVES(true),
    VIERNES(true),
    SABADO(false),
    DOMINGO(false);
     
    private boolean laborable;
     
    private DiasSemana(boolean laborable){
        this.laborable = laborable;
    }
    
 
    @Override
    public String toString() {
         
        if(laborable){
            return "El dia "+ this.name().toLowerCase() +" es laborable";
        }else{
            return "El dia "+  this.name().toLowerCase() +" no es laborable";
        }
         
    }
    }
    
     public static void main(String[] args) {
         
         Scanner sn = new Scanner(System.in);
        System.out.println("Escribe un dia de la semana");
        String dia = sn.next();
         
        DiasSemana diaS = DiasSemana.valueOf(dia.toUpperCase());
         
        System.out.println(diaS.toString());
         
    }
    

}
