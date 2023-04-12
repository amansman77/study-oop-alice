package com.ho.study.oop.alice.wonderland;

public class Alice {

    private static final Integer QUANTITY_OF_DRINK_INIT = 5000;
    private static final Integer QUANTITY_OF_DRINK_ONCE = 106;
    private static final Integer QUANTITY_OF_EAT_CAKE_ONCE = 150;
    private static final Integer QUANTITY_OF_FANNING_ONCE = 20;
    private static final Integer QUANTITY_OF_EAT_MUSHROOM_ONCE = 10;

    private Integer height;
    private AlicePosition position;

    private Beverage beverage;
    private Cake cake;
    private MixMushroom mushroom;
    private Door door;

    public Alice(Integer height) {
        this(height, new Beverage(QUANTITY_OF_DRINK_INIT), new Cake(), new MixMushroom(), new Door());
    }

    public Alice(Integer height, Beverage beverage) {
        this(height, beverage, new Cake());
    }

    public Alice(Integer height, Beverage beverage, Cake cake) {
        this(height, beverage, cake, new MixMushroom());
    }

    public Alice(Integer height, Beverage beverage, Cake cake, MixMushroom mushroom) {
        this(height, beverage, cake, mushroom, new Door());
    }

    public Alice(Integer height, Beverage beverage, Cake cake, MixMushroom mushroom, Door door) {
        this.height = height;
        this.position = AlicePosition.PATH;

        this.beverage = beverage;
        this.cake = cake;
        this.mushroom = mushroom;
        this.door = door;
    }
    
    public Alice(Integer height, Cake cake) {
        this(height, new Beverage(QUANTITY_OF_DRINK_INIT), cake);
    }

    public Alice(Integer height, MixMushroom mushroom) {
        this(height, new Beverage(QUANTITY_OF_DRINK_INIT), new Cake(), mushroom);
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
            this.height += QUANTITY_OF_EAT_CAKE_ONCE;
        }
    }

    public void fanning() {
        if (this.height <= QUANTITY_OF_FANNING_ONCE) {
            this.height = 1;
        } else {
            this.height -= QUANTITY_OF_FANNING_ONCE;
        }
    }

    public void eatMushroom(MushroomKind mushroomKind) {
        Mushroom mushroom = mushroomKind.getParts(this.mushroom);
        Boolean isEaten = mushroom.eaten();
        if (isEaten) {
            this.height = mushroomKind.grow(this.height, QUANTITY_OF_EAT_MUSHROOM_ONCE);
        }
    }

    public void passDoor() {
        Boolean isAccept = this.door.accept(this.height);
        if (isAccept) {
            this.position = AlicePosition.GARDEN;
        }
    }

    public AlicePosition getPosition() {
        return this.position;
    }

}