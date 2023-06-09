package com.ho.study.oop.alice.wonderland;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("앨리스는 행동한다.")
public class AliceTests {

    @Nested
    @DisplayName("앨리스는 음료수를 마신다.")
    class testDrinkBeverage {
        
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
    }

    @Nested
    @DisplayName("앨리스는 케이크를 먹는다.")
    class testEatCake {
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

    @Nested
    @DisplayName("앨리스는 부채질을 한다.")
    class testFanning {

        @Test
        @DisplayName("키가 130센치미터인 앨리스가 부채질을 하면 110센치미터가 된다.")
        void testFanning()  {
            Alice alice = new Alice(130);
            alice.fanning();

            assertEquals(110, alice.getHeight());
        }

        @Test
        @DisplayName("키가 100센치미터인 앨리스가 부채질을 하면 80센치미터가 된다.")
        void testFanning2() {
            Alice alice = new Alice(100);
            alice.fanning();

            assertEquals(80, alice.getHeight());
        }

        @Test
        @DisplayName("부채질을 계속해도 앨리스의 키는 1센치미터보다 작아지지 않는다.")
        void testFanning3() {
            Alice alice = new Alice(19);
            alice.fanning();

            assertEquals(1, alice.getHeight());
        }
    }

    @Nested
    @DisplayName("앨리스는 버섯을 먹는다.")
    class testEatMushroom {

        @Test
        @DisplayName("키가 130센치미터인 앨리스가 버섯의 붉은색 부분을 먹으면 140센치미터가 된다.")
        void testEatMushroom() {
            Alice alice = new Alice(130);
            alice.eatMushroom(MushroomKind.RED);

            assertEquals(140, alice.getHeight());
        }

        @Test
        @DisplayName("키가 50센치미터인 앨리스가 버섯의 붉은색 부분을 먹으면 60센치미터가 된다.")
        void testEarMushroom2() {
            Alice alice = new Alice(50);
            alice.eatMushroom(MushroomKind.RED);

            assertEquals(60, alice.getHeight());
        }

        @Test
        @DisplayName("버섯의 붉은색 부분을 못 먹는다.")
        void testEarMushroom3() {
            Alice alice = new Alice(50, new MixMushroom(0, 0));
            alice.eatMushroom(MushroomKind.RED);

            assertEquals(50, alice.getHeight());
        }

        @Test
        @DisplayName("키가 130센치미터인 앨리스가 버섯의 푸른색 부분을 먹으면 120센치미터가 된다.")
        void testEatMushroom4() {
            Alice alice = new Alice(130);
            alice.eatMushroom(MushroomKind.BLUE);

            assertEquals(120, alice.getHeight());
        }

        @Test
        @DisplayName("버섯의 푸른색 부분을 못 먹는다.")
        void testEarMushroom5() {
            Alice alice = new Alice(50, new MixMushroom(0, 0));
            alice.eatMushroom(MushroomKind.BLUE);

            assertEquals(50, alice.getHeight());
        }
    }

    @Nested
    @DisplayName("앨리스는 문을 통과한다.")
    class passDoor {

        @Test
        @DisplayName("키가 40센치미터인 앨리스는 문을 통과한다.")
        void passDoor() {
            Alice alice = new Alice(40);
            alice.passDoor();

            assertEquals(AlicePosition.GARDEN, alice.getPosition());
        }

        @Test
        @DisplayName("키가 130센치미터인 앨리스는 문을 통과하지 못한다.")
        void passDoor2() {
            Alice alice = new Alice(130);
            alice.passDoor();

            assertEquals(AlicePosition.PATH, alice.getPosition());
        }
    }
}
