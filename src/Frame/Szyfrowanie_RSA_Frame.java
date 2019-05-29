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
        data_ur = new javax.swing.JLabel();
        Wprowadz_date_ur = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        Zaszyfruj_tekst = new javax.swing.JButton();
        Powrot_menu = new javax.swing.JButton();
        imie = new javax.swing.JLabel();
        nazwisko = new javax.swing.JLabel();
        Wprowadz_imie = new javax.swing.JTextField();
        Wprowadz_nazwisko1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
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

        data_ur.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        data_ur.setForeground(new java.awt.Color(255, 255, 255));
        data_ur.setText("Data urodzenia:");
        jPanel1.add(data_ur, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, 110, -1));

        Wprowadz_date_ur.setBackground(new java.awt.Color(16, 16, 16));
        Wprowadz_date_ur.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Wprowadz_date_ur.setForeground(new java.awt.Color(255, 255, 255));
        Wprowadz_date_ur.setBorder(null);
        jPanel1.add(Wprowadz_date_ur, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, 140, 40));

        jSeparator1.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 510, -1));

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
        jPanel1.add(Zaszyfruj_tekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, 170, 30));

        Powrot_menu.setText("Wróć");
        Powrot_menu.setBorder(null);
        Powrot_menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Powrot_menuMouseClicked(evt);
            }
        });
        jPanel1.add(Powrot_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 170, 30));

        imie.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        imie.setForeground(new java.awt.Color(255, 255, 255));
        imie.setText("Imie:");
        jPanel1.add(imie, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 110, -1));

        nazwisko.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        nazwisko.setForeground(new java.awt.Color(255, 255, 255));
        nazwisko.setText("Nazwisko:");
        jPanel1.add(nazwisko, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 110, -1));

        Wprowadz_imie.setBackground(new java.awt.Color(16, 16, 16));
        Wprowadz_imie.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Wprowadz_imie.setForeground(new java.awt.Color(255, 255, 255));
        Wprowadz_imie.setBorder(null);
        jPanel1.add(Wprowadz_imie, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 130, 40));

        Wprowadz_nazwisko1.setBackground(new java.awt.Color(16, 16, 16));
        Wprowadz_nazwisko1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Wprowadz_nazwisko1.setForeground(new java.awt.Color(255, 255, 255));
        Wprowadz_nazwisko1.setBorder(null);
        jPanel1.add(Wprowadz_nazwisko1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 130, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Wprowadź dane do poniższych pól:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

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

    private void Powrot_menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Powrot_menuMouseClicked
        Choice powrot = new Choice();
        powrot.setVisible(true);
        dispose();
    }//GEN-LAST:event_Powrot_menuMouseClicked

    private void Zaszyfruj_tekstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Zaszyfruj_tekstActionPerformed
        String tekst1 = Wprowadz_imie.getText();
        String tekst2 = Wprowadz_nazwisko1.getText();
        String tekst3 = Wprowadz_date_ur.getText();
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
        
        tekst1 = Aplikacja1.Szyfrowanie(tekst1,intKluczPrivate.get(0),intKluczPrivate.get(1));
        tekst2 = Aplikacja1.Szyfrowanie(tekst2,intKluczPrivate.get(0),intKluczPrivate.get(1));
        tekst3 = Aplikacja1.Szyfrowanie(tekst3,intKluczPrivate.get(0),intKluczPrivate.get(1));
         try {
            PrintWriter zapis = new PrintWriter("D:/files/Zaszyfrowany.txt");
            zapis.println(tekst1+" "+tekst2+" "+tekst3);
        zapis.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Deszyfrowanie_RSA_Frame.class.getName()).log(Level.SEVERE, null, ex);
        }
         
            JOptionPane.showMessageDialog(this, "Szyfrowanie zostalo zapisane do pliku !");

    }//GEN-LAST:event_Zaszyfruj_tekstActionPerformed

    private void Zaszyfruj_tekstMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Zaszyfruj_tekstMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Zaszyfruj_tekstMouseClicked

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
    private javax.swing.JButton Powrot_menu;
    private javax.swing.JLabel SzyfrowanieRSA_title;
    private javax.swing.JTextField Wprowadz_date_ur;
    private javax.swing.JTextField Wprowadz_imie;
    private javax.swing.JTextField Wprowadz_nazwisko1;
    private javax.swing.JButton Zaszyfruj_tekst;
    private javax.swing.JLabel data_ur;
    private javax.swing.JLabel imie;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel nazwisko;
    // End of variables declaration//GEN-END:variables
}