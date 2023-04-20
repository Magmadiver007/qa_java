package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;


import static com.example.TestData.*;
import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class TestLion {

    private final String lionSex;
    private final Boolean isMane;
    private static Lion lion;
    public TestLion(String lionSex, Boolean isMane) {
        this.lionSex = lionSex;
        this.isMane = isMane;
    }

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
    @Parameterized.Parameters
    public static Object[][] getSexVariants() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false},
                {"Неизвестен", null},
        };
    }
    @Mock
   IFeliformia feline;


    @Test
    public void testGetKittensExpectedOne() throws Exception {

        try {
            lion = new Lion(lionSex, feline);
            Mockito.when(feline.getKittens()).thenReturn(KITTENS_DEFAULT);
            assertEquals("Ожидалось иное количество котят", KITTENS_DEFAULT, lion.getKittens());
        } catch (Exception exception) {
            System.out.println(exception);
        }

    }


    @Test
    public void testDoesHaveManeExpectedBoolean() {
        try {
            lion = new Lion(lionSex, feline);
            assertEquals("Грива не соответствует полу", isMane, lion.doesHaveMane());
        } catch (Exception exception) {
            System.out.println(exception);
        }
    }


    @Test
    public void testGetFoodExpectedPredatorFood() throws Exception {
        try {
            lion = new Lion(lionSex, feline);
            Mockito.when(feline.getFood(PREDATOR)).thenReturn(PREDATOR_FOOD);
            assertEquals("Ожидался иной набор еды", PREDATOR_FOOD, lion.getFood());
        } catch (Exception exception) {
            System.out.println(exception);
        }


    }
}