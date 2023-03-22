/*
 * Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.

 */
package guia.pkg1;

import java.util.Scanner;


/**
 *
 * @author juanp
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre;
        Scanner leer = new Scanner(System.in);
        System.out.println("Escribir su nombre");
        nombre = leer.nextLine();
        System.out.println("Mi nombre es " + nombre );

    }
    
}
