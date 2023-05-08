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
        int actualResult = feline.getKittens();
        Mockito.verify(feline).getKittens(EXPECTED_KITTENS_DEFAULT);
        assertEquals("Количество котят которое должно вернуться: "+EXPECTED_KITTENS_DEFAULT,EXPECTED_KITTENS_DEFAULT, actualResult);
    }

    @Test
    public void testGetKittensExpectedSendedValue() {
        int actualResult = feline.getKittens(EXPECTED_KITTENS_CUSTOM);
        assertEquals("Количество котят которое должно вернуться: "+EXPECTED_KITTENS_CUSTOM, EXPECTED_KITTENS_CUSTOM, actualResult);

    }
}