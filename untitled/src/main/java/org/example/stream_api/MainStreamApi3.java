package org.example.stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.lang.System.out;

public class MainStreamApi3 {
    public static void main(String[] args) {
        List<Integer> integerList = IntStream.rangeClosed(1, 100) //создаём поток чисел от 1 до 100
                .boxed() //преобразуем IntStream в Stream<Integer>
                .collect(Collectors.toCollection(ArrayList::new)); //Создаём и добавляем все числа в ArrayList

        integerList.stream()
                .filter(i -> i % 2 == 0) // отфильтровываем числа на чётные
                .forEach(out::println); // выводим в консоль отфильтрованные числа

    }
}
