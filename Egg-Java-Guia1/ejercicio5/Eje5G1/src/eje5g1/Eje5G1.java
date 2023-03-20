/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje5g1;
import java.util.Scanner;
/**
 *Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt()
 * @author Gonzalo-Developer
 */
public class Eje5G1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int nro;
        System.out.println("Ingrese un nro: ");
        nro = leer.nextInt();
        System.out.println("El doble seria: " + (nro*2));
        System.out.println("El triple del nro es: " + (nro*3));
        System.out.println("Y su raiz cuadrada es: " + Math.sqrt(nro));
    }
    
}
