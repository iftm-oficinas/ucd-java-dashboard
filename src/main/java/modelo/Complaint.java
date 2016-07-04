package modelo;

public class Complaint {

    private Integer id;
    private User user;
    private User inspector;
    private String status;
    private String latitude;
    private String longitude;
    private String description;

    public Complaint() {
    }

    public Complaint(Integer id) {
        this.id = id;
    }

    public Complaint(Integer id, User user, User inspector, String status, String latitude, String longitude, String description) {
        this.id = id;
        this.user = user;
        this.inspector = inspector;
        this.status = status;
        this.latitude = latitude;
        this.longitude = longitude;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getinspector() {
        return inspector;
    }

    public void setInspector(User inspector) {
        this.inspector = inspector;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Complaint{" + "id=" + id + ", user=" + user.toString() + ", inspector=" + inspector.toString() + ", status=" + status + ", latitude=" + latitude + ", longitude=" + longitude + ", description=" + description + '}';
    }

}
