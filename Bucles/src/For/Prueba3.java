/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package For;

import java.util.Scanner;

/**
 *
 * @author xacarril
 */
public class Prueba3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num_maximo;
        Scanner miScanner = new Scanner(System.in);
        System.out.println("Introduce o nº ");
        num_maximo = miScanner.nextInt();
        System.out.println("Os números pares son: ");
        for (int i = 0; i < num_maximo+1; i += 2) {
            System.out.print(i + " ");
        }

    }

}
