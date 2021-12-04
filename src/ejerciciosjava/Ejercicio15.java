/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjava;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * Crea una aplicación llamada CalculadoraPolacaInversaApp, nos pedirá 2 operandos 
 * (int) y un signo aritmético (String), según este último se realizara la operación 
 * correspondiente. Al final mostrara el resultado en un cuadro de dialogo.
 * 
 * Los signos aritméticos disponibles son:

+: suma los dos operandos.
-: resta los operandos.
*: multiplica los operandos.
/: divide los operandos, este debe dar un resultado con decimales (double)
^:  1º operando como base y 2º como exponente.
%:  módulo, resto de la división entre operando1 y operando2.
 */
public class Ejercicio15 {
    
    public static void main(String[] args) {
  
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        //no importa que sean int o double
        double operando1;
        double operando2;
        double resultado=0;
  
        //Nos pide los operandos y el signo de operacion
        System.out.println("Escribe el operando 1");
        operando1=sc.nextDouble();
         
        System.out.println("Escribe el codigo de operacion");
        String operacion = sc.next();
         
        System.out.println("Escribe el operando 2");
        operando2=sc.nextDouble();
  
        //segun el codigo de operacion, haremos una u otra accion
        switch (operacion){
            case "+":
                resultado=operando1+operando2;
                break;
            case "-":
                resultado=operando1-operando2;
                break;
            case "*":
                resultado=operando1*operando2;
                break;
            case "/":
                resultado=operando1/operando2;
                break;
            case "^":
                resultado=(int)Math.pow(operando1, operando2);
                break;
            case "%":
                resultado=operando1%operando2;
                break;
        }
  
        System.out.println( operando1+" "+operacion+" "+operando2+" = "+resultado);
    }
    
}
