package org.javaacademy.stream_api.theory_part_1;

public class Circle {
    private String color;

    public Circle(String color) {
        this.color = color;
    }

    //Красим круг
    public void setColor(String color) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "color='" + color + '\'' +
                '}';
    }
}
