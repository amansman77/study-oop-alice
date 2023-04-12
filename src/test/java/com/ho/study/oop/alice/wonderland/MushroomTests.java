package com.ho.study.oop.alice.wonderland;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("버섯은 행동한다.")
public class MushroomTests {

    @Test
    @DisplayName("버섯을 먹는다.")
    void testEaten() {
        Mushroom mushroom = new Mushroom(5);
        mushroom.eaten();

        assertEquals(4, mushroom.getPieces());
    }

    @Test
    @DisplayName("버섯을 못 먹는다.")
    void testEaten2() {
        Mushroom mushroom = new Mushroom(0);
        Boolean isEaten = mushroom.eaten();

        assertFalse(isEaten);
        assertEquals(0, mushroom.getPieces());
    }
}
