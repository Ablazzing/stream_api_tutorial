package org.javaacademy.stream_api.stream_api;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.stream.Stream;

public class MethodReferenceExample {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        //FactoryBrick.createBrick();
        Class<FactoryBrick> factoryBrickClass = FactoryBrick.class;
        Method method = factoryBrickClass.getMethods()[0];
        method.invoke(FactoryBrick.class, null);

        //Ссылка на метод
        Stream.of(1,2,3).forEach(System.out::println);
    }
}
