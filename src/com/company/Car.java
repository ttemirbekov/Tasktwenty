package com.company;

import java.io.IOException;
import java.sql.SQLOutput;

public class Car implements AutoCloseable{

    public void drive() {
        System.out.println("Car is going");
    }
    @Override
    public  void close(){
        System.out.println("Car is closing");
    }
}

