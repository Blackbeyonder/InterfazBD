
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

public class TablaEmpleados extends javax.swing.JFrame {
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
       con= DriverManager.getConnection(URL,USER, PASSWORD);
           //JOptionPane.showMessageDialog(null, "Conexion exitosa");
       
       }catch(Exception e){
           System.out.println(e);
       
       }
    return con; 
   }*/
    public void limpiarcasillas(){
 jTextFieldIdTambor.setText(null);
jTextField2Nombre.setText(null);
jTextField3Municipio.setText(null);
jTextField2Salario.setText(null);
jTextField1Telefono.setText(null);

}
   
    public TablaEmpleados() {
        
        initComponents(); 
        //PONER ICONO
                     //   this.setIconImage(new ImageIcon(getClass().getResource("/Fondos/principal.jpg")).getImage());
                        //this.setSize(460,370);
                        this.setResizable(false);
        try{
        jTable1.setModel(modelo);
        
        PreparedStatement ps= null;
        ResultSet rs= null;
        ConectarPRIME conn = new ConectarPRIME();
        Connection con = conn.getConnection();
         
        String sql ="SELECT fk_idTAMBOR, Nombre_Emp, Municipio_Emp, Telefono_Emp, Salario_Emp From empleados";
        System.out.println(sql);
        ps = con.prepareStatement(sql);
        rs= ps.executeQuery();
        
        ResultSetMetaData rsMd = rs.getMetaData();
        int CantidadColumnas = rsMd.getColumnCount();
        
        modelo.addColumn("# Tambor");
        modelo.addColumn("Nombre");
        modelo.addColumn("Municipio");
        modelo.addColumn("Telefono");
        modelo.addColumn("Salario");
        
           /*int[]anchos={700,900,200+100+100+100+100+50,800};
           for (int x=0;x<CantidadColumnas;x++){
           jTable1.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);
           }
           */
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
        jTextField2Nombre = new javax.swing.JTextField();
        jTextField3Municipio = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1Insertar = new javax.swing.JButton();
        jButton1Modificar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldIdTambor = new javax.swing.JTextField();
        jButton2Borrar = new javax.swing.JButton();
        jButton1Regresar = new javax.swing.JButton();
        jTextField1Telefono = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField2Salario = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "# Tambor", "Nombre", "Municipio", "Telefono", "Salario"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 430, 146));

        jButton1Cargar.setText("Cargar");
        jButton1Cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1CargarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1Cargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, -1, -1));

        jLabel1.setText("Buscar por ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jTextField1Buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1BuscarKeyTyped(evt);
            }
        });
        getContentPane().add(jTextField1Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 163, -1));

        jTextField2Nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2NombreKeyTyped(evt);
            }
        });
        getContentPane().add(jTextField2Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, 150, -1));

        jTextField3Municipio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3MunicipioActionPerformed(evt);
            }
        });
        jTextField3Municipio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3MunicipioKeyTyped(evt);
            }
        });
        getContentPane().add(jTextField3Municipio, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, 139, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Nombre");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Municipio");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, -1, -1));

        jButton1Insertar.setText("Insertar");
        jButton1Insertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1InsertarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1Insertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, -1, -1));

        jButton1Modificar.setText("Modificar");
        jButton1Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ModificarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 280, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("#Tambor");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, -1, -1));

        jTextFieldIdTambor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldIdTamborKeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldIdTambor, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, 100, -1));

        jButton2Borrar.setText("Borrar");
        jButton2Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2BorrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2Borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 280, -1, -1));

        jButton1Regresar.setText("Regresar");
        jButton1Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1RegresarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1Regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        jTextField1Telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1TelefonoKeyTyped(evt);
            }
        });
        getContentPane().add(jTextField1Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 170, 101, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Telefono");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Salario");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, -1, -1));

        jTextField2Salario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2SalarioKeyTyped(evt);
            }
        });
        getContentPane().add(jTextField2Salario, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 200, 101, -1));

        jPanel1.setBackground(new java.awt.Color(255, 224, 97));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 690, 290));

        jPanel2.setBackground(new java.awt.Color(157, 57, 3));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1CargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1CargarActionPerformed
    
      String campo= jTextField1Buscar.getText();
      String where ="";
