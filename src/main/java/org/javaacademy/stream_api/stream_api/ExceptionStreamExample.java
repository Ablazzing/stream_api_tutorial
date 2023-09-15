package org.javaacademy.stream_api.stream_api;

import java.util.List;

public class ExceptionStreamExample {
    public static void main(String[] args) {
        //Работа с методом у которого в сигнатуре checked Exception
        List<Car> cars = List.of(new Car(0));
        cars.stream().forEach(car -> {
            try {
                car.start();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
    }
}
