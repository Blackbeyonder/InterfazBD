
package BDPRIME;


import BDPRIME.*;
import static BDPRIME.Busc_Mod_Apicultor.getConnection;
import static BDPRIME.InsertarCompras.getConnection;
import static BaseDeDatosMiel.InsertarBD.getConnection;
import javax.swing.table.DefaultTableModel;


import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class InsertarEmpleados extends javax.swing.JFrame {
    DefaultTableModel modelo = new DefaultTableModel();
    
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
 jTextFieldNtambor.setText(null); 
 jTextField1Nombre.setText(null);
jTextField1Nombre2.setText(null); 
 jTextField1Apellido1.setText(null);
 jTextField2Apellido2.setText(null); 
 jTextField3Municipio.setText(null);
 jTextField2Telefono.setText(null); 
 jTextField1Precio.setText(null); 
 jTextField1PrecioCent.setText(null);

}
   
    public InsertarEmpleados() {
        
        initComponents(); 
        try{
        jTable1.setModel(modelo);
        
        PreparedStatement ps= null;
        ResultSet rs= null;
        ConectarPRIME conn = new ConectarPRIME();
        Connection con = conn.getConnection();
         
        String sql ="SELECT idTAMBOR From mielprime.tambor";
        System.out.println(sql);
        ps = con.prepareStatement(sql);
        rs= ps.executeQuery();
        
        ResultSetMetaData rsMd = rs.getMetaData();
        int CantidadColumnas = rsMd.getColumnCount();
        
        modelo.addColumn("# Tambor");
          int[]anchos={10,10,10,10};
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
        jTextField1Buscar = new javax.swing.JTextField();
        jButton1Insertar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldNtambor = new javax.swing.JTextField();
        jButton1Regresar = new javax.swing.JButton();
        jTextField3Municipio = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField1Apellido1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2Apellido2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField1Nombre2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField1Nombre = new javax.swing.JTextField();
        jTextField2Telefono = new javax.swing.JTextField();
        jTextField1PrecioCent = new javax.swing.JTextField();
        jTextField1Precio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Id"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 74, 89, 190));

        jButton1Cargar.setText("Buscar por ID");
        jButton1Cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1CargarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1Cargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 33, -1, -1));
        getContentPane().add(jTextField1Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 34, 48, -1));

        jButton1Insertar.setText("Insertar");
        jButton1Insertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1InsertarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1Insertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 282, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("# Tambor");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, -1, -1));
        getContentPane().add(jTextFieldNtambor, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 75, 100, -1));

        jButton1Regresar.setText("Ver en tabla");
        jButton1Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1RegresarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1Regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 282, -1, -1));

        jTextField3Municipio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3MunicipioActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3Municipio, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 163, 100, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Apellidos:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 137, -1, -1));
        getContentPane().add(jTextField1Apellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 137, 100, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Nombres:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 109, -1, -1));
        getContentPane().add(jTextField2Apellido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(353, 137, 100, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Municipio:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 166, -1, -1));
        getContentPane().add(jTextField1Nombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(353, 106, 100, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Telefono:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 204, -1, -1));

        jTextField1Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1NombreActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 106, 100, -1));

        jTextField2Telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2TelefonoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 201, 100, -1));
        getContentPane().add(jTextField1PrecioCent, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 232, 55, -1));

        jTextField1Precio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1PrecioActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1Precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 232, 59, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("$");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 235, 8, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Salario");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 234, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 224, 97));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 450, 290));

        jPanel2.setBackground(new java.awt.Color(157, 57, 3));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1CargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1CargarActionPerformed
    
      String campo= jTextField1Buscar.getText();
      String where ="";
