package modelo.dao;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import modelo.ComplaintPhoto;

public class ComplaintPhotoDAO {

    private final Connection connection;

    public ComplaintPhotoDAO(Connection connection) {
        this.connection = connection;
    }

    public ComplaintPhoto save() {
        ComplaintPhoto complaintPhoto = new ComplaintPhoto();
        return complaintPhoto;
    }

    public ComplaintPhoto update(ComplaintPhoto complaintPhoto) {
        return complaintPhoto;
    }

    public ComplaintPhoto fetchOne(Integer idComplaintPhoto) {
        ComplaintPhoto complaintPhoto = new ComplaintPhoto();
        return complaintPhoto;
    }

    public List<ComplaintPhoto> fetchAll() {
        List<ComplaintPhoto> complaintPhotos = new ArrayList<>();
        return complaintPhotos;
    }

    public Boolean delete(Integer idComplaintPhoto) {
        return true;
    }
}
