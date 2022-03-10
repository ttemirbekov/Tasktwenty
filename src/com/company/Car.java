package com.company;

import java.io.IOException;
import java.sql.SQLOutput;

public class Car implements AutoCloseable{
   private String model;

    public Car(String model) {
        this.model = model;
    }

    public void close() {
        System.out.println("Car is closing");
    }
    public void drive(){
        System.out.println("Car is going");
    }

}
