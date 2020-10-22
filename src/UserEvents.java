public class UserEvents {

    public UserEvents(User user, String event) {
        this.user = user;
        this.event = event;
    }

    public UserEvents(String event) {
        this.event = event;
    }

    public UserEvents() {
    }

    long id;
    User user;
    String event;

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
