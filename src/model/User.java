package model;

public class User {
    private int id;
    private String username;
    private String password; // Plain text for simplicity (school project)

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Getters only (no setters needed for this scope)
    public int getId() { return id; }
    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public void setUsername(String newusername) {this.username = newusername;}
}