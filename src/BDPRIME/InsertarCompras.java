
package BDPRIME;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

public class InsertarCompras extends javax.swing.JFrame {
      // public static final String driver= "com.mysql.jdbc.Driver";
    /*public static final String URL= "jdbc:mysql://localhost:3306/mielprime";
    public static final String USER= "root";
    public static final String PASSWORD= "123456789Ab";*/
    
    PreparedStatement ps;
    ResultSet rs;
    
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
    public void limpiarcasillas(){
jTextField1ID.setText(null);
jDateChooser1.setCalendar(null);
jTextField1Precio.setText(null);
jTextField1PrecioCent.setText(null);
jTextField1Apicultor.setText(null);


}
   public void InsertarProducto(){
        String disponible = "Disponible"; 
        try{
         ConectarPRIME conn = new ConectarPRIME();
        java.sql.Connection con = conn.getConnection();
        ps= con.prepareStatement("INSERT INTO producto(fk_idCOMPRAS, fk_fecha_idCOMPRAS,Pdisponibilidad) VALUES(?,?,?)");
        //Depende de los que mandemos se pone setInt, setString, etc.
        
        
        
       ps.setString(1, jTextField1ID.getText());
       // ps.setInt(1, Integer.valueOf(jTextField1ID.getText())); 
       
        String año = Integer.toString(jDateChooser1.getCalendar().get(java.util.Calendar.YEAR));
   String mes = Integer.toString(jDateChooser1.getCalendar().get(java.util.Calendar.MONTH) + 1);
    String dia = Integer.toString(jDateChooser1.getCalendar().get(java.util.Calendar.DATE));
   int mesINT =Integer.valueOf(mes);
   if (mesINT>=10){
       String fecha= dia+"/"+mes+"/"+año;
   
   ps.setString(2, fecha);
   }else{
   String fecha= dia+"/0"+mes+"/"+año;
   ps.setString(2, fecha);
   
   }
        ps.setString(3,disponible );
       // ps.setString(3, jComboBox1.getSelectedItem().toString()); 
        
        int res=ps.executeUpdate();
        
        
        con.close();
        }catch(Exception E ){
            System.err.println(E);
        }// TODO add your handling code here:
}
    
public class ConectarP {
  
     
    
}
    public InsertarCompras() {
        initComponents();
        //PONER ICONO
                        //this.setIconImage(new ImageIcon(getClass().getResource("/Fondos/principal.jpg")).getImage());
                        //this.setSize(460,370);
                        this.setResizable(false);
        
        
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
        jLabel4 = new javax.swing.JLabel();
        jTextField1Apicultor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Clave de identificacion:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 35, -1, -1));

        jLabel2.setText("Fecha:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jTextField1ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1IDActionPerformed(evt);
            }
        });
        jTextField1ID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1IDKeyTyped(evt);
            }
        });
        getContentPane().add(jTextField1ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 101, -1));

        jButton1Agregar.setText("Agregar");
        jButton1Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1AgregarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        jButton5Limpiar.setText("Limpiar");
        jButton5Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5LimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5Limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, -1, -1));

        jLabel6.setText("Precio:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jTextField1Precio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1PrecioActionPerformed(evt);
            }
        });
        jTextField1Precio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1PrecioKeyTyped(evt);
            }
        });
        getContentPane().add(jTextField1Precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 59, -1));

        jButton1Vertabla.setText("Ver en tabla");
        jButton1Vertabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1VertablaActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1Vertabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, -1, -1));

        jDateChooser1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jDateChooser1KeyTyped(evt);
            }
        });
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 120, -1));

        jLabel3.setText("$");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 105, 8, -1));

        jTextField1PrecioCent.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1PrecioCentKeyTyped(evt);
            }
        });
        getContentPane().add(jTextField1PrecioCent, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 59, -1));

        jLabel4.setText("Apicultor:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jTextField1Apicultor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ApicultorActionPerformed(evt);
            }
        });
        jTextField1Apicultor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1ApicultorKeyTyped(evt);
            }
        });
        getContentPane().add(jTextField1Apicultor, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 190, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondos/fondo netbeans.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 250));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1IDActionPerformed

    private void jButton1AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1AgregarActionPerformed
       
        try{
        
        ConectarPRIME conn = new ConectarPRIME();
        java.sql.Connection con = conn.getConnection();
        ps= con.prepareStatement("INSERT INTO compras(idCOMPRAS, CFecha, CPrecio, Apicultor) VALUES(?,?,?,?)");
       
        //Depende de los que mandemos se pone setInt, setString, etc.
        ps.setInt(1, Integer.valueOf(jTextField1ID.getText())); 
        
        /*Date date = jDateChooser1.getDate();
        //Pasar a formato sql
        long d= date.getTime();
        java.sql.Date fecha = new java.sql.Date(d);*/
        String año = Integer.toString(jDateChooser1.getCalendar().get(java.util.Calendar.YEAR));
   String mes = Integer.toString(jDateChooser1.getCalendar().get(java.util.Calendar.MONTH) + 1);
    String dia = Integer.toString(jDateChooser1.getCalendar().get(java.util.Calendar.DATE));
   int mesINT =Integer.valueOf(mes);
   if (mesINT>=10){
       String fecha= dia+"/"+mes+"/"+año;
   
   ps.setString(2, fecha);
   }else{
   String fecha= dia+"/0"+mes+"/"+año;
   ps.setString(2, fecha);
   
   }
    
   //fecha.setText(dia+" de "+mes+" del "+año);

      
        if(jTextField1PrecioCent.getText().isEmpty()){
        jTextField1PrecioCent.setText("00");
        }
       // long d= date.getTime();
        //java.sql.Date fecha = new java.sql.Date(d);
        
        //System.out.println(fecha);
        ps.setString(3, "$"+jTextField1Precio.getText()+"."+jTextField1PrecioCent.getText());
        
       ps.setString(4, jTextField1Apicultor.getText());
       
      
       
       
        
        int res=ps.executeUpdate();
        InsertarProducto();
        if(res>0){
            JOptionPane.showMessageDialog(null,"Fecha guardada");
            limpiarcasillas();
        }else{
        JOptionPane.showMessageDialog(null,"Error al guardar");
        limpiarcasillas();
        }
        
        //con.close();
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
       uno.setSize(700, 300);
       uno.setVisible(true);
       uno.setTitle("Compras");
       this.dispose();  
    }//GEN-LAST:event_jButton1VertablaActionPerformed

    private void jTextField1PrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1PrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1PrecioActionPerformed

    private void jTextField1IDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1IDKeyTyped
      char validar=evt.getKeyChar();

 if(Character.isLetter(validar)){
getToolkit();
evt.consume();
JOptionPane.showMessageDialog(null,"Poner solo numeros", "Error",JOptionPane.ERROR_MESSAGE);
 }
