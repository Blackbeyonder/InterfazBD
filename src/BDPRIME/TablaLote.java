
package BDPRIME;


import javax.swing.table.DefaultTableModel;


import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class TablaLote extends javax.swing.JFrame {
    DefaultTableModel modelo = new DefaultTableModel();
    
/*public static final String URL= "jdbc:mysql://localhost:3306/mielprime";
    public static final String USER= "root";
    public static final String PASSWORD= "123456789Ab";*/
    
    PreparedStatement ps;
    ResultSet rs;
    
    /*public static Connection getConnection(){
       Connection con = null;
       
       try{
       Class.forName("com.mysql.jdbc.Driver");
      // con= DriverManager.getConnection(URL,USER, PASSWORD);
           //JOptionPane.showMessageDialog(null, "Conexion exitosa");
       
       }catch(Exception e){
           System.out.println(e);
       
       }
    return con; 
   }*/
    public void limpiarcasillas(){
 jTextFieldIdLote.setText(null);
jTextFieldFingreso.setText(null);
jTextField4EstadoLote.setText(null);

}
   
    public TablaLote() {
        
        initComponents(); 
        //PONER ICONO
                       // this.setIconImage(new ImageIcon(getClass().getResource("/Fondos/principal.jpg")).getImage());
                        //this.setSize(460,370);
                        this.setResizable(false);
        try{
        jTable1.setModel(modelo);
        
        PreparedStatement ps= null;
        ResultSet rs= null;
        ConectarPRIME conn = new ConectarPRIME();
        Connection con = conn.getConnection();
         
        String sql ="SELECT idProducto,Pfecha,Pdisponibilidad From producto";
        System.out.println(sql);
        ps = con.prepareStatement(sql);
        rs= ps.executeQuery();
        
        ResultSetMetaData rsMd = rs.getMetaData();
        int CantidadColumnas = rsMd.getColumnCount();
        
        modelo.addColumn("# Lote");
        modelo.addColumn("Fecha");
        modelo.addColumn("Estado");
        
        
           int[]anchos={700,900,200+100+100+100+100+50,800};
           for (int x=0;x<CantidadColumnas;x++){
           jTable1.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);
           }
           
        while(rs.next()){
        Object[] filas = new Object [CantidadColumnas];
        for(int i=0; i< CantidadColumnas;i++){
            filas[i]=rs.getObject(i+1);
        }
        modelo.addRow(filas);
        }
        }catch(SQLException ex){
        System.err.println(ex.toString());
        } 
        
        
               
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1Cargar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1Buscar = new javax.swing.JTextField();
        jTextFieldFingreso = new javax.swing.JTextField();
        jTextField4EstadoLote = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1Modificar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldIdLote = new javax.swing.JTextField();
        jButton2Borrar = new javax.swing.JButton();
        jButton1Regresar = new javax.swing.JButton();
        jButton1Insertar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Id compra", "Fecha de ingreso", "Estado del tambor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 68, 370, 171));

        jButton1Cargar.setText("Cargar");
        jButton1Cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1CargarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1Cargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 28, -1, -1));

        jLabel1.setText("Buscar por ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jTextField1Buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1BuscarKeyTyped(evt);
            }
        });
        getContentPane().add(jTextField1Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 163, -1));

        jTextFieldFingreso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldFingresoKeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldFingreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 120, 139, -1));

        jTextField4EstadoLote.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4EstadoLoteKeyTyped(evt);
            }
        });
        getContentPane().add(jTextField4EstadoLote, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, 139, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Fecha de ingreso");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Estado del Lote");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, -1, -1));

        jButton1Modificar.setText("Modificar");
        jButton1Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ModificarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("# Lote");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(409, 70, -1, -1));

        jTextFieldIdLote.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldIdLoteKeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldIdLote, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 68, 100, -1));

        jButton2Borrar.setText("Borrar");
        jButton2Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2BorrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2Borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 260, -1, -1));

        jButton1Regresar.setText("Regresar");
        jButton1Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1RegresarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1Regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 259, -1, -1));

        jButton1Insertar.setText("Insertar");
        jButton1Insertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1InsertarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1Insertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondos/fondo netbeans.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1CargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1CargarActionPerformed
    
      String campo= jTextField1Buscar.getText();
      String where ="";
