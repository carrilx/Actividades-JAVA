package If;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author carri
 */
public class Ordenar3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner miScanner = new Scanner(System.in);

        int num1, num2, num3;

        System.out.println("Introduce el primer número: ");
        num1 = miScanner.nextInt();
        System.out.println("Escribe el segundo número: ");
        num2 = miScanner.nextInt();
        System.out.println("Escribe el tercer número: ");
        num3 = miScanner.nextInt();

        if (num1 > num2) {
            if (num2 > num3) {
                System.out.println(num1 + " " + num2 + " " + num3);
            } else if (num3 > num1) {
                System.out.println(num3 + " " + num1 + " " + num2);
            } else {
                System.out.println(num1 + " " + num3 + " " + num2);
            }
        } else {
            if (num3 > num2) {
                System.out.println(num3 + " " + num2 + " " + num1);
            } else {
                if (num3 > num1) {
                    System.out.println(num3 + " " + num2 + " " + num1);
                } else {
                    System.out.println(num2 + " " + num3 + " " + num1);
                }
            }
        }
        miScanner.close();
    }
}
