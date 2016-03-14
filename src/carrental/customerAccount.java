/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrental;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 12dow_000
 */
public class customerAccount extends javax.swing.JFrame {    
    Customer c;
    private ArrayList<Car> cars = new ArrayList();
    
    
    public customerAccount(ArrayList cars) {
        initComponents();
        this.cars = cars;
        updateJTable1(carTable);
        updateJTable2(rentedcarsTable);
        updateJTable3(returnedcarsTable);
        customerInfoLabel();
        
    }
    
    String[] colFind = {"Select", "ID","Make","Model","Year","Size"};
    String[] colRented = {"Select","Make","Model","Year","Rented"};
    String[] colReturned = {"ID","Make","Model","Year","Rented","Returned"};
    
    
    
    private void updateJTable1(javax.swing.JTable jtable){
        DefaultTableModel tModel = (DefaultTableModel) jtable.getModel();
        for(int j=tModel.getRowCount()-1; j>-1; j--)
            tModel.removeRow(j);
        
        for(int i=0; i < cars.size(); i++)//for(int i=0; i < cars.size(); i++)
        {
            Object[] data = {null,cars.get(i).getID(), cars.get(i).getMake(), cars.get(i).getModel(), cars.get(i).getYear(), cars.get(i).getSize()};
            tModel.addRow(data);
        }
    }
    private void updateJTable2(javax.swing.JTable jtable){
        DefaultTableModel tModel = (DefaultTableModel) jtable.getModel();
        for(int j=tModel.getRowCount()-1; j>-1; j--)
            tModel.removeRow(j);
        
        for(int i=0; i < cars.size(); i++)//for(int i=0; i < cars.size(); i++)
        {
            Object[] data = {null,cars.get(i).getMake(), cars.get(i).getModel(), cars.get(i).getYear(),null};
            tModel.addRow(data);
        }
    }
    private void updateJTable3(javax.swing.JTable jtable){
        DefaultTableModel tModel = (DefaultTableModel) jtable.getModel();
        for(int j=tModel.getRowCount()-1; j>-1; j--)
            tModel.removeRow(j);
        
        for(int i=0; i < cars.size(); i++)//for(int i=0; i < cars.size(); i++)
        {
            Object[] data = {cars.get(i).getID(), cars.get(i).getMake(), cars.get(i).getModel(), cars.get(i).getYear(),null,null};
            tModel.addRow(data);
        }
    }
    
    private void customerInfoLabel(){
        this.customerName.setText(c.getName()+ "'s Account"); //this.customerName.setText(Customer.class.getName()+"'s Account");
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        customersTabFrame = new javax.swing.JTabbedPane();
        findcar_jPanel = new javax.swing.JPanel();
        searchTextField2 = new javax.swing.JTextField();
        searchButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        carTable = new javax.swing.JTable();
        rentSelectedButton = new javax.swing.JButton();
        rentedcars_jPanel = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        rentedcarsTable = new javax.swing.JTable();
        returnedcars_jPanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        returnedcarsTable = new javax.swing.JTable();
        customerName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        searchTextField2.setText(" ");
        searchTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTextField2ActionPerformed(evt);
            }
        });

        searchButton2.setText("Search");
        searchButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButton2ActionPerformed(evt);
            }
        });

        carTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Select", "ID", "Make", "Model", "Year", "Size"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(carTable);

        rentSelectedButton.setText("Rent Selected");
        rentSelectedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rentSelectedButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout findcar_jPanelLayout = new javax.swing.GroupLayout(findcar_jPanel);
        findcar_jPanel.setLayout(findcar_jPanelLayout);
        findcar_jPanelLayout.setHorizontalGroup(
            findcar_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(findcar_jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(findcar_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(findcar_jPanelLayout.createSequentialGroup()
                        .addComponent(searchTextField2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchButton2))
                    .addGroup(findcar_jPanelLayout.createSequentialGroup()
                        .addComponent(rentSelectedButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        findcar_jPanelLayout.setVerticalGroup(
            findcar_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(findcar_jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(findcar_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rentSelectedButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                .addContainerGap())
        );

        customersTabFrame.addTab("Find Car", findcar_jPanel);

        jButton3.setText("Return Selected");

        rentedcarsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Select", "Make", "Model", "Year", "Rented"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(rentedcarsTable);

        javax.swing.GroupLayout rentedcars_jPanelLayout = new javax.swing.GroupLayout(rentedcars_jPanel);
        rentedcars_jPanel.setLayout(rentedcars_jPanelLayout);
        rentedcars_jPanelLayout.setHorizontalGroup(
            rentedcars_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rentedcars_jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(rentedcars_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(rentedcars_jPanelLayout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        rentedcars_jPanelLayout.setVerticalGroup(
            rentedcars_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rentedcars_jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        customersTabFrame.addTab("Rented Cars", rentedcars_jPanel);

        returnedcarsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Make", "Model", "Year", "Rented", "Returned"
            }
        ));
        jScrollPane3.setViewportView(returnedcarsTable);

        javax.swing.GroupLayout returnedcars_jPanelLayout = new javax.swing.GroupLayout(returnedcars_jPanel);
        returnedcars_jPanel.setLayout(returnedcars_jPanelLayout);
        returnedcars_jPanelLayout.setHorizontalGroup(
            returnedcars_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(returnedcars_jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        returnedcars_jPanelLayout.setVerticalGroup(
            returnedcars_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(returnedcars_jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        customersTabFrame.addTab("Returned Cars", returnedcars_jPanel);

        customerName.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(customersTabFrame)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(customerName)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(customerName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(customersTabFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTextField2ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_searchTextField2ActionPerformed

    private void searchButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButton2ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_searchButton2ActionPerformed

    private void rentSelectedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rentSelectedButtonActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_rentSelectedButtonActionPerformed

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
            java.util.logging.Logger.getLogger(customerAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(customerAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(customerAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(customerAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new customerAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable carTable;
    private javax.swing.JLabel customerName;
    private javax.swing.JTabbedPane customersTabFrame;
    private javax.swing.JPanel findcar_jPanel;
    private javax.swing.JButton jButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton rentSelectedButton;
    private javax.swing.JTable rentedcarsTable;
    private javax.swing.JPanel rentedcars_jPanel;
    private javax.swing.JTable returnedcarsTable;
    private javax.swing.JPanel returnedcars_jPanel;
    private javax.swing.JButton searchButton2;
    private javax.swing.JTextField searchTextField2;
    // End of variables declaration//GEN-END:variables
}
