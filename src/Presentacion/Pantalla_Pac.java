/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;


import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Emil Paulino
 */
public class Pantalla_Pac extends javax.swing.JFrame {
    DefaultTableModel Pac;
    /**
     * Creates new form Pantalla_Serv
     */
    public Pantalla_Pac() {
        initComponents();
        this.Pac = (DefaultTableModel) tbl_pac.getModel();
        Mostrardatos("");
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_pac = new javax.swing.JTable();
        btn_aceptar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_buscador = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ELIGE EL PACIENTE");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tbl_pac.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_pac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_pacMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_pac);

        btn_aceptar.setBackground(new java.awt.Color(255, 255, 255));
        btn_aceptar.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btn_aceptar.setText("Aceptar");
        btn_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aceptarActionPerformed(evt);
            }
        });

        jLabel1.setText("Buscar:");

        txt_buscador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_buscadorKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(213, 213, 213))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_buscador, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_buscador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_aceptar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptarActionPerformed
        // TODO add your handling code here:
        
        this.dispose();
        
    }//GEN-LAST:event_btn_aceptarActionPerformed

    private void tbl_pacMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_pacMouseClicked
        // TODO add your handling code here:
        
         try {  
        String Nombre = (String) Pac.getValueAt(tbl_pac.getSelectedRow(),1);
        String Apellido = (String) Pac.getValueAt(tbl_pac.getSelectedRow(),2);
        


        Frm_factura.txt_nombre.setText(Nombre);
        Frm_factura.txt_apellido.setText(Apellido);
        
        }
         catch (Exception ex){
        JOptionPane.showMessageDialog(null, "error "+ex);
        } 
                this.dispose();

    }//GEN-LAST:event_tbl_pacMouseClicked

    private void txt_buscadorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buscadorKeyPressed
        // TODO add your handling code here:
        
          try {
            if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
        String B = txt_buscador.getText()+"";
        Mostrardatos(B);
            }
        }
        catch (Exception ex){
        JOptionPane.showMessageDialog(null, "error "+ex);
        }
        
    }//GEN-LAST:event_txt_buscadorKeyPressed

    
    public void RefrescarTabla(){
        try{
            
            Pac.setColumnCount(0);
            Pac.setRowCount(0);
            tbl_pac.revalidate();
        }
         catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "error "+ex);
        
    }
    }
    
    public final void Mostrardatos(String valor){
            //Funcion para llenar la jtable de Usuarios desde la BD
            MyConnection cc=new MyConnection();
            Connection cn=MyConnection.getConnection();
            RefrescarTabla();
            Pac.addColumn("ID Paciente");
            Pac.addColumn("Nombre");
            Pac.addColumn("Apellido");

           this.tbl_pac.setModel(Pac);
            String sql;
            if (valor.equals(""))
            {
            sql="SELECT ID_Paciente,Nombre,Apellido FROM pacientes";
            }
            else{
            sql="SELECT ID_Paciente,Nombre,Apellido FROM pacientes WHERE Nombre like'%"+valor+"%'";
            } 

            String []datos=new String [3];
            try{
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery(sql);
            while(rs.next()){
            datos[0]=rs.getString(1);
            datos[1]=rs.getString(2);
            datos[2]=rs.getString(3);
            

            Pac.addRow(datos);
            }
            tbl_pac.setModel(Pac);


            }catch(SQLException ex){
            Logger.getLogger(frm_Main.class.getName()).log(Level.SEVERE,null,ex);
            JOptionPane.showMessageDialog(null, "error "+ex);
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
            java.util.logging.Logger.getLogger(Pantalla_Pac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Pac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Pac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Pac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla_Pac().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_aceptar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tbl_pac;
    private javax.swing.JTextField txt_buscador;
    // End of variables declaration//GEN-END:variables
}