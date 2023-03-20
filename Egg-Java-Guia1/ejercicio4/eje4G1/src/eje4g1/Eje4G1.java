/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje4g1;
import java.util.Scanner;
/**
 *Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. 
 * La fórmula correspondiente es: F = 32 + (9 * C / 5).

 * @author Gonzalo-Developer
 */
public class Eje4G1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int temp;
        double gf;
        System.out.println("Ingrese la cantidad de grados: ");
        temp = leer.nextInt();
        gf = 32 + (9*temp/5);
        System.out.println(temp + "°C pasados a Fahrenheit es: " + gf + "F");
    }
    
}
