
package BDPRIME;
import BaseDeDatosMiel.*;
import BaseDeDatosMiel.ConectarP;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

import java.util.Date;

public class InsertarCompras extends javax.swing.JFrame {
      // public static final String driver= "com.mysql.jdbc.Driver";
    public static final String URL= "jdbc:mysql://localhost:3306/mielprime";
    public static final String USER= "root";
    public static final String PASSWORD= "123456789Ab";
    
    PreparedStatement ps;
    ResultSet rs;
    
    public static Connection getConnection(){
       Connection con = null;
       
       try{
       Class.forName("com.mysql.jdbc.Driver");
       con= DriverManager.getConnection(URL,USER, PASSWORD);
           JOptionPane.showMessageDialog(null, "Conexion exitosa");
       
       }catch(Exception e){
           System.out.println(e);
       
       }
    return con; 
   }
    public void limpiarcasillas(){
jTextField1ID.setText(null);
jDateChooser1.setCalendar(null);
jTextField1Precio.setText(null);
jTextField1PrecioCent.setText(null);


}
public class ConectarP {
  
     
    
}
    public InsertarCompras() {
        initComponents();
        
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1ID = new javax.swing.JTextField();
        jButton1Agregar = new javax.swing.JButton();
        jButton5Limpiar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextField1Precio = new javax.swing.JTextField();
        jButton1Vertabla = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jTextField1PrecioCent = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Clave de identificacion:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jLabel2.setText("Fecha:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jTextField1ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1IDActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 101, -1));

        jButton1Agregar.setText("Agregar");
        jButton1Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1AgregarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        jButton5Limpiar.setText("Limpiar");
        jButton5Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5LimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5Limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, -1, -1));

        jLabel6.setText("Precio");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jTextField1Precio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1PrecioActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1Precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 59, -1));

        jButton1Vertabla.setText("Ver en tabla");
        jButton1Vertabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1VertablaActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1Vertabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, -1, -1));
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 122, -1));

        jLabel3.setText("$");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 8, -1));
        getContentPane().add(jTextField1PrecioCent, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 59, -1));

        jPanel1.setBackground(new java.awt.Color(255, 224, 97));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 350, 180));

        jPanel2.setBackground(new java.awt.Color(157, 57, 3));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 220));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1IDActionPerformed

    private void jButton1AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1AgregarActionPerformed
        Connection con= null;
        try{
        
        con = getConnection();
        ps= con.prepareStatement("INSERT INTO mielprime.compras(idCOMPRAS, CFecha, CPrecio) VALUES(?,?,?)");
        //Depende de los que mandemos se pone setInt, setString, etc.
        ps.setInt(1, Integer.valueOf(jTextField1ID.getText())); 
        
        Date date = jDateChooser1.getDate();
        //Pasar a formato sql
        long d= date.getTime();
        java.sql.Date fecha = new java.sql.Date(d);
        ps.setDate(2, fecha);
        int precio= Integer.valueOf(jTextField1Precio.getText()+jTextField1PrecioCent.getText());
        System.out.println(precio);
        if(jTextField1PrecioCent.getText().isEmpty()){
        jTextField1PrecioCent.setText(".00");
        }
        ps.setString(3, "$"+jTextField1Precio.getText()+jTextField1PrecioCent.getText());
       
        
        int res=ps.executeUpdate();
        
        if(res>0){
            JOptionPane.showMessageDialog(null,"Fecha guardada");
            limpiarcasillas();
        }else{
        JOptionPane.showMessageDialog(null,"Error al guardar");
        limpiarcasillas();
        }
        con.close();
        }catch(Exception E ){
            System.err.println(E);
        }
    }//GEN-LAST:event_jButton1AgregarActionPerformed

    private void jButton5LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5LimpiarActionPerformed
        limpiarcasillas();// TODO add your handling code here:
    }//GEN-LAST:event_jButton5LimpiarActionPerformed

    private void jButton1VertablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1VertablaActionPerformed
      TablaCompras uno = new TablaCompras();
       uno.setLocationRelativeTo(null);
       uno.setVisible(true);
       uno.setTitle("Menú");
       this.dispose();  
    }//GEN-LAST:event_jButton1VertablaActionPerformed

    private void jTextField1PrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1PrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1PrecioActionPerformed

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
            java.util.logging.Logger.getLogger(InsertarCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertarCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertarCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertarCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertarCompras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1Agregar;
    private javax.swing.JButton jButton1Vertabla;
    private javax.swing.JButton jButton5Limpiar;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1ID;
    private javax.swing.JTextField jTextField1Precio;
    private javax.swing.JTextField jTextField1PrecioCent;
    // End of variables declaration//GEN-END:variables
}
