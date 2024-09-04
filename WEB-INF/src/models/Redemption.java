package models;

import java.sql.Timestamp;

public class Redemption {
    private Integer redemptionId;
    private User user;
    private Partner partner;
    private Integer coinSpent;
    private Timestamp createdAt;

    public Integer getRedemptionId() {
        return redemptionId;
    }
    public void setRedemptionId(Integer redemptionId) {
        this.redemptionId = redemptionId;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public Partner getPartner() {
        return partner;
    }
    public void setPartner(Partner partner) {
        this.partner = partner;
    }
    public Integer getCoinSpent() {
        return coinSpent;
    }
    public void setCoinSpent(Integer coinSpent) {
        this.coinSpent = coinSpent;
    }
    public Timestamp getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }
}
