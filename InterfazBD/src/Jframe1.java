/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Beyon
 */
public class Jframe1 extends javax.swing.JFrame {

    /**
     * Creates new form Jframe1
     */
    public Jframe1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1Apicultores = new javax.swing.JButton();
        jButton2Ventas = new javax.swing.JButton();
        jButton1Salir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1Apicultores.setText("Apicultores");
        jButton1Apicultores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ApicultoresActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1Apicultores, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 47, -1, -1));

        jButton2Ventas.setText("Ventas");
        jButton2Ventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2VentasActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2Ventas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 133, 85, -1));

        jButton1Salir.setText("Salir");
        jButton1Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1SalirActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 167, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondos/fondo netbeans.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 210));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ApicultoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ApicultoresActionPerformed
       Jframe2 uno = new Jframe2();
       uno.setLocationRelativeTo(null);
       uno.setVisible(true);
       uno.setTitle("Apicultores");
       this.dispose();  // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ApicultoresActionPerformed

    private void jButton1SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1SalirActionPerformed
System.exit(0);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton1SalirActionPerformed

    private void jButton2VentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2VentasActionPerformed
        Jframe3 uno = new Jframe3();
       uno.setLocationRelativeTo(null);
       uno.setVisible(true);
       uno.setTitle("Ventas");
       this.dispose(); // TODO add your handling code here:
    }//GEN-LAST:event_jButton2VentasActionPerformed

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
            java.util.logging.Logger.getLogger(Jframe1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jframe1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jframe1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jframe1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jframe1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1Apicultores;
    private javax.swing.JButton jButton1Salir;
    private javax.swing.JButton jButton2Ventas;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
