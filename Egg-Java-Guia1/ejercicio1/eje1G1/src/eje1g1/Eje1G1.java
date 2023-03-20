/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje1g1;
import java.util.Scanner;
/**
 *Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos.
 * El programa deberá después mostrar el resultado de la suma
 * @author Gonzalo-Developer
 */
public class Eje1G1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lea = new Scanner(System.in);
        int n1; int n2;
        System.out.println("Ingrese el primer nro: ");
         n1 = lea.nextInt();
        System.out.println("Ingrese el segundo nro: ");
         n2 = lea.nextInt();
        System.out.println("La suma de los nros ingresados es " + (n1 + n2));
        
    }
    
}
