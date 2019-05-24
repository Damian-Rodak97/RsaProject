package Frame;

import Frame.Szyfrowanie_RSA_Frame;
import Frame.Deszyfrowanie_RSA_Frame;
import javax.swing.JOptionPane;

public class Choice extends javax.swing.JFrame {

    public Choice() {
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

        Icon_minimize1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Szyfrowanie = new javax.swing.JButton();
        Deszyfrowanie = new javax.swing.JButton();
        Icon_exit = new javax.swing.JLabel();
        Icon_minimize = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        Icon_minimize1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Icon_minimize1.setForeground(new java.awt.Color(255, 255, 255));
        Icon_minimize1.setText("-");
        Icon_minimize1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Icon_minimize1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Icon_minimize1MouseClicked(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(557, 592));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(27, 26, 26));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Wybierz opcję");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 210, 50));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 91, 220, 10));

        Szyfrowanie.setText("Szyfrowanie RSA (Aplikacja 1)");
        Szyfrowanie.setBorder(null);
        Szyfrowanie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SzyfrowanieMouseClicked(evt);
            }
        });
        jPanel1.add(Szyfrowanie, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 153, 252, 40));

        Deszyfrowanie.setText("Deszyfrowanie RSA (Aplikacja 2)");
        Deszyfrowanie.setBorder(null);
        Deszyfrowanie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeszyfrowanieMouseClicked(evt);
            }
        });
        Deszyfrowanie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeszyfrowanieActionPerformed(evt);
            }
        });
        jPanel1.add(Deszyfrowanie, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 226, 252, 37));

        Icon_exit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Icon_exit.setForeground(new java.awt.Color(255, 255, 255));
        Icon_exit.setText("X");
        Icon_exit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Icon_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Icon_exitMouseClicked(evt);
            }
        });
        jPanel1.add(Icon_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 7, 10, 20));

        Icon_minimize.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Icon_minimize.setForeground(new java.awt.Color(255, 255, 255));
        Icon_minimize.setText("-");
        Icon_minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Icon_minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Icon_minimizeMouseClicked(evt);
            }
        });
        jPanel1.add(Icon_minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 10, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 340, 370));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frame/background_image.JPG"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(557, 592));
        jLabel1.setMinimumSize(new java.awt.Dimension(557, 592));
        jLabel1.setPreferredSize(new java.awt.Dimension(557, 592));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 557, 592));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DeszyfrowanieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeszyfrowanieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeszyfrowanieActionPerformed

    private void Icon_minimize1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Icon_minimize1MouseClicked
        this.setState(Login.ICONIFIED);
    }//GEN-LAST:event_Icon_minimize1MouseClicked

    private void SzyfrowanieMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SzyfrowanieMouseClicked
        Szyfrowanie_RSA_Frame szyfrowanieRSA = new Szyfrowanie_RSA_Frame();
        szyfrowanieRSA.setVisible(true);
        dispose();
    }//GEN-LAST:event_SzyfrowanieMouseClicked

    private void DeszyfrowanieMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeszyfrowanieMouseClicked
        Deszyfrowanie_RSA_Frame deszyfrowanieRSA = new Deszyfrowanie_RSA_Frame();
        deszyfrowanieRSA.setVisible(true);
        dispose();
    }//GEN-LAST:event_DeszyfrowanieMouseClicked

    private void Icon_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Icon_exitMouseClicked
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null, "Are you sure you want to quit?", "Exit", dialogButton);
        if (result == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_Icon_exitMouseClicked

    private void Icon_minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Icon_minimizeMouseClicked
        this.setState(Login.ICONIFIED);
    }//GEN-LAST:event_Icon_minimizeMouseClicked

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
            java.util.logging.Logger.getLogger(Choice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Choice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Choice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Choice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Choice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Deszyfrowanie;
    private javax.swing.JLabel Icon_exit;
    private javax.swing.JLabel Icon_minimize;
    private javax.swing.JLabel Icon_minimize1;
    private javax.swing.JButton Szyfrowanie;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
