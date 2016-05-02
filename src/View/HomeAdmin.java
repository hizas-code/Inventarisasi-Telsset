package View;

import java.awt.CardLayout;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

/**
 * @author Hizas
 */

public class HomeAdmin extends javax.swing.JFrame {

    private CardLayout cardLayout;
    
    public HomeAdmin() {
        initComponents();
        cardLayout = new CardLayout();
        mainPanel.setLayout(cardLayout);
    }

    public JPanel getMainPanel(){
        return mainPanel;
    }
    public CardLayout getLayout(){
        return cardLayout;
    }
    
    public void addListener(ActionListener al){
        btnBuilding.addActionListener(al);
        btnLogout.addActionListener(al);
        btnMessage.addActionListener(al);
        btnRoom.addActionListener(al);
        btnUser.addActionListener(al);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        btnMessage = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnUser = new javax.swing.JButton();
        btnBuilding = new javax.swing.JButton();
        btnRoom = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        greeting = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 488, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        btnMessage.setText("Send Message");

        btnLogout.setText("Logout");

        btnUser.setText("User Manage");

        btnBuilding.setText("Building Manage");

        btnRoom.setText("Room Manage");

        jLabel1.setText("Tellset");

        greeting.setText("Hello, ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(greeting)
                .addGap(159, 159, 159)
                .addComponent(btnMessage)
                .addGap(18, 18, 18)
                .addComponent(btnLogout)
                .addGap(32, 32, 32))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUser)
                    .addComponent(btnBuilding)
                    .addComponent(btnRoom))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnLogout)
                    .addComponent(greeting)
                    .addComponent(btnMessage))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(14, 14, 14))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(btnUser)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuilding)
                        .addGap(18, 18, 18)
                        .addComponent(btnRoom)
                        .addContainerGap(285, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuilding;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnMessage;
    private javax.swing.JButton btnRoom;
    private javax.swing.JButton btnUser;
    private javax.swing.JLabel greeting;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel mainPanel;
    // End of variables declaration//GEN-END:variables

    public Object getBtnBuilding() {
        return btnBuilding;
    }
    public Object getBtnLogout() {
        return btnLogout;
    }
    public Object getBtnMessage() {
        return btnMessage;
    }
    public Object getBtnRoom() {
        return btnRoom;
    }
    public Object getBtnUser() {
        return btnUser;
    }   
    public void setGreet(String s){
        greeting.setText("Hello, " + s);
    }
    
}
