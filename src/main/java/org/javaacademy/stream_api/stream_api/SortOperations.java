package org.javaacademy.stream_api.stream_api;

import java.util.Comparator;
import java.util.List;

public class SortOperations {
    public static void main(String[] args) {
        //Сортировка элементов
        List<Integer> integers = List.of(5, 4, 0, 1);
        integers.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
        System.out.println();

        Student petr = new Student(29, "Petr");
        Student yuri = new Student(25, "Yuri");
        Student ivan = new Student(27, "Ivan");
        //Сортировка элементов
        List<Student> students = List.of(petr, yuri, ivan);
        students.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(student -> System.out.println(student));
    }
}
