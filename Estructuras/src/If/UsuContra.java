package If;

import javax.swing.JOptionPane;

/**
 *
 * @author carri
 */
public class UsuContra {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        String usuario, contrasenha, validU, validP;
        

        validU = "Xaime";
        validP = "1234";

        usuario = JOptionPane.showInputDialog("Introduce el usuario:");
        contrasenha = JOptionPane.showInputDialog("Introduce la contraseña:");

        if (usuario.equals(validU) && contrasenha.equals(validP)) {           
            JOptionPane.showMessageDialog(null, "Estás dentro.");            
        } else {           
            if (!usuario.equals(validU)) {                
                JOptionPane.showMessageDialog(null, "usuario incorrecto.");               
            } else {                
                JOptionPane.showMessageDialog(null, "contraseña incorrecta.");
            }
        }
    }
}