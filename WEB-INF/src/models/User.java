package models;

import java.sql.Timestamp;

public class User {
    private Integer userId;
    private String name;
    private String email;
    private String password;
    private String address;
    private Integer coinBalance;
    private String referalCode;
    private String referredBy;
    private Timestamp createdAt;
    private Timestamp updatedAt;

    public Integer getUserId() {
        return userId;
    }
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public Integer getCoinBalance() {
        return coinBalance;
    }
    public void setCoinBalance(Integer coinBalance) {
        this.coinBalance = coinBalance;
    }
    public String getReferalCode() {
        return referalCode;
    }
    public void setReferalCode(String referalCode) {
        this.referalCode = referalCode;
    }
    public String getReferredBy() {
        return referredBy;
    }
    public void setReferredBy(String referredBy) {
        this.referredBy = referredBy;
    }
    public Timestamp getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }
    public Timestamp getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }
}
