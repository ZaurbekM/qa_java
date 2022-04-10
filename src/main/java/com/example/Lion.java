package com.example;

import java.util.List;

public class Lion extends Feline {

    boolean hasMane;

    public Lion(String sex) throws Exception {
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самей или самка");
        }
    }
    public boolean doesHaveMane() {
        return hasMane;
    }
    @Override
    public int getKittens()  {
        return super.getKittens();
    }
    public List<String> getFood() throws Exception {
        return getFood("Хищник");
    }

}
