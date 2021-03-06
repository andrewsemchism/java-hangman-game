/**
 * Name: Andrew Semchism
 * Date: June 10 2018
 * Description: Lose screen for hangman game
 */
package main;

public class LoseScreen extends javax.swing.JFrame {

    /**
     * Creates new form LoseScreen
     */
    public LoseScreen() {
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

        message = new javax.swing.JLabel();
        win = new javax.swing.JLabel();
        exit = new javax.swing.JButton();
        backround = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(720, 490));
        setMinimumSize(new java.awt.Dimension(710, 490));
        setPreferredSize(new java.awt.Dimension(710, 490));
        setResizable(false);
        getContentPane().setLayout(null);

        message.setBackground(new java.awt.Color(10, 240, 240));
        message.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        message.setForeground(new java.awt.Color(50, 140, 200));
        message.setText("Better luck next time!");
        getContentPane().add(message);
        message.setBounds(180, 290, 370, 70);

        win.setFont(new java.awt.Font("Tahoma", 0, 100)); // NOI18N
        win.setForeground(new java.awt.Color(255, 0, 51));
        win.setText("You Lose");
        getContentPane().add(win);
        win.setBounds(160, 0, 420, 150);

        exit.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit);
        exit.setBounds(290, 370, 170, 70);

        backround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/backround.jpg"))); // NOI18N
        backround.setMaximumSize(new java.awt.Dimension(9999, 9999));
        backround.setMinimumSize(new java.awt.Dimension(700, 520));
        getContentPane().add(backround);
        backround.setBounds(0, -10, 720, 510);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0); //exits the game
    }//GEN-LAST:event_exitActionPerformed

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
            java.util.logging.Logger.getLogger(LoseScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoseScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoseScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoseScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoseScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backround;
    private javax.swing.JButton exit;
    private javax.swing.JLabel message;
    private javax.swing.JLabel win;
    // End of variables declaration//GEN-END:variables
}
