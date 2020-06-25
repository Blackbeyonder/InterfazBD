
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

public class TablaCompras extends javax.swing.JFrame {
    DefaultTableModel modelo = new DefaultTableModel();
    
/*public static final String URL= "jdbc:mysql://localhost:3306/mielprime";
    public static final String USER= "root";
    public static final String PASSWORD= "123456789Ab";
    
    PreparedStatement ps;
    ResultSet rs;
    
    public static Connection getConnection(){
       Connection con = null;
       
       try{
       Class.forName("com.mysql.jdbc.Driver");
       con= DriverManager.getConnection(URL,USER, PASSWORD);
           //JOptionPane.showMessageDialog(null, "Conexion exitosa");
       
       }catch(Exception e){
           System.out.println(e);
       
       }
    return con; 
   }*/
    public void limpiarcasillas(){
 jTextFieldID.setText(null);
jTextField2Fecha.setText(null);
jTextField3Precio.setText(null);
jTextField1Apicultor.setText(null);


}
   
    public TablaCompras() {
        
        initComponents(); 
        //PONER ICONO
                      //  this.setIconImage(new ImageIcon(getClass().getResource("/Fondos/principal.jpg")).getImage());
                       // this.setSize(460,370);
                        this.setResizable(false);
        try{
        jTable1.setModel(modelo);
        
        PreparedStatement ps= null;
        ResultSet rs= null;
        ConectarPRIME conn = new ConectarPRIME();
        Connection con = conn.getConnection();
         
        String sql ="SELECT idCOMPRAS, CFecha, CPrecio, Apicultor From compras";
        System.out.println(sql);
        ps = con.prepareStatement(sql);
        rs= ps.executeQuery();
        
        ResultSetMetaData rsMd = rs.getMetaData();
        int CantidadColumnas = rsMd.getColumnCount();
        
        modelo.addColumn("ID Compras");
        modelo.addColumn("Fecha");
        modelo.addColumn("Precio");
        modelo.addColumn("Apicultor");
        
        
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
        jTextField2Fecha = new javax.swing.JTextField();
        jTextField3Precio = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1Insertar = new javax.swing.JButton();
        jButton1Modificar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jButton2Borrar = new javax.swing.JButton();
        jButton1Regresar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField1Apicultor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "fecha", "precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 68, 370, 133));

        jButton1Cargar.setText("Cargar");
        jButton1Cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1CargarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1Cargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 28, -1, -1));

