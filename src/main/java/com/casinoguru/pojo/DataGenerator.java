package com.casinoguru.pojo;

import com.github.javafaker.Faker;

public class DataGenerator {
    static DataGenerator dataGenerator = null;

   public Faker faker;
    private DataGenerator(){
        faker = new Faker();
    }

    public static DataGenerator getInstance() {
        if(dataGenerator==null){
            dataGenerator = new DataGenerator();
        }
        return dataGenerator;
    }
}
