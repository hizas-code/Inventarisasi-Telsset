package Model;

/**
 * @author hizas-code
 */

public class Objects {
    
    public String name;
    public String idRoom;
    public int category;
    public int status;

    public Objects(String name, int category, String idRoom) {
        this.name = name;
        this.category = category;
        this.idRoom = idRoom;
        status = 1;
    }

    public Objects(String name, int category, int status, String idRoom) {
        this.name = name;
        this.idRoom = idRoom;
        this.category = category;
        this.status = status;
    }
  
    public String getName() { return name; }
    public int getCategory() { return category; }    
    public String getIdRoom() { return idRoom; }
    public int getStatus() { return status; }
 
    public void setName(String name) { this.name = name; }
    public void setCategory(int category) { this.category = category; }
    public void setIdRoom(String IdRoom) { this.idRoom = idRoom; }
    public void setStatus(int status) { this.status = status; }
    
    public String categoryToString(){
        if(category == 1) return "Kursi";
        if(category == 2) return "Meja";
        if(category == 3) return "AC";
        if(category == 4) return "Papan Tulis";
        if(category == 5) return "Lemari";
        if(category == 6) return "Komputer";
        if(category == 7) return "Pintu";
        if(category == 8) return "Jendela";
        if(category == 9) return "Lain-lain";
        return "";
    }
    
    public String statusToString(){
        if(status == -1) return "Rusak";
        if(status == 0) return "Baik";
        if(status == 1) return "Baru";
        else return "Sudah Ada";
    }
}
