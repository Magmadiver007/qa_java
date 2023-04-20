package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static com.example.TestData.*;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class TestCat {
    @Spy
    public Feline feline;
//    Feline feline = new Feline();

    private Cat cat;
    @Before
    public void setUp () {
        cat = new Cat(feline);
    }
    @Test
    public void getRealSoundReturnMeow() {
        assertEquals(CAT_SOUND,cat.getSound());
    }

    @Test
    public void getFoodReturnList() throws Exception {
        List<String> food = cat.getFood();
        Mockito.verify(feline, Mockito.times(1)).getFood("Хищник");
        assertEquals(PREDATOR_FOOD,food);
    }
}