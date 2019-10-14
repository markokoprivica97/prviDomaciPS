
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mnmh
 */
public class Domaci extends javax.swing.JFrame {

    public Domaci() {
        components();
    }
    public javax.swing.JLabel jLabelA;
    private javax.swing.JLabel jLabelB;
    private javax.swing.JLabel jLabelResult;
    private javax.swing.JLabel jLabelEmpty;
    private javax.swing.JTextField jTextFieldA;
    private javax.swing.JTextField jTextFieldB;
    private javax.swing.JTextField jTextFieldC;
    private javax.swing.JButton jButtonSaberi;
    private javax.swing.JButton jButtonOduzmi;

    private void components() {

        jLabelA = new javax.swing.JLabel();
        jLabelA.setText("A");
        jLabelA.setBounds(30, 20, 10, 10);
        jLabelB = new javax.swing.JLabel();
        jLabelB.setText("B");
         jLabelB.setBounds(30, 60, 10, 10);
        jLabelResult = new javax.swing.JLabel();;
        jLabelResult.setText("C");
         jLabelResult.setBounds(30, 100, 10, 10);
         jLabelEmpty = new javax.swing.JLabel();
            jLabelEmpty.setText("");
        jTextFieldA = new javax.swing.JTextField();
               // jTextFieldA.setSize(10, 10);
                    jTextFieldA.setBounds(50, 16, 60, 20);
        jTextFieldB = new javax.swing.JTextField();
        jTextFieldB.setBounds(50, 56, 60, 20);
        jTextFieldC = new javax.swing.JTextField();
        jTextFieldC.setBounds(50,96,60,20);
        jButtonSaberi = new javax.swing.JButton();
        jButtonSaberi.setBounds(20,136,50,20);
        jButtonSaberi.setText("+");
        jButtonSaberi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaberiActionPerformed(evt);
            }

            private void jButtonSaberiActionPerformed(ActionEvent evt) {
                jTextFieldC.setText("");
                String a = jTextFieldA.getText();
               String b = jTextFieldB.getText();
               if(a.equals("") || b.equals(""))
                   jTextFieldC.setText("Greska");
               else
               {
               double c = Double.parseDouble(a) - Double.parseDouble(b);
               jTextFieldC.setText(""+c);
               }
            }
        });
        jButtonOduzmi = new javax.swing.JButton();
        jButtonOduzmi.setBounds(90,136,50,20);
        jButtonOduzmi.setText("-");
        
         jButtonOduzmi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOduzmiActionPerformed(evt);
            }

            private void jButtonOduzmiActionPerformed(ActionEvent evt) {
                jTextFieldC.setText("");
                String a = jTextFieldA.getText();
               String b = jTextFieldB.getText();
               if(a.equals("") || b.equals(""))
                   jTextFieldC.setText("Greska");
               else
               {
               double c = Double.parseDouble(a) - Double.parseDouble(b);
               jTextFieldC.setText(""+c);
               }
            }
        });
        
        
        JFrame frame = new JFrame("Domaci");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(180, 220));
        frame.setLocationRelativeTo(null);
        frame.getContentPane().add(jLabelA);
       
        frame.getContentPane().add(jLabelB);
         frame.getContentPane().add(jLabelResult);
         //frame.getContentPane().add(jLabelEmpty);
         frame.getContentPane().add(jTextFieldA);
         frame.getContentPane().add(jTextFieldB);
         frame.getContentPane().add(jTextFieldC);
         frame.getContentPane().add(jButtonSaberi);
            frame.getContentPane().add(jButtonOduzmi);
        frame.getContentPane().add(jLabelEmpty);
         //frame.getContentPane().add(jTextFieldB);
        // frame.getContentPane().add(jTextFieldC);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
                new Domaci();
    }
}
