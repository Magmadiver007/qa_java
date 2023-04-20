package com.example;

import java.util.List;

public interface IFeliformia {
    String getFamily();
    int getKittens();
    int getKittens(int kittensCount);
    List<String> getFood(String animalKind) throws Exception;
}
