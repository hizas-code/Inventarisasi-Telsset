package View;

import java.awt.event.ActionListener;

/**
 * @author Hizas
 */

public class Index extends javax.swing.JFrame {

    public Index() {
        initComponents();
        this.setSize(600, 400);
    }
    
    public void addListener(ActionListener a){
        btnLogin.addActionListener(a);
        btnPropose.addActionListener(a);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLogin = new javax.swing.JButton();
        btnPropose = new javax.swing.JButton();
        chooseLogin = new javax.swing.JComboBox<>();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 400));
        setResizable(false);
        getContentPane().setLayout(null);

        btnLogin.setBackground(new java.awt.Color(255, 255, 255));
        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asset/btnLogin.png"))); // NOI18N
        getContentPane().add(btnLogin);
        btnLogin.setBounds(160, 320, 130, 30);

        btnPropose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asset/btnPengajuan.png"))); // NOI18N
        getContentPane().add(btnPropose);
        btnPropose.setBounds(300, 320, 140, 30);

        chooseLogin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Logistik Informatika", "Dekan", "Koordinator Pengadaan Barang", "Vendor" }));
        chooseLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseLoginActionPerformed(evt);
            }
        });
        getContentPane().add(chooseLogin);
        chooseLogin.setBounds(200, 270, 200, 30);

        username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(username);
        username.setBounds(200, 140, 200, 30);

        password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(password);
        password.setBounds(200, 200, 200, 30);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asset/background login.png"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(0, 0, 600, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chooseLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chooseLoginActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnPropose;
    private javax.swing.JComboBox<String> chooseLogin;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
    
    public Object getBtnLogin(){
        return btnLogin;
    }
    public Object getBtnPropose(){
        return btnPropose;
    }
    public String getUsername(){
        return username.getText();
    }
    public String getPassword(){
        return password.getText();
    }
    public int getLoginType(){
        return chooseLogin.getSelectedIndex()+1;
    }
    public void setBackgroundSize(){
        background.setSize(600, 400);
    }
}
