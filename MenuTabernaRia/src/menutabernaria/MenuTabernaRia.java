/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menutabernaria;

import java.util.Scanner;

/**
 *
 * @author carri
 */
public class MenuTabernaRia {

    public static final double PRECIO_BEBIDA = 2.50;
    public static final double PRECIO_COMIDA = 10.00;
    public static final double PRECIO_HABITA = 10.00;

    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);

        double ingresosA = 0;
        double ingresosCB = 0;
        boolean sesion = true;
        int opcion;

        do {

            System.out.println("Bienvenido a la taberna");
            System.out.println("MENÚ DA TABERNA");
            System.out.println("1. Atender cliente");
            System.out.println("2. Alugar habitación");
            System.out.println("3. Ver ingresos");
            System.out.println("4. Pechar taberna");
            System.out.println("ELIXE UNHA OPCIÓN");

            opcion = miScanner.nextInt();

            switch (opcion) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    verEst(ingresosA, ingresosCB);
                    break;
                case 4:
                    sesion = false;
                    System.out.println("Taberna cerrada");
                    break;
                default:
                    System.out.println("Opción non valida.");

            }

        } while (sesion);

    }

    public static void verEst(double ingresosA, double ingresosCB) {
        double gananciasT = ingresosA + ingresosCB;
        System.out.println("ingresos alquiler = " + ingresosA);
        System.out.println("ingresos comidas e bebidas = " + ingresosCB);
        System.out.println("ingresos totales = " + gananciasT);
    }

}
