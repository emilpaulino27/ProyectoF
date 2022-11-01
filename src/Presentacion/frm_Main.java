/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

/**
 *
 * @author Emil Paulino
 */
public class frm_Main extends javax.swing.JFrame {

    /**
     * Creates new form Main_Adm
     */
    public frm_Main() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jPanel2 = new javax.swing.JPanel();
        btn_cerrar_sesion = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        btn_pac = new javax.swing.JMenu();
        btn_cit = new javax.swing.JMenu();
        btn_factura = new javax.swing.JMenu();
        btn_recibo = new javax.swing.JMenu();
        btn_abono_recibo = new javax.swing.JMenu();
        m_ganancias = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        jMenuItem1.setText("jMenuItem1");

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú Administrador");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btn_cerrar_sesion.setBackground(new java.awt.Color(255, 255, 255));
        btn_cerrar_sesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logout.png"))); // NOI18N
        btn_cerrar_sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrar_sesionActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo sistema.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_cerrar_sesion, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(btn_cerrar_sesion)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));

        btn_pac.setText("Control Pacientes");
        btn_pac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_pacMouseClicked(evt);
            }
        });
        jMenuBar1.add(btn_pac);

        btn_cit.setText("Control Citas");
        btn_cit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_citMouseClicked(evt);
            }
        });
        jMenuBar1.add(btn_cit);

        btn_factura.setText("Factura");
        btn_factura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_facturaMouseClicked(evt);
            }
        });
        jMenuBar1.add(btn_factura);

        btn_recibo.setText("Recibos");
        btn_recibo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_reciboMouseClicked(evt);
            }
        });
        jMenuBar1.add(btn_recibo);

        btn_abono_recibo.setText("Abono Recibo");
        btn_abono_recibo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_abono_reciboMouseClicked(evt);
            }
        });
        jMenuBar1.add(btn_abono_recibo);

        m_ganancias.setText("Ganancias Diarias");
        m_ganancias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m_gananciasMouseClicked(evt);
            }
        });
        jMenuBar1.add(m_ganancias);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_pacMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pacMouseClicked
        // TODO add your handling code here:
        
        Frm_pacientes mf = new Frm_pacientes ();
        mf.setVisible(true);
        mf.pack();
        mf.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_btn_pacMouseClicked

    private void btn_citMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_citMouseClicked
        // TODO add your handling code here:
        
        Frm_citas mf = new Frm_citas ();
        mf.setVisible(true);
        mf.pack();
        mf.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_btn_citMouseClicked

    private void btn_cerrar_sesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrar_sesionActionPerformed
        // TODO add your handling code here:

        Frm_Login mf = new Frm_Login ();
        mf.setVisible(true);
        mf.pack();
        mf.setLocationRelativeTo(null);
        this.dispose();

    }//GEN-LAST:event_btn_cerrar_sesionActionPerformed

    private void btn_reciboMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_reciboMouseClicked
        // TODO add your handling code here:
        
         Recibo mf = new Recibo ();
        mf.setVisible(true);
        mf.pack();
        mf.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_btn_reciboMouseClicked

    private void btn_facturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_facturaMouseClicked
        // TODO add your handling code here:
        
         Frm_factura mf = new Frm_factura ();
        mf.setVisible(true);
        mf.pack();
        mf.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_btn_facturaMouseClicked

    private void btn_abono_reciboMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_abono_reciboMouseClicked
        // TODO add your handling code here:
        
        RecibosAlmacenados mf = new RecibosAlmacenados ();
        mf.setVisible(true);
        mf.pack();
        mf.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_btn_abono_reciboMouseClicked

    private void m_gananciasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_gananciasMouseClicked
        // TODO add your handling code here:
         Ganancias_Almacenadas mf = new Ganancias_Almacenadas ();
        mf.setVisible(true);
        mf.pack();
        mf.setLocationRelativeTo(null);
    }//GEN-LAST:event_m_gananciasMouseClicked

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
            java.util.logging.Logger.getLogger(frm_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu btn_abono_recibo;
    private javax.swing.JButton btn_cerrar_sesion;
    private javax.swing.JMenu btn_cit;
    private javax.swing.JMenu btn_factura;
    private javax.swing.JMenu btn_pac;
    private javax.swing.JMenu btn_recibo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenu m_ganancias;
    // End of variables declaration//GEN-END:variables
}