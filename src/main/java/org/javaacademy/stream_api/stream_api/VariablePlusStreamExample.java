package org.javaacademy.stream_api.stream_api;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Работа с внешними переменными через стрим
 */
public class VariablePlusStreamExample {
    public static void main(String[] args) {
        //Сумма чисел
        List<Integer> integers = List.of(1, 2, 3);
        AtomicInteger sum = new AtomicInteger();
        integers.stream().forEach(e -> sum.addAndGet(e));
        System.out.println(sum.get());
        System.out.println();

        //Конкатенация строк
        List<String> strings = List.of("a", "b", "c");
        StringBuffer text = new StringBuffer();
        strings.stream().forEach(e -> {
            text.append(e);
        });

        System.out.println(text);
    }
}
