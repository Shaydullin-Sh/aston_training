package org.example.stream_api;

import java.util.stream.IntStream;

public class MainStreamApi4 {
    public static void main(String[] args) {
        IntStream intStream1 = IntStream.rangeClosed(1, 10);
        IntStream intStream2 = IntStream.rangeClosed(11, 20);
        IntStream intStream3 = IntStream.concat(intStream1, intStream2);

        intStream3
                .filter(i -> i > 10)
                .forEach(System.out::println);
    }
}
