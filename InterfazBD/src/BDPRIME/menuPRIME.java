package BDPRIME;


import BaseDeDatosMiel.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class menuPRIME extends javax.swing.JFrame {

    public static final String URL= "jdbc:mysql://localhost:3306/miel";
    public static final String USER= "root";
    public static final String PASSWORD= "123456789Ab";
    public menuPRIME() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1Apicultores = new javax.swing.JButton();
        jButton2Ventas = new javax.swing.JButton();
        jButton1Salir = new javax.swing.JButton();
        jButton1Compras = new javax.swing.JButton();
        jButton2Tambor = new javax.swing.JButton();
        jButton3Empleados = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1Apicultores.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1Apicultores.setText("Apicultores");
        jButton1Apicultores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ApicultoresActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1Apicultores, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jButton2Ventas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2Ventas.setText("Ventas");
        jButton2Ventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2VentasActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2Ventas, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 85, -1));

        jButton1Salir.setText("Salir");
        jButton1Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1SalirActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, -1, -1));

        jButton1Compras.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1Compras.setText("Compras");
        jButton1Compras.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jButton1Compras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ComprasActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1Compras, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, -1, -1));

        jButton2Tambor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2Tambor.setText("Tambor");
        jButton2Tambor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2TamborActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2Tambor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jButton3Empleados.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3Empleados.setText("Empleados");
        jButton3Empleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3EmpleadosActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3Empleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 224, 97));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 350, 160));

        jPanel2.setBackground(new java.awt.Color(157, 57, 3));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 230));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ApicultoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ApicultoresActionPerformed
       TablaApicultores uno = new TablaApicultores();
       uno.setLocationRelativeTo(null);
       uno.setVisible(true);
       uno.setTitle("Apicultores");
       this.setResizable(false);
       this.dispose(); 
        
        
        /*try {
            Connection con= null;
            con = getConnection();
            
            PreparedStatement ps;
            ResultSet res;
            
            ps= con.prepareStatement("SELECT * FROM miel.apicultores");
            res = ps.executeQuery();
            
            if(res.next()){
            JOptionPane.showMessageDialog(null,"Nombre: "+ res.getString("nombre")+"\n"+"Domicilio: "+ res.getString("domicilio")+"\nTelefono: "+res.getString("telefono")+"\nTipo de miel: "+res.getString("tipo de miel"));
            }else{
                
            JOptionPane.showMessageDialog(null, "No Existen Datos");
           
            }
            if(res.next()){
            JOptionPane.showMessageDialog(null,"Nombre: "+ res.getString("nombre")+"\n"+"Domicilio: "+ res.getString("domicilio")+"\nTelefono: "+res.getString("telefono")+"\nTipo de miel: "+res.getString("tipo de miel"));
            }else{
                
            JOptionPane.showMessageDialog(null, "No Existen Datos");
           
            }
            
            con.close();
            
        } catch (Exception e) {
            System.out.println(e);
        } // TODO add your handling code here:*/
        
    }//GEN-LAST:event_jButton1ApicultoresActionPerformed
 /*public static Connection getConnection(){
       Connection con = null;
       
       try{
       Class.forName("com.mysql.jdbc.Driver");
       con= DriverManager.getConnection(URL,USER, PASSWORD);
           JOptionPane.showMessageDialog(null, "Conexion exitosa");
       
       }catch(Exception e){
           System.out.println(e);
       
       }
    return con; 
   }*/
    private void jButton1SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1SalirActionPerformed
System.exit(0);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton1SalirActionPerformed

    private void jButton2VentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2VentasActionPerformed
        TablaVentas uno = new TablaVentas();
       uno.setLocationRelativeTo(null);
       uno.setVisible(true);
       uno.setTitle("Ventas");
       this.setResizable(false);
       this.dispose(); // TODO add your handling code here:
    }//GEN-LAST:event_jButton2VentasActionPerformed

    private void jButton1ComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ComprasActionPerformed
        TablaCompras uno = new TablaCompras();
       uno.setLocationRelativeTo(null);
       uno.setVisible(true);
       uno.setTitle("Ventas");
       this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ComprasActionPerformed

    private void jButton2TamborActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2TamborActionPerformed
         TablaTambor uno = new TablaTambor();
       uno.setLocationRelativeTo(null);
       uno.setVisible(true);
       uno.setTitle("Ventas");
       this.dispose();/// TODO add your handling code here:
    }//GEN-LAST:event_jButton2TamborActionPerformed

    private void jButton3EmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3EmpleadosActionPerformed
       TablaEmpleados uno = new TablaEmpleados();
       uno.setLocationRelativeTo(null);
       uno.setVisible(true);
       uno.setTitle("Empleados");
       this.dispose(); // TODO add your handling code here:
    }//GEN-LAST:event_jButton3EmpleadosActionPerformed

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
            java.util.logging.Logger.getLogger(menuPRIME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuPRIME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuPRIME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuPRIME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuPRIME().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1Apicultores;
    private javax.swing.JButton jButton1Compras;
    private javax.swing.JButton jButton1Salir;
    private javax.swing.JButton jButton2Tambor;
    private javax.swing.JButton jButton2Ventas;
    private javax.swing.JButton jButton3Empleados;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
