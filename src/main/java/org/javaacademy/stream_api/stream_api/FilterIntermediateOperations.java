package org.javaacademy.stream_api.stream_api;

import java.util.List;

public class FilterIntermediateOperations {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(5, 0, 10, 10);
        //Фильтрация элементов по условию
        System.out.println("Оставить только элементы равные 0");
        numbers.stream()
                .filter(e -> e == 0)
                .forEach(e -> System.out.print(e + " "));
        System.out.println();

        System.out.println("Удалить дубликаты");
        numbers.stream()
                .distinct()
                .forEach(e -> System.out.print(e + " "));
        System.out.println();

        System.out.println("Убрать первый элемент");
        numbers.stream()
                .skip(1)
                .forEach(e -> System.out.print(e + " "));
        System.out.println();

        System.out.println("Оставить первый элемент");
        numbers.stream()
                .limit(1)
                .forEach(e -> System.out.print(e + " "));
        System.out.println();


    }
}
