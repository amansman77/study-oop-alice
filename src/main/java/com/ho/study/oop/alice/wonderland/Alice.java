package com.ho.study.oop.alice.wonderland;

public class Alice {

    private static final Integer QUANTITY_OF_DRINK_INIT = 5000;
    private static final Integer QUANTITY_OF_DRINK_ONCE = 106;

    private static final Integer QUANTITY_OF_HEIGHT_AFTER_EAT_CAKE = 150;

    private Integer height;
    private Beverage beverage;
    private Cake cake;

    public Alice(Integer height) {
        this(height, new Beverage(QUANTITY_OF_DRINK_INIT), new Cake());
    }

    public Alice(Integer height, Beverage beverage) {
        this(height, beverage, new Cake());
    }

    public Alice(Integer height, Beverage beverage, Cake cake) {
        this.height = height;
        this.beverage = beverage;
        this.cake = cake;
    }

    public Alice(Integer height, Cake cake) {
        this(height, new Beverage(QUANTITY_OF_DRINK_INIT), cake);
    }

    public void drinkBeverage() {
        Integer drunkenQuantity = this.beverage.drunken(QUANTITY_OF_DRINK_ONCE);
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

    public void eatCake() {
        Boolean isEaten = this.cake.eaten();
        if (isEaten) {
            this.height += QUANTITY_OF_HEIGHT_AFTER_EAT_CAKE;
        }
    }

}