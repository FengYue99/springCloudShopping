package com.zl.pojo;

/**
 * @author fy
 */
public class Stock {
    private Integer id;
    private Integer goodId;
    private Integer stockNumber;
    private String stockLoc;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGoodId() {
        return goodId;
    }

    public void setGoodId(Integer goodId) {
        this.goodId = goodId;
    }

    public Integer getStockNumber() {
        return stockNumber;
    }

    public void setStockNumber(Integer stockNumber) {
        this.stockNumber = stockNumber;
    }

    public String getStockLoc() {
        return stockLoc;
    }

    public void setStockLoc(String stockLoc) {
        this.stockLoc = stockLoc;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "id=" + id +
                ", goodId=" + goodId +
                ", stockNumber=" + stockNumber +
                ", stockLoc='" + stockLoc + '\'' +
                '}';
    }
}
