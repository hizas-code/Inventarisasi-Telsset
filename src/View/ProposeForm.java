package View;

import Model.Building;
import Model.Room;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * @author Hizas
 */

public class ProposeForm extends javax.swing.JFrame {

    public ProposeForm() {
        initComponents();
        this.setSize(415, 540);
    }

    public void addListener(ActionListener al){
        building.addActionListener(al);
        btnCancel.addActionListener(al);
        btnPropose.addActionListener(al);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        personName = new javax.swing.JTextField();
        personTitle = new javax.swing.JTextField();
        objectName = new javax.swing.JTextField();
        category = new javax.swing.JComboBox<>();
        quantity = new javax.swing.JSpinner();
        btnPropose = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        building = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        room = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        detail = new javax.swing.JTextArea();
        background = new javax.swing.JLabel();

        jTextField3.setText("jTextField3");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(personName);
        personName.setBounds(150, 80, 240, 20);
        getContentPane().add(personTitle);
        personTitle.setBounds(150, 120, 240, 20);
        getContentPane().add(objectName);
        objectName.setBounds(150, 160, 240, 20);

        category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kursi", "Meja", "AC", "Papan Tulis", "Lemari", "Computer", "Pintu", "Jendela", "Lain-lain" }));
        getContentPane().add(category);
        category.setBounds(150, 190, 140, 30);

        quantity.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        getContentPane().add(quantity);
        quantity.setBounds(150, 230, 79, 30);

        btnPropose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asset/btnajukan.png"))); // NOI18N
        getContentPane().add(btnPropose);
        btnPropose.setBounds(80, 460, 130, 30);

        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asset/btnbatal.png"))); // NOI18N
        getContentPane().add(btnCancel);
        btnCancel.setBounds(230, 470, 110, 20);

        getContentPane().add(building);
        building.setBounds(260, 270, 130, 20);

        room.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(room);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(200, 300, 190, 140);

        detail.setColumns(20);
        detail.setLineWrap(true);
        detail.setRows(5);
        jScrollPane3.setViewportView(detail);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(10, 300, 190, 140);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asset/background form.png"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(0, 0, 400, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnPropose;
    private javax.swing.JComboBox<String> building;
    private javax.swing.JComboBox<String> category;
    private javax.swing.JTextArea detail;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField objectName;
    private javax.swing.JTextField personName;
    private javax.swing.JTextField personTitle;
    private javax.swing.JSpinner quantity;
    private javax.swing.JList<String> room;
    // End of variables declaration//GEN-END:variables

    public Object getBtnPropose(){
        return btnPropose;
    }
    public Object getBtnCancel(){
        return btnCancel;
    }
    public Object getBuilding(){
        return building;
    }
    public String getName(){
        return personName.getText();
    }
    public String getTitle(){
        return personTitle.getText();
    }
    public String getObjectName(){
        return objectName.getText();
    }
    public int getQuantity(){
        return (int) quantity.getValue();
    }
    public int getCategory(){
        return category.getSelectedIndex()+1;
    }
    public String getDetail(){
        return detail.getText();
    }
    public String getBuildingItem(){
        return (String) building.getSelectedItem();
    }
    public String getRoomName(){
        return room.getSelectedValue();
    }
    public void setRoomList(String [] listRoom){
        room.setListData(listRoom);
    }
    public void setBuildingItem(ArrayList<Building> listBuilding){
        for(Building b : listBuilding)
            building.addItem(b.getName());
    }
}
