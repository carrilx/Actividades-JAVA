/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package regex;
/**
 *
 * @author Xaime
 */
import java.util.Scanner;
import java.util.regex.Pattern;

public class RegEx {

    public static void main(String[] args) {

        Scanner miScanner = new Scanner(System.in);

        // Expresións regulares
        String[] patrones = {
                "^\\d{5}$",                                       
                "^36\\d{3}$",                                     
                "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$",  
                "^https?:\\/\\/(?:www\\.)?[A-Za-z0-9.-]+\\.[A-Za-z]{2,}(?:\\/\\S*)?$",
                "^\\+34\\s?\\d{9}$",                              
                "^\\d{8}[A-Za-z]$",                               
                "^([01]\\d|2[0-3]):[0-5]\\d$",                    
                "^-?\\d+(?:,\\d+)?$",                             
                "^(?:opcion1|opcion2|opcion3)$",                  
                "^(?:(?:25[0-5]|2[0-4]\\d|1?\\d{1,2})\\.){3}(?:25[0-5]|2[0-4]\\d|1?\\d{1,2})$" 
        };

        // Menú
        System.out.println("MENÚ DE VALIDACIÓN REGEX");
        System.out.println("1) Calquera código postal");
        System.out.println("2) Código postal de Pontevedra");
        System.out.println("3) Correo electrónico");
        System.out.println("4) URL");
        System.out.println("5) Teléfono España (+34)");
        System.out.println("6) NIF");
        System.out.println("7) Hora en 24 horas");
        System.out.println("8) Número decimal con coma");
        System.out.println("9) Opcións dun menú (opcion1 | opcion2 | opcion3)");
        System.out.println("10) Dirección IP");
        System.out.print("\nEscolle unha opción (1-10): ");

        int opcion = miScanner.nextInt();
        miScanner.nextLine();

        if (opcion < 1 || opcion > 10) {
            System.out.println("Opción non válida.");
            return;
        }

        // Solicitar texto a validar
        System.out.print("Introduce o texto a comprobar: ");
        String texto = miScanner.nextLine();

        // Comprobación
        boolean valido = Pattern.matches(patrones[opcion - 1], texto);

        // Resultado
        if (valido) {
            System.out.println("O texto COINCIDE co patrón seleccionado.");
        } else {
            System.out.println("O texto NON coincide co patrón.");
        }

        miScanner.close();
    }
}
