/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vel_on_time;

import java.io.IOException;

/**
 *
 * @author jose noel mantilla
 */
public class Evento extends javax.swing.JFrame {

    /**
     * Creates new form Evento
     */
    public Evento() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        elec_cotizar = new javax.swing.ButtonGroup();
        evento = new javax.swing.JLabel();
        selc_evento1 = new javax.swing.JLabel();
        nombre_cliente = new javax.swing.JLabel();
        MES = new javax.swing.JLabel();
        numero_invitados = new javax.swing.JLabel();
        id_cliente = new javax.swing.JLabel();
        rev_id = new javax.swing.JTextField();
        rev_nombre = new javax.swing.JTextField();
        rev_presupuesto = new javax.swing.JTextField();
        rev_invitados = new javax.swing.JTextField();
        enviar_cliente = new javax.swing.JButton();
        RESET = new javax.swing.JButton();
        presupuesto1 = new javax.swing.JLabel();
        ANO = new javax.swing.JLabel();
        DIA = new javax.swing.JLabel();
        rev_dia = new javax.swing.JTextField();
        rev_mes = new javax.swing.JTextField();
        rev_ano = new javax.swing.JTextField();
        VOLVER = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        evento.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        getContentPane().add(evento, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 276, 50));

        selc_evento1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        selc_evento1.setText("Tipo de evento seleccionado:");
        getContentPane().add(selc_evento1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 220, 50));

        nombre_cliente.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        nombre_cliente.setText("Nombre cliente:");
        getContentPane().add(nombre_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 119, 34));

        MES.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        MES.setText("MES:");
        getContentPane().add(MES, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, -1, 34));

        numero_invitados.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        numero_invitados.setText("Numero de invitados:");
        getContentPane().add(numero_invitados, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 129, 34));

        id_cliente.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        id_cliente.setText("Id del cliente:");
        getContentPane().add(id_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 85, 34));

        rev_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rev_idActionPerformed(evt);
            }
        });
        getContentPane().add(rev_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 103, -1));
        getContentPane().add(rev_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 160, -1));
        getContentPane().add(rev_presupuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 103, -1));
        getContentPane().add(rev_invitados, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 130, -1));

        enviar_cliente.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        enviar_cliente.setText("Aceptar");
        enviar_cliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enviar_cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enviar_clienteMouseClicked(evt);
            }
        });
        getContentPane().add(enviar_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, 100, 40));

        RESET.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        RESET.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/trash_full_recycle_delete_delete_9751.png"))); // NOI18N
        RESET.setText("Reset");
        RESET.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RESET.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RESETMouseClicked(evt);
            }
        });
        getContentPane().add(RESET, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 110, 40));

        presupuesto1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        presupuesto1.setText("Presupuesto:");
        getContentPane().add(presupuesto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 85, 34));

        ANO.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        ANO.setText("AÑO:");
        getContentPane().add(ANO, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 39, 34));

        DIA.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        DIA.setText("DIA:");
        getContentPane().add(DIA, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 36, 34));
        getContentPane().add(rev_dia, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 60, -1));
        getContentPane().add(rev_mes, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 61, -1));
        getContentPane().add(rev_ano, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 68, -1));

        VOLVER.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        VOLVER.setText("Volver");
        VOLVER.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VOLVER.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VOLVERMouseClicked(evt);
            }
        });
        getContentPane().add(VOLVER, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 70, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/marble-2398946_960_720.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rev_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rev_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rev_idActionPerformed

    private void enviar_clienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enviar_clienteMouseClicked
     
       archivos ob4= new archivos();
       int id;
       String name;
       int pres;
       int numI;
       int dia;
       int mes;
       int ano;
       
       id= Integer.parseInt(rev_id.getText());
       name= rev_nombre.getText();
       pres= Integer.parseInt(rev_presupuesto.getText());
       numI= Integer.parseInt(rev_invitados.getText());
       dia= Integer.parseInt(rev_dia.getText());
       mes= Integer.parseInt(rev_mes.getText());
       ano= Integer.parseInt(rev_ano.getText());
       
       String fecha;
       fecha = dia+"/"+mes+"/"+ano;
       
       ob4.archCli(id,name,pres,numI,fecha);
       
       
       Cotizador ob25= new Cotizador();
       ob25.llegada(id,name,pres,numI,dia,mes,ano);
   
       ob25.setVisible(true);
       this.setVisible(false);
  
    }//GEN-LAST:event_enviar_clienteMouseClicked

    private void RESETMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RESETMouseClicked
       rev_id.setText("");
       rev_nombre.setText("");
       rev_presupuesto.setText("");
       rev_invitados.setText("");
    }//GEN-LAST:event_RESETMouseClicked

    private void VOLVERMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VOLVERMouseClicked
       Selec_evento ob26 = new Selec_evento();
       ob26.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_VOLVERMouseClicked

    void quince(){
        
        evento.setText("15 años");
    }
    void aniversario(){
        evento.setText("Aniversario");
    }
    void matrimonio(){
        evento.setText("Matrimonio");
    }
    void soltero(){
        evento.setText("Despedida de soltero");
    }
    void inaguracion(){
        evento.setText("Inaguración");
    }
    void confirmacion(){
        evento.setText("Confirmación");
    }
    void comunion(){
        evento.setText("Comunion");
    }
    void bautizo(){
        evento.setText("Bautizo");
    }
    void galas(){
        evento.setText("Galas-Cocteles");
    }
    void reuniones(){
        evento.setText("Reuniones de trabajo");
    }
    void cumple(){
        evento.setText("Cumpleaños");
    }
    void cenas(){
        evento.setText("Cenas intimas");
    }
    void reuFam(){
        evento.setText("Reunion Familiar");
    }
    void graduacion(){
        evento.setText("Graducaciones");
    }
    void convenciones(){
        evento.setText("Convenciones y ferias");
    } 
    void baby(){
        evento.setText("Baby Shower");
    }
    void benei(){
        evento.setText("Benei Mitzvá");
    }
    void halloween(){
        evento.setText("Fiesta halloween");
    }
    void sabbat(){
        evento.setText("Sabbat");
    }
    void navidad(){
        evento.setText("Fiesta navideña");
    }
        
    
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
            java.util.logging.Logger.getLogger(Evento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Evento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Evento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Evento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Evento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ANO;
    private javax.swing.JLabel DIA;
    private javax.swing.JLabel MES;
    private javax.swing.JButton RESET;
    private javax.swing.JButton VOLVER;
    private javax.swing.ButtonGroup elec_cotizar;
    private javax.swing.JButton enviar_cliente;
    private javax.swing.JLabel evento;
    private javax.swing.JLabel id_cliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel nombre_cliente;
    private javax.swing.JLabel numero_invitados;
    private javax.swing.JLabel presupuesto1;
    private javax.swing.JTextField rev_ano;
    private javax.swing.JTextField rev_dia;
    private javax.swing.JTextField rev_id;
    private javax.swing.JTextField rev_invitados;
    private javax.swing.JTextField rev_mes;
    private javax.swing.JTextField rev_nombre;
    private javax.swing.JTextField rev_presupuesto;
    private javax.swing.JLabel selc_evento1;
    // End of variables declaration//GEN-END:variables
}
