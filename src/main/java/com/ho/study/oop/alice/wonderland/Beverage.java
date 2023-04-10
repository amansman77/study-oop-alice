package com.ho.study.oop.alice.wonderland;

public class Beverage {

    private Integer quantity;

    public Beverage(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer drunken(Integer quantity) {
        if (this.quantity < quantity) {
            Integer tmpQuantity = this.quantity;
            this.quantity = 0;
            return tmpQuantity;
        } else {
            this.quantity -= quantity;
            return quantity;
        }
    }

    public Integer getQuantity() {
        return this.quantity;
    }

}
