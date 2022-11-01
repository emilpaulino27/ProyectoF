/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import static com.sun.corba.se.impl.orbutil.CorbaResourceUtil.getText;
import com.toedter.calendar.JDateChooser;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Emil Paulino
 */
public class Ganancias_Diarias extends javax.swing.JFrame {
 Calendar Fecha_Actual = new GregorianCalendar();
 DefaultTableModel ControlGanancias;
 Calendar fecha_actual=new GregorianCalendar();
    /**
     * Creates new form Ganancias
     */
    public Ganancias_Diarias() {
        initComponents();
        this.ControlGanancias = (DefaultTableModel) table.getModel();
        txt_fecha.setCalendar(Fecha_Actual);
        ConsultarDoc(txt_doctor);
        getlastid();
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
        txt_doctor = new javax.swing.JComboBox<>();
        lbl_doctor = new javax.swing.JLabel();
        lbl_fecha = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        ganancias = new javax.swing.JLabel();
        porclinic = new javax.swing.JLabel();
        tfact = new javax.swing.JLabel();
        lbl_totalfact = new javax.swing.JLabel();
        lbl_por_clinica = new javax.swing.JLabel();
        lbl_ganancias = new javax.swing.JLabel();
        btn_reporte = new javax.swing.JButton();
        btn_cargar = new javax.swing.JButton();
        txt_fecha = new com.toedter.calendar.JDateChooser();
        btn_factura = new javax.swing.JButton();
        lbl_ctrl_g = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ALMACENAR NUEVA GANANCIA");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lbl_doctor.setText("Doctor:");

        lbl_fecha.setText("Fecha:");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Factura", "ID Detalle Factura", "Nombre Paciente", "Apellido Paciente", "Total Factura"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        ganancias.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ganancias.setText("Ganancias: RD$");

        porclinic.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        porclinic.setText("Porciento de la Clínica: RD$");

        tfact.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tfact.setText("Total Facturado: RD$");

        lbl_totalfact.setBackground(new java.awt.Color(0, 0, 0));
        lbl_totalfact.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbl_totalfact.setText("0.00");

        lbl_por_clinica.setBackground(new java.awt.Color(255, 0, 0));
        lbl_por_clinica.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbl_por_clinica.setForeground(new java.awt.Color(255, 0, 0));
        lbl_por_clinica.setText("0.00");

        lbl_ganancias.setBackground(new java.awt.Color(0, 153, 0));
        lbl_ganancias.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbl_ganancias.setForeground(new java.awt.Color(0, 153, 0));
        lbl_ganancias.setText("0.00");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(porclinic, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfact, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ganancias, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_totalfact, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_ganancias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_por_clinica, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_totalfact, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfact))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_por_clinica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(porclinic))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_ganancias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ganancias))
                .addContainerGap())
        );

        btn_reporte.setBackground(new java.awt.Color(255, 255, 255));
        btn_reporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/printer.png"))); // NOI18N
        btn_reporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reporteActionPerformed(evt);
            }
        });

        btn_cargar.setText("Cargar");
        btn_cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cargarActionPerformed(evt);
            }
        });

        txt_fecha.setDateFormatString("yyyy/MM/dd");

        btn_factura.setBackground(new java.awt.Color(255, 255, 255));
        btn_factura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/inspect.png"))); // NOI18N
        btn_factura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_facturaActionPerformed(evt);
            }
        });

        lbl_ctrl_g.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl_ctrl_g.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_ctrl_g.setText("<html>CONTROL DE GANANCIAS DIARIAS</html>");

        txt_id.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_reporte, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_doctor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_doctor, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_cargar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl_fecha)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_factura, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_ctrl_g, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_ctrl_g, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_fecha)
                        .addComponent(lbl_doctor)
                        .addComponent(txt_doctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_cargar)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(btn_factura, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(btn_reporte, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void RefrescarTabla(){
        try{
            
            ControlGanancias.setColumnCount(0);
            ControlGanancias.setRowCount(0);
            table.revalidate();
        }
         catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "error "+ex);
        
    }
    }
    
    public final void Mostrardatos(String string){
            //Funcion para llenar la jtable de Usuarios desde la BD
            MyConnection cc=new MyConnection();
            Connection cn=MyConnection.getConnection();
            RefrescarTabla();
            ControlGanancias.addColumn("ID Factura");
            ControlGanancias.addColumn("ID Detalle Factura");
            ControlGanancias.addColumn("Nombre Paciente");
            ControlGanancias.addColumn("Apellido Paciente");
            ControlGanancias.addColumn("Total Factura");
            
            
           String var = (String) txt_doctor.getSelectedItem();
           String doc= var;
           
           
           
           String date = (String) txt_fecha.getDateFormatString();
           
           
String dia = Integer.toString(txt_fecha.getCalendar().get(Calendar.DAY_OF_MONTH));
String mes = Integer.toString(txt_fecha.getCalendar().get(Calendar.MONTH) + 1);
String year = Integer.toString(txt_fecha.getCalendar().get(Calendar.YEAR));
String fecha = (year + "-" + mes+ "-" + dia);

            
            this.table.setModel(ControlGanancias);
            String sql;
            if (doc.equals(""))
            {
           sql="";
            }
            else{
            sql="select ID_Factura,ID_DetalleFac,Nombre_Paciente,Apellido_Paciente,Total from factura where fecha = '"+fecha+"' and Doctor = '"+doc+"';";
            } 

            String []datos=new String [5];
            try{
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery(sql);
            while(rs.next()){
            datos[0]=rs.getString(1);
            datos[1]=rs.getString(2);
            datos[2]=rs.getString(3);
            datos[3]=rs.getString(4);
            
            datos[4]=rs.getString(5);


            ControlGanancias.addRow(datos);
            }
            table.setModel(ControlGanancias);

               lbl_totalfact.setText(Integer.toString(sumarcolumna()));
                    lbl_por_clinica.setText(Integer.toString(porcientoclinica()));
                    lbl_ganancias.setText(Integer.toString(ganancias()));


            }catch(SQLException ex){
            Logger.getLogger(frm_Main.class.getName()).log(Level.SEVERE,null,ex);
            JOptionPane.showMessageDialog(null, "error "+ex);
            }
        }
    
   
    private void btn_cargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cargarActionPerformed
        // TODO add your handling code here:
        
      sumarcolumna();
      Mostrardatos("");
      

        
    }//GEN-LAST:event_btn_cargarActionPerformed

    private void btn_facturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_facturaActionPerformed
        // TODO add your handling code here:
        
        
        String id = (String)ControlGanancias.getValueAt(table.getSelectedRow(),0);
        
         Connection cn=MyConnection.getConnection();
        try{
            int txtFac;
          JasperReport jr = (JasperReport) JRLoader.loadObject(Frm_factura.class.getResource("/Reportes/factura.jasper"));
          Map parametros = new HashMap<>();
          parametros.put("Factura",txtFac = Integer.parseInt(id));
          JasperPrint jp = JasperFillManager.fillReport(jr, parametros, cn);
          JasperViewer jv = new JasperViewer(jp, false);
          jv.setVisible(true); 
        }
        catch (JRException ex) {
            JOptionPane.showMessageDialog(rootPane, ex);
        }
        
        
    }//GEN-LAST:event_btn_facturaActionPerformed

    private void btn_reporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reporteActionPerformed
        // TODO add your handling code here:
        guardarGanancia();
        guardarDetalleG();
        imprimir();
    }//GEN-LAST:event_btn_reporteActionPerformed

   public int sumarcolumna(){
     
       int contar = table.getRowCount();
       int suma = 0;
       for (int i = 0; i < contar; i++){
           suma = suma+Integer.parseInt(table.getValueAt(i,4).toString());
       }
        return suma;
    
   }
   
   public int porcientoclinica(){
       
       String total =  lbl_totalfact.getText();
     Integer num = Integer.parseInt(total);
     int calc =0;
             calc = (int) (num*0.20);
     return calc;
     
   }
   
   public int ganancias(){
       String total =  lbl_totalfact.getText();
     Integer num1 = Integer.parseInt(total);
     
     String porCli = lbl_por_clinica.getText();
     Integer num2 = Integer.parseInt(porCli);
     
     
     int calc =0;
             calc = (int) (num1 - num2);
     return calc;
   }
   
   
   
    public void ConsultarDoc(JComboBox Doctor){
       String sql = "select * from vista_doc;";
       try{
         
           MyConnection cn = new MyConnection();
           Connection con;
           PreparedStatement ps;
           ResultSet rs;
           
           con = cn.getConnection();
           ps = con.prepareStatement(sql);
           rs=ps.executeQuery();
           while(rs.next()) {
               Doctor.addItem(rs.getString("Nombres"));
           }
           
           
           
       } catch (SQLException e){
           System.out.println(e.toString());
       }
   }
    
    private void getlastid() {

         int lastid;
        Statement st;
        ResultSet rs;
        
         try{
            Connection con = MyConnection.getConnection();
            String sql = "select max(ID_Ganancia) from ganancias";
            st= con.createStatement();
            
            rs=st.executeQuery(sql);
            if(rs.next()){
                lastid = rs.getInt(1);
                lastid++;
                txt_id.setText(Integer.toString(lastid));
            }
            else{
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Met_Factura.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void guardarGanancia (){ //Inserta datos en la tabla factura
            String detalle = txt_id.getText();
            String date = (String) txt_fecha.getDateFormatString(); 
            String dia = Integer.toString(txt_fecha.getCalendar().get(Calendar.DAY_OF_MONTH));
            String mes = Integer.toString(txt_fecha.getCalendar().get(Calendar.MONTH) + 1);
            String year = Integer.toString(txt_fecha.getCalendar().get(Calendar.YEAR));
            String fecha = (year + "-" + mes+ "-" + dia);
            
            String Doctor= (String) txt_doctor.getSelectedItem(); 
            String Total_F = lbl_totalfact.getText();
            String Porc_Cli = lbl_por_clinica.getText();
            String Ganancias = lbl_ganancias.getText();

              PreparedStatement ps;
        String query = "INSERT INTO `ganancias`(`No_Detalle_Ganancia`,`Fecha`,`Doctor`,`Total_Facturado`,`Porciento_Clinica`,`Ganancia_Neta`) VALUES (?,?,?,?,?,?)";
        try {
            ps = MyConnection.getConnection().prepareStatement(query);
            
       ps.setString(1, detalle);
       ps.setString(2, fecha);
       ps.setString(3, Doctor);
       ps.setString(4, Total_F);
       ps.setString(5, Porc_Cli);
       ps.setString(6, Ganancias);



                 if(ps.executeUpdate() > 0)
            {
            }    
          
                 
        } catch (SQLException ex) {
            Logger.getLogger(Frm_empleados.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "error "+ex);
            }

         
         
    }  
    
    
    public void guardarDetalleG(){
        String detalle = txt_id.getText();
    for (int i=0; i<table.getRowCount();i++){
        
        PreparedStatement ps;
        String query = "INSERT INTO `detalle_ganancia`(`No_Detalle_Ganancia`,`Nombre_Paciente`, `Apellido_Paciente`,`Total_Factura`) VALUES (?,?,?,?)";
        
        try {
            ps = MyConnection.getConnection().prepareStatement(query);
              
          ps.setString(1, detalle);
          ps.setString(2, table.getValueAt(i, 2).toString());
          ps.setString(3, table.getValueAt(i, 3).toString());          
          ps.setString(4, table.getValueAt(i, 4).toString());
     
           
           if(ps.executeUpdate() > 0)
            {
            }
                   
                 
        } catch (SQLException ex) {
            Logger.getLogger(Frm_Login.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "error "+ex);
            }
 
    }

        }
                                             

    public void imprimir(){
     
      Connection cn=MyConnection.getConnection();
        try{
            int txtFac;
          JasperReport jr = (JasperReport) JRLoader.loadObject(Frm_factura.class.getResource("/Reportes/ganancias.jasper"));
          Map parametros = new HashMap<>();
          parametros.put("id",txtFac = Integer.parseInt(txt_id.getText()));
          JasperPrint jp = JasperFillManager.fillReport(jr, parametros, cn);
          JasperViewer jv = new JasperViewer(jp, false);
          jv.setVisible(true); 
        }
        catch (JRException ex) {
            JOptionPane.showMessageDialog(rootPane, ex);
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
            java.util.logging.Logger.getLogger(Ganancias_Diarias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ganancias_Diarias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ganancias_Diarias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ganancias_Diarias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ganancias_Diarias().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btn_cargar;
    private javax.swing.JButton btn_factura;
    private javax.swing.JButton btn_reporte;
    private javax.swing.JLabel ganancias;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_ctrl_g;
    private javax.swing.JLabel lbl_doctor;
    private javax.swing.JLabel lbl_fecha;
    private javax.swing.JLabel lbl_ganancias;
    private javax.swing.JLabel lbl_por_clinica;
    private javax.swing.JLabel lbl_totalfact;
    private javax.swing.JLabel porclinic;
    private javax.swing.JTable table;
    private javax.swing.JLabel tfact;
    public static javax.swing.JComboBox<String> txt_doctor;
    private com.toedter.calendar.JDateChooser txt_fecha;
    private javax.swing.JTextField txt_id;
    // End of variables declaration//GEN-END:variables
}
