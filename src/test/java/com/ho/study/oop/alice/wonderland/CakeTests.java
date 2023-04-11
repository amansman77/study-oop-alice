package com.ho.study.oop.alice.wonderland;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("케이크는 행동한다.")
public class CakeTests {

    @Test
    @DisplayName("케이크를 먹는다.")
    void testEaten() {
        Cake cake = new Cake();
        Boolean isEaten = cake.eaten();

        assertTrue(isEaten);
    }

    @Test
    @DisplayName("케이크를 못 먹는다.")
    void testEaten2() {
        Cake cake = new Cake(0);
        Boolean isEaten = cake.eaten();

        assertFalse(isEaten);
    }
}
