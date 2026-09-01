package com.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FelineTest {

    Feline feline = new Feline();

    @Test
    void eatMeat_returnsMeatFood() throws Exception {
        assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    void getFamily_returnsCats() {
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    void getKittens_returnsOne() {
        assertEquals(1, feline.getKittens());
    }

    @Test
    void getKittens_withCount_returnsCount() {
        assertEquals(3, feline.getKittens(3));
    }
}
