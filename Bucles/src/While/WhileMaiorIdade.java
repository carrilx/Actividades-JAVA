/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author xacarril
 */
package While;

import java.util.Scanner;

public class WhileMaiorIdade {

    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        String nome = "Anonimo";
        int edad;

        while (!"w".equals(nome)) { 
            System.out.println("Introduce o teu nome (ou 'w' para saír):");
            nome = miScanner.nextLine();

            if (!"w".equals(nome)) {
                System.out.println("Introduce a túa idade:");
                edad = miScanner.nextInt();

                System.out.println("Ola" + nome);
                if (edad >= 18) {
                    System.out.println("Es maior de idade");
                } else {
                    System.out.println("Aínda non es maior de idade");

                }

            } else {
                System.out.println("Programa finalizado.");

            }

        
        }
            miScanner.close();
    }

}
