package com.ho.study.oop.alice.wonderland;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AliceTests {

    @Test
    @DisplayName("130센치미터인 앨리스의 키가 병 속의 액체를 들이키자 24센치미터 정도로 작아졌다.")
    void testDrinkBeverage() {
        Alice alice = new Alice(130);
        alice.drinkBeverage();

        assertEquals(24, alice.getHeight());
    }

    @Test
    @DisplayName("200센치미터인 앨리스의 키가 병 속의 액체를 들이키자 94센치미터 정도로 작아졌다.")
    void testDrinkBeverage2() {
        Alice alice = new Alice(200);
        alice.drinkBeverage();

        assertEquals(94, alice.getHeight());
    }

    @Test
    @DisplayName("마신 음료수의 양이 마음먹은거보다 적으면 마신만큼만 키가 줄어든다.")
    void testDrinkBeverage3() {
        Alice alice = new Alice(600, new Beverage(100));
        alice.drinkBeverage();

        assertEquals(500, alice.getHeight());
        assertEquals(0, alice.getBeverage().getQuantity());
    }

    @Test
    @DisplayName("앨리스의 키보다 마신양이 많으면 1센치미터가 된다.")
    void testDrinkBeverage4() {
        Alice alice = new Alice(100, new Beverage(150));
        alice.drinkBeverage();

        assertEquals(1, alice.getHeight());
        assertEquals(44, alice.getBeverage().getQuantity());
    }

    @Test
    @DisplayName("키가 130센치미터인 앨리스가 케이크를 먹으면 280센치미터가 된다.")
    void testEatCake() {
        Alice alice = new Alice(130);
        alice.eatCake();

        assertEquals(130 + 150, alice.getHeight());
    }

    @Test
    @DisplayName("키가 50센치미터인 앨리스가 케이크를 먹으면 200센치미터가 된다.")
    void testEatCake2() {
        Alice alice = new Alice(50);
        alice.eatCake();

        assertEquals(200, alice.getHeight());
    }

    @Test
    @DisplayName("케이크를 못 먹으면 키가 크지 않는다.")
    void testEatCake3() {
        Alice alice = new Alice(50, new Cake(0));
        alice.eatCake();

        assertEquals(50, alice.getHeight());
    }
}
