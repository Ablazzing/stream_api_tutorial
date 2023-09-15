package org.javaacademy.stream_api.theory_part_1;

public class Operator {

    //Функция высшего порядка
    public void call(OperatorAction operatorAction) {
        System.out.println("Оператор начинает звонок");
        operatorAction.action();
        System.out.println("Оператор заканчивает звонок");
    }
}
