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
public class PiedraPapelTijera {

    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);

        int J1, J2, combinacion;
        
        boolean cond1 = true;
        
        
        while (cond1){
            System.out.println("Jugador 1 Introduce piedra, papel o tijera");
            System.out.println("Introduce cualquier otro numero para salir");

            J1 = miScanner.nextInt();
            cond1 = (J1 <= 3 && J1 >= 1);
        

            if (cond1) {
                System.out.println("Jugador 2 Introduce piedra, papel o tijera");

                J2 = miScanner.nextInt();
                boolean cond2 = (J2 <= 3 && J2 >= 1) ;
                
                    if (cond2){

                        combinacion = (J1 * 10) + J2;

                        switch (combinacion) {
                            case 32:
                                JG1();
                                break;
                            case 23:
                                JG2();
                                break;
                            case 13:
                                JG1();
                                break;
                            case 31:
                                JG2();
                                break;
                            case 21:
                                JG1();
                                break;
                            case 12:
                                JG2();
                                break;
                            default:
                                System.out.println("Empate");
                        }
                    
                
                    }else{
                    System.out.println("Introduce un num valido" + "");
                    }
                
            }
        }
    }

    public static void JG1() {
        // El cuerpo del método. Aquí va el código.
        System.out.println("Jugador 1 GANA!!");
    }

    public static void JG2() {
        // El cuerpo del método. Aquí va el código.
        System.out.println("Jugador 2 GANA!!");
    }

}
