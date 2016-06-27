package modelo;

public class Complaint {

    private Integer id;
    private Integer id_user;
    private Integer id_inspector;
    private String status;
    private String latitude;
    private String longitude;
    private String description;

    public Complaint() {
    }

    public Complaint(Integer id) {
        this.id = id;
    }

    public Complaint(Integer id, Integer id_user, Integer id_inspector, String status, String latitude, String longitude, String description) {
        this.id = id;
        this.id_user = id_user;
        this.id_inspector = id_inspector;
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

    public Integer getId_user() {
        return id_user;
    }

    public void setId_user(Integer id_user) {
        this.id_user = id_user;
    }

    public Integer getId_inspector() {
        return id_inspector;
    }

    public void setId_inspector(Integer id_inspector) {
        this.id_inspector = id_inspector;
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
        return "Complaint{" + "id=" + id + ", id_user=" + id_user + ", id_inspector=" + id_inspector + ", status=" + status + ", latitude=" + latitude + ", longitude=" + longitude + ", description=" + description + '}';
    }

}
