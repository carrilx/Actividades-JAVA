/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package While;

import javax.swing.JOptionPane;

/**
 *
 * @author xacarril
 */
public class NotasMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String continuar = "s";
        int notaM;
        int notaH;
        int notaI;
        double media;

        while (continuar.equals("s")) {
            if (continuar.equals("s")) {
                //Uso de cuadros de diálogo de swing
                notaM = Integer.parseInt(JOptionPane.showInputDialog("Nota de Matemáticas"));
                notaH = Integer.parseInt(JOptionPane.showInputDialog("Nota de Historia"));
                notaI = Integer.parseInt(JOptionPane.showInputDialog("Nota de Informática"));
                // Cálculo de la nota media
                media = (notaM + notaH + notaI) / 3;
                //Control da nota media e uso de ventás de swing
                if (media >= 5) {
                    JOptionPane.showMessageDialog(null, "¡Parabéns! A túa media é " + media);
                    continuar = (JOptionPane.showInputDialog("Desea continuar? (s/n)"));
                } else {
                    JOptionPane.showMessageDialog(null, "¡Recuperación! A túa media é " + media);
                    continuar = (JOptionPane.showInputDialog("Desea continuar? (s/n)"));
                }
            }
        }
        if (continuar.equals("n")) {
            JOptionPane.showMessageDialog(null, "Terminou de facer a media");
        }
    }
}
