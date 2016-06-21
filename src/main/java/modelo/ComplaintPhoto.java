package modelo;

public class ComplaintPhoto {

    private int id;
    private int id_complaint;
    private String extension;
    private String name;
    private String path;

    public ComplaintPhoto() {
    }

    public ComplaintPhoto(int id) {
        this.id = id;
    }

    public ComplaintPhoto(int id, int id_complaint, String extension, String name, String path) {
        this.id = id;
        this.id_complaint = id_complaint;
        this.extension = extension;
        this.name = name;
        this.path = path;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_complaint() {
        return id_complaint;
    }

    public void setId_complaint(int id_complaint) {
        this.id_complaint = id_complaint;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "ComplaintPhoto{" + "id=" + id + ", id_complaint=" + id_complaint + ", extension=" + extension + ", name=" + name + ", path=" + path + '}';
    }

}
