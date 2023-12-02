/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_luisvarela;

import javax.swing.JPanel;
import javax.swing.JProgressBar;

/**
 *
 * @author Luis Andres Varela
 */
public class hilo_inciar extends Thread {

    private JProgressBar a;
    private JPanel barra;
    private JPanel usuario;
    private JPanel iniciar_crear;

    public hilo_inciar(JProgressBar a, JPanel barra, JPanel usuario, JPanel iniciar_crear) {
        this.a = a;
        this.barra = barra;
        this.usuario = usuario;
        this.iniciar_crear = iniciar_crear;
    }

    @Override
    public void run() {
        adminjugador j = new adminjugador("./Usuario.usr");
        j.cargarArchivo();
        barra.setVisible(true);
        for (int i = 1; i <= a.getMaximum(); i++) {
            a.setValue(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
        }
        if (j.getlistajugador().size() < a.getMaximum()) {
            barra.setVisible(false);
            usuario.setVisible(false);
            iniciar_crear.setVisible(true);
        } else {
            barra.setVisible(false);
            usuario.setVisible(true);
        }
    }

}
