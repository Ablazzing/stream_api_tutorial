package org.javaacademy.stream_api.stream_api;

import java.util.List;

public class IntermediateOperations {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 20, 30);
        System.out.println("Печатаем числа меньше 20");
        numbers.stream()
                //это промежуточная операция
                .filter(number -> number < 20)
                .forEach(number -> System.out.println(number));

    }
}