if(Character.isSpaceChar(validar)){
getToolkit();
//getToolkit().beep(); poner sonido molesto
evt.consume();
JOptionPane.showMessageDialog(null,"Poner solo numeros", "Error",JOptionPane.ERROR_MESSAGE);
} 

if(evt.getKeyChar()=='/'||evt.getKeyChar()=='*'
        ||evt.getKeyChar()=='-'||evt.getKeyChar()=='+'
        ||evt.getKeyChar()=='.'||evt.getKeyChar()=='?'||evt.getKeyChar()==';'
        ||evt.getKeyChar()=='"'||evt.getKeyChar()=='#'||evt.getKeyChar()=='$'
        ||evt.getKeyChar()=='%'||evt.getKeyChar()=='('||evt.getKeyChar()==')'
        ||evt.getKeyChar()=='´'||evt.getKeyChar()=='&'||evt.getKeyChar()=='='
        ||evt.getKeyChar()=='¿'||evt.getKeyChar()=='¡'||evt.getKeyChar()=='@'
        ||evt.getKeyChar()=='<'||evt.getKeyChar()=='>'||evt.getKeyChar()==','
        ||evt.getKeyChar()=='_'||evt.getKeyChar()==':'||evt.getKeyChar()==','
        ||evt.getKeyChar()=='['||evt.getKeyChar()==']'||evt.getKeyChar()=='{'
        ||evt.getKeyChar()=='}'||evt.getKeyChar()=='^'||evt.getKeyChar()=='~'
        ||evt.getKeyChar()=='\''||evt.getKeyChar()=='!'||evt.getKeyChar()=='|'
        ||evt.getKeyChar()=='°'||evt.getKeyChar()=='¬'
        
        ){
getToolkit();
evt.consume();
JOptionPane.showMessageDialog(null,"Poner solo numeros", "Error",JOptionPane.ERROR_MESSAGE);

}   // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1IDKeyTyped

    private void jDateChooser1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDateChooser1KeyTyped
        char validar=evt.getKeyChar();

 if(Character.isDigit(validar)){
getToolkit();
evt.consume();
JOptionPane.showMessageDialog(null,"Poner solo letras", "Error",JOptionPane.ERROR_MESSAGE);
 }
