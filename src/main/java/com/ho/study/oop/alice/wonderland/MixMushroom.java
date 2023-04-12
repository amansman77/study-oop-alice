package com.ho.study.oop.alice.wonderland;

public class MixMushroom {

    private Mushroom redParts;
    private Mushroom blueParts;

    public MixMushroom() {
        this.redParts = new Mushroom();
        this.blueParts = new Mushroom();
	}

    public MixMushroom(Integer redParts, Integer blueParts) {
        this.redParts = new Mushroom(redParts);
        this.blueParts = new Mushroom(blueParts);
    }

    public Mushroom getRedParts() {
        return this.redParts;
    }

    public Mushroom getBlueParts() {
        return this.blueParts;
    }

}
