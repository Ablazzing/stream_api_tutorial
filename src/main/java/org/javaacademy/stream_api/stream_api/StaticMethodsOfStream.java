package org.javaacademy.stream_api.stream_api;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StaticMethodsOfStream {
    public static void main(String[] args) {
        //Получить стрим из элементов
        Stream.of(1, 2, 3, 4).forEach(e -> System.out.println(e));
        System.out.println();

        //Распечатать элементы от 1 до 100
        AtomicInteger number = new AtomicInteger(0);
        Stream.generate(number::incrementAndGet).limit(100).forEach(e -> System.out.println(e));
        IntStream.range(1, 101).forEach(e -> System.out.println(e));
        System.out.println();

        //Объединение стримов
        Stream<Integer> integerStream = Stream.of(1, 2, 3);
        Stream<Integer> integerStream2 = Stream.of(4, 5);

        Stream.concat(integerStream, integerStream2).forEach(e -> System.out.println(e));
    }
}
