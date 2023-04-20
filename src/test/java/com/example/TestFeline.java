package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import static com.example.TestData.*;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class TestFeline {

    @Spy
    private Feline feline;
    //Feline feline = new Feline();

    @Test
    public void testEatMeatExpectedPredatorFoodList() throws Exception {

        assertEquals(PREDATOR_FOOD, feline.eatMeat());
    }

    @Test
    public void testGetFamilyExpectedFeline() {
        assertEquals(FAMILY, feline.getFamily());
    }

    @Test
    public void testGetKittensExpectedOne() {
        int expectedResult = KITTENS_DEFAULT;
        int actualResult = feline.getKittens();
        Mockito.verify(feline).getKittens(KITTENS_DEFAULT);
        assertEquals("Количество котят которое должно вернуться: "+KITTENS_DEFAULT,expectedResult, actualResult);
    }

    @Test
    public void testGetKittensExpectedSendedValue() {
        int expectedResult = KITTENS_CUSTOM;
        int actualResult = feline.getKittens(KITTENS_CUSTOM);
        assertEquals("Количество котят которое должно вернуться: "+KITTENS_CUSTOM,expectedResult, actualResult);
    }
}