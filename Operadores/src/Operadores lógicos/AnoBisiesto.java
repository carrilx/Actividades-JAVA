import java.util.Scanner;

public class AnoBisiesto {

    public static void main(String[] args) {

        Scanner miScanner = new Scanner(System.in);
        
        System.out.print("Introduce un año: ");
        int ano = miScanner.nextInt();
        //Error de compilacion a la hora de concatenar
        //System.out.println (ano + ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) ? " es un año bisiesto. " : " NO es un año bisiesto. ");
        System.out.println (ano + ((ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) ? "es un año bisiesto." : "NO es un año bisiesto."));
        
        miScanner.close();
    }
}