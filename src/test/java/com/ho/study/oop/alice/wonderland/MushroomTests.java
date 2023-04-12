package com.ho.study.oop.alice.wonderland;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
}
