package com.example;

import org.junit.Test;
import static com.example.TestData.ERROR_MESSAGE_FOR_LION;
import static org.junit.Assert.assertEquals;


public class TestLionSex{
    private static Lion lion;
    private String errorMessage;


    Feline feline = new Feline();

    @Test
    public void testDoesHaveManeExpectedException() {
        try {
            lion = new Lion("Неизвестен", feline);
        } catch (Exception exception) {
            errorMessage = exception.getMessage();
        } finally {
            assertEquals("Ожидается ошибка", ERROR_MESSAGE_FOR_LION,errorMessage);
        }
    }
}
