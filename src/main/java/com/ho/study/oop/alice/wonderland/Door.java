package com.ho.study.oop.alice.wonderland;

public class Door {

    private static final Integer HEIGHT_OF_DOOR = 40;

    public Boolean accept(Integer height) {
        if (height <= HEIGHT_OF_DOOR) {
            return Boolean.TRUE;
        } else {
            return Boolean.FALSE;
        }
    }

}
