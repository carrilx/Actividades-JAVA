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
public class PedraPapelTixeiraAvaliable {

    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);

        int victJ1 = 0, victJ2 = 0, empate = 0, numPartidas= 0, puntosJ1=0, puntosJ2=0;


        String J1, J2;
        
        boolean seguirxogando = true;
        
        
        
        while(seguirxogando){
            do {
                numPartidas++;
                System.out.println("--Partida: " + numPartidas);
                System.out.println("J1 introduce pedra papel o texoira");
                J1 = miScanner.nextLine().trim().toLowerCase();
                
            } while (!J1.equals("pedra") && !J1.equals("papel") && !J1.equals("texoira"));
            
            do {
                System.out.println("J2 Introduce pedra papel ou texoira");
                J2 = miScanner.nextLine().trim().toLowerCase();
            }while (!J2.equals("pedra") && !J2.equals("papel") && !J2.equals("texoira"));
            
            numPartidas++;
            
            if (J1.equals(J2)){
                System.out.println("Empate");
                empate++;
            }else if(
                    J1.equals("piedra") && J2.equals("texoira") ||
                    J1.equals("texoira") && J2.equals("papel") ||
                    J1.equals("papel") && J2.equals("piedra")
                    
                ) {
                System.out.println("Xogador 1 GAÑA!!!");
                victJ1++;
                puntosJ1 = +10;
                
            }else {
                System.out.println("Xogador 2 GAÑA!!");
                victJ2++;
                puntosJ2 = +10;
            }
            
            System.out.println("Resumo");
            System.out.println("Partidas xogadas: " + --numPartidas);
            System.out.println("Victorias J1: " + victJ1);
            System.out.println("Puntos J1: " + puntosJ1);
            System.out.println("Victorias J2: " + victJ2);
            System.out.println("Puntos J2: " + puntosJ2);
            System.out.println("Empates: " + empate );
            
            String seguir;
            
            do{
            
                System.out.println("Queres xogar outra partida? S/N");

                seguir = miScanner.nextLine().trim().toUpperCase();
            }while(!seguir.equals("N") && !seguir.equals("S"));
            
            if (seguir.equals("N")){
                seguirxogando = false;
            }
            
            
            
        }
        
        System.out.println("Resumo final");
        System.out.println("Victorias J1: " + victJ1);
        System.out.println("Victorias J2: " + victJ2);
        System.out.println("Empates: " + empate);
        
        if(victJ1>victJ2){
            System.out.println("Resultado final: Xogador 1 GAÑA!! ");
        }else if(victJ1<victJ2){
            System.out.println("Resultado final: Xogador 2 GAÑA!!");
        }else {
            System.out.println("Resultado final: Empate!!!");
        }
        miScanner.close();
        
        
        
        
        
    }

}
