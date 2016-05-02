package Controller;

import Model.*;
import View.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

/**
 * @author Hizas
 */

public class ControllerAdmin implements ActionListener {
   
    private Application model;
    private HomeAdmin view;
    private JPanel mainPanel;
    
    public ControllerAdmin(Application model){
        this.model = model;
        view = new HomeAdmin();
        view.addListener(this);
        
        mainPanel = view.getMainPanel();
        
        view.setVisible(true);
        view.setGreet(model.getUser().getName());
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source.equals(view.getBtnLogout())){
            view.dispose();
            new ControllerIndex(model);
        }
        //if(source.equals(view.))
    }
}
