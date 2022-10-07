package Interfaz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Action;
import Interfaz.conexion;


public class Interfaz extends javax.swing.JFrame {
    
Connection ccn = null;
conexion conect = new conexion();

    public Interfaz() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        Guardar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lb1 = new javax.swing.JLabel();
        lb2 = new javax.swing.JLabel();
        lb3 = new javax.swing.JLabel();
        lb4 = new javax.swing.JLabel();
        lb5 = new javax.swing.JLabel();
        lb6 = new javax.swing.JLabel();
        cases = new javax.swing.JTextField();
        tecla = new javax.swing.JTextField();
        moni = new javax.swing.JTextField();
        parla = new javax.swing.JTextField();
        memoria = new javax.swing.JTextField();
        raton = new javax.swing.JTextField();
        inventario = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        inicio = new javax.swing.JMenu();
        conexion = new javax.swing.JMenuItem();
        Salir = new javax.swing.JMenuItem();
        help = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(0, 0, 0));

        Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/save-disk.png"))); // NOI18N
        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        jPanel1.setForeground(new java.awt.Color(153, 153, 153));

        lb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/torre-de-la-cpu.png"))); // NOI18N
        lb1.setText("Cases Listos:");

        lb2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/raton.png"))); // NOI18N
        lb2.setText("Ratones:");

        lb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/monitor.png"))); // NOI18N
        lb3.setText("Monitores");

        lb4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/teclado.png"))); // NOI18N
        lb4.setText("Teclados:");

        lb5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/altavoz.png"))); // NOI18N
        lb5.setText("Parlantes:");

        lb6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/memoria-usb.png"))); // NOI18N
        lb6.setText("Memorias USB:");

        cases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casesActionPerformed(evt);
            }
        });

        tecla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teclaActionPerformed(evt);
            }
        });

        moni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moniActionPerformed(evt);
            }
        });

        parla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parlaActionPerformed(evt);
            }
        });

        memoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memoriaActionPerformed(evt);
            }
        });

        raton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ratonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lb4)
                        .addGap(18, 18, 18)
                        .addComponent(tecla, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lb3)
                        .addGap(18, 18, 18)
                        .addComponent(moni, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lb2)
                                .addGap(18, 18, 18)
                                .addComponent(raton, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lb1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cases, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lb6)
                                .addGap(18, 18, 18)
                                .addComponent(memoria, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lb5)
                                .addGap(18, 18, 18)
                                .addComponent(parla, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb1)
                    .addComponent(lb5)
                    .addComponent(cases, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(parla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb2)
                    .addComponent(lb6)
                    .addComponent(raton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(memoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb3)
                    .addComponent(moni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb4)
                    .addComponent(tecla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        inventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/carpeta.png"))); // NOI18N
        inventario.setText("Inventario");
        inventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inventarioActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(Guardar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(inventario, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Guardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(inventario))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 42, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Guardar)
                    .addComponent(inventario))
                .addContainerGap())
        );

        inicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/logotype192.png"))); // NOI18N
        inicio.setText("Inicio");

        conexion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/group.png"))); // NOI18N
        conexion.setText("Probar Conexion");
        conexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conexionActionPerformed(evt);
            }
        });
        inicio.add(conexion);

        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/emergency-exit.png"))); // NOI18N
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        inicio.add(Salir);

        jMenuBar1.add(inicio);

        help.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/exclamation11.png"))); // NOI18N
        help.setText("Help");

        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/question.png"))); // NOI18N
        jMenuItem9.setText("Ayuda");
        help.add(jMenuItem9);

        jMenuBar1.add(help);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        String rato,teclados,mon,usb,cas,parl,campos,valores;

        cas=this.cases.getText();
        teclados=this.tecla.getText();
        rato=this.raton.getText();
        mon=this.moni.getText();
        usb=this.memoria.getText();
        parl=this.parla.getText();
        campos="Cases,Ratones,Monitores,Teclados,Parlantes,Memorias_USB";
        valores=""+cas+","+rato+","+mon+","+teclados+","+parl+","+usb+"";
        Guardar n=new Guardar();
        n.guardar("Registro",campos,valores);
        cases.setText("");
        tecla.setText("");
        raton.setText("");
        moni.setText("");
        memoria.setText("");
        parla.setText("");
    }//GEN-LAST:event_GuardarActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        JOptionPane.showMessageDialog(null, "CONEXION TERMINADA");
        conexion obj = new conexion();
    }//GEN-LAST:event_SalirActionPerformed

    private void conexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conexionActionPerformed
        conexion a=new conexion();
        a.conexion();
        JOptionPane.showMessageDialog(null, "CONEXION EXITOSA");
    }//GEN-LAST:event_conexionActionPerformed

    private void casesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casesActionPerformed

    private void teclaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teclaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teclaActionPerformed

    private void moniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_moniActionPerformed

    private void parlaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parlaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_parlaActionPerformed

    private void memoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_memoriaActionPerformed

    private void ratonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ratonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ratonActionPerformed

    private void inventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventarioActionPerformed
        Inventario a = new Inventario();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_inventarioActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Guardar;
    private javax.swing.JMenuItem Salir;
    private javax.swing.JTextField cases;
    private javax.swing.JMenuItem conexion;
    private javax.swing.JMenu help;
    private javax.swing.JMenu inicio;
    private javax.swing.JButton inventario;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lb4;
    private javax.swing.JLabel lb5;
    private javax.swing.JLabel lb6;
    private javax.swing.JTextField memoria;
    private javax.swing.JTextField moni;
    private javax.swing.JTextField parla;
    private javax.swing.JTextField raton;
    private javax.swing.JTextField tecla;
    // End of variables declaration//GEN-END:variables
}
