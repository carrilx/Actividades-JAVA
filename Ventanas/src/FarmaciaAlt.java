

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//Una farmacia desexa un programa para ingresar o valor da compra e calcular o seguinte: 
//se o pago efectúase ao “contado”, calcular un desconto do 5%; 
//pero se o pago é con “tarxeta” increméntase o prezo cun recargo do 3%. 
//Calcular e visualizar o descontou o recargo segundo sexa o caso e o total a pagar da compra.



import javax.swing.JOptionPane;



/**
 *
 * @author carri
 */
public class FarmaciaAlt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        
        double valorCompra;
        int pago;
        
        valorCompra = Double.parseDouble(JOptionPane.showInputDialog("Introduzca o valor da compra: "));
        pago = JOptionPane.showOptionDialog(
                null,//jframe
                "Como quieres pagar?",
                "Forma de pago.",
                JOptionPane.DEFAULT_OPTION, //DEFAULT es para personalizar los botones
                JOptionPane.QUESTION_MESSAGE,//tipo de mensaje que lanzas
                null,//icono por defecto de question_message
                new Object[]{"Efectivo", "Tarjeta"},//objeto array con dos valores para los botones
                "Tarjeta"
            );
        
        if (pago==1){
            JOptionPane.showMessageDialog(null, "Valor final da compra: " + (valorCompra + (valorCompra*0.05)));
        }else{
            JOptionPane.showMessageDialog(null, "Valor final da compra: " + (valorCompra - (valorCompra*0.03)));
        }
        
        
        
        
        
        
        
        
        
    }
    
}
