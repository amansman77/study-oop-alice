package com.ho.study.oop.alice.wonderland;

public class Mushroom {

    private static final Integer QUANTITY_OF_PARTS_INIT = 5;

    private Integer pieces;

    public Mushroom() {
        this.pieces = QUANTITY_OF_PARTS_INIT;
	}

    public Mushroom(Integer pieces) {
        this.pieces = pieces;
    }

	public Integer getPieces() {
        return this.pieces;
    }

    public Boolean eaten() {
        if (this.pieces > 1) {
            this.pieces--;
            return Boolean.TRUE;
        } else {
            return Boolean.FALSE;
        }
    }

}
