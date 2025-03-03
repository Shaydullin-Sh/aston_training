package org.example.stream_api;

import java.util.Arrays;
import java.util.stream.Stream;

public class MainStreamApi2 {
    public static void main(String[] args) {
        Stream.of("a", "b", "c", "d")
                .filter(s -> {
                    System.out.println("Работает фильтр: " + s);
                    return true;
                })
                .map(s -> {
                    System.out.println("Работает map: " + s);
                    return s.toUpperCase();
                })
                .forEach(s -> System.out.println("Работает forEach: " + s));
        //стрим обрабатывает каждый элемент по очереди, а не сразу все элементы
        System.out.println("*******************************************");

        //используем метод parallelStream(), который подключает в работу многопоточку
        //в данном режиме jvm подключает к работе дополнительные ядра процессора
        Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h")
                .parallelStream()
                .filter(s -> {
                    System.out.println(" filter: " + Thread.currentThread().getName());
                    return true;
                })
                .forEach(s -> {
                    System.out.println(" filter: " + Thread.currentThread().getName());
                });
    }
}
