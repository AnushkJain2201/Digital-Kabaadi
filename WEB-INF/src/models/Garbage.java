package models;

import java.util.Date;
import java.sql.Timestamp;

public class Garbage {
    private int garbageId;
    private User user;
    private String garbageType;
    private Integer quantity;
    private Date pickupDate;
    private String status;
    private Timestamp createdAt;

    public int getGarbageId() {
        return garbageId;
    }
    public void setGarbageId(int garbageId) {
        this.garbageId = garbageId;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public String getGarbageType() {
        return garbageType;
    }
    public void setGarbageType(String garbageType) {
        this.garbageType = garbageType;
    }
    public Integer getQuantity() {
        return quantity;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    public Date getPickupDate() {
        return pickupDate;
    }
    public void setPickupDate(Date pickupDate) {
        this.pickupDate = pickupDate;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public Timestamp getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }
}
