/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Switch;

import java.util.Scanner;

/**
 *
 * @author xacarril
 */
public class Caixeiro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        int saldo = 400;
        String sesion = "s";
        byte opcion = 0;
        int ingreso, retirada = 0;

        while (opcion != 3) {
            System.out.printf("===== MENÚ =====%n");
            System.out.printf("1. Ingresar%n");
            System.out.printf("2. Retirar%n");
            System.out.printf("3. Salir%n");

            opcion = miScanner.nextByte();

            switch (opcion) {

                case 1: {
                    System.out.println("canto deseas ingresar?");
                    ingreso = miScanner.nextInt();
                    System.out.println("Ha ingresado" + ingreso);
                    saldo = saldo + ingreso;
                    System.out.println("Su saldo es" + saldo);
                    break;
                }
                case 2: {
                    do {
                        System.out.println("canto deseas retirar?");
                        retirada = miScanner.nextInt();
                        if (retirada < saldo) {
                            System.out.println("Ha retirado" + retirada);
                            saldo = saldo - retirada;
                            System.out.println("Su saldo actual es: " + saldo);
                        } else {
                            System.out.println("Saldo insuficiente");
                        }

                    } while (retirada < saldo);
                    break;
                }
                case 3: {
                    System.out.println("sesión finalizada");
                }

            }
        }

    }

}
