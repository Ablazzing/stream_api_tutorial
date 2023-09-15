package org.javaacademy.stream_api;


import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Stream;

public class Example {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Circle circle1 = new Circle("purple");
        Circle circle2 = new Circle("purple");
        Circle circle3 = new Circle("purple");
        List<Circle> circles = List.of(circle1, circle2, circle3);

//        for (Circle circle : circles) {
//            circle.setColor("yellow");
//        }

        Stream<Circle> stream = circles.parallelStream();

        stream.forEach(circle -> circle.setColor("yellow"));

        System.out.println(circles);

        long end = System.currentTimeMillis();
        System.out.println( (end - start) / 1000);
    }
}
