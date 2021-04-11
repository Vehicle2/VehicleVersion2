/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.programacion.views;

import java.awt.BorderLayout;
import java.beans.PropertyChangeListener;
import ni.edu.uni.programacion.controllers.PnlVehicleController;
import ni.edu.uni.programacion.views.panels.PnlVehicle;

/**
 *
 * @author Sistemas-05
 */
public class DlgAppVehicle extends javax.swing.JDialog {
    private PnlVehicle pnlVehicle;
    private PnlVehicleController pnlVehicleController;
    
    /**
     * Creates new form DlgVehicle
     */
    public DlgAppVehicle(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public void addPropertySupport(PropertyChangeListener pcl){
        pnlVehicleController.addPropertyChangeListener(pcl);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlContent = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("New or Update Vehicle");
        setModal(true);

        pnlContent.setLayout(new java.awt.BorderLayout());
        pnlVehicle = new PnlVehicle();
        pnlVehicleController = new PnlVehicleController(pnlVehicle);
        pnlContent.add(pnlVehicle, BorderLayout.CENTER);
        getContentPane().add(pnlContent, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(553, 522));
        setLocationRelativeTo(null);
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
            java.util.logging.Logger.getLogger(DlgAppVehicle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DlgAppVehicle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DlgAppVehicle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DlgAppVehicle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DlgAppVehicle dialog = new DlgAppVehicle(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel pnlContent;
    // End of variables declaration//GEN-END:variables
}
