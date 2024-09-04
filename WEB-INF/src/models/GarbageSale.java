package models;

import java.util.Date;

public class GarbageSale {
    private Integer saleId;
    private Garbage garbage;
    private Industry industry;
    private Integer saleAmount;
    private Integer coinEarned;
    private Date saleDate;
    
    public Integer getSaleId() {
        return saleId;
    }
    public void setSaleId(Integer saleId) {
        this.saleId = saleId;
    }
    public Garbage getGarbage() {
        return garbage;
    }
    public void setGarbage(Garbage garbage) {
        this.garbage = garbage;
    }
    public Industry getIndustry() {
        return industry;
    }
    public void setIndustry(Industry industry) {
        this.industry = industry;
    }
    public Integer getSaleAmount() {
        return saleAmount;
    }
    public void setSaleAmount(Integer saleAmount) {
        this.saleAmount = saleAmount;
    }
    public Integer getCoinEarned() {
        return coinEarned;
    }
    public void setCoinEarned(Integer coinEarned) {
        this.coinEarned = coinEarned;
    }
    public Date getSaleDate() {
        return saleDate;
    }
    public void setSaleDate(Date saleDate) {
        this.saleDate = saleDate;
    }

    
}
