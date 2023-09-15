package org.javaacademy.stream_api.theory_part_1;


import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Example {
    public static void main(String[] args) {
        //Проверка на возраст
        Predicate<Integer> isAdult = (age) -> age > 17;
        boolean result = isAdult.test(30);
        //System.out.println(result);

        //Покупка в автомате напитка
        Function<Integer, String> automate = (money) -> {
            if (money == 100) {
                return "Cola";
            } else if (money == 50) {
                return "Water";
            } else {
                return "Nothing";
            }
        };
        //System.out.println(automate.apply(100));

        //Костер
        Consumer<String> fire = (item) -> {
            if (item.equals("дрова")) {
                System.out.println("Горит долго огонь");
            } else if (item.equals("бумага")) {
                System.out.println("Горит ярко огонь");
            }
        };
        //fire.accept("дрова");

        //Талоны в очереди
        Supplier<Integer> talons = () -> new Random().nextInt(100);
        System.out.println("Ваш номер:" +  talons.get());



    }


}
