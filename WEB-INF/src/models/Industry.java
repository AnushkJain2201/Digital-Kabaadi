package models;

import java.sql.Timestamp;

public class Industry {
    private Integer industryId;
    private String name;
    private String description;
    private String contactPerson;
    private String contactEmail;
    private Timestamp createdAt;

    public Integer getIndustryId() {
        return industryId;
    }
    public void setIndustryId(Integer industryId) {
        this.industryId = industryId;
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
    public String getContactPerson() {
        return contactPerson;
    }
    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }
    public String getContactEmail() {
        return contactEmail;
    }
    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }
    public Timestamp getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }    
}
