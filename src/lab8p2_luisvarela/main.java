/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lab8p2_luisvarela;

import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis Andres Varela
 */
public class main extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    public main() {
        initComponents();
        iniciar_crear.setVisible(true);
        pbar_iniciar.setVisible(false);
        usuario.setVisible(false);
        admin.setVisible(false);
        adminjugador j = new adminjugador("./Usuario.usr");
        j.getlistajugador().add(new jugador("a", "a", "a", new Date(), "a", "a"));
        i_barra.setStringPainted(true);
        j.escribirArchivo();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usuario = new javax.swing.JPanel();
        iniciar_crear = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        i_usuario = new javax.swing.JTextField();
        i_contrasena = new javax.swing.JTextField();
        Listo = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        Correo = new javax.swing.JTextField();
        Contrasena = new javax.swing.JTextField();
        Pais = new javax.swing.JTextField();
        Usuario = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        fecha = new com.toedter.calendar.JDateChooser();
        pbar_iniciar = new javax.swing.JPanel();
        i_barra = new javax.swing.JProgressBar();
        jLabel4 = new javax.swing.JLabel();
        admin = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        concesionaria_locacion = new javax.swing.JTextField();
        concesionaria_nombre = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        longitud = new javax.swing.JTextField();
        curvas = new javax.swing.JTextField();
        locacion = new javax.swing.JTextField();
        tipo_carrera = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        usuario.setMinimumSize(new java.awt.Dimension(790, 540));
        usuario.setPreferredSize(new java.awt.Dimension(790, 540));
        usuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iniciar_crear.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Iniciar Sesion");

        jLabel2.setText("Usuario");

        jLabel3.setText("Contraseña");

