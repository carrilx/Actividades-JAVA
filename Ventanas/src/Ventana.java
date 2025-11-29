import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
/**
 *
 * @author carri
 */
public class Ventana {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        int notaM;
        int notaH;
        int notaI;
        double media;
        
        notaM = Integer.parseInt(JOptionPane.showInputDialog("Nota de matemáticas"));
        notaH = Integer.parseInt(JOptionPane.showInputDialog("Nota de historia"));
        notaI = Integer.parseInt(JOptionPane.showInputDialog("Nota de informática"));
        
        media = (notaM + notaH + notaI)/3;
        
        if(media>=5){
        System.out.println("Estas aprobado " + media);
        }else{
        System.out.println("No estas aprobado");
        }
    }
}
