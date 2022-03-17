package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Car car = new Car()) {
            car.drive();
        } catch (Exception e) {
            throw e;
        }
    }
}