        Listo.setText("listo");
        Listo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(229, 229, 229)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Listo, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel2))
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(i_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(i_contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(306, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(i_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(i_contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addComponent(Listo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(173, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Iniciar Sesion", jPanel2);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Fecha de nacimiento:");
        jPanel6.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 180, 20));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Contraseña:");
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 100, 20));

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Correo:");
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 70, 20));

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Pais de residencia:");
        jPanel6.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 160, 20));

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Registro");
        jPanel6.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 100, 30));

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Usuario:");
        jPanel6.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 70, 20));
        jPanel6.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 262, 710, 10));

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Nombre:");
        jPanel6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 70, 20));

        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });
        jPanel6.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 220, -1));

        Correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CorreoActionPerformed(evt);
            }
        });
        jPanel6.add(Correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 220, -1));

        Contrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContrasenaActionPerformed(evt);
            }
        });
        jPanel6.add(Contrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 220, -1));

        Pais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaisActionPerformed(evt);
            }
        });
        jPanel6.add(Pais, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 220, -1));

        Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuarioActionPerformed(evt);
            }
        });
        jPanel6.add(Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 220, -1));

        jButton2.setText("Listo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 420, 150, -1));
        jPanel6.add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 190, -1));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 775, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Registro", jPanel4);

        iniciar_crear.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 780, 510));

        pbar_iniciar.setMinimumSize(new java.awt.Dimension(790, 540));
        pbar_iniciar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        i_barra.setToolTipText("");
        pbar_iniciar.add(i_barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 570, 45));

        jLabel4.setText("Buscando Usuario");
        pbar_iniciar.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 110, -1));

        admin.setMinimumSize(new java.awt.Dimension(790, 540));
        admin.setPreferredSize(new java.awt.Dimension(790, 540));
        admin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 775, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 403, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Agregar carro", jPanel1);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setText("Nombre");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, -1));

        jLabel17.setText("locacion");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        jButton4.setText("listo");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 96, -1));
        jPanel3.add(concesionaria_locacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 88, -1));
        jPanel3.add(concesionaria_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 88, -1));

        jTabbedPane2.addTab("Agregar concesionaria", jPanel3);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("Longitud");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 75, -1, -1));

        jLabel6.setText("Cantidad de curvas ");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 112, -1, -1));

        jLabel7.setText(" Tipo de carreras");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 149, -1, -1));

        jLabel15.setText("Locacion");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 182, -1, -1));

        jButton3.setText("listo");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 277, 96, -1));
        jPanel5.add(longitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 73, 88, -1));
        jPanel5.add(curvas, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 110, 88, -1));
        jPanel5.add(locacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 180, 88, -1));
        jPanel5.add(tipo_carrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 147, 88, -1));

        jTabbedPane2.addTab("Agregar circuito", jPanel5);

        admin.add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 780, 430));

        jButton1.setText("<-");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        admin.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(iniciar_crear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pbar_iniciar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 790, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(usuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(admin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(iniciar_crear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pbar_iniciar, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(usuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(admin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (nombre.getText() != null && Correo.getText() != null && Pais.getText() != null && Usuario.getText() != null && Contrasena.getText() != null) {
            boolean cumple_edad = validacion_fecha();
            if (cumple_edad) {
                boolean nombre_usuario = validacion_nombre_usuario_mismo_nombre();
                if (nombre_usuario) {
                    boolean contasena_no_valida = validando_nombre_contasena_2();
                    if (contasena_no_valida) {
                        adminjugador j = new adminjugador("./Usuario.usr");
                        j.getlistajugador().add(new jugador(nombre.getText(), Correo.getText(), Pais.getText(), fecha.getDate(), Usuario.getText(), Contrasena.getText()));
                        j.escribirArchivo();
                        nombre.setText("");
                        Correo.setText("");
                        Pais.setText("");
                        fecha.setDate(new Date());
                        Usuario.setText("");
                        Contrasena.setText("");

                        JOptionPane.showMessageDialog(this, "Se a registrado exitosamente");
                    } else {
                        JOptionPane.showMessageDialog(this, "Esta contraseña no es valida porque debe de:\nContener mínimo una letra mayúscula \nUna minúscula\nUn arácter especial");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Este nombre de usuario ya fue tomado");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Es menor de edad");
                nombre.setText("");
                Usuario.setText("");
                Contrasena.setText("");
                Correo.setText("");
                Pais.setText("");
                fecha.setDate(new Date());
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsuarioActionPerformed

    private void PaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PaisActionPerformed

    private void ContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ContrasenaActionPerformed

    private void CorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CorreoActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void ListoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListoActionPerformed
        if (i_usuario.getText() != null && i_contrasena.getText() != null) {
            hilo_inciar h_i = new hilo_inciar(i_barra);
            adminjugador j = new adminjugador("./Usuario.usr");
            j.cargarArchivo();
            i_barra.setMaximum(j.getlistajugador().size());
            for (jugador object : j.getlistajugador()) {
                if (i_usuario.getText().equals(object.getUsuario()) && i_contrasena.getText().equals(object.getContrasena())) {
                    i_barra.setMaximum((j.getlistajugador().indexOf(object) + 1));
                    break;
                }
            }

            i_barra.setMinimum(0);
            h_i.start();
            boolean acabo = false;
            while (!acabo) {
                if (i_barra.getValue() == i_barra.getMaximum()) {
                    acabo = true;
                    System.out.println("ya");
                }
            }
            if (i_usuario.getText().equals("admin") && i_contrasena.getText().equals("admin")) {

            }
        } else {

        }
    }//GEN-LAST:event_ListoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        admin.setVisible(false);
        iniciar_crear.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (concesionaria_locacion.getText()!=null&&concesionaria_nombre.getText()!=null) {
            concesionarias temp=new concesionarias(concesionaria_nombre.getText(), concesionaria_locacion.getText());
            adminConcesionarias c=new adminConcesionarias("./Concesionaria.cns");
            c.agregar_concesionaria(temp);
            c.escribirArchivo();
        }
    }//GEN-LAST:event_jButton4ActionPerformed
    public boolean validacion_nombre_usuario_mismo_nombre() {
        adminjugador j = new adminjugador("./Usuario.usr");
        for (jugador object : j.getlistajugador()) {
            if (object.getUsuario().equals(Usuario.getText())) {
                return false;
            }
        }
        return true;
    }

    public boolean validando_nombre_contasena_2() {
        String c = Contrasena.getText();
        int mayuscula = 0;
        int minuscula = 0;
        int especial = 0;
        for (int i = 0; i < c.length(); i++) {
            char letra = c.charAt(i);
            if ((int) letra >= 97 && (int) letra <= 122) {
                minuscula++;
            }
            if ((int) letra >= 65 && (int) letra <= 90) {
                mayuscula++;
            }
            if ((int) letra >= 33 && (int) letra <= 47) {
                especial++;
            }
            if ((int) letra >= 58 && (int) letra <= 64) {
                especial++;
            }
        }
        if (mayuscula == 0 || minuscula == 0 || especial == 0) {
            return false;
        } else {
            return true;
        }
    }

    public boolean validacion_fecha() {
        Date nacimiento = fecha.getDate();
        int year = nacimiento.getYear() + 1900, dia = nacimiento.getDay(), mes = nacimiento.getMonth() + 1;
        Date hoy = new Date();
        int year1 = hoy.getYear() + 1900, dia1 = hoy.getDay(), mes1 = hoy.getMonth() + 1, diferencia = 0;
        diferencia = year1 - year;
        if (mes1 >= mes) {
            if (dia1 >= dia && mes1 == mes) {
            } else if (mes1 == mes) {
                diferencia--;
            }
        } else {
            diferencia--;
        }
        if (diferencia <= 12) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Contrasena;
    private javax.swing.JTextField Correo;
    private javax.swing.JButton Listo;
    private javax.swing.JTextField Pais;
    private javax.swing.JTextField Usuario;
    private javax.swing.JPanel admin;
    private javax.swing.JTextField concesionaria_locacion;
    private javax.swing.JTextField concesionaria_nombre;
    private javax.swing.JTextField curvas;
    private com.toedter.calendar.JDateChooser fecha;
    private javax.swing.JProgressBar i_barra;
    private javax.swing.JTextField i_contrasena;
    private javax.swing.JTextField i_usuario;
    private javax.swing.JPanel iniciar_crear;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField locacion;
    private javax.swing.JTextField longitud;
    private javax.swing.JTextField nombre;
    private javax.swing.JPanel pbar_iniciar;
    private javax.swing.JTextField tipo_carrera;
    private javax.swing.JPanel usuario;
    // End of variables declaration//GEN-END:variables
}
