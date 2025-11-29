package operadores;

import java.util.Scanner;
/**
 *
 * @author xacarril
 */
public class Desencriptar2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);  // Crear objeto Scanner para leer entrada del usuario
        
        // Pedir os catro caracteres ao usuario un a un
        System.out.print("Introduce o primeiro carácter: ");
        char c1 = miScanner.next().charAt(0);
        
        System.out.print("Introduce o segundo carácter: ");
        char c2 = miScanner.next().charAt(0);
        
        System.out.print("Introduce o terceiro carácter: ");
        char c3 = miScanner.next().charAt(0);
        
        System.out.print("Introduce o cuarto carácter: ");
        char c4 = miScanner.next().charAt(0);
        
        // "Desencriptar" os caracteres
        int n1 = (int)(c1 - 65);
        int n2 = (int)(c2 - 65);
        int n3 = (int)(c3 - 65);
        int n4 = (int)(c4 - 65);
        
        // Imprimir os números desencriptados
        System.out.println("Os números orixinais son: " + n1 + " " + n2 + " " + n3 + " " + n4);
        
        miScanner.close();  // Cerrar Scanner
    }
}