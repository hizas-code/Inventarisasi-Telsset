package Controller;

import Model.*;
import View.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Hizas
 */
public class ControllerLogin implements ActionListener {
    private Application model;
    private Login view;
    
    public ControllerLogin(Application model, ControllerIndex c){
        this.model = model;
        view = new Login();
        
        view.setVisible(true);
        view.addListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        Object source = e.getSource();
        if(source.equals(view.getBtnLogin())){
            String username = view.getUsername();
            String password = view.getPassword();
            
        }
    }
}
