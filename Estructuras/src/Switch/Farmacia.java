/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

//Una farmacia desexa un programa para ingresar o valor da compra e calcular o seguinte: 
//se o pago efectúase ao “contado”, calcular un desconto do 5%; 
//pero se o pago é con “tarxeta” increméntase o prezo cun recargo do 3%. 
//Calcular e visualizar o descontou o recargo segundo sexa o caso e o total a pagar da compra.

package Switch;
import java.util.Scanner;
/**
 *
 * @author carri
 */
public class Farmacia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        
        double valorCompra, prezoFinal, incrTar, desCont ;
        String metodoPago;
        
        
        
        System.out.println("Introducee o valor da compra: ");
        
        valorCompra = miScanner.nextDouble();
        incrTar = valorCompra * 0.03;
        desCont = valorCompra * 0.05;
        
        System.out.println("Introducee o metodo de pago (contado ou tarxeta): ");
        
        metodoPago = miScanner.next();

        switch (metodoPago){
            case "tarxeta":
                prezoFinal = valorCompra + (incrTar) ;
                System.out.println("O prezo final e de:" + prezoFinal);
                break;
            case "contado":
                prezoFinal = valorCompra - (desCont) ;
                System.out.println("O prezo final e de:" + prezoFinal);
                break;
            default:
                System.out.println("metodo no valido");
                
        }
        
        
        
    }
    
}
