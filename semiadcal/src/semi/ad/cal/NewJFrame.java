package semi.ad.cal;

import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Acer
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
    }

    String operations;
    int w = 5;
    double number;
    double num[] = new double[w];

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        back_button = new javax.swing.JButton();
        keys = new javax.swing.JPanel();
        nine_button = new javax.swing.JButton();
        eight_button = new javax.swing.JButton();
        new_button = new javax.swing.JButton();
        zero_button = new javax.swing.JButton();
        clear_button = new javax.swing.JButton();
        five_button = new javax.swing.JButton();
        negate_button = new javax.swing.JButton();
        seven_button = new javax.swing.JButton();
        two_button = new javax.swing.JButton();
        four_button = new javax.swing.JButton();
        decimal_button = new javax.swing.JButton();
        one_button = new javax.swing.JButton();
        six_button = new javax.swing.JButton();
        three_button = new javax.swing.JButton();
        enter_button = new javax.swing.JButton();
        partialdisplay = new javax.swing.JTextField();
        fulldisplay = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Factorial");
        setResizable(false);
        setSize(new java.awt.Dimension(355, 581));

        back_button.setText("back");
        back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_buttonActionPerformed(evt);
            }
        });

        nine_button.setText("9");
        nine_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nine_buttonActionPerformed(evt);
            }
        });

        eight_button.setLabel("8");
        eight_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eight_buttonActionPerformed(evt);
            }
        });

        new_button.setText("New");
        new_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_buttonActionPerformed(evt);
            }
        });

        zero_button.setText("0");
        zero_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zero_buttonActionPerformed(evt);
            }
        });

        clear_button.setText("C");
        clear_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_buttonActionPerformed(evt);
            }
        });

        five_button.setText("5");
        five_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                five_buttonActionPerformed(evt);
            }
        });

        negate_button.setText("-");
        negate_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                negate_buttonActionPerformed(evt);
            }
        });

        seven_button.setText("7");
        seven_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seven_buttonActionPerformed(evt);
            }
        });

        two_button.setText("2");
        two_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                two_buttonActionPerformed(evt);
            }
        });

        four_button.setText("4");
        four_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                four_buttonActionPerformed(evt);
            }
        });

        decimal_button.setText(".");
        decimal_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decimal_buttonActionPerformed(evt);
            }
        });

        one_button.setText("1");
        one_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                one_buttonActionPerformed(evt);
            }
        });

        six_button.setText("6");
        six_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                six_buttonActionPerformed(evt);
            }
        });

        three_button.setText("3");
        three_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                three_buttonActionPerformed(evt);
            }
        });

        enter_button.setText("ENTER");
        enter_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enter_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout keysLayout = new javax.swing.GroupLayout(keys);
        keys.setLayout(keysLayout);
        keysLayout.setHorizontalGroup(
            keysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(keysLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(keysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(four_button, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(seven_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(one_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(negate_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(keysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(two_button, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(five_button, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(eight_button, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(zero_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(keysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(keysLayout.createSequentialGroup()
                        .addComponent(six_button, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(new_button, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(keysLayout.createSequentialGroup()
                        .addComponent(nine_button, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(clear_button, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(keysLayout.createSequentialGroup()
                        .addGroup(keysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(decimal_button, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(three_button, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(enter_button, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
        );
        keysLayout.setVerticalGroup(
            keysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(keysLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(keysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seven_button, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eight_button, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nine_button, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clear_button, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(keysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(four_button, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(five_button, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(six_button, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(new_button, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(keysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(keysLayout.createSequentialGroup()
                        .addGroup(keysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(one_button, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(two_button, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(three_button, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(keysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(zero_button, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(decimal_button, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(negate_button, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(enter_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(8, 12, Short.MAX_VALUE))
        );

        partialdisplay.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        partialdisplay.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        partialdisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                partialdisplayActionPerformed(evt);
            }
        });

        fulldisplay.setEditable(false);
        fulldisplay.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        fulldisplay.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        fulldisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fulldisplayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(keys, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(partialdisplay, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(fulldisplay, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE))
                    .addComponent(back_button, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(back_button)
                .addGap(37, 37, 37)
                .addComponent(fulldisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(partialdisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(keys, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        getAccessibleContext().setAccessibleName("test");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttonActionPerformed
        setVisible(false);
        semiadcal balik = new semiadcal();
        balik.setVisible(true);
        balik.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_back_buttonActionPerformed

    private void fulldisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fulldisplayActionPerformed
        fulldisplay.setText("");
    }//GEN-LAST:event_fulldisplayActionPerformed

    private void partialdisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_partialdisplayActionPerformed
        partialdisplay.setText("");
    }//GEN-LAST:event_partialdisplayActionPerformed

    private void three_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_three_buttonActionPerformed

        partialdisplay.setText(partialdisplay.getText() + "3");
    }//GEN-LAST:event_three_buttonActionPerformed

    private void six_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_six_buttonActionPerformed

        partialdisplay.setText(partialdisplay.getText() + "6");

    }//GEN-LAST:event_six_buttonActionPerformed

    private void one_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_one_buttonActionPerformed

        partialdisplay.setText(partialdisplay.getText() + "1");

    }//GEN-LAST:event_one_buttonActionPerformed

    private void decimal_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decimal_buttonActionPerformed

        partialdisplay.setText(partialdisplay.getText() + ".");

    }//GEN-LAST:event_decimal_buttonActionPerformed

    private void four_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_four_buttonActionPerformed

        partialdisplay.setText(partialdisplay.getText() + "4");

    }//GEN-LAST:event_four_buttonActionPerformed

    private void two_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_two_buttonActionPerformed

        partialdisplay.setText(partialdisplay.getText() + "2");

    }//GEN-LAST:event_two_buttonActionPerformed

    private void seven_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seven_buttonActionPerformed

        partialdisplay.setText(partialdisplay.getText() + "7");

    }//GEN-LAST:event_seven_buttonActionPerformed

    private void negate_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_negate_buttonActionPerformed
        partialdisplay.setText(partialdisplay.getText() + "-");
        fulldisplay.setText(fulldisplay.getText() + "-");
    }//GEN-LAST:event_negate_buttonActionPerformed

    private void five_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_five_buttonActionPerformed

        partialdisplay.setText(partialdisplay.getText() + "5");

    }//GEN-LAST:event_five_buttonActionPerformed

    private void clear_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_buttonActionPerformed
        partialdisplay.setText("");
    }//GEN-LAST:event_clear_buttonActionPerformed

    private void zero_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zero_buttonActionPerformed

        partialdisplay.setText(partialdisplay.getText() + "0");

    }//GEN-LAST:event_zero_buttonActionPerformed

    private void new_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_buttonActionPerformed
        partialdisplay.setText(" ");
        fulldisplay.setText(" ");
        operations = "new";
    }//GEN-LAST:event_new_buttonActionPerformed

    private void eight_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eight_buttonActionPerformed

        partialdisplay.setText(partialdisplay.getText() + "8");

    }//GEN-LAST:event_eight_buttonActionPerformed

    private void nine_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nine_buttonActionPerformed

        partialdisplay.setText(partialdisplay.getText() + "9");

    }//GEN-LAST:event_nine_buttonActionPerformed

    private void enter_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enter_buttonActionPerformed

        fulldisplay.setText(partialdisplay.getText() + "!");
        double num = Double.parseDouble(partialdisplay.getText());
        int a = 1;
        for (int i = 1; i <= num; i++) {

            a = (int) (a * i);

        }
        int result = a;
        partialdisplay.setText(result + "");

    }//GEN-LAST:event_enter_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_button;
    private javax.swing.JButton clear_button;
    private javax.swing.JButton decimal_button;
    private javax.swing.JButton eight_button;
    private javax.swing.JButton enter_button;
    private javax.swing.JButton five_button;
    private javax.swing.JButton four_button;
    private javax.swing.JTextField fulldisplay;
    private javax.swing.JPanel keys;
    private javax.swing.JButton negate_button;
    private javax.swing.JButton new_button;
    private javax.swing.JButton nine_button;
    private javax.swing.JButton one_button;
    private javax.swing.JTextField partialdisplay;
    private javax.swing.JButton seven_button;
    private javax.swing.JButton six_button;
    private javax.swing.JButton three_button;
    private javax.swing.JButton two_button;
    private javax.swing.JButton zero_button;
    // End of variables declaration//GEN-END:variables
}
