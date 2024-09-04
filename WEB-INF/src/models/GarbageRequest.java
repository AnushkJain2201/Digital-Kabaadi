package models;

import java.sql.Timestamp;

public class GarbageRequest {
    private Integer requestId;
    private Garbage garbage;
    private Admin admin;
    private Timestamp createdAt;

    public Integer getRequestId() {
        return requestId;
    }
    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }
    public Garbage getGarbage() {
        return garbage;
    }
    public void setGarbage(Garbage garbage) {
        this.garbage = garbage;
    }
    public Admin getAdmin() {
        return admin;
    }
    public void setAdmin(Admin admin) {
        this.admin = admin;
    }
    public Timestamp getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }
}
