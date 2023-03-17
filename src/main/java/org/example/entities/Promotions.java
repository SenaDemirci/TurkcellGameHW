package org.example.entities;

public class Promotions {
    private int id;
    private String promotionDescription;
    private Double discountRate;

    public Promotions() {
    }

    public Promotions(int id, String promotionDescription, Double discountRate) {
        this.id = id;
        this.promotionDescription = promotionDescription;
        this.discountRate = discountRate;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPromotionDescription() {
        return promotionDescription;
    }

    public void setPromotionDescription(String promotionDescription) {
        this.promotionDescription = promotionDescription;
    }

    public Double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(Double discountRate) {
        this.discountRate = discountRate;
    }
}
