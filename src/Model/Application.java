package Model;

import Database.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author hizas-code
 */
public class Application {
    
    private Database connection;
    private User currentUser;
    private ArrayList<Propose> currentListProposeIn;
    private Propose selectedPropose;
    private ArrayList<Objects> selectedObjects;
    
    public Application(){
        this.connection = new Database();
        connection.connect();
    }
    
    public boolean doLogin(String username, String password, int type){
        currentUser = connection.loginUser(username, password, type);
        return currentUser != null;
    }
    
    public ArrayList<Building> getListBuilding(){
        return connection.getListBuilding();
    }
    
    public String[] getListRoomNameByBuilding(String building){
        ArrayList<Room> room = connection.getListRoomByBuilding(building);
        ArrayList<String> roomName = new ArrayList<>();
        for(Room r : room)
            roomName.add(r.getName());
        return (String[]) roomName.toArray(new String[0]);
    }
    
    public boolean createPropose(String proposer, String title, String objectName, int qty, int type, String roomName, String detail){
        return connection.createPropose(proposer, title, objectName, qty, type, roomName, detail);
    }
    
    public ArrayList<Propose> getProposeByStatus(int status){
        currentListProposeIn = connection.getListPropose(status);
        return currentListProposeIn;
    }
    
    public Propose getProposeById(String id){
        selectedPropose = connection.getProposeByID(id);
        return selectedPropose;
    }
    
    public User getUser(){
        return currentUser;
    }
    
    public boolean deleteProposeById(String id){
        return connection.deletePropose(id);
    }
    
    public Propose getSelectedPropose(){
        return selectedPropose;
    }
    public void setSelectedPropose(Propose p){
        selectedPropose = p;
    }
    
    public ArrayList<Objects> getSelectedObjects(){
        return selectedObjects;
    }
    public void setSelectedObjects(ArrayList<Objects> o){
        selectedObjects = o;
    }
    
    public void buildingAdded(){
        selectedPropose.setRoomName(selectedPropose.getRoomName() + ", " + connection.getBuildingByRoom(selectedPropose.getRoomName()));
    }
    
    public boolean updateObjectStatus(String id, int status){
        return connection.updateStatusObject(id, status);
    }
    
    public boolean updateObjectDetail(String id, String detail){
        return connection.updateDetailObject(id, detail);
    }
    
    public ArrayList<Objects> getObjectByRoom(String room){
        selectedObjects =  connection.getObjects(room);
        return selectedObjects;
    }
}
