package If;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author xacarril
 */
public class NumDigitos {

    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        int numero;
        System.out.println("Introduce un número del 0 al 9999:");
        numero = miScanner.nextInt();

        if (numero < 10) {
            System.out.println("Número de cifras: 1");
        } else {
            if (numero < 100) {
                System.out.println("Número de cifras: 2");
            } else {
                if (numero < 1000) {
                    System.out.println("Número de cifras: 3");
                } else {
                    if (numero < 10000) {
                        System.out.println("Número de cifras: 4");
                    } else {
                        System.out.println("El número está fuera del rango permitido (0 - 9999).");
                    }
                }
            }
        }

        miScanner.close();
    }

}
