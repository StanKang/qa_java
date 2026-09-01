package com.example;

import java.util.List;

public class Alex extends Lion {

    private final String name = "Алекс";

    public Alex(Feline feline) throws Exception {
        super("Самец", feline);
    }

    public String getName() {
        return name;
    }

    @Override
    public int getKittens() {
        return 0;
    }

    public List<String> getFood() throws Exception {
        return List.of("Стейк", "Суши", "Стейк из рыбы");
    }

    public List<String> getFriends() {
        return List.of("Марти", "Глория", "Мелман");
    }

    public String getPlaceOfLiving() {
        return "Нью-Йоркский зоопарк";
    }
}
