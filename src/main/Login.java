/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javax.swing.JOptionPane;

/**
 *
 * @author Rafael
 */
public class Login extends javax.swing.JFrame {
    
    //Sistema log = new Sistema();
    /**
     * Creates new form Login
     */
    public Login() {
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

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jlLogin = new javax.swing.JLabel();
        jlSenha = new javax.swing.JLabel();
        loginIn = new javax.swing.JTextField();
        senhaIn = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        btnEntrar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnSuporte = new javax.swing.JButton();
        txt_msg = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Login"));
        jPanel2.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Vivaldi", 1, 36)); // NOI18N
        jLabel3.setText("Bem Vindo");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(147, 27, 219, 43);

        jlLogin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlLogin.setText("Login");
        jPanel2.add(jlLogin);
        jlLogin.setBounds(59, 90, 360, 15);

        jlSenha.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlSenha.setText("Senha");
        jPanel2.add(jlSenha);
        jlSenha.setBounds(59, 145, 360, 15);

        loginIn.setText("SysVet@SysVet.com");
        loginIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginInActionPerformed(evt);
            }
        });
        jPanel2.add(loginIn);
        loginIn.setBounds(59, 111, 360, 23);

        senhaIn.setText("jPasswordField1");
        senhaIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaInActionPerformed(evt);
            }
        });
        jPanel2.add(senhaIn);
        senhaIn.setBounds(59, 166, 360, 27);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 255));
        jLabel11.setText("Esqueceu a Senha?");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel11);
        jLabel11.setBounds(59, 192, 107, 20);

        btnEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botaoLogin.png"))); // NOI18N
        btnEntrar.setContentAreaFilled(false);
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        jPanel2.add(btnEntrar);
        btnEntrar.setBounds(59, 223, 100, 49);

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sair.png"))); // NOI18N
        btnSair.setContentAreaFilled(false);
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        jPanel2.add(btnSair);
        btnSair.setBounds(334, 223, 85, 52);

        btnSuporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/suporte.png"))); // NOI18N
        btnSuporte.setActionCommand("suporte");
        btnSuporte.setContentAreaFilled(false);
        btnSuporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSuporteMouseClicked(evt);
            }
        });
        btnSuporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuporteActionPerformed(evt);
            }
        });
        jPanel2.add(btnSuporte);
        btnSuporte.setBounds(211, 223, 96, 52);
        jPanel2.add(txt_msg);
        txt_msg.setBounds(209, 192, 210, 20);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(100, 90, 480, 300);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo telas.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-10, -10, 970, 620);

        setSize(new java.awt.Dimension(962, 639));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginInActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        /*String login = loginIn.getText();
        String senha = senhaIn.getText();
        if (log.sistema(login, senha)) {

            Inicial a = new Inicial();
            a.setVisible(true);
            this.setVisible(false);

        } else {
            txt_msg.setText("Login ou senha incorreto");
        }*/
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void senhaInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senhaInActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSairActionPerformed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Alterar Senha");
    }//GEN-LAST:event_jLabel11MouseClicked

    private void btnSuporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuporteMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Central de atendimento SysVet\n\nTelefone: (11)4647-6035\n"
                + "E-mail: suporte@sysvet.com.br\nSite: www.-------.com.br");
    }//GEN-LAST:event_btnSuporteMouseClicked

    private void btnSuporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSuporteActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSuporte;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jlLogin;
    private javax.swing.JLabel jlSenha;
    private javax.swing.JTextField loginIn;
    private javax.swing.JPasswordField senhaIn;
    private javax.swing.JLabel txt_msg;
    // End of variables declaration//GEN-END:variables
}
