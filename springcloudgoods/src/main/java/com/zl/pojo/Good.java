package com.zl.pojo;

/**
 * @author fy
 */
public class Good {
    private Integer id;
    private String goodName;
    private String goodId;
    private Integer goodPrice;
    private Integer goodType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public String getGoodId() {
        return goodId;
    }

    public void setGoodId(String goodId) {
        this.goodId = goodId;
    }

    public Integer getGoodPrice() {
        return goodPrice;
    }

    public void setGoodPrice(Integer goodPrice) {
        this.goodPrice = goodPrice;
    }

    public Integer getGoodType() {
        return goodType;
    }

    public void setGoodType(Integer goodType) {
        this.goodType = goodType;
    }

    @Override
    public String toString() {
        return "Good{" +
                "id=" + id +
                ", goodName='" + goodName + '\'' +
                ", goodId='" + goodId + '\'' +
                ", goodPrice=" + goodPrice +
                ", goodType=" + goodType +
                '}';
    }
}
