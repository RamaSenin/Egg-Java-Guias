/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eje2;

import java.util.Scanner;

/**
 *
 * @author Gonzalo-Developer
 */
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer = new Scanner(System.in);
        String nombre; 
        System.out.println("ingrese el nombre: ");
        nombre = leer.next();
        System.out.println("Hola " + nombre + " bienvenido");
    }
}
