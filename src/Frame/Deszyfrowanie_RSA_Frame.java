package Frame;

import static Frame.Aplikacja2.Deszyfrowanie;
import static Frame.Aplikacja2.sitoEratostenesa;
import static Frame.Aplikacja2.wyznacz_d;
import static Frame.Aplikacja2.wyznacz_e;
import javax.swing.JOptionPane;
import Frame.Choice;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class Deszyfrowanie_RSA_Frame extends javax.swing.JFrame {

    public Deszyfrowanie_RSA_Frame() {
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
        DeszyfrowanieRSA_title = new javax.swing.JLabel();
        Tekst_odszyfrowany = new javax.swing.JTextField();
        Label2 = new javax.swing.JLabel();
        Label1 = new javax.swing.JLabel();
        Tekst_zaszyfrowany = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        Podaj_q = new javax.swing.JTextField();
        q = new javax.swing.JLabel();
        p = new javax.swing.JLabel();
        Podaj_p = new javax.swing.JTextField();
        Save = new javax.swing.JButton();
        Odszyfruj_tekst = new javax.swing.JButton();
        Klucz_deszyfrowanie = new javax.swing.JButton();
        Wczytaj_plik1 = new javax.swing.JButton();
        Powrot_menu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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

        DeszyfrowanieRSA_title.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        DeszyfrowanieRSA_title.setForeground(new java.awt.Color(255, 255, 255));
        DeszyfrowanieRSA_title.setText("Deszyfrowanie RSA");
        jPanel1.add(DeszyfrowanieRSA_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        Tekst_odszyfrowany.setBackground(new java.awt.Color(16, 16, 16));
        Tekst_odszyfrowany.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Tekst_odszyfrowany.setForeground(new java.awt.Color(255, 255, 255));
        Tekst_odszyfrowany.setBorder(null);
        jPanel1.add(Tekst_odszyfrowany, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 450, 40));

        Label2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        Label2.setForeground(new java.awt.Color(255, 255, 255));
        Label2.setText("Tekst odszyfrowany:");
        jPanel1.add(Label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 110, -1));

        Label1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        Label1.setForeground(new java.awt.Color(255, 255, 255));
        Label1.setText("Tekst zaszyfrowany:");
        jPanel1.add(Label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 110, -1));

        Tekst_zaszyfrowany.setBackground(new java.awt.Color(16, 16, 16));
        Tekst_zaszyfrowany.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Tekst_zaszyfrowany.setForeground(new java.awt.Color(255, 255, 255));
        Tekst_zaszyfrowany.setBorder(null);
        Tekst_zaszyfrowany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tekst_zaszyfrowanyActionPerformed(evt);
            }
        });
        jPanel1.add(Tekst_zaszyfrowany, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 450, 40));

        jSeparator1.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 450, -1));
        jPanel1.add(Podaj_q, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, 60, 30));

        q.setForeground(new java.awt.Color(255, 255, 255));
        q.setText("Wartość q:");
        jPanel1.add(q, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, -1, -1));

        p.setForeground(new java.awt.Color(255, 255, 255));
        p.setText("Wartość p:");
        jPanel1.add(p, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, -1, -1));
        jPanel1.add(Podaj_p, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 60, 30));

        Save.setText("Zapisz");
        Save.setBorder(null);
        Save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SaveMouseClicked(evt);
            }
        });
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        jPanel1.add(Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, 170, 30));

        Odszyfruj_tekst.setText("Odszyfruj");
        Odszyfruj_tekst.setBorder(null);
        Odszyfruj_tekst.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Odszyfruj_tekstMouseClicked(evt);
            }
        });
        Odszyfruj_tekst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Odszyfruj_tekstActionPerformed(evt);
            }
        });
        jPanel1.add(Odszyfruj_tekst, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, 160, 20));

        Klucz_deszyfrowanie.setText("Generuj klucz");
        Klucz_deszyfrowanie.setBorder(null);
        Klucz_deszyfrowanie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Klucz_deszyfrowanieMouseClicked(evt);
            }
        });
        Klucz_deszyfrowanie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Klucz_deszyfrowanieActionPerformed(evt);
            }
        });
        jPanel1.add(Klucz_deszyfrowanie, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, 80, 30));

        Wczytaj_plik1.setText("Wczytaj plik");
        Wczytaj_plik1.setBorder(null);
        Wczytaj_plik1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Wczytaj_plik1MouseClicked(evt);
            }
        });
        Wczytaj_plik1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Wczytaj_plik1ActionPerformed(evt);
            }
        });
        jPanel1.add(Wczytaj_plik1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, 160, 20));

        Powrot_menu.setText("Wróć");
        Powrot_menu.setBorder(null);
        Powrot_menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Powrot_menuMouseClicked(evt);
            }
        });
        jPanel1.add(Powrot_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 170, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 720, 410));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frame/background_image.JPG"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(1180, 690));
        jLabel1.setMinimumSize(new java.awt.Dimension(1180, 690));
        jLabel1.setPreferredSize(new java.awt.Dimension(1180, 690));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1180, 690));

        pack();
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

    private void SaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_SaveMouseClicked

    private void Odszyfruj_tekstMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Odszyfruj_tekstMouseClicked
        //TODO add your handling code here:
    }//GEN-LAST:event_Odszyfruj_tekstMouseClicked

    private void Odszyfruj_tekstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Odszyfruj_tekstActionPerformed
        String tekst = Tekst_zaszyfrowany.getText();
           String keyprivate ="";
         File file1 = new File("D:/files/KluczPrywatny.txt");
         Scanner in1 = null;
        try {
            in1 = new Scanner(file1);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Deszyfrowanie_RSA_Frame.class.getName()).log(Level.SEVERE, null, ex);
        }
         keyprivate = in1.nextLine();
        List<String> kluczPrivate = Arrays.asList(keyprivate.split(" "));
        List <Integer> intKluczPrivate = kluczPrivate.stream().map(s -> Integer.parseInt(s)).collect(Collectors.toList());
        tekst = Aplikacja2.Deszyfrowanie(tekst,intKluczPrivate.get(0),intKluczPrivate.get(1));
        Tekst_odszyfrowany.setText(tekst);
    }//GEN-LAST:event_Odszyfruj_tekstActionPerformed

    private void Klucz_deszyfrowanieMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Klucz_deszyfrowanieMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Klucz_deszyfrowanieMouseClicked

    private void Klucz_deszyfrowanieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Klucz_deszyfrowanieActionPerformed
    int p = Integer.parseInt(Podaj_p.getText());
    int q = Integer.parseInt(Podaj_q.getText());
    int n= p*q;
    int phi = (p-1) * (q -1);
    int e = wyznacz_e(phi,n);
    int d = wyznacz_d(e,phi);
    String Key_Private = n + " " + d ;
    String Key_Public = n + " " + e ;
        try {
            PrintWriter zapis = new PrintWriter("D:/files/KluczJawny.txt");
            zapis.println(Key_Public);
        zapis.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Deszyfrowanie_RSA_Frame.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            PrintWriter zapis2 = new PrintWriter("D:/files/KluczPrywatny.txt");
            zapis2.println(Key_Private);
        zapis2.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Deszyfrowanie_RSA_Frame.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(this, "Klucze zostały wygenerowane !");
    }//GEN-LAST:event_Klucz_deszyfrowanieActionPerformed

    private void Wczytaj_plik1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Wczytaj_plik1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Wczytaj_plik1MouseClicked

    private void Wczytaj_plik1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Wczytaj_plik1ActionPerformed
           String tekst ="";
         File file1 = new File("D:/files/Zaszyfrowany.txt");
         Scanner in1 = null;
        try {
            in1 = new Scanner(file1);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Deszyfrowanie_RSA_Frame.class.getName()).log(Level.SEVERE, null, ex);
        }
         tekst = in1.nextLine();
         String zaszyfrowany = tekst;
         Tekst_zaszyfrowany.setText(zaszyfrowany);
         JOptionPane.showMessageDialog(this, "Plik wczytany !");
    }//GEN-LAST:event_Wczytaj_plik1ActionPerformed

    private void Powrot_menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Powrot_menuMouseClicked
        Choice powrot = new Choice();
        powrot.setVisible(true);
        dispose();
    }//GEN-LAST:event_Powrot_menuMouseClicked

    private void Tekst_zaszyfrowanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tekst_zaszyfrowanyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tekst_zaszyfrowanyActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
           try {
            PrintWriter zapis = new PrintWriter("D:/files/Odszyfrowany.txt");
            zapis.println(Tekst_odszyfrowany.getText());
        zapis.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Deszyfrowanie_RSA_Frame.class.getName()).log(Level.SEVERE, null, ex);
        }
            JOptionPane.showMessageDialog(this, "Deszyfrowanie zostalo zapisane do pliku !");
    }//GEN-LAST:event_SaveActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Deszyfrowanie_RSA_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Deszyfrowanie_RSA_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Deszyfrowanie_RSA_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Deszyfrowanie_RSA_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Deszyfrowanie_RSA_Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DeszyfrowanieRSA_title;
    private javax.swing.JLabel Icon_exit;
    private javax.swing.JLabel Icon_minimize;
    private javax.swing.JButton Klucz_deszyfrowanie;
    private javax.swing.JLabel Label1;
    private javax.swing.JLabel Label2;
    private javax.swing.JButton Odszyfruj_tekst;
    private javax.swing.JTextField Podaj_p;
    private javax.swing.JTextField Podaj_q;
    private javax.swing.JButton Powrot_menu;
    private javax.swing.JButton Save;
    private javax.swing.JTextField Tekst_odszyfrowany;
    private javax.swing.JTextField Tekst_zaszyfrowany;
    private javax.swing.JButton Wczytaj_plik1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel p;
    private javax.swing.JLabel q;
    // End of variables declaration//GEN-END:variables
}
