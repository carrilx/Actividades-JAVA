/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package If;

import java.util.Scanner;

/**
 *
 * @author xacarril
 */
public class Entradas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner miScanner = new Scanner(System.in);
        
        // Solicitar datos
        System.out.print("Introduce o prezo da entrada: ");
        double prezo = miScanner.nextDouble();
        
        System.out.print("Introduce a idade: ");
        int idade = miScanner.nextInt();
        
        System.out.print("Es estudiante? (s/n): ");
        char estudiante = miScanner.next().charAt(0);
        
        System.out.print("Introduce o dia da semana (1=Luns, 2=Martes, 3=Mercores, 4=Xoves, 5=Venres, 6=Sabado, 7=Domingo): ");
        int dia = miScanner.nextInt();
        
        // Variable para acumular descuentos
        double desconto = 0;
        
        // Aplicar descuentos con if
        
        // Descuento infantil
        if (idade < 12) {
            desconto = desconto + 0.50;
            System.out.println("Desconto infantil: 50%");
        }
        
        // Descuento xubilado
        if (idade >= 65) {
            desconto = desconto + 0.40;
            System.out.println("Desconto xubilado: 40%");
        }
        
        // Descuento estudiante
        if (estudiante == 's') {
            desconto = desconto + 0.30;
            System.out.println("Desconto estudiante: 30%");
        }
        
        // Descuento dia do espectador (Mercores)
        if (dia == 3) {
            desconto = desconto + 0.20;
            System.out.println("Desconto dia do espectador: 20%");
        }
        
        // Calcular precio final
        double prezoFinal = prezo - (prezo * desconto);
        
        // Mostrar resultado
        System.out.println("Prezo base: " + prezo + " euros");
        System.out.println("Desconto total: " + (desconto * 100) + "%");
        System.out.println("Prezo final: " + prezoFinal + " euros");
        
        miScanner.close();
    }
    
}
