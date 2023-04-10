package com.ho.study.oop.alice.wonderland;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BeverageTests {

    @Test
    @DisplayName("음료수를 완전히 마신다.")
    void testDrunken() {
        Beverage beverage = new Beverage(50);
        Integer drunkenQuantity = beverage.drunken(50);

        assertEquals(50, drunkenQuantity);
    }

    @Test
    @DisplayName("음료수를 더 마시고 싶다.")
    void testDrunken2() {
        Beverage beverage = new Beverage(50);
        Integer drunkenQuantity = beverage.drunken(60);

        assertEquals(50, drunkenQuantity);
    }
}
