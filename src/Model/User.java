package Model;

/**
 * @author Hizas
 */

public class User {
    
    private String username;
    private String password;
    private int type;
    
    private String name;
    private String address;    
    private String email;
    private String phone;

    public User(String username, String password, int type, String name, String address, String email, String phone) {
        this.username = username;
        this.password = password;
        this.type = type;
        this.name = name;
        this.address = address;
        this.email = email;
        this.phone = phone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
}
