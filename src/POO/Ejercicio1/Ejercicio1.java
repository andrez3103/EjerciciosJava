/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO.Ejercicio1;

import java.util.Scanner;

/**
 *
 * Crea una clase llamada Cuenta que tendrá los siguientes atributos: titular y
 * cantidad (puede tener decimales). El titular será obligatorio y la cantidad
 * es opcional. Crea dos constructores que cumpla lo anterior. Crea sus métodos
 * get, set y toString. Tendrá dos métodos especiales: ingresar(double
 * cantidad): se ingresa una cantidad a la cuenta, si la cantidad introducida es
 * negativa, no se hará nada. retirar(double cantidad): se retira una cantidad a
 * la cuenta, si restando la cantidad actual a la que nos pasan es negativa, la
 * cantidad de la cuenta pasa a ser 0.
 */
public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Cuenta cuenta_1 = new Cuenta("Zhereff");

        Cuenta cuenta_2 = new Cuenta("Luis", 300);
        


        //Ingresa dinero en las cuentas
        cuenta_1.ingresar(300);
        cuenta_2.ingresar(400);

        //Retiramos dinero en las cuentas
        cuenta_1.retirar(500);
        cuenta_2.retirar(100);

        //Muestro la informacion de las cuentas
        System.out.println(cuenta_1); // 0 euros
        System.out.println(cuenta_2); // 600 euros

    }

}