if(!"".equals(campo))
{
      where =" WHERE idTAMBOR='"+ campo+" '";
      
      }
        
        try{
 DefaultTableModel modelo = new DefaultTableModel();
        jTable1.setModel(modelo);
        
       PreparedStatement ps= null;
        ResultSet rs= null;
        
        ConectarPRIME conn = new ConectarPRIME();
        Connection con = conn.getConnection();
         
        String sql ="SELECT idTAMBOR From mielprime.tambor"+where;
        System.out.println(sql);
        ps = con.prepareStatement(sql);
        rs= ps.executeQuery();
        
        ResultSetMetaData rsMd = rs.getMetaData();
        int CantidadColumnas = rsMd.getColumnCount();
        
        modelo.addColumn("# Tambor");
        
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
         
        ps=con.prepareStatement("SELECT idTAMBOR From mielprime.tambor WHERE idTAMBOR=?");
        //System.out.println(sql);
        ps.setString(1,codigo);
        rs= ps.executeQuery();
        
        while(rs.next()){
        jTextFieldNtambor.setText(rs.getString("idTAMBOR"));
        }
        
        }catch(SQLException ex){
        System.out.println(ex.toString());
        }// TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1InsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1InsertarActionPerformed
    Connection con= null;
        try{
        
        con = getConnection();
        ps= con.prepareStatement("INSERT INTO mielprime.empleados(fk_TAMBOR_idTAMBOR, Nombre_Emp, Municipio_Emp,Telefono_Emp,Salario_Emp) VALUES(?,?,?,?,?)");
        //Depende de los que mandemos se pone setInt, setString, etc.
        ps.setInt(1, Integer.valueOf(jTextFieldNtambor.getText())); 
       
        
   String mayus= jTextField1Nombre.getText().substring(0,1).toUpperCase()+jTextField1Nombre.getText().substring(1);
        
        String ponermayustodo= jTextField1Nombre2.getText().substring(0,1).toUpperCase()+jTextField1Nombre2.getText().substring(1)+" "+jTextField1Apellido1.getText().substring(0,1).toUpperCase()+jTextField1Apellido1.getText().substring(1)+" "+jTextField2Apellido2.getText().substring(0,1).toUpperCase()+jTextField2Apellido2.getText().substring(1);
        ps.setString(2, mayus+" "+ponermayustodo);
        ps.setString(3,jTextField3Municipio.getText());
        ps.setString(4,jTextField2Telefono.getText());
        
        
        int precio= Integer.valueOf(jTextField1Precio.getText()+jTextField1PrecioCent.getText());
        System.out.println(precio);
        if(jTextField1PrecioCent.getText().isEmpty()){
        jTextField1PrecioCent.setText(".00");
        }
        ps.setString(5, "$"+jTextField1Precio.getText()+jTextField1PrecioCent.getText());
        
        int res=ps.executeUpdate();
        
        if(res>0){
            JOptionPane.showMessageDialog(null,"Empleado guardado");
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
      TablaEmpleados uno = new TablaEmpleados();
       uno.setLocationRelativeTo(null);
       uno.setVisible(true);
       uno.setTitle("Empleados");
       this.dispose();   // TODO add your handling code here:
    }//GEN-LAST:event_jButton1RegresarActionPerformed

    private void jTextField3MunicipioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3MunicipioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3MunicipioActionPerformed

    private void jTextField1NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1NombreActionPerformed

    private void jTextField2TelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2TelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2TelefonoActionPerformed

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
            java.util.logging.Logger.getLogger(InsertarEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertarEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertarEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertarEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertarEmpleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1Cargar;
    private javax.swing.JButton jButton1Insertar;
    private javax.swing.JButton jButton1Regresar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1Apellido1;
    private javax.swing.JTextField jTextField1Buscar;
    private javax.swing.JTextField jTextField1Nombre;
    private javax.swing.JTextField jTextField1Nombre2;
    private javax.swing.JTextField jTextField1Precio;
    private javax.swing.JTextField jTextField1PrecioCent;
    private javax.swing.JTextField jTextField2Apellido2;
    private javax.swing.JTextField jTextField2Telefono;
    private javax.swing.JTextField jTextField3Municipio;
    private javax.swing.JTextField jTextFieldNtambor;
    // End of variables declaration//GEN-END:variables
}
