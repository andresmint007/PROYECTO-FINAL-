/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vel_on_time;

/**
 *
 * @author jose noel mantilla
 */
public class Empleado extends javax.swing.JFrame {

    /**
     * Creates new form Empleado
     */
    public Empleado() {
        initComponents();
        transparenciaBotones();
        this.setLocationRelativeTo(null);
        SELEC_DESEO.add(cotizar);
        SELEC_DESEO.add(admon);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    public void transparenciaBotones(){
    
        cotizar.setOpaque(false);
        cotizar.setContentAreaFilled(false);
        cotizar.setBorderPainted(true);
        admon.setOpaque(false);
        admon.setContentAreaFilled(false);
        admon.setBorderPainted(true);
    }
    
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SELEC_DESEO = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        cotizar = new javax.swing.JRadioButton();
        admon = new javax.swing.JRadioButton();
        VOLVER_DESEO = new javax.swing.JButton();
        ENVIAR_DESEO1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("¿Que deses hacer?");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 63, 520, 28));

        cotizar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        cotizar.setText("Cotizar un servicio");
        cotizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cotizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/shoppingcart_accept_compra_12832.png"))); // NOI18N
        cotizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cotizarActionPerformed(evt);
            }
        });
        getContentPane().add(cotizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 220, 50));

        admon.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        admon.setText("Administrar");
        admon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        admon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/databasesearch_basededato_12920.png"))); // NOI18N
        admon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admonActionPerformed(evt);
            }
        });
        getContentPane().add(admon, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 220, 50));

        VOLVER_DESEO.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        VOLVER_DESEO.setText("Volver");
        VOLVER_DESEO.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VOLVER_DESEO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VOLVER_DESEOMouseClicked(evt);
            }
        });
        getContentPane().add(VOLVER_DESEO, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 70, 30));

        ENVIAR_DESEO1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        ENVIAR_DESEO1.setText("Aceptar");
        ENVIAR_DESEO1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ENVIAR_DESEO1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ENVIAR_DESEO1MouseClicked(evt);
            }
        });
        ENVIAR_DESEO1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ENVIAR_DESEO1ActionPerformed(evt);
            }
        });
        getContentPane().add(ENVIAR_DESEO1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 80, 30));

        jLabel2.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("BIENVENIDO EMPLEADO");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 520, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/marble-2398946_960_720.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

  
 
    
    
    private void cotizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cotizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cotizarActionPerformed

    private void VOLVER_DESEOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VOLVER_DESEOMouseClicked
       Quien ob7 = new Quien();
       ob7.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_VOLVER_DESEOMouseClicked

    private void ENVIAR_DESEO1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ENVIAR_DESEO1MouseClicked
        Selec_evento ob6 = new Selec_evento();
        proveedor ob10 = new proveedor();
        if(cotizar.isSelected()){
            ob6.setVisible(true);
            this.setVisible(false);
                          
        }
        if(admon.isSelected()){
            ob10.setVisible(true);
            this.setVisible(false);
                          
        }
        
    }//GEN-LAST:event_ENVIAR_DESEO1MouseClicked

    private void ENVIAR_DESEO1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ENVIAR_DESEO1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ENVIAR_DESEO1ActionPerformed

    private void admonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_admonActionPerformed

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
            java.util.logging.Logger.getLogger(Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Empleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ENVIAR_DESEO1;
    private javax.swing.ButtonGroup SELEC_DESEO;
    private javax.swing.JButton VOLVER_DESEO;
    private javax.swing.JRadioButton admon;
    private javax.swing.JRadioButton cotizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
