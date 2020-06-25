
package BDPRIME;


import BDPRIME.*;
import static BDPRIME.Busc_Mod_Apicultor.getConnection;
import javax.swing.table.DefaultTableModel;


import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class InsertarLote extends javax.swing.JFrame {
    DefaultTableModel modelo = new DefaultTableModel();
    
 /*public static final String URL= "jdbc:mysql://localhost:3306/mielprime";
    public static final String USER= "root";
    public static final String PASSWORD= "123456789Ab";*/
    
    PreparedStatement ps;
    ResultSet rs;
    
  /*  public static Connection getConnection(){
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
 jTextField1IDLote.setText(null); 
jDateChooser1.setCalendar(null);
jComboBox1.setSelectedIndex(0);

}
   
    public InsertarLote() {
        
        initComponents(); 
        //PONER ICONO
                       // this.setIconImage(new ImageIcon(getClass().getResource("/Fondos/principal.jpg")).getImage());
                        //this.setSize(460,370);
                        this.setResizable(false);
         
        
        
               
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1Insertar = new javax.swing.JButton();
        jButton1Regresar = new javax.swing.JButton();
        jTextField1IDLote = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Fecha de ingreso");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Estado de Lote");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jButton1Insertar.setText("Insertar");
        jButton1Insertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1InsertarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1Insertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));

        jButton1Regresar.setText("Ver en tabla");
        jButton1Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1RegresarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1Regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, -1, -1));

        jTextField1IDLote.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1IDLoteKeyTyped(evt);
            }
        });
        getContentPane().add(jTextField1IDLote, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 100, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No seleccionado", "Vendido", "Disponible" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("ID lote");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 122, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondos/fondo netbeans.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1InsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1InsertarActionPerformed
   
        try{
           ConectarPRIME conn = new ConectarPRIME();
        java.sql.Connection con = conn.getConnection();
        ps= con.prepareStatement("INSERT INTO producto(idProducto, Pfecha,Pdisponibilidad) VALUES(?,?,?)");
        //Depende de los que mandemos se pone setInt, setString, etc.
        
        
        
        ps.setString(1, jTextField1IDLote.getText());
        
    ////FECHA
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
       
       ps.setString(3, jComboBox1.getSelectedItem().toString()); 
        
        int res=ps.executeUpdate();
        
        if(res>0){
            JOptionPane.showMessageDialog(null,"Lote guardado");
            limpiarcasillas();
        }else{
        JOptionPane.showMessageDialog(null,"Error al guardar");
        limpiarcasillas();
        }
        con.close();
        }catch(Exception E ){
            System.err.println(E);
        }// TODO add your handling code here:
    }//GEN-LAST:event_jButton1InsertarActionPerformed

    private void jButton1RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1RegresarActionPerformed
      TablaLote uno = new TablaLote();
       uno.setLocationRelativeTo(null);
       uno.setSize(700, 330);
       uno.setVisible(true);
       uno.setTitle("Lotes");
       this.dispose();   // TODO add your handling code here:
    }//GEN-LAST:event_jButton1RegresarActionPerformed

    private void jTextField1IDLoteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1IDLoteKeyTyped
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
    }//GEN-LAST:event_jTextField1IDLoteKeyTyped

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
            java.util.logging.Logger.getLogger(InsertarLote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertarLote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertarLote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertarLote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertarLote().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1Insertar;
    private javax.swing.JButton jButton1Regresar;
    private javax.swing.JComboBox jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1IDLote;
    // End of variables declaration//GEN-END:variables
}
