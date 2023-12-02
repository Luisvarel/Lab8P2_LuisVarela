/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_luisvarela;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luis Andres Varela
 */
public class hilo_garage extends Thread {
    
    private JTable tabla;
    private String usuario;
    private String contra;
    
    public hilo_garage(JTable tabla, String usuario, String contra) {
        this.tabla = tabla;
        this.usuario = usuario;
        this.contra = contra;
    }
    
    @Override
    public void run() {
        adminjugador j = new adminjugador("./Usuario.usr");
        ArrayList<carro> c = new ArrayList();
        for (jugador object : j.getlistajugador()) {
            if (object.getNombre().equals(usuario) && object.getContrasena().equals(contra)) {
                for (carro object1 : object.getC()) {
                    c.add(object1);
                }
                break;
            }
        }
        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
        
        for (carro object : c) {
            Object[] newRow = {object.getMarca(), object.getModelo(), object.getColor(), object.getTiempo(), object.isReconstruido()};
            model.addRow(newRow);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(hilo_garage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
}
