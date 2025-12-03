package gr.aueb.cf.cf9.ch11;

public class User {
    private long id;
    private String firstname;
    private String lastame;
    private String username;
    private String password;
    private boolean active;

    public User() {

    }

    public User(long id, String firstname
            , String lastame, String username
            , String password, boolean active) {
        this.id = id;
        this.firstname = firstname;
        this.lastame = lastame;
        this.username = username;
        this.password = password;
        this.active = active;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastame() {
        return lastame;
    }

    public void setLastame(String lastame) {
        this.lastame = lastame;
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

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
