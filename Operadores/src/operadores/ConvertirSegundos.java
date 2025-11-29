/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadores;

import java.util.Scanner;

/**
 *
 * @author xacarril
 */
public class ConvertirSegundos {

public static void main(String[] args) {

        Scanner MiScanner = new Scanner(System.in);
        System.out.print("Introduce os segundos: ");
        
        int segundosTotais = MiScanner.nextInt();
        int minutos = segundosTotais / 60;
        int segundos = segundosTotais % 60;
        
        System.out.println(segundosTotais + " segundos = " + minutos + 
                          " minutos e " + segundos + " segundos");
        

        MiScanner.close();
    }
    
}
