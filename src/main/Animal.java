/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Rafael
 */
public class Animal extends javax.swing.JFrame {

    /**
     * Creates new form ClienteInserir
     */
    public Animal() {
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

        panel1 = new java.awt.Panel();
        label1 = new java.awt.Label();
        jButton1 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        panel1.setBackground(new java.awt.Color(204, 204, 204));

        label1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label1.setText("Bem vindo Fulano!");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(833, Short.MAX_VALUE)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(panel1);
        panel1.setBounds(0, 0, 960, 20);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/icone_inicio1.png"))); // NOI18N
        getContentPane().add(jButton1);
        jButton1.setBounds(700, 30, 70, 80);

        jButton6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rafael\\Desktop\\TelasJAVA\\Icones_atualizados\\icone_proprietario1.png")); // NOI18N
        getContentPane().add(jButton6);
        jButton6.setBounds(770, 30, 70, 80);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/icone_animal1.png"))); // NOI18N
        getContentPane().add(jButton5);
        jButton5.setBounds(840, 30, 70, 80);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/icone_estoque1.png"))); // NOI18N
        getContentPane().add(jButton4);
        jButton4.setBounds(840, 110, 70, 80);

        jButton7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rafael\\Desktop\\TelasJAVA\\Icones_atualizados\\icone_serviço1.png")); // NOI18N
        getContentPane().add(jButton7);
        jButton7.setBounds(770, 110, 70, 80);

        jButton9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rafael\\Desktop\\TelasJAVA\\Icones_atualizados\\icones_agenda1.png")); // NOI18N
        getContentPane().add(jButton9);
        jButton9.setBounds(700, 110, 70, 80);

        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rafael\\Desktop\\TelasJAVA\\Icones_atualizados\\icones_vendas1.png")); // NOI18N
        getContentPane().add(jButton3);
        jButton3.setBounds(700, 190, 70, 80);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/icone_financeiro1.png"))); // NOI18N
        getContentPane().add(jButton2);
        jButton2.setBounds(770, 190, 70, 80);

        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/icones_produtos1.png"))); // NOI18N
        getContentPane().add(jButton17);
        jButton17.setBounds(840, 190, 70, 80);

        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/icone_sair1.png"))); // NOI18N
        getContentPane().add(jButton13);
        jButton13.setBounds(840, 270, 70, 80);

        jButton19.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rafael\\Desktop\\TelasJAVA\\Icones_atualizados\\icones_configurações1.png")); // NOI18N
        getContentPane().add(jButton19);
        jButton19.setBounds(770, 270, 70, 80);

        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/icone_ajuda1.png"))); // NOI18N
        getContentPane().add(jButton18);
        jButton18.setBounds(700, 270, 70, 80);

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));
        jPanel6.setBorder(new javax.swing.border.MatteBorder(null));

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/icone_pesquisar.png"))); // NOI18N
        jButton10.setText("Consultar");
        jButton10.setToolTipText("");
        jButton10.setPreferredSize(new java.awt.Dimension(100, 35));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/add.png"))); // NOI18N
        jButton12.setText("Inserir");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Animal");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
                    .addComponent(jLabel5))
                .addGap(33, 33, 33))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(437, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Animal", jPanel6);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(10, 20, 640, 530);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/suporte_sair.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 560, 162, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/fundo telas.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 960, 600);

        setSize(new java.awt.Dimension(975, 637));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

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
            java.util.logging.Logger.getLogger(Animal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Animal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Animal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Animal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Animal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField8;
    private java.awt.Label label1;
    private java.awt.Panel panel1;
    // End of variables declaration//GEN-END:variables
}
