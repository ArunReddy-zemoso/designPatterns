package proxyDesign.protection;


public class User {
    private String username;
    private String designation;

    public User(String username, String designation) {
        this.username = username;
        this.designation = designation;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

}