if(Character.isSpaceChar(validar)){
getToolkit();
//getToolkit().beep(); poner sonido molesto
evt.consume();
JOptionPane.showMessageDialog(null,"Poner solo letras", "Error",JOptionPane.ERROR_MESSAGE);
} 

if(evt.getKeyChar()=='/'||evt.getKeyChar()=='*'
        ||evt.getKeyChar()=='-'||evt.getKeyChar()=='+'
        ||evt.getKeyChar()=='.'||evt.getKeyChar()=='?'||evt.getKeyChar()==';'
        ||evt.getKeyChar()=='"'||evt.getKeyChar()=='#'||evt.getKeyChar()=='$'
        ||evt.getKeyChar()=='%'||evt.getKeyChar()=='('||evt.getKeyChar()==')'
        ||evt.getKeyChar()=='´'||evt.getKeyChar()=='&'||evt.getKeyChar()=='='
        ||evt.getKeyChar()=='¿'||evt.getKeyChar()=='¡'||evt.getKeyChar()=='@'
        ||evt.getKeyChar()=='<'||evt.getKeyChar()=='>'||evt.getKeyChar()==','
        ||evt.getKeyChar()=='_'||evt.getKeyChar()==':'||evt.getKeyChar()==','
        ||evt.getKeyChar()=='['||evt.getKeyChar()==']'||evt.getKeyChar()=='{'
        ||evt.getKeyChar()=='}'||evt.getKeyChar()=='^'||evt.getKeyChar()=='~'
        ||evt.getKeyChar()=='\''||evt.getKeyChar()=='!'||evt.getKeyChar()=='|'
        ||evt.getKeyChar()=='°'||evt.getKeyChar()=='¬'
        
        ){
getToolkit();
evt.consume();
JOptionPane.showMessageDialog(null,"Poner solo letras", "Error",JOptionPane.ERROR_MESSAGE);

} // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooser1KeyTyped

    private void jTextField1PrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1PrecioKeyTyped
       char validar=evt.getKeyChar();

 if(Character.isLetter(validar)){
getToolkit();
evt.consume();
JOptionPane.showMessageDialog(null,"Poner solo numeros", "Error",JOptionPane.ERROR_MESSAGE);
 }
if(Character.isSpaceChar(validar)){
getToolkit();
//getToolkit().beep(); poner sonido molesto
evt.consume();
JOptionPane.showMessageDialog(null,"Poner solo numeros", "Error",JOptionPane.ERROR_MESSAGE);
} 

