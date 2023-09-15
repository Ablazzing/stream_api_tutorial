package org.javaacademy.stream_api;

public class Operator {

    //Функция высшего порядка
    public void call(OperatorAction operatorAction) {
        System.out.println("Оператор начинает звонок");
        operatorAction.action();
        System.out.println("Оператор заканчивает звонок");
    }
}
