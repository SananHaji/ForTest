package com.company.di;

public class Car {
    private String car_type;
    private Engine engine;

    public Car(String car_type, Engine engine) {
        this.car_type = car_type;
        this.engine = engine;
    }

    public String getCar_type() {
        return car_type;
    }

    public Engine getEngine() {
        return engine;
    }
}
