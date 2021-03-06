/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.Color;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Persondesc;
import model.Persondeschistory;
import model.Vitaldesc;
import model.Vitaldeschistory;

/**
 *
 * 
 */
public class welcomeJFrame extends javax.swing.JFrame {

    /**
     * Creates new form welcomeJFrame
     */
    


    Persondeschistory history;
      Vitaldeschistory vitalhistory;
    
    public welcomeJFrame() {
        initComponents();
       history = new  Persondeschistory();
       vitalhistory = new  Vitaldeschistory();
       Persondesc md= history.addnewdesc();
       Vitaldesc md1=vitalhistory.addnewdesc();
               /* initialize persons*/
md.setCommunity("Street1");
md.setAddress("Boston city");
md.setAge(70);
md.setPname("Thomas");
md.setCity("Boston");
md.setId(1);
/****************/
var now = new Date();
       // DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");
         DateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm");
        md1.setId(1);
md1.setDp(80);
md1.setSp(180);
md1.setVitaldate(now);
       // vs: history.getHistory();
      
       //
         DefaultTableModel model2 =(DefaultTableModel) bpnormal.getModel();   
       bpnormal.setShowVerticalLines(true);
         bpnormal.getTableHeader().setOpaque(false);
         bpnormal.getTableHeader().setBackground(Color.red);
           
        model2.setRowCount(0);
         Object[] data0 = {"Normal", "Less Than 120", "and","Less Than 80"};
          model2.addRow(data0);
           Object[] data1 = {"Elevated", "120-129", "and","Less Than 80"};
          model2.addRow(data1);
           Object[] data2 = {"High BP Stage-1", "130-139", "or","80-89"};
          model2.addRow(data2);
          Object[] data3 = {"High BP Stage-2", "140 or Higher", "or","90 or higher"};
          model2.addRow(data3);
          Object[] data4 = {"High BP Emergency", "Higher than 180", "and/or","higher than 120"};
          model2.addRow(data4);
  
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitpanel = new javax.swing.JSplitPane();
        displaydata = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        bpnormal = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        menu = new javax.swing.JPanel();
        addcar = new javax.swing.JButton();
        viewcar = new javax.swing.JButton();
        viewvital = new javax.swing.JButton();
        viewencounter = new javax.swing.JButton();
        viewcar5 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        displaydata.setPreferredSize(new java.awt.Dimension(600, 800));
        displaydata.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 153, 255));
        jButton1.setText("Patient Vital Analysis-Blood Pressure");
        displaydata.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 33, 490, -1));

        bpnormal.setBackground(new java.awt.Color(204, 255, 204));
        bpnormal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Category", "Systolic", "Combination", "Diastolic"
            }
        ));
        bpnormal.setRowHeight(26);
        jScrollPane1.setViewportView(bpnormal);

        displaydata.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 96, 496, 165));

        jLabel2.setIcon(new javax.swing.ImageIcon("/Users/akhil_kaundinya/Downloads/bpimage1.png")); // NOI18N
        jLabel2.setOpaque(true);
        displaydata.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 120, 120));

        jLabel3.setIcon(new javax.swing.ImageIcon("/Users/akhil_kaundinya/Downloads/patient.jpg")); // NOI18N
        displaydata.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, -1, 100));

        jLabel4.setIcon(new javax.swing.ImageIcon("/Users/akhil_kaundinya/Downloads/patient1.jpg")); // NOI18N
        displaydata.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 316, 100, 90));

        splitpanel.setRightComponent(displaydata);

        menu.setBackground(new java.awt.Color(255, 255, 255));

        addcar.setBackground(new java.awt.Color(0, 204, 255));
        addcar.setText("Register Person");
        addcar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addcarActionPerformed(evt);
            }
        });

        viewcar.setBackground(new java.awt.Color(0, 204, 255));
        viewcar.setText("View Persons");
        viewcar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewcarActionPerformed(evt);
            }
        });

        viewvital.setBackground(new java.awt.Color(0, 204, 255));
        viewvital.setText("Collect Vitals");
        viewvital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewvitalActionPerformed(evt);
            }
        });

        viewencounter.setBackground(new java.awt.Color(0, 204, 255));
        viewencounter.setText("View Encounter Details");
        viewencounter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewencounterActionPerformed(evt);
            }
        });

        viewcar5.setBackground(new java.awt.Color(0, 204, 255));
        viewcar5.setText("Analyse Encounter");
        viewcar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewcar5ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 204, 255));
        jButton2.setText("Analyse by Community");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("/Users/akhil_kaundinya/Downloads/medical-image.jpg")); // NOI18N

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viewcar5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewcar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewvital, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewencounter, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addcar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(addcar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(viewcar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(viewvital)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(viewencounter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(viewcar5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addGap(34, 34, 34)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        splitpanel.setLeftComponent(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(splitpanel, javax.swing.GroupLayout.DEFAULT_SIZE, 716, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(splitpanel, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addcarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addcarActionPerformed
        // TODO add your handling code here :
     
       createpanel menu1= new createpanel(history);
         
       splitpanel.setRightComponent(menu1);
    }//GEN-LAST:event_addcarActionPerformed

    private void viewcarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewcarActionPerformed

        // TODO add your handling code here:
       EditJPanelperson viewmenu1= new EditJPanelperson(history);
        splitpanel.setRightComponent(viewmenu1);

    }//GEN-LAST:event_viewcarActionPerformed

    private void viewvitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewvitalActionPerformed
        // TODO add your handling code here:
          // TODO add your handling code here:
       // searchmodelJPanel1 viewmenu1= new searchmodelJPanel1(history);
 //ViewJPanelperson viewmenu1= new ViewJPanelperson(history);
ViewJPanelpersonvital viewmenu1= new ViewJPanelpersonvital(history,vitalhistory);
        splitpanel.setRightComponent(viewmenu1);
        //splitpanel.setRightComponent(viewmenu1);
    }//GEN-LAST:event_viewvitalActionPerformed

    private void viewencounterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewencounterActionPerformed
        // TODO add your handling code here:
        ViewJPanelencounter viewmenu1= new ViewJPanelencounter(history,vitalhistory);
        splitpanel.setRightComponent(viewmenu1);
       // availJPanel1 viewmenu1= new availJPanel1(history);

       // splitpanel.setRightComponent(viewmenu1);
    }//GEN-LAST:event_viewencounterActionPerformed

    private void viewcar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewcar5ActionPerformed
        // TODO add your handling code here
        AnalyseJPanelencounter viewmenu1= new AnalyseJPanelencounter(history,vitalhistory);
        splitpanel.setRightComponent(viewmenu1);
    }//GEN-LAST:event_viewcar5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        AnalyseCommunity viewmenu1= new AnalyseCommunity(history,vitalhistory);
        splitpanel.setRightComponent(viewmenu1);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(welcomeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(welcomeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(welcomeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(welcomeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new welcomeJFrame().setVisible(true);
               // txtnocars.setText(String.valueOf(history.getHistory().size()));
              //  txtnocars=String.valueOf(history.getHistory().size());
            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addcar;
    private javax.swing.JTable bpnormal;
    private javax.swing.JPanel displaydata;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel menu;
    private javax.swing.JSplitPane splitpanel;
    private javax.swing.JButton viewcar;
    private javax.swing.JButton viewcar5;
    private javax.swing.JButton viewencounter;
    private javax.swing.JButton viewvital;
    // End of variables declaration//GEN-END:variables

}
