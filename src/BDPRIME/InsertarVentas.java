
package BDPRIME;



import javax.swing.table.DefaultTableModel;


import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class InsertarVentas extends javax.swing.JFrame {
    DefaultTableModel modelo = new DefaultTableModel();
    
/* public static final String URL= "jdbc:mysql://localhost:3306/mielprime";
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
 jTextField1IdVenta.setText(null); 
 jTextFieldNCompra.setText(null);
jDateChooser1.setCalendar(null);
jTextField1Precio.setText(null);
jTextField1PrecioCent.setText(null);

}
    public void actualizarProducto(){
        String vendido="Vendido";
    PreparedStatement ps= null;
        try{
        
        ConectarPRIME objcon = new ConectarPRIME();
        Connection con = objcon.getConnection();
        ps=con.prepareStatement("UPDATE producto SET Pfecha=?,Pdisponibilidad=? WHERE idProducto=?");
       
        //System.out.println(sql);
      String año = Integer.toString(jDateChooser1.getCalendar().get(java.util.Calendar.YEAR));
   String mes = Integer.toString(jDateChooser1.getCalendar().get(java.util.Calendar.MONTH) + 1);
    String dia = Integer.toString(jDateChooser1.getCalendar().get(java.util.Calendar.DATE));
   int mesINT =Integer.valueOf(mes);
   if (mesINT>=10){
       String fecha= dia+"/"+mes+"/"+año;
   
   ps.setString(1, fecha);
   }else{
   String fecha= dia+"/0"+mes+"/"+año;
   ps.setString(1, fecha);
   
   }
        
       // //Convertir para que lo lea
        ps.setString(2, vendido);
        
        ps.setInt(3, Integer.valueOf(jTextFieldNCompra.getText()));
        
        ps.execute();
        
        //JOptionPane.showMessageDialog(null,"Modificado");
        
        
        
        }catch(SQLException E ){
            System.err.println(E);
        }// TODO add your handling code here:
    }
    public void ADispo(){
        try{
 DefaultTableModel modelo = new DefaultTableModel();
        jTable1.setModel(modelo);
        
       PreparedStatement ps= null;
        ResultSet rs= null;
        
        ConectarPRIME conn = new ConectarPRIME();
        Connection con = conn.getConnection();
         
        String sql ="SELECT  idProducto FROM producto WHERE Pdisponibilidad like 'D%'";
       // "SELECT  idProducto FROM producto WHERE Pdisponibilidad like 'D%';"
        
        System.out.println(sql);
        ps = con.prepareStatement(sql);
        rs= ps.executeQuery();
        
        ResultSetMetaData rsMd = rs.getMetaData();
        int CantidadColumnas = rsMd.getColumnCount();
        
        modelo.addColumn("# producto");
        
        
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
   
    public InsertarVentas() {
        
        initComponents(); 
        //PONER ICONO
                    //    this.setIconImage(new ImageIcon(getClass().getResource("/Fondos/principal.jpg")).getImage());
                     //   this.setSize(460,370);
                        this.setResizable(false);
        
        try{
        jTable1.setModel(modelo);
        
        PreparedStatement ps= null;
        ResultSet rs= null;
        ConectarPRIME conn = new ConectarPRIME();
        Connection con = conn.getConnection();
         
        String sql ="SELECT  idProducto\n" +
                    "FROM producto \n" +
                    "WHERE Pdisponibilidad like 'D%';";
        System.out.println(sql);
        ps = con.prepareStatement(sql);
        rs= ps.executeQuery();
        
        ResultSetMetaData rsMd = rs.getMetaData();
        int CantidadColumnas = rsMd.getColumnCount();
        
        modelo.addColumn("#Producto");
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1Insertar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldNCompra = new javax.swing.JTextField();
        jButton1Regresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1IdVenta = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jTextField1PrecioCent = new javax.swing.JTextField();
        jTextField1Precio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 66, 89, 108));

        jButton1Cargar.setText("Buscar por ID");
        jButton1Cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1CargarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1Cargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 28, -1, -1));

        jTextField1Buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1BuscarKeyTyped(evt);
            }
        });
        getContentPane().add(jTextField1Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 70, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Fecha");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 149, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Precio");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 196, -1, -1));

        jButton1Insertar.setText("Insertar");
        jButton1Insertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1InsertarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1Insertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 232, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("# Compra ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 109, -1, -1));

        jTextFieldNCompra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNCompraKeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldNCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 107, 100, -1));

        jButton1Regresar.setText("Ver en tabla");
        jButton1Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1RegresarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1Regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 232, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("ID Venta");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 68, -1, -1));

        jTextField1IdVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1IdVentaKeyTyped(evt);
            }
        });
        getContentPane().add(jTextField1IdVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 66, 100, -1));
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 144, 122, -1));

        jTextField1PrecioCent.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1PrecioCentKeyTyped(evt);
            }
        });
        getContentPane().add(jTextField1PrecioCent, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 194, 55, -1));

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
        getContentPane().add(jTextField1Precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 194, 59, -1));

        jLabel5.setText("$");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 197, 8, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondos/fondo netbeans.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1CargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1CargarActionPerformed
    
      
      String campo= jTextField1Buscar.getText();
      String where ="";
if(!"".equals(campo))
{
      where =" WHERE Pdisponibilidad like 'D%' and idProducto='"+campo+"'";
      
      }else{
    where =" WHERE Pdisponibilidad like 'D%'";

}
        
        try{
 DefaultTableModel modelo = new DefaultTableModel();
        jTable1.setModel(modelo);
        
       PreparedStatement ps= null;
        ResultSet rs= null;
        
        ConectarPRIME conn = new ConectarPRIME();
        Connection con = conn.getConnection();
         
        String sql ="SELECT  idProducto\n" +
                    "FROM producto \n" + where;
        System.out.println(sql);
        ps = con.prepareStatement(sql);
        rs= ps.executeQuery();
        
        ResultSetMetaData rsMd = rs.getMetaData();
        int CantidadColumnas = rsMd.getColumnCount();
        
         modelo.addColumn("#Producto");
        
       
        
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
         
        ps=con.prepareStatement("SELECT idProducto From producto WHERE idProducto=?");
        //System.out.println(sql);
        ps.setString(1,codigo);
        rs= ps.executeQuery();
        
        while(rs.next()){
        jTextFieldNCompra.setText(rs.getString("idproducto"));
        }
        
        }catch(SQLException ex){
        System.out.println(ex.toString());
        }// TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1InsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1InsertarActionPerformed
    //Connection con= null;
        try{
          ConectarPRIME conn = new ConectarPRIME();
        java.sql.Connection con = conn.getConnection();
        ps= con.prepareStatement("INSERT INTO venta(idVENTAS, fk_idProducto, VFecha,VPrecio) VALUES(?,?,?,?)");
        //Depende de los que mandemos se pone setInt, setString, etc.
        ps.setInt(1, Integer.valueOf(jTextField1IdVenta.getText())); 
        ps.setInt(2, Integer.valueOf(jTextFieldNCompra.getText()));
        
 String año = Integer.toString(jDateChooser1.getCalendar().get(java.util.Calendar.YEAR));
   String mes = Integer.toString(jDateChooser1.getCalendar().get(java.util.Calendar.MONTH) + 1);
    String dia = Integer.toString(jDateChooser1.getCalendar().get(java.util.Calendar.DATE));
   int mesINT =Integer.valueOf(mes);
   if (mesINT>=10){
       String fecha= dia+"/"+mes+"/"+año;
   
   ps.setString(3, fecha);
   }else{
   String fecha= dia+"/0"+mes+"/"+año;
   ps.setString(3, fecha);
   
   }
        int precio= Integer.valueOf(jTextField1Precio.getText()+jTextField1PrecioCent.getText());
        System.out.println(precio);
        if(jTextField1PrecioCent.getText().isEmpty()){
        jTextField1PrecioCent.setText("00");
        }
        ps.setString(4, "$"+jTextField1Precio.getText()+"."+jTextField1PrecioCent.getText());
        
        int res=ps.executeUpdate();
        actualizarProducto(); //Para mandar al producto Vendido
        ADispo();             //Para actualizar la tabla inmediatamente que vendas algo
        
       
        if(res>0){
            JOptionPane.showMessageDialog(null,"Venta guardada");
            limpiarcasillas();
            
        }else{
        JOptionPane.showMessageDialog(null,"Error al guardar");
        limpiarcasillas();
        }
        //con.close();
        }catch(Exception E ){
            System.err.println(E);
        }// TODO add your handling code here:
    }//GEN-LAST:event_jButton1InsertarActionPerformed

    private void jButton1RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1RegresarActionPerformed
      TablaVentas uno = new TablaVentas();
       uno.setLocationRelativeTo(null);
       uno.setSize(680, 330);
       uno.setVisible(true);
       uno.setTitle("Ventas");
       this.dispose();   // TODO add your handling code here:
    }//GEN-LAST:event_jButton1RegresarActionPerformed

    private void jTextField1PrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1PrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1PrecioActionPerformed

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

} // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1BuscarKeyTyped

    private void jTextField1IdVentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1IdVentaKeyTyped
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
    }//GEN-LAST:event_jTextField1IdVentaKeyTyped

    private void jTextFieldNCompraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNCompraKeyTyped
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

}// TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNCompraKeyTyped

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

}// TODO add your handling code here:
    }//GEN-LAST:event_jTextField1PrecioKeyTyped

    private void jTextField1PrecioCentKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1PrecioCentKeyTyped
        ////Para validar el tamaño del jlabel  
 if(jTextField1PrecioCent.getText().length() >= 2){
    evt.consume();
 } 
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
            java.util.logging.Logger.getLogger(InsertarVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertarVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertarVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertarVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertarVentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1Cargar;
    private javax.swing.JButton jButton1Insertar;
    private javax.swing.JButton jButton1Regresar;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1Buscar;
    private javax.swing.JTextField jTextField1IdVenta;
    private javax.swing.JTextField jTextField1Precio;
    private javax.swing.JTextField jTextField1PrecioCent;
    private javax.swing.JTextField jTextFieldNCompra;
    // End of variables declaration//GEN-END:variables
}
