package org.javaacademy.stream_api.stream_api;

import java.util.List;

/**
 * Промежуточные преобразующие операции
 */
public class TransformOperations {
    public static void main(String[] args) {
        Student petr = new Student(20, "Petr");
        Student yuri = new Student(25, "Yuri");
        Student ivan = new Student(27, "Ivan");

        List<Student> students = List.of(petr, yuri, ivan);
        //Получить возраст каждого студента и распечатать
        students.stream()
                .map(student -> student.getAge())
                .forEach(e -> System.out.println(e));
        System.out.println();

        //Поменять имя студента и распечатать
        students.stream()
                .peek(e -> System.out.println(e))
                .peek(student -> student.setName("Mr. " + student.getName()))
                .forEach(student -> System.out.println(student));
        System.out.println();

        //Преобразование элементов стрима в плоскую структуру (раскрытие листов)
        List<Integer> list1 = List.of(1, 2, 3);
        List<Integer> list2 = List.of(4, 5);
        List<Integer> list3 = List.of(6);
        List<List<Integer>> lists = List.of(list1, list2, list3);

        lists.stream()
                .flatMap(e -> e.stream())
                .forEach(e -> System.out.println(e));

    }
}
