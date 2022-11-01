/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;


import static Presentacion.Frm_factura.txt_nombre;
import static Presentacion.Frm_factura.txt_doctor;
import static Presentacion.Frm_factura.txt_apellido;
import static Presentacion.Frm_factura.txt_noFact;
import static Presentacion.Frm_factura.txt_nombre_user;
import static Presentacion.Frm_factura.txt_fecha;
import static Presentacion.Frm_factura.txt_precio;
import static Presentacion.Frm_factura.txt_cantidad;
import static Presentacion.Frm_factura.txt_noFact;
import static Presentacion.Frm_factura.txt_total;
import static Presentacion.Frm_factura.txt_tipo_pago;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class Met_Factura {
  
    public static void suma (){ 
    //Metodo para la suma que da el Total
        int a=0;
       int  b=0;

        for (int i=0; i<Frm_factura.tbl_prod.getRowCount(); i++){
            a= Integer.parseInt(Frm_factura.tbl_prod.getValueAt(i,2).toString());
            
          b+=a;
        }
        
   Frm_factura.txt_total.setText(""+  b);
    }
    
     public static void resta (){ 
    //Metodo para la resta que da el Total
       int a=0;
       int  b=0;
       int tot = 0;

        for (int i=0; i<Frm_factura.tbl_prod.getRowCount(); i++){
            a= Integer.parseInt(Frm_factura.tbl_prod.getValueAt(i,2).toString());
            
          tot = a-b;
        }
        
   Frm_factura.txt_total.setText(""+  tot);
    }
        

     
      public static String Fecha(){
     Date fecha = new Date();
     SimpleDateFormat formatofecha=new SimpleDateFormat("YYYY/MM/dd");
        return formatofecha.format(fecha);
 
 }
      
  
      
      
     
         public static void monto(){ //Calcula el monto de la factura
   
        int mon,prec,canti;
   prec=Integer.parseInt(txt_precio.getText());
      canti=Integer.parseInt(txt_cantidad.getText());
   mon=prec*canti;
  Frm_factura.txt_monto.setText(String.valueOf(mon));
   
}
    public static void guardar (){ //Inserta datos en la tabla factura
            String detall = txt_noFact.getText();
            String fecha = txt_fecha.getText();
            String NomUser= txt_nombre_user.getText(); 
            String nomPac= txt_nombre.getText();
            String apelPac= txt_apellido.getText();
            String total= txt_total.getText();
            String Tipo_Pago = (String) txt_tipo_pago.getSelectedItem();
            String Doctor = (String) txt_doctor.getSelectedItem();

            java.util.Date date = Calendar.getInstance().getTime();  


 
              PreparedStatement ps;
        String query = "INSERT INTO `factura`(`Fecha`,`ID_DetalleFac`,`Nombre_Paciente`,`Apellido_Paciente`,`Tipo_Pago`,`Usuario`,`Total`, `Doctor`) VALUES (?,?,?,?,?,?,?,?)";
        try {
            ps = MyConnection.getConnection().prepareStatement(query);
            
       ps.setString(1, fecha);
       ps.setString(2, detall);
       ps.setString(3, nomPac);
       ps.setString(4, apelPac);
       ps.setString(5, Tipo_Pago);
       ps.setString(6, NomUser);
       ps.setString(7, total);
       ps.setString(8, Doctor);

 
               
         if(ps.executeUpdate() > 0)
            {
                JOptionPane.showMessageDialog(null, "Factura guardada");
                
            }
                   
                 
        } catch (SQLException ex) {
            Logger.getLogger(Frm_empleados.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "error "+ex);
            }

         
         
    }   
    
   
    
    
    
      
}
