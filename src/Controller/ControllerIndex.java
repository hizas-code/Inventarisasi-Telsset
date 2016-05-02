package Controller;

import Model.*;
import View.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 * @author Hizas
 */

public class ControllerIndex implements ActionListener {
    
    private Application model;
    private Index view;
    
    public ControllerIndex(Application model){

        this.model = model;
        view = new Index();
        view.setTitle("Login");
        view.setBackgroundSize();
        
        view.addListener(this);
        view.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source.equals(view.getBtnLogin())){
            String username = view.getUsername();
            String password = view.getPassword();
            int type = view.getLoginType();
            if(username.equals("") || password.equals ("")) 
                JOptionPane.showMessageDialog(view,"Input Username and Password!");
            else {
                boolean success = model.doLogin(username, password, type);
                if(success){
                    view.dispose();
                    if(model.getUser().getType() == 1) new ControllerAdmin(model);
                    //if(model.getUser().getType() == 2) new ControllerLogistik(model);
                    //if(model.getUser().getType() == 3) new ControllerDekan(model);
                    if(model.getUser().getType() == 4) new ControllerCoor(model);
                    //if(model.getUser().getType() == 5) new ControllerVendor(model);
                }
                else {
                    JOptionPane.showMessageDialog(view, "Username atau Password salah!");
                }
            }
        }
        if(source.equals(view.getBtnPropose())){
            new ControllerPropose(model);
        }
    }    
}
