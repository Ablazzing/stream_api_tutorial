package org.javaacademy.stream_api.stream_api;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class GroupingTerminalOperations {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 5, 6, 1, 1);
        //Сумма всех элементов стрима
        integers.stream().reduce((a, b) -> a + b)
                .ifPresent(e -> System.out.println(e));

        //Собрать элементы в лист
        List<Integer> collect = integers.stream().collect(Collectors.toList());
        System.out.println(collect);

        //Собрать элементы в сет
        Set<Integer> set = integers.stream().collect(Collectors.toSet());
        System.out.println(set);

        //Собрать элементы в map (количество повторений в листе)
        //1 - 2
        //5 - 1
        //6 - 1
        Map<Integer, Integer> map = integers.stream().collect(
                Collectors.toMap(
                        number -> number,
                        number -> 1,
                        (valuePrev, valueCurrent) -> valuePrev + valueCurrent));
        System.out.println(map);
    }
}
