package Controller;

import Model.*;
import View.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * @author Hizas
 */

public class ControllerCoor extends MouseAdapter implements ActionListener {

    private Application model;
    private HomeCoor view;
    private JPanel mainPanel;
    
    private ProposeCoor panelPropose;
    private ListBarang panelBarang;
    
    public ControllerCoor(Application model){
        this.model = model;
        view = new HomeCoor();
        panelPropose = new ProposeCoor();
        panelBarang = new ListBarang();
        
        mainPanel = view.getMainPanel();
        mainPanel.add(panelPropose,"panelPropose");
        mainPanel.add(panelBarang,"panelBarang");
        
        view.addListener(this);
        panelPropose.addListener(this);
        panelPropose.addAdapter(this);
        panelBarang.addListener(this);
        panelBarang.addAdapter(this);
        
        view.setTitle("Telsset Home");
        view.setGreet(model.getUser().getName());
        view.setVisible(true);
        panelPropose.setTableData(model.getProposeByStatus(1));
       // panelBarang.set
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source.equals(view.getBtnLogout())){
            view.dispose();
            new ControllerIndex(model);
        }
        if(source.equals(view.getBtnPropose())){
            view.getLayout().show(mainPanel, "panelPropose");
            panelPropose.setTableData(model.getProposeByStatus(1));
        }
        if(source.equals(view.getBtnDatabase())){
            view.getLayout().show(mainPanel, "panelBarang");
            panelBarang.setListRoom(model.getListRoomNameByBuilding(panelBarang.getBuildingName()));
        }
        //if(source.equals(view.getBtn))
        if(source.equals(panelPropose.getBtnDetail())){
            if(model.getSelectedPropose() != null)
                new ProposeDetailCoor(model.getSelectedPropose());
            else JOptionPane.showMessageDialog(panelPropose, "Pilih pengajuan yang ingin dilihat!");
        }
        if(source.equals(panelPropose.getBtnDecline())){
            if(model.getSelectedPropose() != null){
                model.deleteProposeById(model.getSelectedPropose().getId());
                model.setSelectedPropose(null);
                panelPropose.setTableData(model.getProposeByStatus(1));
            }
            else JOptionPane.showMessageDialog(panelPropose, "Pilih pengajuan yang ingin dilihat!");
        }
        if(source.equals(panelPropose.getBtnAccept())){
            if(model.getSelectedPropose() != null){
                String updatedDetail = model.getSelectedPropose().getDetail();
                model.getSelectedPropose().setDetail(JOptionPane.showInputDialog(panelPropose, "Update keterangan pengajuan : ",updatedDetail));
                model.updateObjectDetail(model.getSelectedPropose().getId(), updatedDetail);
                int x = JOptionPane.showConfirmDialog(panelPropose,"Ajukan ke Dekan?");
                if(x == 0){
                    model.updateObjectStatus(model.getSelectedPropose().getId(), 2);
                    panelPropose.setTableData(model.getProposeByStatus(1));
                }
            }
        }
        if(source.equals(panelBarang.getListBuilding())){
            panelBarang.setListRoom(model.getListRoomNameByBuilding(panelBarang.getBuildingName()));
            panelBarang.resetTable();
        }
    }
    
    public void mousePressed(MouseEvent me){
        Object source = me.getSource();
        if(source.equals(panelPropose.getTable())){
            model.setSelectedPropose(model.getProposeById(panelPropose.getSelectedId()));
            model.buildingAdded();
        }
        if(source.equals(panelBarang.getListRoom())){
            model.setSelectedObjects(model.getObjectByRoom(panelBarang.getRoomName()));
            panelBarang.setTableData(model.getSelectedObjects());
        }
    }
}
