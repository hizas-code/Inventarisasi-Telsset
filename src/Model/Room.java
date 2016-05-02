package Model;

/**
 * @author Hizas
 */

public class Room {
    private String name;
    private String buildingName;

    public Room(String name, String buildingName) {
        this.name = name;
        this.buildingName = buildingName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }
    
    
}
