package org.javaacademy.stream_api.stream_api;

public class Car {
    private int fuel;

    public Car(int fuel) {
        this.fuel = fuel;
    }

    public void start() throws Exception {
        if (fuel < 1) {
            throw new Exception("Нет бензина!");
        }
    }

}
