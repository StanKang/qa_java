package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class LionTest {

    @Mock
    Feline feline;

    @Test
    void invalidSexThrowsException() {
        assertThrows(Exception.class, () -> new Lion("Неизвестно", feline));
    }

    @Test
    void getFood_returnsMeatFood() throws Exception {
        Lion lion = new Lion("Самец", feline);
        when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));

        assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }

    @Test
    void getKittens_returnsFelinesKittens() throws Exception {
        Lion lion = new Lion("Самка", feline);
        when(feline.getKittens()).thenReturn(2);

        assertEquals(2, lion.getKittens());
    }
}