        jLabel1.setText("Buscar por ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 32, -1, -1));

        jTextField1Buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1BuscarKeyTyped(evt);
            }
        });
        getContentPane().add(jTextField1Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 29, 163, -1));

        jTextField2Fecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2FechaKeyTyped(evt);
            }
        });
        getContentPane().add(jTextField2Fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(485, 108, 139, -1));

        jTextField3Precio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3PrecioActionPerformed(evt);
            }
        });
        jTextField3Precio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3PrecioKeyTyped(evt);
            }
        });
        getContentPane().add(jTextField3Precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(485, 146, 139, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Fecha");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(409, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Apicultor");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, -1, -1));

        jButton1Insertar.setText("Insertar");
        jButton1Insertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1InsertarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1Insertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, -1, -1));

        jButton1Modificar.setText("Modificar");
        jButton1Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ModificarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("ID");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(409, 70, -1, -1));

        jTextFieldID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldIDKeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldID, new org.netbeans.lib.awtextra.AbsoluteConstraints(485, 68, 100, -1));

        jButton2Borrar.setText("Borrar");
        jButton2Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2BorrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2Borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 230, -1, -1));

        jButton1Regresar.setText("Regresar");
        jButton1Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1RegresarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1Regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Precio");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(414, 148, -1, -1));
        getContentPane().add(jTextField1Apicultor, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, 130, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondos/fondo netbeans.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1CargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1CargarActionPerformed
    
      String campo= jTextField1Buscar.getText();
      String where ="";
if(!"".equals(campo))
{
      where =" WHERE idCOMPRAS='"+ campo+"'";
      
      }
        
        try{
 DefaultTableModel modelo = new DefaultTableModel();
        jTable1.setModel(modelo);
        
       PreparedStatement ps= null;
        ResultSet rs= null;
        
        ConectarPRIME conn = new ConectarPRIME();
        Connection con = conn.getConnection();
         
        String sql ="SELECT idCOMPRAS, CFecha, CPrecio, Apicultor  From compras"+where;
        System.out.println(sql);
        ps = con.prepareStatement(sql);
        rs= ps.executeQuery();
        
        ResultSetMetaData rsMd = rs.getMetaData();
        int CantidadColumnas = rsMd.getColumnCount();
        
        modelo.addColumn("ID Compras");
        modelo.addColumn("Fecha");
        modelo.addColumn("Precio");
        modelo.addColumn("Apicultor");
        
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
         
        ps=con.prepareStatement("SELECT idCOMPRAS, CFecha, CPrecio,Apicultor From compras WHERE idCOMPRAS=?");
        //System.out.println(sql);
        ps.setString(1,codigo);
        rs= ps.executeQuery();
        
        while(rs.next()){
        jTextFieldID.setText(rs.getString("idCOMPRAS"));
        jTextField2Fecha.setText(rs.getString("CFecha"));
        jTextField3Precio.setText(rs.getString("CPrecio"));
        jTextField1Apicultor.setText(rs.getString("Apicultor"));
        }
        
        }catch(SQLException ex){
        System.out.println(ex.toString());
        }// TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1InsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1InsertarActionPerformed
      InsertarCompras uno = new InsertarCompras();
       uno.setLocationRelativeTo(null);
       uno.setSize(420, 250);
       uno.setVisible(true);
       uno.setTitle("Insertar compras");
       this.dispose();   // TODO add your handling code here:
    }//GEN-LAST:event_jButton1InsertarActionPerformed

    private void jButton1ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ModificarActionPerformed
       int fila = jTable1.getSelectedRow();
      PreparedStatement ps= null;
        try{
        
        ConectarPRIME objcon = new ConectarPRIME();
        Connection con = objcon.getConnection();
        ps=con.prepareStatement("UPDATE compras SET CFecha=?,CPrecio=?, Apicultor=? WHERE idCOMPRAS=?");
        //System.out.println(sql);
      
        
       // //Convertir para que lo lea
        ps.setString(1, jTextField2Fecha.getText());
        ps.setString(2, jTextField3Precio.getText());
        ps.setString(3, jTextField1Apicultor.getText());
         ps.setInt(4, Integer.valueOf(jTextFieldID.getText()));
         
        ps.execute();
        
        JOptionPane.showMessageDialog(null,"Modificado");
        jTable1.setValueAt(jTextFieldID.getText(), fila, 0);
        jTable1.setValueAt(jTextField2Fecha.getText(), fila, 1);
        jTable1.setValueAt(jTextField3Precio.getText(), fila, 2);
        jTable1.setValueAt(jTextField1Apicultor.getText(), fila, 3);
        
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
         
        ps=con.prepareStatement("DELETE FROM compras WHERE idCOMPRAS=?");
        //System.out.println(sql);
        ps.setString(1,idApicultor);
        ps.execute();
       
        modelo.removeRow(Fila);
           JOptionPane.showMessageDialog(null, "Compra Eliminada");
            limpiarcasillas();
       
        }catch(SQLException ex ){
            JOptionPane.showMessageDialog(null, "Error al Eliminar Compra");
            System.out.println(ex.toString());
        }// TODO add your handling code here:
    }//GEN-LAST:event_jButton2BorrarActionPerformed

    private void jTextField3PrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3PrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3PrecioActionPerformed

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

    private void jTextFieldIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldIDKeyTyped
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
    }//GEN-LAST:event_jTextFieldIDKeyTyped

    private void jTextField3PrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3PrecioKeyTyped
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
    }//GEN-LAST:event_jTextField3PrecioKeyTyped

    private void jTextField2FechaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2FechaKeyTyped
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
JOptionPane.showMessageDialog(null,"Poner solo numeros", "Error",JOptionPane.ERROR_MESSAGE);

} // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2FechaKeyTyped

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
            java.util.logging.Logger.getLogger(TablaCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TablaCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TablaCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TablaCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new TablaCompras().setVisible(true);
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1Apicultor;
    private javax.swing.JTextField jTextField1Buscar;
    private javax.swing.JTextField jTextField2Fecha;
    private javax.swing.JTextField jTextField3Precio;
    private javax.swing.JTextField jTextFieldID;
    // End of variables declaration//GEN-END:variables
}
