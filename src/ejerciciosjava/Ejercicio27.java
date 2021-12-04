/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjava;

import java.util.Scanner;

/**
 *
 * Crea el enum Mes, que contenga como parametros el orden(1,2,3,etc) y el numero de dias (febrero tendra 28 dias siempre).

Estos datos pueden pedirse por separado, asi que tienes que hacer sus respectivos get. No son necesarios los setters.

Create un arrays de Mes (mirate la funcion values), pide un numero por teclado e indica que meses tienen ese numero 
* de dias (toda su informacion).

Por ejemplo, si escribes un 28, este te devolvera la informacion de FEBRERO.
 */
public class Ejercicio27 {
    
        
        public enum Mes {
    ENERO(1,31),
    FEBRERO(2,28),
    MARZO(3,31),
    ABRIL(4,30),
    MAYO(5,31),
    JUNIO(6,30),
    JULIO(7,31),
    AGOSTO(8,31),
    SEPTIEMBRE(9,30),
    OCTUBRE(10,31),
    NOVIEMBRE(11,30),
    DICIEMBRE(12,31);
     
    private int orden;
    private int numDias;
     
    private Mes(int orden, int numDias){
         
        this.orden=orden;
        this.numDias=numDias;
         
    }
    public int getOrden() {
        return orden;
    }
 
    public int getNumDias() {
        return numDias;
    }
 

    @Override
    public String toString() {
        return "El mes "+this.name().toLowerCase()+" es el mes "+orden+"º y tiene "+numDias+" dias";
    }
     
     
     
     
}
        public static void main(String[] args) {
         
            Scanner sn = new Scanner(System.in);
         
        Mes[] meses = Mes.values();
         
        System.out.println("Escribe un numero de dias");
        int dias = sn.nextInt();
         
        for(int i=0;i<meses.length;i++){
             
            if(meses[i].getNumDias()==dias){
                System.out.println(meses[i].toString());
            }
             
        }
        
        
        
        
    }
    
}

