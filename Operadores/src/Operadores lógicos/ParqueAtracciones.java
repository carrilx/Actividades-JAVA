/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parqueatracciones;

import java.util.Scanner;
/**
 *
 * @author xacarril
 */
public class ParqueAtracciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);

        System.out.print("Introduce a idade: ");
        byte idade = miScanner.nextByte();
        
        System.out.print("Tes ticket? (true/false): ");
        boolean ticket = miScanner.nextBoolean();
        
        System.out.print("Mides mais de 120cm? (true/false): ");
        boolean altura = miScanner.nextBoolean();
        
        System.out.print("Esta a maquina en mantenemento? (true/false): ");
        boolean mantenemento = miScanner.nextBoolean();
        
        if (idade > 8 && ticket && altura && !mantenemento) {
            System.out.println("Podes subir á atracción!");
        } else {
            System.out.println("Non podes subir á atracción.");
        }
        
    }
    
}
