/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_luisvarela;

import javax.swing.JProgressBar;

/**
 *
 * @author Luis Andres Varela
 */
public class hilo_inciar extends Thread {

    private JProgressBar a;

    public hilo_inciar(JProgressBar a) {
        this.a = a;
    }

    @Override
    public void run() {
        adminjugador j = new adminjugador("./Usuario.usr");
        j.cargarArchivo();
        a.setStringPainted(true);
        System.out.println(j.getlistajugador().size());
        for (int i = 1; i <= j.getlistajugador().size(); i++) {
            a.setValue(i);
            a.setString("aaa");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {

            }
        }
    }

}
