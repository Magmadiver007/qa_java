package com.example;

import com.google.inject.internal.util.ImmutableList;

public class TestData {
    public static final String CAT_SOUND = "Мяу";
    public static final ImmutableList<String> PREDATOR_FOOD = ImmutableList.of("Животные", "Птицы", "Рыба");
    public static final int EXPECTED_KITTENS_DEFAULT = 1;
    public static final int EXPECTED_KITTENS_CUSTOM = 5;
    public static final String FAMILY = "Кошачьи";
    public static final String PREDATOR = "Хищник";
    public static final String ERROR_MESSAGE_FOR_LION = "Используйте допустимые значения пола животного - самец или самка";
}
