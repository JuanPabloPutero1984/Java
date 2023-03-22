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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//*Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. 
//La fórmula correspondiente es: F = 32 + (9 * C / 5).
        double num;
        
        System.out.println("Ingrese la cantidad de grados centigrados");
        Scanner leer = new Scanner(System.in);
        num = leer.nextDouble();
        System.out.println("La cantidad de grados Centigrados convertidos a Farenheit es " + (32 + 9 * num / 5));
    }
    
}
