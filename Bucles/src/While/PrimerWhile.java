/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package While;

import java.util.Scanner;

/**
 *
 * @author xacarril
 */
public class PrimerWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nota = 0;
        Scanner miScanner = new Scanner(System.in);
        while (nota!= -1){
            System.out.println("Introduce a nota (-1 para finalizar)");
            nota = miScanner.nextInt();
            if (nota != -1){
                if (nota >= 5){
                    System.out.println("Aprovaches)");
                }else {
                    System.out.println("Suspendiches");
                    
                }
            }else{
                System.out.println("Programa finalizado.");
            }
        
        }
//        int i = 0;
//        while (i<=10){
//            System.out.println(i);
//            i++;
//        }
                
    }
    
}
