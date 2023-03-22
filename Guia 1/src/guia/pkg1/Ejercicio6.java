/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg1;

import java.util.Scanner;

/**
 *
 * @author juanp
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 4. Escribir un programa que calcule cuántos litros de combustible consumió un automóvil. El /
usuario ingresará una cantidad de litros de combustible cargados en la estación y una 
cantidad de kilómetros recorridos, después, el programa calculará el consumo (km/lt) y se lo 
mostrará al usuario*/
        System.out.println("Ingresar cuantos litros cargo y cuantos kilometros recorrio");
        Scanner leer = new Scanner(System.in);
        
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        
        System.out.println("El consumo de este automovil es de " + (num2 / num1) + "km por litro" );
        
        
        
    }
    
}
