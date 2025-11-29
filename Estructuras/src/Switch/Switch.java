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
public class Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String tipoVehiculo;
        Scanner miScanner = new Scanner(System.in);
        System.out.println("Introduce tipo vehiculo");
        tipoVehiculo = miScanner.nextLine();
        switch (tipoVehiculo) {
            case "coche":
                System.out.println("Podes pasar as 00:00");
                break;
            case "camion":
                System.out.println("Podes pasar as 12:00");
                break;
            case "moto":
                System.out.println("Podes pasar as 13:00");
                break;
            default:
                System.out.println("Podes pasar as 14:00");
                miScanner.close();
        }
    }
    
}
