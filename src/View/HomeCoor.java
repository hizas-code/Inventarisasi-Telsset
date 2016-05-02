package View;

import java.awt.CardLayout;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

/**
 * @author Hizas
 */

public class HomeCoor extends javax.swing.JFrame {

    private CardLayout cardLayout;
    public HomeCoor() {
        initComponents();
        cardLayout = new CardLayout();
        mainPanel.setLayout(cardLayout);
        this.setSize(660,330);
    }

    public JPanel getMainPanel(){
        return mainPanel;
    }
    public CardLayout getLayout(){
        return cardLayout;
    }
    
    public void addListener(ActionListener al){
        btnLogout.addActionListener(al);
        btnDatabase.addActionListener(al);
        btnProposeIn.addActionListener(al);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        btnDatabase = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnProposeIn = new javax.swing.JButton();
        btnCancelledP = new javax.swing.JButton();
        greeting = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mainPanel.setPreferredSize(new java.awt.Dimension(610, 184));

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 606, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );

        getContentPane().add(mainPanel);
        mainPanel.setBounds(20, 90, 610, 184);

        btnDatabase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asset/btndatabase.png"))); // NOI18N
        getContentPane().add(btnDatabase);
        btnDatabase.setBounds(280, 50, 60, 30);

        btnLogout.setBackground(new java.awt.Color(255, 255, 255));
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asset/btnlogout.png"))); // NOI18N
        getContentPane().add(btnLogout);
        btnLogout.setBounds(510, 50, 116, 23);

        btnProposeIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asset/btnformup.png"))); // NOI18N
        getContentPane().add(btnProposeIn);
        btnProposeIn.setBounds(350, 50, 60, 30);

        btnCancelledP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asset/btnfromno.png"))); // NOI18N
        getContentPane().add(btnCancelledP);
        btnCancelledP.setBounds(420, 50, 60, 30);

        greeting.setForeground(new java.awt.Color(255, 255, 255));
        greeting.setText("Hello, ");
        getContentPane().add(greeting);
        greeting.setBounds(140, 20, 340, 14);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asset/background pjg2.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 650, 310);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelledP;
    private javax.swing.JButton btnDatabase;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnProposeIn;
    private javax.swing.JLabel greeting;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel mainPanel;
    // End of variables declaration//GEN-END:variables

    public Object getBtnLogout() {
        return btnLogout;
    }
    public Object getBtnDatabase() {
        return btnDatabase;
    }
    public Object getBtnPropose(){
        return btnProposeIn;
    }
    public void setGreet(String s){
        greeting.setText("Hello, " + s);
    }
    
}
