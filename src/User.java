import java.util.Set;

public class User {
    String name;
    String username;
    String password;
    long id;
    Set userEvents;

    public Set getUserEvents() {
        return userEvents;
    }

    public void setUserEvents(Set userEvents) {
        this.userEvents = userEvents;
    }

    public User(String name, String username, String password) {
        this.name = name;
        this.username = username;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
