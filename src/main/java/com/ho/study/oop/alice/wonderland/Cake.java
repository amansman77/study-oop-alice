package com.ho.study.oop.alice.wonderland;

public class Cake {

    private static final Integer QUANTITY_OF_PIECE = 8;

    private Integer quantity;

    public Cake() {
        this.quantity = QUANTITY_OF_PIECE;
    }

    public Cake(Integer quantity) {
        this.quantity = quantity;
    }

    public Boolean eaten() {
        if (this.quantity > 0) {
            quantity--;
            return Boolean.TRUE;
        } else {
            return Boolean.FALSE;
        }

    }

}
