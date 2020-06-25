
package BDPRIME;
import BaseDeDatosMiel.*;
import BaseDeDatosMiel.ConectarP;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Busc_Mod_Apicultor extends javax.swing.JFrame {
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
jTextField1Nombre.setText(null);
jTextField2Telefono.setText(null);
jTextField3Municipio.setText(null);
}
public class ConectarP {
  
     
    
}
    public Busc_Mod_Apicultor() {
        initComponents();
        
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1ID = new javax.swing.JTextField();
        jTextField1Nombre = new javax.swing.JTextField();
        jTextField2Telefono = new javax.swing.JTextField();
        jTextField3Municipio = new javax.swing.JTextField();
        jButton2Buscar = new javax.swing.JButton();
        jButton3Modificar = new javax.swing.JButton();
        jButton4Eliminar = new javax.swing.JButton();
        jButton5Limpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Clave de identificacion:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Municipio:");

        jLabel4.setText("Telefono:");

        jTextField1ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1IDActionPerformed(evt);
            }
        });

        jTextField1Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1NombreActionPerformed(evt);
            }
        });

        jTextField2Telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2TelefonoActionPerformed(evt);
            }
        });

        jTextField3Municipio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3MunicipioActionPerformed(evt);
            }
        });

        jButton2Buscar.setText("Buscar");
        jButton2Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2BuscarActionPerformed(evt);
            }
        });

        jButton3Modificar.setText("Modificar");
        jButton3Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ModificarActionPerformed(evt);
            }
        });

        jButton4Eliminar.setText("Eliminar");
        jButton4Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4EliminarActionPerformed(evt);
            }
        });

        jButton5Limpiar.setText("Limpiar");
        jButton5Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5LimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton3Modificar)
                                .addGap(36, 36, 36)
                                .addComponent(jButton4Eliminar)
                                .addGap(39, 39, 39)
                                .addComponent(jButton5Limpiar)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextField3Municipio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                    .addComponent(jTextField1Nombre, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1ID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jTextField2Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2Buscar)
                        .addGap(86, 86, 86))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2Buscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3Municipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField2Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3Modificar)
                    .addComponent(jButton4Eliminar)
                    .addComponent(jButton5Limpiar))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1IDActionPerformed

    private void jTextField3MunicipioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3MunicipioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3MunicipioActionPerformed

    private void jTextField2TelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2TelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2TelefonoActionPerformed

    private void jButton2BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2BuscarActionPerformed
     Connection con= null;
        try{
        
        con = getConnection();
        ps= con.prepareStatement("SELECT * FROM mielprime.apicultores WHERE idApicultor=?");
        ps.setString(1, jTextField1ID.getText());
        
        rs=ps.executeQuery();
        
        if(rs.next()){
        jTextField1ID.setText(rs.getString("idApicultor"));
        jTextField1Nombre.setText(rs.getString("Nombre_Api"));
        jTextField2Telefono.setText(rs.getString("Telefono_Api"));
        jTextField3Municipio.setText(rs.getString("Municipio_Api"));
        
        }else{
        JOptionPane.showMessageDialog(null, "No existe ningun apicultor con esa identificacion");
        }
        
        }catch(Exception E ){
            System.err.println(E);
        }  
    }//GEN-LAST:event_jButton2BuscarActionPerformed

    private void jTextField1NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1NombreActionPerformed

    private void jButton5LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5LimpiarActionPerformed
        limpiarcasillas();// TODO add your handling code here:
    }//GEN-LAST:event_jButton5LimpiarActionPerformed

    private void jButton3ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ModificarActionPerformed
       Connection con= null;
        try{
        
        con = getConnection();
        ps= con.prepareStatement("UPDATE mielprime.apicultores SET idApicultor=?,Nombre_Api=?,Municipio_Api=?,Telefono_Api=? WHERE idApicultor=?");
        //Depende de los que mandemos se pone setInt, setString, etc.
        ps.setInt(1, Integer.valueOf(jTextField1ID.getText())); //Convertir para que lo lea
        ps.setString(2, jTextField1Nombre.getText());
        ps.setString(3, jTextField3Municipio.getText());
        ps.setString(4, jTextField2Telefono.getText());
        ps.setInt(5, Integer.valueOf(jTextField1ID.getText()));
        int res=ps.executeUpdate();
        
        if(res>0){
            JOptionPane.showMessageDialog(null,"Apicultor modificado");
            limpiarcasillas();
        }else{
        JOptionPane.showMessageDialog(null,"Error al modificar");
        limpiarcasillas();
        }
        con.close();
        }catch(Exception E ){
            System.err.println(E);
        } // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ModificarActionPerformed

    private void jButton4EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4EliminarActionPerformed
         Connection con= null;
        try{
        
        con = getConnection();
        ps= con.prepareStatement("DELETE FROM mielprime.apicultores WHERE (idApicultor=?");
        //DELETE FROM `mielprime`.`apicultores` WHERE (`idApicultor` = '5');
        //Depende de los que mandemos se pone setInt, setString, etc.
        ps.setInt(0, Integer.valueOf(jTextField1ID.getText())); //Convertir para que lo lea
        
        int res=ps.executeUpdate();
        
        if(res>0){
            JOptionPane.showMessageDialog(null,"Apicultor ELIMINADO");
            limpiarcasillas();
        }else{
        JOptionPane.showMessageDialog(null,"Error al ELIMINAR");
        limpiarcasillas();
        }
        con.close();
        }catch(Exception E ){
            System.err.println(E);
        } // TODO add your handling code here:
    }//GEN-LAST:event_jButton4EliminarActionPerformed

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
            java.util.logging.Logger.getLogger(Busc_Mod_Apicultor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Busc_Mod_Apicultor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Busc_Mod_Apicultor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Busc_Mod_Apicultor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Busc_Mod_Apicultor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2Buscar;
    private javax.swing.JButton jButton3Modificar;
    private javax.swing.JButton jButton4Eliminar;
    private javax.swing.JButton jButton5Limpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1ID;
    private javax.swing.JTextField jTextField1Nombre;
    private javax.swing.JTextField jTextField2Telefono;
    private javax.swing.JTextField jTextField3Municipio;
    // End of variables declaration//GEN-END:variables
}
