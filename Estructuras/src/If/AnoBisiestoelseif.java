/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package If;

import java.util.Scanner;

/**
 *
 * @author xacarril
 */
public class AnoBisiestoelseif {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        int Ano;
        System.out.println("Escribe o ano");
        Ano = miScanner.nextInt();

        if (Ano % 400 == 0) {
            System.out.println("e bisiesto");
        } else {
            if (Ano % 100 == 0) {
                System.out.println("non e bisiesto");
            } else {
                if (Ano % 4 == 0) {
                    System.out.println("e bisiesto");
                } else {
                    System.out.println("non e bisiesto");
                }
            }

        }

    }

}