if(evt.getKeyChar()=='/'||evt.getKeyChar()=='*'
        ||evt.getKeyChar()=='-'||evt.getKeyChar()=='+'
        ||evt.getKeyChar()=='.'||evt.getKeyChar()=='?'||evt.getKeyChar()==';'
        ||evt.getKeyChar()=='"'||evt.getKeyChar()=='#'||evt.getKeyChar()=='$'
        ||evt.getKeyChar()=='%'||evt.getKeyChar()=='('||evt.getKeyChar()==')'
        ||evt.getKeyChar()=='´'||evt.getKeyChar()=='&'||evt.getKeyChar()=='='
        ||evt.getKeyChar()=='¿'||evt.getKeyChar()=='¡'||evt.getKeyChar()=='@'
        ||evt.getKeyChar()=='<'||evt.getKeyChar()=='>'||evt.getKeyChar()==','
        ||evt.getKeyChar()=='_'||evt.getKeyChar()==':'||evt.getKeyChar()==','
        ||evt.getKeyChar()=='['||evt.getKeyChar()==']'||evt.getKeyChar()=='{'
        ||evt.getKeyChar()=='}'||evt.getKeyChar()=='^'||evt.getKeyChar()=='~'
        ||evt.getKeyChar()=='\''||evt.getKeyChar()=='!'||evt.getKeyChar()=='|'
        ||evt.getKeyChar()=='°'||evt.getKeyChar()=='¬'
        
        ){
getToolkit();
evt.consume();
JOptionPane.showMessageDialog(null,"Poner solo numeros", "Error",JOptionPane.ERROR_MESSAGE);

}  // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1PrecioKeyTyped

    private void jTextField1PrecioCentKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1PrecioCentKeyTyped
 ////Para validar el tamaño del jlabel  
 if(jTextField1PrecioCent.getText().length() >= 2){
    evt.consume();
 }   
 /////Sirve para validar los caracteres indivudial char
        char validar=evt.getKeyChar();
        

 if(Character.isLetter(validar)){
getToolkit();
evt.consume();
JOptionPane.showMessageDialog(null,"Poner solo numeros", "Error",JOptionPane.ERROR_MESSAGE);
 }
if(Character.isSpaceChar(validar)){
getToolkit();
//getToolkit().beep(); poner sonido molesto
evt.consume();
JOptionPane.showMessageDialog(null,"Poner solo numeros", "Error",JOptionPane.ERROR_MESSAGE);
} 


if(evt.getKeyChar()=='/'||evt.getKeyChar()=='*'
        ||evt.getKeyChar()=='-'||evt.getKeyChar()=='+'
        ||evt.getKeyChar()=='.'||evt.getKeyChar()=='?'||evt.getKeyChar()==';'
        ||evt.getKeyChar()=='"'||evt.getKeyChar()=='#'||evt.getKeyChar()=='$'
        ||evt.getKeyChar()=='%'||evt.getKeyChar()=='('||evt.getKeyChar()==')'
        ||evt.getKeyChar()=='´'||evt.getKeyChar()=='&'||evt.getKeyChar()=='='
        ||evt.getKeyChar()=='¿'||evt.getKeyChar()=='¡'||evt.getKeyChar()=='@'
        ||evt.getKeyChar()=='<'||evt.getKeyChar()=='>'||evt.getKeyChar()==','
        ||evt.getKeyChar()=='_'||evt.getKeyChar()==':'||evt.getKeyChar()==','
        ||evt.getKeyChar()=='['||evt.getKeyChar()==']'||evt.getKeyChar()=='{'
        ||evt.getKeyChar()=='}'||evt.getKeyChar()=='^'||evt.getKeyChar()=='~'
        ||evt.getKeyChar()=='\''||evt.getKeyChar()=='!'||evt.getKeyChar()=='|'
        ||evt.getKeyChar()=='°'||evt.getKeyChar()=='¬'
        
        ){
getToolkit();
evt.consume();
JOptionPane.showMessageDialog(null,"Poner solo numeros", "Error",JOptionPane.ERROR_MESSAGE);
  


} // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1PrecioCentKeyTyped

    private void jTextField1ApicultorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ApicultorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ApicultorActionPerformed

    private void jTextField1ApicultorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1ApicultorKeyTyped
        
        
        
        
        
        
    }//GEN-LAST:event_jTextField1ApicultorKeyTyped

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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1Apicultor;
    private javax.swing.JTextField jTextField1ID;
    private javax.swing.JTextField jTextField1Precio;
    private javax.swing.JTextField jTextField1PrecioCent;
    // End of variables declaration//GEN-END:variables
}
