package Controller;

import Model.*;
import View.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * @author Hizas
 */

public class ControllerPropose implements ActionListener {
    
    private Application model;
    private ProposeForm view;
    
    public ControllerPropose(Application model){
        this.model = model;
        view = new ProposeForm();
        view.addListener(this);
        view.setVisible(true);
        view.setBuildingItem(model.getListBuilding());
        view.setRoomList(model.getListRoomNameByBuilding(view.getBuildingItem()));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source.equals(view.getBtnCancel())){
            view.dispose();
        }
        if(source.equals(view.getBuilding())){
            view.setRoomList(model.getListRoomNameByBuilding(view.getBuildingItem()));
        }
        if(source.equals(view.getBtnPropose())){
            boolean success = model.createPropose(view.getName(), view.getTitle(), view.getObjectName(), view.getQuantity(), view.getCategory(), view.getRoomName(), view.getDetail());
            if(success) { 
                JOptionPane.showMessageDialog(view, "PENGAJUAN BARANG BERHASIL DILAKUKAN!");
                view.dispose();
            }
            else JOptionPane.showMessageDialog(view, "PENGAJUAN BARANG GAGAL!"); 
        }
    }    
}
