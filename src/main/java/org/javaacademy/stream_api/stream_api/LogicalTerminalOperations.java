package org.javaacademy.stream_api.stream_api;

import java.util.List;

public class LogicalTerminalOperations {
    public static void main(String[] args) {
        List<Integer> integers = List.of(4, 8, 2);
        System.out.println("Наш лист: " + integers);

        //Есть ли хотя бы один элемент со значением 8
        boolean anyMatch = integers.stream().anyMatch(integer -> integer == 8);
        System.out.println("Есть ли хотя бы один элемент со значением 8: " + anyMatch);

        //Все элементы меньше 10
        boolean allMatch = integers.stream().allMatch(integer -> integer < 10);
        System.out.println("Все элементы меньше 10: " + allMatch);

        //Ни один элемент ни меньше 0
        boolean noneMatch = integers.stream().noneMatch(integer -> integer < 0);
        System.out.println("Ни один элемент ни меньше 0: " + noneMatch);
    }
}
