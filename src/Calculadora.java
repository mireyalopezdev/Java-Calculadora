/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.SwingUtilities;
/**
 *
 * @author zooe_
 */
public class Calculadora {
   public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Ventana VTN = new Ventana();
            VTN.setVisible(true);
        });
    }
}
