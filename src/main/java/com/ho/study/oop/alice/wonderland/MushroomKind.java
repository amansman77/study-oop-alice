package com.ho.study.oop.alice.wonderland;

public enum MushroomKind {
    
    RED {
        @Override
        public Mushroom getParts(MixMushroom mushroom) {
            return mushroom.getRedParts();
        }

        @Override
        public Integer grow(Integer height, Integer quantity) {
            return height + quantity;
        }
    }, 
    BLUE {
        @Override
        public Mushroom getParts(MixMushroom mushroom) {
            return mushroom.getBlueParts();
        }

        @Override
        public Integer grow(Integer height, Integer quantity) {
            return height - quantity;
        }
    };

    public abstract Mushroom getParts(MixMushroom mushroom);
    public abstract Integer grow(Integer height, Integer quantity);

}
