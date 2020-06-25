package BDPRIME;



import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class menuPRIME extends javax.swing.JFrame {
    
private int pX;
private int pY;

    /*public static final String URL= "jdbc:mysql://localhost:3306/miel";
    public static final String USER= "root";
    public static final String PASSWORD= "123456789Ab";*/
    public menuPRIME() {
        
        initComponents();
        this.setResizable(false);
         /*menuPRIME cr = new menuPRIME();
ComponentResizer cr = new ComponentResizer();
cr.registerComponent(cr);
cr.setSnapSize(new Dimension(10, 10));
cr.setMaximumSize(new Dimension(500,500));
cr.setMinimumSize(new Dimension(500,500));*/
        
        
        
     // setUndecorated(true);
         /*menuPRIME cr = new menuPRIME();
ComponentResizer cr = new ComponentResizer();
cr.registerComponent(cr);
cr.setSnapSize(new Dimension(10, 10));
cr.setMaximumSize(new Dimension(500,500));
cr.setMinimumSize(new Dimension(500,500));*/
        
        /*****PARA QUE SE MUEV ALA CHINGADERA ESA*******/
/*
			addMouseListener(new MouseAdapter() {
                public void mousePressed(MouseEvent me) {
                    // Get x,y and store them
                    pX = me.getX();
                    pY = me.getY();

                }

                 public void mouseDragged(MouseEvent me) {

                    setLocation(getLocation().x + me.getX() - pX,getLocation().y + me.getY() - pY);
                }
            });

            addMouseMotionListener(new MouseMotionAdapter() {
                public void mouseDragged(MouseEvent me) {

                    setLocation(getLocation().x + me.getX() - pX,    getLocation().y + me.getY() - pY);
                }
            });
*/
        ImageIcon imagen= new ImageIcon(getClass().getResource("/Fondos/abeja.gif"));/////////Cuando es gif poner SCALE_DEFAULT para que se mueva
        Icon iconimagen = new ImageIcon(imagen.getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(),Image.SCALE_DEFAULT));
		jLabel1.setIcon(iconimagen);
                
             
                //PONER ICONO
                       // this.setIconImage(new ImageIcon(getClass().getResource("/Fondos/principal.jpg")).getImage());
                       // this.setSize(658,370);
                        //this.setResizable(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jButton1Compras = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1Salir = new javax.swing.JButton();
        jButton2Ventas = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(157, 57, 3));
        jPanel2.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 224, 97));
        jPanel1.setLayout(null);

        jButton1Compras.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1Compras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondos/botonC.png"))); // NOI18N
        jButton1Compras.setBorderPainted(false);
        jButton1Compras.setContentAreaFilled(false);
        jButton1Compras.setMargin(new java.awt.Insets(1, 1, 1, 1));
        jButton1Compras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1ComprasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1ComprasMouseExited(evt);
            }
        });
        jButton1Compras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ComprasActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1Compras);
        jButton1Compras.setBounds(20, 100, 180, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondos/Principal.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(240, 60, 140, 140);

        jButton1Salir.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton1Salir.setText("Salir");
        jButton1Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1SalirActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1Salir);
        jButton1Salir.setBounds(260, 220, 100, 23);

        jButton2Ventas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2Ventas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondos/botonV.png"))); // NOI18N
        jButton2Ventas.setBorderPainted(false);
        jButton2Ventas.setContentAreaFilled(false);
        jButton2Ventas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2VentasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2VentasMouseExited(evt);
            }
        });
        jButton2Ventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2VentasActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2Ventas);
        jButton2Ventas.setBounds(400, 90, 190, 47);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondos/botonL.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(230, 10, 160, 40);

        jPanel2.add(jPanel1);
        jPanel1.setBounds(20, 30, 610, 280);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2VentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2VentasActionPerformed
        TablaVentas uno = new TablaVentas();
        uno.setLocationRelativeTo(null);
        uno.setVisible(true);
        uno.setSize(680, 330);
        uno.setTitle("Ventas");
        this.setResizable(false);
        this.dispose(); // TODO add your handling code here:
    }//GEN-LAST:event_jButton2VentasActionPerformed

    private void jButton2VentasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2VentasMouseExited
        ImageIcon imagen= new ImageIcon(getClass().getResource("/Fondos/abeja.gif"));/////////Cuando es gif poner SCALE_DEFAULT para que se mueva
        Icon iconimagen = new ImageIcon(imagen.getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(),Image.SCALE_DEFAULT));
        jLabel1.setIcon(iconimagen);  // TODO add your handling code here:
    }//GEN-LAST:event_jButton2VentasMouseExited

    private void jButton2VentasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2VentasMouseEntered
        ImageIcon imagen= new ImageIcon(getClass().getResource("/Fondos/venta.gif"));/////////Cuando es gif poner SCALE_DEFAULT para que se mueva
        Icon iconimagen = new ImageIcon(imagen.getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(),Image.SCALE_DEFAULT));
        jLabel1.setIcon(iconimagen); // TODO add your handling code here:
    }//GEN-LAST:event_jButton2VentasMouseEntered

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

    private void jButton1ComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ComprasActionPerformed
        TablaCompras uno = new TablaCompras();
        uno.setLocationRelativeTo(null);
        uno.setSize(700, 300);
        uno.setVisible(true);
        uno.setTitle("Compras");
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ComprasActionPerformed

    private void jButton1ComprasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1ComprasMouseExited
        ImageIcon imagen= new ImageIcon(getClass().getResource("/Fondos/abeja.gif"));/////////Cuando es gif poner SCALE_DEFAULT para que se mueva
        Icon iconimagen = new ImageIcon(imagen.getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(),Image.SCALE_DEFAULT));
        jLabel1.setIcon(iconimagen); // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ComprasMouseExited

    private void jButton1ComprasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1ComprasMouseEntered
        ImageIcon imagen= new ImageIcon(getClass().getResource("/Fondos/abejaC.gif"));/////////Cuando es gif poner SCALE_DEFAULT para que se mueva
        Icon iconimagen = new ImageIcon(imagen.getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(),Image.SCALE_DEFAULT));
        jLabel1.setIcon(iconimagen);  // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ComprasMouseEntered

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        TablaLote tablaTambor = new TablaLote();
        tablaTambor.setLocationRelativeTo(null);
        tablaTambor.setSize(700, 330);
        tablaTambor.setVisible(true);
        tablaTambor.setTitle("Lotes");
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
       ImageIcon imagen= new ImageIcon(getClass().getResource("/Fondos/tambor.gif"));/////////Cuando es gif poner SCALE_DEFAULT para que se mueva
        Icon iconimagen = new ImageIcon(imagen.getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(),Image.SCALE_DEFAULT));
        jLabel1.setIcon(iconimagen);  // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
         ImageIcon imagen= new ImageIcon(getClass().getResource("/Fondos/abeja.gif"));/////////Cuando es gif poner SCALE_DEFAULT para que se mueva
        Icon iconimagen = new ImageIcon(imagen.getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(),Image.SCALE_DEFAULT));
        jLabel1.setIcon(iconimagen);  // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseExited

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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton1Compras;
    private javax.swing.JButton jButton1Salir;
    private javax.swing.JButton jButton2Ventas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
