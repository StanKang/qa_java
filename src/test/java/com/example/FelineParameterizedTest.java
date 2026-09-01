package com.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class FelineParameterizedTest {

    Feline feline = new Feline();

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5})
    void getKittens(int count) {
        assertEquals(count, feline.getKittens(count));
    }
}
