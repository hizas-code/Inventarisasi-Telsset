package Model;

/**
 * @author Hizas
 */
public class Propose implements Cloneable{
   private String id;
   private String proposerName;
   private String proposerTitle;
   private String objectName;
   private int qty;
   private int category;
   private String roomName;
   private String detail;
   private int status;

    public Propose(String id, String proposerName, String proposerTitle, String objectName, int qty, int category, String roomName, String detail, int status) {
        this.id = id;
        this.proposerName = proposerName;
        this.proposerTitle = proposerTitle;
        this.objectName = objectName;
        this.qty = qty;
        this.category = category;
        this.roomName = roomName;
        this.detail = detail;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProposerName() {
        return proposerName;
    }

    public void setProposerName(String proposerName) {
        this.proposerName = proposerName;
    }

    public String getProposerTitle() {
        return proposerTitle;
    }

    public void setProposerTitle(String proposerTitle) {
        this.proposerTitle = proposerTitle;
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
    
}
