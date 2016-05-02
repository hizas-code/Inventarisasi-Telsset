package Database;

import Model.*;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.UUID;

/**
 * @author Hizas
 */

public class Database {
    
    private String server = "jdbc:mysql://localhost:3306/inventarisasi", dbuser = "root", dbpass = "";
    private Connection connection;
    private Statement statement;
    private PreparedStatement ps;
    
    public void connect(){
        try {
            connection = DriverManager.getConnection(server, dbuser, dbpass);
            statement = connection.createStatement();
        } 
        catch (SQLException e) {
            System.out.println(e);
        }

    }
    
    public User loginUser(String username, String password, int type) {
        try {
            String query = "SELECT * FROM USER WHERE USERNAME = '" + username + "' AND PASSWORD = '" + password + "' AND TYPE = " + type;
            ResultSet rs = statement.executeQuery(query);
            rs.last();
            int size = rs.getRow();
            if(size == 1){
                String uname = rs.getString(1);
                String pass = rs.getString(2);
                int userType = rs.getInt(3);
                String title = rs.getString(4);
                String address = rs.getString(5);
                String email = rs.getString(6);
                String phone = rs.getString(7);
                return(new User(uname,pass,userType,title,address,email,phone));
            }
            else {
                return null;
            }
        } catch (Exception e) {
            System.out.println(e);;
        }
        return null;
    }
    
    public ArrayList<Building> getListBuilding(){
        try {
            String query = "SELECT * FROM BUILDING";
            ArrayList<Building> listBuilding = new ArrayList<>();
            ResultSet rs = statement.executeQuery(query);
            while(rs.next()){
                String name = rs.getString(1);
                listBuilding.add(new Building(name));
            }
            return listBuilding;
        } 
        catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
    public ArrayList<Room> getListRoom(){
        try {
            String query = "SELECT * FROM ROOM";
            ArrayList<Room> listRoom = new ArrayList<>();
            ResultSet rs = statement.executeQuery(query);
            while(rs.next()){
                String name = rs.getString(1);
                String buildingName = rs.getString(2);
                listRoom.add(new Room(name,buildingName));
            }
            return listRoom;
        } 
        catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
    public ArrayList<Room> getListRoomByBuilding(String building){
        try {
            String query = "SELECT * FROM ROOM WHERE BUILDINGNAME = '" + building + "'" ;
            ArrayList<Room> listRoom = new ArrayList<>();
            ResultSet rs = statement.executeQuery(query);
            while(rs.next()){
                String name = rs.getString(1);
                String buildingName = rs.getString(2);
                listRoom.add(new Room(name,buildingName));
            }
            return listRoom;
        } 
        catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
    
    public ArrayList<Propose> getListPropose(int status){
        try {
            String query = "SELECT * FROM PROPOSE WHERE STATUS = " + status;
            ArrayList<Propose> prp = new ArrayList<>();
            ResultSet rs = statement.executeQuery(query);
            while(rs.next()){
                prp.add(new Propose(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getInt(6), rs.getString(7), rs.getString(8), rs.getInt(9)));
            }
            return prp;
        } 
        catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
    
    public Propose getProposeByID(String id){
        try {
            String query = "SELECT * FROM PROPOSE WHERE IDPROPOSE = '" + id + "'";
            ResultSet rs = statement.executeQuery(query);
            rs.last();
            return (new Propose(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getInt(6), rs.getString(7), rs.getString(8), rs.getInt(9)));
        } 
        catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
    
    public String getBuildingByRoom(String room){
        try {
            String query = "SELECT BUILDINGNAME FROM ROOM WHERE NAME = '" + room + "'";
            ResultSet rs = statement.executeQuery(query);
            rs.last();
            return (rs.getString(1));
        } 
        catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
    
    public boolean createPropose(String proposer, String title, String objectName, int qty, int type, String roomName, String detail){
        try {
            String id = "";
            boolean done;
            do {
                done = true;
                id = UUID.randomUUID().toString().substring(0,11).toUpperCase().replaceAll("-","");
                ArrayList<String> listId = new ArrayList<>();
                ResultSet r = statement.executeQuery("SELECT IDPROPOSE FROM PROPOSE");
                while(r.next()) listId.add(r.getString(1));
                for(String s : listId)
                    if(id.equals(s)) done = false;
            } while(!done);
            
            String query = "INSERT INTO PROPOSE VALUES ('" + id + "','" + proposer + "','" + title + "','" + objectName + "'," + qty + "," + type + ",'" + roomName + "','" + detail + "'," + 1 + ")";
            statement.execute(query);
            return true;
        } 
        catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
    
    public boolean updateStatusObject(String id, int status){
        try {
            String query = "UPDATE PROPOSE SET STATUS = " + status + " WHERE IDPROPOSE = '" + id + "'";
            statement.execute(query);
            return true;
        } 
        catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
    
    public boolean updateDetailObject(String id, String detail){
        try {
            String query = "UPDATE PROPOSE SET DETAIL = '" + detail + "' WHERE IDPROPOSE = '" + id + "'";
            statement.execute(query);
            return true;
        } 
        catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
    
    public boolean deletePropose(String id){
        try {
            String query = "DELETE FROM PROPOSE WHERE IDPROPOSE = '" + id + "'";
            statement.execute(query);
            return true;
        } 
        catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
    
    public ArrayList<Objects> getObjects(String room){
        try {
            String query = "SELECT * FROM OBJECT WHERE ROOMNAME = '" + room + "'";
            ArrayList<Objects> objects = new ArrayList<>();
            ResultSet rs = statement.executeQuery(query);
            while(rs.next()){
                objects.add(new Objects(rs.getString(1), rs.getInt(2), rs.getInt(3), rs.getString(4)));
            }
            return objects;
        } 
        catch (Exception e) {
            System.out.println(e);
            return null;
        }    
    }
}
