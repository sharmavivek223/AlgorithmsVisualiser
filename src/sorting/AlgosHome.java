/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Apar
 */
public class AlgosHome extends javax.swing.JFrame {

    /**
     * Creates new form AlgosHome
     */
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    private int x_window=(int) screenSize.getWidth()*90/100;
    private int y_window=(int) screenSize.getHeight()*90/100;
    private int window=x_window*80/100;
    
    
    public AlgosHome() {
        initComponents();
        setLayout(null);          
        setSize(x_window, y_window);
        JPanel panel=new JPanel();  
        panel.setBounds(x_window*3/100,y_window*15/100,x_window*20/100,y_window*70/100);    
        panel.setBackground(Color.gray);  
        JButton b1=new JButton("Button 1");     
//        b1.setBounds(0,0,0,0);    
        b1.setBackground(Color.yellow);   
        JButton b2=new JButton("Button 2");   
//        b2.setBounds(100,100,80,30);    
        b2.setBackground(Color.green);   
        panel.add(b1); panel.add(b2);  
        add(panel);  
        panel=new JPanel();  
        panel.setBounds(x_window*27/100,y_window*15/100,x_window*20/100,y_window*70/100);       
        panel.setBackground(Color.gray);   
        add(panel);
        panel=new JPanel();  
        panel.setBounds(x_window*53/100,y_window*15/100,x_window*20/100,y_window*70/100);       
        panel.setBackground(Color.gray);   
        add(panel);
        panel=new JPanel();  
        panel.setBounds(x_window*76/100,y_window*15/100,x_window*20/100,y_window*70/100);       
        panel.setBackground(Color.gray);   
        add(panel);
        // top horizontal panel
        panel=new JPanel();  
        panel.setBounds(x_window*20/100,0,x_window*60/100,y_window*10/100);      
//        panel.
        JLabel j1=new JLabel("Visualiser");
        panel.add(j1);
//        panel.setBackground(Color.gray);   
        add(panel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 720));
        setPreferredSize(new java.awt.Dimension(1200, 720));
        getContentPane().setLayout(null);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(AlgosHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlgosHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlgosHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlgosHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlgosHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
