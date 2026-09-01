package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class AlexTest {

    @Mock
    Feline feline;

    @Test
    void getName_returnsAlex() throws Exception {
        Alex alex = new Alex(feline);
        assertEquals("Алекс", alex.getName());
    }

    @Test
    void doesHaveMane_returnsTrue() throws Exception {
        Alex alex = new Alex(feline);
        assertTrue(alex.doesHaveMane());
    }

    @Test
    void getKittens_returnsZero() throws Exception {
        Alex alex = new Alex(feline);
        assertEquals(0, alex.getKittens());
    }

    @Test
    void getFood_returnsZooFood() throws Exception {
        Alex alex = new Alex(feline);
        assertEquals(List.of("Стейк", "Суши", "Стейк из рыбы"), alex.getFood());
    }

    @Test
    void getFriends_returnsFriends() throws Exception {
        Alex alex = new Alex(feline);
        assertEquals(List.of("Марти", "Глория", "Мелман"), alex.getFriends());
    }

    @Test
    void getPlaceOfLiving_returnsZoo() throws Exception {
        Alex alex = new Alex(feline);
        assertEquals("Нью-Йоркский зоопарк", alex.getPlaceOfLiving());
    }
}
