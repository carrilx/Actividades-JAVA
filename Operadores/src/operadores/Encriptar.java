/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadores;

import java.util.Scanner;

/**
 *
 * @author xacarril
 */
public class Encriptar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner miScanner = new Scanner(System.in);  // Crear objeto Scanner para leer entrada del usuario
      
      // Pedir los cuatro enteros al usuario
      System.out.print("Introduce el primer número entero (n1): ");
      int n1 = miScanner.nextInt();
      
      System.out.print("Introduce el segundo número entero (n2): ");
      int n2 = miScanner.nextInt();
      
      System.out.print("Introduce el tercer número entero (n3): ");
      int n3 = miScanner.nextInt();
      
      System.out.print("Introduce el cuarto número entero (n4): ");
      int n4 = miScanner.nextInt();
      
      // "Encriptar" convirtiendo a caracteres sumando 65 (código ASCII de 'A')
      char c1 = (char)(n1 + 65);
      char c2 = (char)(n2 + 65);
      char c3 = (char)(n3 + 65);
      char c4 = (char)(n4 + 65);
      
      // Imprimir la combinación encriptada
      System.out.println("A combinación é " + c1 + " " + c2 + " " + c3 + " " + c4);
      
      miScanner.close();  // Cerrar el Scanner (buena práctica)
    }
    
}
