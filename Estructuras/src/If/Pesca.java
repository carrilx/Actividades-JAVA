package If;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author xacarril
 */
public class Pesca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        
        
        Scanner miScanner = new Scanner(System.in);

        LocalDate hoy = LocalDate.now();  
        int mesActual = hoy.getMonthValue();
        
        double prezoBase = 0.0;
        double multTemp ;
        double extra = 0.0;
        double prezoTotal;
        int numXente;
        
        
        // 1. Número de participantes
        System.out.println("Canta xente sodes?");
        numXente = miScanner.nextInt();
        
        if (numXente >= 1 && numXente <= 5) {
            prezoBase = 50.0;
        } else if (numXente >= 6 && numXente <= 10) {
            prezoBase = 40.0;
        } else if (numXente >= 11 && numXente <= 15) {
            prezoBase = 30.0;
        } 

            
            
        multTemp = switch (mesActual) {
            case 7, 8 -> 1.5;
            case 6, 9 -> 1.2;
            default -> 1.0;
        };

            String resposta;
            
            System.out.println("comida incluída? (s/n)");
            resposta = miScanner.next().toLowerCase();
            if (resposta.equals("s")) {
                extra += 15.0;
            }
    
            System.out.println("guía fotográfico? (s/n)");
            resposta = miScanner.next().toLowerCase();
            if (resposta.equals("s")) {
                extra += 10.0;
            }
            
            System.out.println("seguro de cancelación? (s/n)");
            resposta = miScanner.next().toLowerCase();
            if (resposta.equals("s")) {
                extra += 5.0;
            }

            double prezoInicial = numXente * prezoBase;
            double prezoTrasTempada = prezoInicial * multTemp;
            double custoTotalExtras = numXente * extra;
            

            prezoTotal = prezoTrasTempada + custoTotalExtras;

            System.out.println("PREZO FINAL TOTAL: " + prezoTotal);



        miScanner.close();
    }
}