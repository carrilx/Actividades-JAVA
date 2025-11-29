/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package probas;

import java.util.Scanner;

/**
 *
 * @author xacarril
 */
public class Probas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        System.out.println("Introduce una cadena de texto");
        String miCadena = miScanner.nextLine();
        System.out.println("Introduce un número entero");
        int miEntero = miScanner.nextInt();
        System.out.println("Introduce un numero con decimal");
        float miFloat = miScanner.nextFloat();
        miScanner.close();
        
            System.out.println("A cadena é : " +miCadena);
            System.out.println("O enteiro é : " +miEntero);
            System.out.println("O float é : " +miFloat);
        
        
    }
    
}
