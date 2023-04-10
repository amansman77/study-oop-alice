package com.ho.study.oop.alice.wonderland;

public class Alice {

    private static final Integer QUANTITY_OF_DRINK_INIT = 5000;
    private static final Integer QUANTITY_OF_DRINK_ONCE = 106;

    private Integer height;
    private Beverage beverage;

    public Alice(Integer height) {
        this(height, new Beverage(QUANTITY_OF_DRINK_INIT));
    }

    public Alice(Integer height, Beverage beverage) {
        this.height = height;
        this.beverage = beverage;
    }

    public void drinkBeverage() {
        Integer drunkenQuantity = beverage.drunken(QUANTITY_OF_DRINK_ONCE);
        if (this.height <= drunkenQuantity) {
            this.height = 1;
        } else {
            this.height = this.height - drunkenQuantity;
        }
    }

    public Integer getHeight() {
        return this.height;
    }

    public Beverage getBeverage() {
        return this.beverage;
    }

}