package View;

import Model.Propose;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


/**
 * @author Hizas
 */

public class ProposeCoor extends javax.swing.JPanel {
    
    public ProposeCoor() {
        initComponents();
    }

    public void addListener(ActionListener al){
        btnAccept.addActionListener(al);
        btnDecline.addActionListener(al);
        btnDetail.addActionListener(al);
    }
    
    public void addAdapter(MouseAdapter ma){
        tableObject.addMouseListener(ma);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tableObject = new javax.swing.JTable();
        btnAccept = new javax.swing.JButton();
        btnDecline = new javax.swing.JButton();
        btnDetail = new javax.swing.JButton();

        tableObject.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID Pengajuan", "Nama Pengaju", "Jabatan Pengaju"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tableObject);

        btnAccept.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asset/btnformyes.png"))); // NOI18N

        btnDecline.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asset/btnfromno.png"))); // NOI18N

        btnDetail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asset/btnview.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAccept)
                    .addComponent(btnDecline)
                    .addComponent(btnDetail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAccept)
                        .addGap(18, 18, 18)
                        .addComponent(btnDecline)
                        .addGap(18, 18, 18)
                        .addComponent(btnDetail)
                        .addGap(0, 3, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccept;
    private javax.swing.JButton btnDecline;
    private javax.swing.JButton btnDetail;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableObject;
    // End of variables declaration//GEN-END:variables

    public Object getBtnAccept(){
        return btnAccept;
    }
    public Object getBtnDecline(){
        return btnDecline;
    }
    public Object getBtnDetail(){
        return btnDetail;
    }
    public Object getTable(){
        return tableObject;
    }
    
    public void setTableData(ArrayList<Propose> prp){
        int x = 0;
        DefaultTableModel dm = (DefaultTableModel)tableObject.getModel();
        dm.setRowCount(0);
        dm.setRowCount(50);
        for(Propose p : prp){
            tableObject.getModel().setValueAt(p.getId(),x,0);
            tableObject.getModel().setValueAt(p.getProposerName(),x,1);
            tableObject.getModel().setValueAt(p.getProposerTitle(),x,2);
            x++;
        }
    }
    
    public String getSelectedId(){
        return (String) tableObject.getValueAt(tableObject.getSelectedRow(), 0);
    }
}
