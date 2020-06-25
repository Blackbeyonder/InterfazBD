
package BDPRIME;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class InsertarApicultor extends javax.swing.JFrame {
    
      // public static final String driver= "com.mysql.jdbc.Driver";
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
jTextField1ID.setText(null);
jTextField1Nombre.setText(null);
jTextField1Nombre2.setText(null);
jTextField1Apellido1.setText(null);
jTextField2Apellido2.setText(null);
jTextField2Telefono.setText(null);
jTextField3Municipio.setText(null);
}
public class ConectarP {
  
     
    
}
    public InsertarApicultor() {
        initComponents();
       //PONER ICONO
                       // this.setIconImage(new ImageIcon(getClass().getResource("/Fondos/principal.jpg")).getImage());
                        //this.setSize(460,370);
                        this.setResizable(false);
        
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
        jButton1Agregar = new javax.swing.JButton();
        jButton5Limpiar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextField1Apellido1 = new javax.swing.JTextField();
        jTextField2Apellido2 = new javax.swing.JTextField();
        jTextField1Nombre2 = new javax.swing.JTextField();
        jButton1Vertabla = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Clave de identificacion:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel2.setText("Nombres:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabel3.setText("Municipio:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel4.setText("Telefono:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

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
        getContentPane().add(jTextField1ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 17, 101, -1));

        jTextField1Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1NombreActionPerformed(evt);
            }
        });
        jTextField1Nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1NombreKeyTyped(evt);
            }
        });
        getContentPane().add(jTextField1Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 55, 100, -1));

        jTextField2Telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2TelefonoActionPerformed(evt);
            }
        });
        jTextField2Telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2TelefonoKeyTyped(evt);
            }
        });
        getContentPane().add(jTextField2Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 175, 100, -1));

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
        getContentPane().add(jTextField3Municipio, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 137, 100, -1));

        jButton1Agregar.setText("Agregar");
        jButton1Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1AgregarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jButton5Limpiar.setText("Limpiar");
        jButton5Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5LimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5Limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 220, -1, -1));

        jLabel6.setText("Apellidos:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jTextField1Apellido1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1Apellido1KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField1Apellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 93, 100, -1));

        jTextField2Apellido2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2Apellido2KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField2Apellido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 93, 100, -1));

        jTextField1Nombre2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1Nombre2KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField1Nombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 55, 100, -1));

        jButton1Vertabla.setText("Ver en tabla");
        jButton1Vertabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1VertablaActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1Vertabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 221, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 224, 97));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 370, 280));

        jPanel2.setBackground(new java.awt.Color(157, 57, 3));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 300));

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

    private void jTextField1NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1NombreActionPerformed

    private void jButton1AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1AgregarActionPerformed
        
        try{
        
        ConectarPRIME conn = new ConectarPRIME();
        java.sql.Connection con = conn.getConnection();
        ps= con.prepareStatement("INSERT INTO apicultores(idApicultor,Nombre_Api,Municipio_Api,Telefono_Api) VALUES(?,?,?,?)");
        //Depende de los que mandemos se pone setInt, setString, etc.
        ps.setInt(1, Integer.valueOf(jTextField1ID.getText())); //Convertir para que lo lea
        
        //Para poner mayuscula en la primera letra en el jtextfield
        String mayus= jTextField1Nombre.getText().substring(0,1).toUpperCase()+jTextField1Nombre.getText().substring(1);
        
        String ponermayustodo= jTextField1Nombre2.getText().substring(0,1).toUpperCase()+jTextField1Nombre2.getText().substring(1)+" "+jTextField1Apellido1.getText().substring(0,1).toUpperCase()+jTextField1Apellido1.getText().substring(1)+" "+jTextField2Apellido2.getText().substring(0,1).toUpperCase()+jTextField2Apellido2.getText().substring(1);
        ps.setString(2, mayus+" "+ponermayustodo);
        ps.setString(3, jTextField3Municipio.getText());
        ps.setString(4, jTextField2Telefono.getText());
       
        
        int res=ps.executeUpdate();
        
        if(res>0){
            JOptionPane.showMessageDialog(null,"Apicultor guardado");
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
      TablaApicultores uno = new TablaApicultores();
       uno.setLocationRelativeTo(null);
       uno.setVisible(true);
       uno.setTitle("Apicultores");
       this.dispose();  
    }//GEN-LAST:event_jButton1VertablaActionPerformed

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

}
/*
   //Para impedir poner mayusculas 
    if(Character.isDigit(validar)){
getToolkit().beep();
evt.consume();
} 
//Para impedir poner numeros
    if(Character.isDigit(validar)){
getToolkit().beep();
evt.consume();

} 
//Para impedir poner espacios
if(Character.isSpaceChar(validar)){
getToolkit().beep();
evt.consume();} 

*/



 // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1IDKeyTyped

    private void jTextField1NombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1NombreKeyTyped
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

}
/*
   //Para impedir poner mayusculas 
    if(Character.isDigit(validar)){
getToolkit().beep();
evt.consume();
} 
//Para impedir poner numeros
    if(Character.isDigit(validar)){
getToolkit().beep();
evt.consume();

} 
//Para impedir poner espacios
if(Character.isSpaceChar(validar)){
getToolkit().beep();
evt.consume();} 

*/



 // TODO add your handling code here:
     // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1NombreKeyTyped

    private void jTextField1Nombre2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1Nombre2KeyTyped
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

}
/*
   //Para impedir poner mayusculas 
    if(Character.isDigit(validar)){
getToolkit().beep();
evt.consume();
} 
//Para impedir poner numeros
    if(Character.isDigit(validar)){
getToolkit().beep();
evt.consume();

} 
//Para impedir poner espacios
if(Character.isSpaceChar(validar)){
getToolkit().beep();
evt.consume();} 

*/



 // TODO add your handling code here:
    // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1Nombre2KeyTyped

    private void jTextField1Apellido1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1Apellido1KeyTyped
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

}
/*
   //Para impedir poner mayusculas 
    if(Character.isDigit(validar)){
getToolkit().beep();
evt.consume();
} 
//Para impedir poner numeros
    if(Character.isDigit(validar)){
getToolkit().beep();
evt.consume();

} 
//Para impedir poner espacios
if(Character.isSpaceChar(validar)){
getToolkit().beep();
evt.consume();} 

*/



 // TODO add your handling code here:
   // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1Apellido1KeyTyped

    private void jTextField2Apellido2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2Apellido2KeyTyped
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
}
/*
   //Para impedir poner mayusculas 
    if(Character.isDigit(validar)){
getToolkit().beep();
evt.consume();
} 
//Para impedir poner numeros
    if(Character.isDigit(validar)){
getToolkit().beep();
evt.consume();

} 
//Para impedir poner espacios
if(Character.isSpaceChar(validar)){
getToolkit().beep();
evt.consume();} 

*/



 // TODO add your handling code here:
    // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2Apellido2KeyTyped

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
}
/*
   //Para impedir poner mayusculas 
    if(Character.isDigit(validar)){
getToolkit().beep();
evt.consume();
} 
//Para impedir poner numeros
    if(Character.isDigit(validar)){
getToolkit().beep();
evt.consume();

} 
//Para impedir poner espacios
if(Character.isSpaceChar(validar)){
getToolkit().beep();
evt.consume();} 

*/



 // TODO add your handling code here:
    // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3MunicipioKeyTyped

    private void jTextField2TelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2TelefonoKeyTyped
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

}
/*
   //Para impedir poner mayusculas 
    if(Character.isDigit(validar)){
getToolkit().beep();
evt.consume();
} 
//Para impedir poner numeros
    if(Character.isDigit(validar)){
getToolkit().beep();
evt.consume();

} 
//Para impedir poner espacios
if(Character.isSpaceChar(validar)){
getToolkit().beep();
evt.consume();} 

*/



 // TODO add your handling code here:
   // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2TelefonoKeyTyped

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
            java.util.logging.Logger.getLogger(InsertarApicultor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertarApicultor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertarApicultor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertarApicultor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertarApicultor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1Agregar;
    private javax.swing.JButton jButton1Vertabla;
    private javax.swing.JButton jButton5Limpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1Apellido1;
    private javax.swing.JTextField jTextField1ID;
    private javax.swing.JTextField jTextField1Nombre;
    private javax.swing.JTextField jTextField1Nombre2;
    private javax.swing.JTextField jTextField2Apellido2;
    private javax.swing.JTextField jTextField2Telefono;
    private javax.swing.JTextField jTextField3Municipio;
    // End of variables declaration//GEN-END:variables
}
