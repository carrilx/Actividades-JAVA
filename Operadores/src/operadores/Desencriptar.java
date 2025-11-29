package operadores;

import java.util.Scanner;
/**
 *
 * @author xacarril
 */
public class Desencriptar {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);  // Crear objeto Scanner para leer entrada del usuario
        
        // Pedir os catro caracteres ao usuario (separados por espazos)
        System.out.print("Introduce a combinación: ");
        String linea = miScanner.nextLine();  // Ler a línea completa
        Scanner scannerLinea = new Scanner(linea);  // Scanner para a línea
        
        // Ler os catro caracteres
        char c1 = scannerLinea.next().charAt(0);
        char c2 = scannerLinea.next().charAt(0);
        char c3 = scannerLinea.next().charAt(0);
        char c4 = scannerLinea.next().charAt(0);
        
        // "Desencriptar" s
        int n1 = (int)(c1 - 65);
        int n2 = (int)(c2 - 65);
        int n3 = (int)(c3 - 65);
        int n4 = (int)(c4 - 65);
        
        // Imprimir os números desencriptados
        System.out.println("Os números orixinais son: " + n1 + " " + n2 + " " + n3 + " " + n4);
        
        miScanner.close();  // Cerrar Scanner
        scannerLinea.close();  // Cerrar Scanner línea
    }
}