if(!"".equals(campo))
{
      where =" WHERE fk_idTAMBOR='"+ campo+"'";
      
      }
        
        try{
 DefaultTableModel modelo = new DefaultTableModel();
        jTable1.setModel(modelo);
        
       PreparedStatement ps= null;
        ResultSet rs= null;
        
        ConectarPRIME conn = new ConectarPRIME();
        Connection con = conn.getConnection();
         
        String sql ="SELECT fk_idTAMBOR, Nombre_Emp, Municipio_Emp,Telefono_Emp,Salario_Emp From empleados"+where;
        System.out.println(sql);
        ps = con.prepareStatement(sql);
        rs= ps.executeQuery();
        
        ResultSetMetaData rsMd = rs.getMetaData();
        int CantidadColumnas = rsMd.getColumnCount();
        
        modelo.addColumn("#Tambor");
        modelo.addColumn("Nombre");
        modelo.addColumn("Municipio");
        modelo.addColumn("Telefono");
        modelo.addColumn("Salario");
        
         
           
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
         
        ps=con.prepareStatement("SELECT fk_idTAMBOR, Nombre_Emp, Municipio_Emp,Telefono_Emp,Salario_Emp From empleados WHERE fk_idTAMBOR=?");
        //System.out.println(sql);
        ps.setString(1,codigo);
        rs= ps.executeQuery();
        
        while(rs.next()){
        jTextFieldIdTambor.setText(rs.getString("fk_idTAMBOR"));
        jTextField2Nombre.setText(rs.getString("Nombre_Emp"));
        jTextField3Municipio.setText(rs.getString("Municipio_Emp"));
        jTextField1Telefono.setText(rs.getString("Telefono_Emp"));
        jTextField2Salario.setText(rs.getString("Salario_Emp"));
        }
        
        }catch(SQLException ex){
        System.out.println(ex.toString());
        }// TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1InsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1InsertarActionPerformed
      InsertarEmpleados uno = new InsertarEmpleados();
       uno.setLocationRelativeTo(null);
       uno.setVisible(true);
       uno.setTitle("Insertar empleados");
       this.dispose();   // TODO add your handling code here:
    }//GEN-LAST:event_jButton1InsertarActionPerformed

    private void jButton1ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ModificarActionPerformed
       int fila = jTable1.getSelectedRow();
      PreparedStatement ps= null;
        try{
        
        ConectarPRIME objcon = new ConectarPRIME();
        Connection con = objcon.getConnection();
        ps=con.prepareStatement("UPDATE empleados SET Nombre_Emp=?,Municipio_Emp=?,Telefono_Emp=?,Salario_Emp=? WHERE fk_idTAMBOR=?");
        //System.out.println(sql);
      
        
       // //Convertir para que lo lea
        ps.setString(1, jTextField2Nombre.getText());
        ps.setString(2, jTextField3Municipio.getText());
        ps.setString(3, jTextField1Telefono.getText());
        ps.setString(4, jTextField2Salario.getText());
         ps.setInt(5, Integer.valueOf(jTextFieldIdTambor.getText()));
        ps.execute();
        
        JOptionPane.showMessageDialog(null,"Modificado");
        jTable1.setValueAt(jTextFieldIdTambor.getText(), fila, 0);
        jTable1.setValueAt(jTextField2Nombre.getText(), fila, 1);
        jTable1.setValueAt(jTextField3Municipio.getText(), fila, 2);
        jTable1.setValueAt(jTextField1Telefono.getText(), fila, 3);
        jTable1.setValueAt(jTextField2Salario.getText(), fila, 4);
        
        limpiarcasillas();
        }catch(SQLException E ){
            System.err.println(E);
        }// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ModificarActionPerformed

    private void jButton2BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2BorrarActionPerformed
      
       
        PreparedStatement ps= null;
        try{
        
        ConectarPRIME objcon = new ConectarPRIME();
        Connection con = objcon.getConnection();
        
        int Fila= jTable1.getSelectedRow();
        String idApicultor = jTable1.getValueAt(Fila, 0).toString();
         
        ps=con.prepareStatement("DELETE FROM empleados WHERE fk_idTAMBOR=?");
        //System.out.println(sql);
        ps.setString(1,idApicultor);
        ps.execute();
       
        modelo.removeRow(Fila);
           JOptionPane.showMessageDialog(null, "Empleado Eliminado");
            limpiarcasillas();
       
        }catch(SQLException ex ){
            JOptionPane.showMessageDialog(null, "Error al Eliminar");
            System.out.println(ex.toString());
        }// TODO add your handling code here:
    }//GEN-LAST:event_jButton2BorrarActionPerformed

    private void jTextField3MunicipioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3MunicipioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3MunicipioActionPerformed

    private void jButton1RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1RegresarActionPerformed
      menuPRIME uno = new menuPRIME();
       uno.setLocationRelativeTo(null);
       uno.setVisible(true);
       uno.setTitle("Menú");
       this.dispose();   // TODO add your handling code here:
    }//GEN-LAST:event_jButton1RegresarActionPerformed

    private void jTextField2NombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2NombreKeyTyped
       char validar=evt.getKeyChar();

 if(Character.isDigit(validar)){
getToolkit();
evt.consume();
JOptionPane.showMessageDialog(null,"Poner solo letras", "Error",JOptionPane.ERROR_MESSAGE);
 }
/*if(Character.isSpaceChar(validar)){
getToolkit();
//getToolkit().beep(); poner sonido molesto
evt.consume();
JOptionPane.showMessageDialog(null,"Poner solo letras", "Error",JOptionPane.ERROR_MESSAGE);
} */

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
    }//GEN-LAST:event_jTextField2NombreKeyTyped

    private void jTextField3MunicipioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3MunicipioKeyTyped
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
    }//GEN-LAST:event_jTextField3MunicipioKeyTyped

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

    private void jTextFieldIdTamborKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldIdTamborKeyTyped
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
    }//GEN-LAST:event_jTextFieldIdTamborKeyTyped

    private void jTextField1TelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1TelefonoKeyTyped
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
    }//GEN-LAST:event_jTextField1TelefonoKeyTyped

    private void jTextField2SalarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2SalarioKeyTyped
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
    }//GEN-LAST:event_jTextField2SalarioKeyTyped

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
            java.util.logging.Logger.getLogger(TablaEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TablaEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TablaEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TablaEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new TablaEmpleados().setVisible(true);
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1Buscar;
    private javax.swing.JTextField jTextField1Telefono;
    private javax.swing.JTextField jTextField2Nombre;
    private javax.swing.JTextField jTextField2Salario;
    private javax.swing.JTextField jTextField3Municipio;
    private javax.swing.JTextField jTextFieldIdTambor;
    // End of variables declaration//GEN-END:variables
}
