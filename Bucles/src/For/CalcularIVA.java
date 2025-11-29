package For;

import java.util.Scanner;

public class CalcularIVA {

    public static void main(String[] args) {

        try (Scanner miScanner = new Scanner(System.in)) {
            System.out.print("Introduce o país (ex: España, Portugal, Francia): ");
            String pais = miScanner.nextLine().trim();
            
            System.out.print("Introduce a divisa (ex: EUR, USD, GBP): ");
            String divisa = miScanner.nextLine().trim().toUpperCase();
            
            
            System.out.print("Introduce a cantidade enteira de diñeiro: ");
            long cantidad = miScanner.nextLong();
            
            
            miScanner.nextLine();
            
            int ivaPorcentaje;
            String paisNormalizado = pais.toLowerCase();
            
            switch (paisNormalizado) {
                case "españa", "espana" -> ivaPorcentaje = 21;
                case "portugal" -> ivaPorcentaje = 23;
                case "francia", "france" -> ivaPorcentaje = 20;
                case "italia", "italy" -> ivaPorcentaje = 22;
                case "alemania", "germany" -> ivaPorcentaje = 19;
                default -> {
                    ivaPorcentaje = 21;
                    System.out.print("País non recoñecido. Usando IVA de España (21%).\n");
                }
            }
            
            
            long resultadoIVA = (cantidad * ivaPorcentaje) / 100;
            long totalConIVA = cantidad + resultadoIVA;
            
            
            String[] paisesLista = {"España", "Portugal", "Francia", "Italia", "Alemania"};
            int[] ivasLista = {21, 23, 20, 22, 19};
            
            System.out.print("\nLista de IVAs por país:\n");
            for (int i = 0; i < paisesLista.length; i++) {
                String paisActual = paisesLista[i];
                int ivaActual = ivasLista[i];
                
                if (paisActual.toLowerCase().equals(paisNormalizado)) {
                    
                    System.out.print("\u001B[33;4m**** " + paisActual + ": " + ivaActual + "% ****\u001B[0m\n");
                } else {
                    
                    System.out.print(paisActual + ": " + ivaActual + "%\n");
                }
            }
            
            
            System.out.print("\n Resultado do teu cálculo n");
            System.out.print("País: " + pais + "\n");
            System.out.print("Divisa: " + divisa + "\n");
            System.out.print("Cantidade orixinal: " + cantidad + " " + divisa + "\n");
            System.out.print("Tipo de IVA: " + ivaPorcentaje + "%\n");
            System.out.print("IVA a pagar: " + resultadoIVA + " " + divisa + "\n");
            System.out.print("Total a pagar (con IVA): " + totalConIVA + " " + divisa + "\n");
        }

    }
}
