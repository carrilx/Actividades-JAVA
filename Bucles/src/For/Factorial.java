package For;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        System.out.println("Ingresa un número:");
        int num1 = miScanner.nextInt();
        int factorial = 1;
        int sumaMultiplicador = 0;

        for (int i = 1; i <= num1; i++) {
            int resultadoMultiplicador = 5 * i;
            sumaMultiplicador += resultadoMultiplicador;
            factorial *= i;

            System.out.println("5 * " + i + " = " + resultadoMultiplicador + " Suma acumulada: " + sumaMultiplicador);
        }
        System.out.println("Factorial de " + num1 + " es: " + factorial);
    }
}
