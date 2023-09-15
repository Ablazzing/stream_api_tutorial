package org.javaacademy.stream_api;

public class HighOrderFunctionExample {
    public static void main(String[] args) {
        Operator operator = new Operator();
        OperatorAction creditCardAction = () -> System.out.println("Оператор спрашивает: хотите ли вы приобрести кредитную карту?");
        OperatorAction phoneChangeAction = () -> System.out.println("Оператор спрашивает: хотите ли вы поменять тариф сотовой связи?");
        OperatorAction socialAction = () -> {
            System.out.println("Оператор спрашивает: Вопрос №1 сколько вам лет?");
            System.out.println("Оператор спрашивает: Вопрос №2 любите ли вы собак?");
        };
        operator.call(creditCardAction);
        operator.call(phoneChangeAction);
        operator.call(socialAction);
    }
}
