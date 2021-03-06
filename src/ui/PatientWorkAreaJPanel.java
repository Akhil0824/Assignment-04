/*
 * ProductManagerWorkAreaJPanel.java
 *
 * Created on October 3, 2008, 8:06 AM
 */
package ui;


import model.Persondeschistory;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;
//import ui.LoginScreen;

/**
 *
 * @author Rushabh
 */
public class PatientWorkAreaJPanel extends javax.swing.JPanel {

    JPanel mainWorkArea;
   Persondeschistory persondeschistory;
//    MasterOrderCatalog masterOrderCatalog;

    /**
     * Creates new form ProductManagerWorkAreaJPanel
     */
    public PatientWorkAreaJPanel(JPanel mainWorkArea, Persondeschistory persondeschistory) {

        initComponents();
        this.mainWorkArea = mainWorkArea;
        
        this.persondeschistory = persondeschistory;
        if (persondeschistory != null) lblWelcome.setText("Welcome to Lab 4, "+persondeschistory.getHistory());
        
//      masterOrderCatalog = moc;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();
        menuBar = new javax.swing.JPanel();
        btnLogOut = new javax.swing.JButton();
        lblWelcome = new javax.swing.JLabel();
        btnManageVitalCatalog = new javax.swing.JButton();
        btnSupplierProfile = new javax.swing.JButton();
        btnManageStaff = new javax.swing.JButton();
        Performance = new javax.swing.JButton();
        workArea = new javax.swing.JPanel();

        splitPane.setDividerLocation(50);
        splitPane.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        menuBar.setBackground(new java.awt.Color(255, 255, 255));

        btnLogOut.setText("Log Out");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        lblWelcome.setText("<WelcomeMsg>");

        btnManageVitalCatalog.setText("Manage Vitals");
        btnManageVitalCatalog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageVitalCatalogActionPerformed(evt);
            }
        });

        btnSupplierProfile.setText("Update Profile");
        btnSupplierProfile.setEnabled(false);
        btnSupplierProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupplierProfileActionPerformed(evt);
            }
        });

        btnManageStaff.setText("Manage Staff");
        btnManageStaff.setEnabled(false);

        Performance.setText("Performance");
        Performance.setEnabled(false);
        Performance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PerformanceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuBarLayout = new javax.swing.GroupLayout(menuBar);
        menuBar.setLayout(menuBarLayout);
        menuBarLayout.setHorizontalGroup(
            menuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuBarLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblWelcome, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnManageVitalCatalog)
                .addGap(18, 18, 18)
                .addComponent(btnSupplierProfile)
                .addGap(18, 18, 18)
                .addComponent(btnManageStaff)
                .addGap(18, 18, 18)
                .addComponent(Performance)
                .addGap(18, 18, 18)
                .addComponent(btnLogOut)
                .addGap(46, 46, 46))
        );
        menuBarLayout.setVerticalGroup(
            menuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuBarLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(menuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogOut)
                    .addComponent(lblWelcome)
                    .addComponent(btnManageVitalCatalog)
                    .addComponent(btnSupplierProfile)
                    .addComponent(Performance)
                    .addComponent(btnManageStaff))
                .addContainerGap())
        );

        splitPane.setTopComponent(menuBar);

        workArea.setBackground(new java.awt.Color(255, 255, 255));
        workArea.setLayout(new java.awt.CardLayout());
        splitPane.setRightComponent(workArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(splitPane, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(splitPane, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents
    private void btnManageVitalCatalogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageVitalCatalogActionPerformed
        // TODO add your handling code here:
        //ManageVitalCatalogJPanel mpcjp = new ManageVitalCatalogJPanel(workArea, persondesc);
       //ViewJPanelpersonvital mpcjp = new ViewJPanelpersonvital(workArea, persondeschistory,);
       // workArea.add("ViewJPanelpersonvital", mpcjp);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
    }//GEN-LAST:event_btnManageVitalCatalogActionPerformed

    private void PerformanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PerformanceActionPerformed
        // TODO add your handling code here:
//        ProductReportJPanel prjp = new workArea(userProcessContainer, supplier);
//        workArea.add("ProductReportJPanelSupplier", prjp);
//        CardLayout layout = (CardLayout)workArea.getLayout();
//        layout.next(userProcessContainer);
    }//GEN-LAST:event_PerformanceActionPerformed

    private void btnSupplierProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupplierProfileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSupplierProfileActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:

        mainWorkArea.remove(this);

        Component[] componentArray = mainWorkArea.getComponents();
        Component component = componentArray[componentArray.length - 1];
      //  LoginScreen loginPanel = (LoginScreen) component;
        //loginPanel.populateSupplierCombo();

        CardLayout layout = (CardLayout) mainWorkArea.getLayout();
        layout.previous(mainWorkArea);

    }//GEN-LAST:event_btnLogOutActionPerformed

    public String toString() {
        return "Supplier";
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Performance;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnManageStaff;
    private javax.swing.JButton btnManageVitalCatalog;
    private javax.swing.JButton btnSupplierProfile;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JPanel menuBar;
    private javax.swing.JSplitPane splitPane;
    private javax.swing.JPanel workArea;
    // End of variables declaration//GEN-END:variables
}
