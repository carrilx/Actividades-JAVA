/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ifacortado;

/**
 *
 * @author xacarril
 */
public class Ifacortado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        byte a = 18, b = 14, c = 22 ;
        String s = "máximo =";
        s= (a>b && a>c) ? s + a : "";
        s= (b>a && b>c) ? s + b : "";
        s= (c>a && c>b) ? s + c : "";
        System.out.println(s);
    }
    
}
