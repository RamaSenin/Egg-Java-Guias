/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3g1;
import java.util.Scanner;
/**
 *Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. 
Nota: investigar la función toUpperCase() y toLowerCase() en Java.

 * @author Gonzalo-Developer
 */
public class Ej3G1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese la Frase: ");
        frase = leer.nextLine();
        System.out.println("La frase en Mayusculas es: " + frase.toUpperCase());
        System.out.println("La frse en Minusculas es: " + frase.toLowerCase());
    }
    
}
