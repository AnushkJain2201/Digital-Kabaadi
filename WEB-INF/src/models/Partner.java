package models;

import java.sql.Timestamp;

public class Partner {
    private Integer partnerId;
    private String name;
    private String description;
    private Integer discountPercentage;
    private Timestamp createdAt;

    public Integer getPartnerId() {
        return partnerId;
    }
    public void setPartnerId(Integer partnerId) {
        this.partnerId = partnerId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Integer getDiscountPercentage() {
        return discountPercentage;
    }
    public void setDiscountPercentage(Integer discountPercentage) {
        this.discountPercentage = discountPercentage;
    }
    public Timestamp getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }
}