if(!"".equals(campo))
{
      where =" WHERE idProducto='"+ campo+"'";
      
      }
        
        try{
 DefaultTableModel modelo = new DefaultTableModel();
        jTable1.setModel(modelo);
        
       PreparedStatement ps= null;
        ResultSet rs= null;
        
        ConectarPRIME conn = new ConectarPRIME();
        Connection con = conn.getConnection();
         
        String sql ="SELECT idProducto, Pfecha,Pdisponibilidad From producto"+where;
        
        System.out.println(sql);
        ps = con.prepareStatement(sql);
        rs= ps.executeQuery();
        
        ResultSetMetaData rsMd = rs.getMetaData();
        int CantidadColumnas = rsMd.getColumnCount();
        
        modelo.addColumn("# Lote");
        modelo.addColumn("Fecha");
        modelo.addColumn("Estado");
        
           int[]anchos={700,900,200+100+100+100+100+50,800};
           for (int x=0;x<CantidadColumnas;x++){
           jTable1.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);
           }
           
        while(rs.next()){
        Object[] filas = new Object [CantidadColumnas];
        
        for(int i=0; i< CantidadColumnas;i++){
            filas[i]=rs.getObject(i+1);
        }
        modelo.addRow(filas);
        }
        
        
        }catch(SQLException ex){
        System.err.println(ex.toString());
        } 
   
      
    }//GEN-LAST:event_jButton1CargarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       PreparedStatement ps= null;
        ResultSet rs= null;
        try{
            
        ConectarPRIME conn = new ConectarPRIME();
        Connection con = conn.getConnection();
        
        int Fila= jTable1.getSelectedRow();
        String codigo= jTable1.getValueAt(Fila, 0).toString();
         
        ps=con.prepareStatement("SELECT idProducto, Pfecha ,Pdisponibilidad From producto WHERE idProducto=?");
        

        //System.out.println(sql);
        ps.setString(1,codigo);
        rs= ps.executeQuery();
        
        while(rs.next()){
        jTextFieldIdLote.setText(rs.getString("idProducto"));
        jTextFieldFingreso.setText(rs.getString("Pfecha"));
        jTextField4EstadoLote.setText(rs.getString("Pdisponibilidad"));
        }
        
        }catch(SQLException ex){
        System.out.println(ex.toString());
        }// TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ModificarActionPerformed
       int fila = jTable1.getSelectedRow();
      PreparedStatement ps= null;
        try{
        
        ConectarPRIME objcon = new ConectarPRIME();
        Connection con = objcon.getConnection();
        ps=con.prepareStatement("UPDATE producto SET Pfecha=?,Pdisponibilidad=? WHERE idProducto=?");
                    
//System.out.println(ps);
      
        
       // //Convertir para que lo lea
        ps.setString(1, jTextFieldFingreso.getText());
        ps.setString(2, jTextField4EstadoLote.getText());
        ps.setString(3, jTextFieldIdLote.getText());
        ps.execute();
        
        JOptionPane.showMessageDialog(null,"Modificado");
        jTable1.setValueAt(jTextFieldIdLote.getText(), fila, 0);
        jTable1.setValueAt(jTextFieldFingreso.getText(), fila, 1);
        jTable1.setValueAt(jTextField4EstadoLote.getText(), fila, 2);
        
        limpiarcasillas();
        }catch(SQLException E ){
            System.err.println(E);
        }// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ModificarActionPerformed

    private void jButton2BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2BorrarActionPerformed
      
       
        PreparedStatement ps= null;
        try{
        
       ConectarPRIME conn = new ConectarPRIME();
     java.sql.Connection con = conn.getConnection();
        
        
        int Fila= jTable1.getSelectedRow();
        String idApicultor = jTable1.getValueAt(Fila, 0).toString();
         
        ps=con.prepareStatement("DELETE FROM producto WHERE idProducto=? ");
        //System.out.println(sql);
        ps.setString(1,idApicultor);
        ps.execute();
       
        modelo.removeRow(Fila);
           JOptionPane.showMessageDialog(null, "Producto Eliminado");
            limpiarcasillas();
       
        }catch(SQLException ex ){
            JOptionPane.showMessageDialog(null, "Error al Eliminar Producto");
            System.out.println(ex.toString());
        }// TODO add your handling code here:
    }//GEN-LAST:event_jButton2BorrarActionPerformed

    private void jButton1RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1RegresarActionPerformed
       menuPRIME uno = new menuPRIME();
       uno.setLocationRelativeTo(null);
       uno.setVisible(true);
       uno.setTitle("Menú");
       this.dispose();   // TODO add your handling code here:
    }//GEN-LAST:event_jButton1RegresarActionPerformed

    private void jTextField1BuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1BuscarKeyTyped
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
    }//GEN-LAST:event_jTextField1BuscarKeyTyped

    private void jTextFieldIdLoteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldIdLoteKeyTyped
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
    }//GEN-LAST:event_jTextFieldIdLoteKeyTyped

    private void jTextFieldFingresoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldFingresoKeyTyped
       char validar=evt.getKeyChar();

 if(Character.isLetter(validar)){
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

if(evt.getKeyChar()=='*'
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

}  // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFingresoKeyTyped

    private void jTextField4EstadoLoteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4EstadoLoteKeyTyped
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

}  // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4EstadoLoteKeyTyped

    private void jButton1InsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1InsertarActionPerformed
       InsertarLote uno = new InsertarLote();
       uno.setLocationRelativeTo(null);
      uno.setSize(390, 280);
       uno.setVisible(true);
       uno.setTitle("Insertar Lote");
       this.dispose();   // TODO add your handling code here:
    }//GEN-LAST:event_jButton1InsertarActionPerformed

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
            java.util.logging.Logger.getLogger(TablaLote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TablaLote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TablaLote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TablaLote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TablaLote().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1Cargar;
    private javax.swing.JButton jButton1Insertar;
    private javax.swing.JButton jButton1Modificar;
    private javax.swing.JButton jButton1Regresar;
    private javax.swing.JButton jButton2Borrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1Buscar;
    private javax.swing.JTextField jTextField4EstadoLote;
    private javax.swing.JTextField jTextFieldFingreso;
    private javax.swing.JTextField jTextFieldIdLote;
    // End of variables declaration//GEN-END:variables
}
