package For;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author xacarril
 */
public class NumDigitalt {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner miScanner = new Scanner(System.in);
        int numero;
        System.out.println("Introduce un número del 0 al 9999");
        numero = miScanner.nextInt();
        byte i;

        for (i = 0; numero != 0; i++) {
            numero = numero / 10;
        }
        System.out.println("Número de cifras: " + i);
    }
    
}
