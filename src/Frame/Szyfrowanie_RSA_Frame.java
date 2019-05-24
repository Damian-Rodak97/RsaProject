package Frame;

import javax.swing.JOptionPane;
import java.math.BigInteger;
import Frame.Choice;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class Szyfrowanie_RSA_Frame extends javax.swing.JFrame {

    public Szyfrowanie_RSA_Frame() {
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

        jPanel1 = new javax.swing.JPanel();
        Icon_exit = new javax.swing.JLabel();
        Icon_minimize = new javax.swing.JLabel();
        SzyfrowanieRSA_title = new javax.swing.JLabel();
        Tekst_zaszyfrowany = new javax.swing.JTextField();
        Label2 = new javax.swing.JLabel();
        Label1 = new javax.swing.JLabel();
        Wprowadz_tekst = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        Wczytaj_klucz = new javax.swing.JButton();
        Send_File = new javax.swing.JButton();
        Zaszyfruj_tekst = new javax.swing.JButton();
        Powrot_menu = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setMinimumSize(new java.awt.Dimension(1180, 690));
        setUndecorated(true);
        setSize(new java.awt.Dimension(1180, 690));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(27, 26, 26));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Icon_exit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Icon_exit.setForeground(new java.awt.Color(255, 255, 255));
        Icon_exit.setText("X");
        Icon_exit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Icon_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Icon_exitMouseClicked(evt);
            }
        });
        jPanel1.add(Icon_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, 20, 30));

        Icon_minimize.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Icon_minimize.setForeground(new java.awt.Color(255, 255, 255));
        Icon_minimize.setText("-");
        Icon_minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Icon_minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Icon_minimizeMouseClicked(evt);
            }
        });
        jPanel1.add(Icon_minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, 20, 30));

        SzyfrowanieRSA_title.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        SzyfrowanieRSA_title.setForeground(new java.awt.Color(255, 255, 255));
        SzyfrowanieRSA_title.setText("Szyfrowanie RSA");
        jPanel1.add(SzyfrowanieRSA_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        Tekst_zaszyfrowany.setBackground(new java.awt.Color(16, 16, 16));
        Tekst_zaszyfrowany.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Tekst_zaszyfrowany.setForeground(new java.awt.Color(255, 255, 255));
        Tekst_zaszyfrowany.setBorder(null);
        jPanel1.add(Tekst_zaszyfrowany, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 450, 40));

        Label2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        Label2.setForeground(new java.awt.Color(255, 255, 255));
        Label2.setText("Tekst zaszyfrowany:");
        jPanel1.add(Label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 110, -1));

        Label1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        Label1.setForeground(new java.awt.Color(255, 255, 255));
        Label1.setText("Wprowadź tekst:");
        jPanel1.add(Label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 110, -1));

        Wprowadz_tekst.setBackground(new java.awt.Color(16, 16, 16));
        Wprowadz_tekst.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Wprowadz_tekst.setForeground(new java.awt.Color(255, 255, 255));
        Wprowadz_tekst.setBorder(null);
        jPanel1.add(Wprowadz_tekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 450, 40));

        jSeparator1.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 450, -1));

        Wczytaj_klucz.setText("Wczytaj klucz");
        Wczytaj_klucz.setBorder(null);
        Wczytaj_klucz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Wczytaj_kluczMouseClicked(evt);
            }
        });
        Wczytaj_klucz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Wczytaj_kluczActionPerformed(evt);
            }
        });
        jPanel1.add(Wczytaj_klucz, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, 160, 20));

        Send_File.setText("Zapisz do pliku");
        Send_File.setBorder(null);
        Send_File.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Send_FileMouseClicked(evt);
            }
        });
        Send_File.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Send_FileActionPerformed(evt);
            }
        });
        jPanel1.add(Send_File, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, 170, 30));

        Zaszyfruj_tekst.setText("Zaszyfruj");
        Zaszyfruj_tekst.setBorder(null);
        Zaszyfruj_tekst.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Zaszyfruj_tekstMouseClicked(evt);
            }
        });
        Zaszyfruj_tekst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Zaszyfruj_tekstActionPerformed(evt);
            }
        });
        jPanel1.add(Zaszyfruj_tekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, 160, 20));

        Powrot_menu.setText("Wróć");
        Powrot_menu.setBorder(null);
        Powrot_menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Powrot_menuMouseClicked(evt);
            }
        });
        jPanel1.add(Powrot_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 170, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 720, 410));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frame/background_image.JPG"))); // NOI18N
        Background.setMaximumSize(new java.awt.Dimension(1180, 690));
        Background.setMinimumSize(new java.awt.Dimension(1180, 690));
        Background.setPreferredSize(new java.awt.Dimension(1180, 690));
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 690));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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

    private void Wczytaj_kluczMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Wczytaj_kluczMouseClicked
        //TODO add your handling code here:
    }//GEN-LAST:event_Wczytaj_kluczMouseClicked

    private void Send_FileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Send_FileMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Send_FileMouseClicked

    private void Zaszyfruj_tekstMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Zaszyfruj_tekstMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Zaszyfruj_tekstMouseClicked

    private void Wczytaj_kluczActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Wczytaj_kluczActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Wczytaj_kluczActionPerformed

    private void Powrot_menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Powrot_menuMouseClicked
        Choice powrot = new Choice();
        powrot.setVisible(true);
        dispose();
    }//GEN-LAST:event_Powrot_menuMouseClicked

    private void Zaszyfruj_tekstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Zaszyfruj_tekstActionPerformed
       String tekst = Wprowadz_tekst.getText();
            String keypublic ="";
         File file1 = new File("D:/files/KluczJawny.txt");
         Scanner in1 = null;
        try {
            in1 = new Scanner(file1);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Deszyfrowanie_RSA_Frame.class.getName()).log(Level.SEVERE, null, ex);
        }
         keypublic = in1.nextLine();
        List<String> kluczPrivate = Arrays.asList(keypublic.split(" "));
        List <Integer> intKluczPrivate = kluczPrivate.stream().map(s -> Integer.parseInt(s)).collect(Collectors.toList());
        tekst = Aplikacja1.Szyfrowanie(tekst,intKluczPrivate.get(0),intKluczPrivate.get(1));
        Tekst_zaszyfrowany.setText(tekst);
       
    }//GEN-LAST:event_Zaszyfruj_tekstActionPerformed

    private void Send_FileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Send_FileActionPerformed
        try {
            PrintWriter zapis = new PrintWriter("D:/files/Zaszyfrowany.txt");
            zapis.println(Tekst_zaszyfrowany.getText());
        zapis.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Deszyfrowanie_RSA_Frame.class.getName()).log(Level.SEVERE, null, ex);
        }
            JOptionPane.showMessageDialog(this, "Szyfrowanie zostalo zapisane do pliku !");
    }//GEN-LAST:event_Send_FileActionPerformed

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
            java.util.logging.Logger.getLogger(Szyfrowanie_RSA_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Szyfrowanie_RSA_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Szyfrowanie_RSA_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Szyfrowanie_RSA_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Szyfrowanie_RSA_Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Icon_exit;
    private javax.swing.JLabel Icon_minimize;
    private javax.swing.JLabel Label1;
    private javax.swing.JLabel Label2;
    private javax.swing.JButton Powrot_menu;
    private javax.swing.JButton Send_File;
    private javax.swing.JLabel SzyfrowanieRSA_title;
    private javax.swing.JTextField Tekst_zaszyfrowany;
    private javax.swing.JButton Wczytaj_klucz;
    private javax.swing.JTextField Wprowadz_tekst;
    private javax.swing.JButton Zaszyfruj_tekst;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}