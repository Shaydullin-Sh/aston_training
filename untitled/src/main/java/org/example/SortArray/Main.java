package org.example.SortArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 6, 0, -5, 7, 145, -9, -3, 99, 11};
        //сортировка пузырьком
        SortBubbles.sortBubbles(arr);
        System.out.println(Arrays.toString(arr));

        //использование класса Collections и его метода sort(есть необходимость преобразования массива в коллекцию)
        int[] arr2 = {5, 0, 0, -15, 177, 145, -92, -43, 299, 411};
        List<Integer> intList = CollectionSort.sortCollInt(arr2);
        System.out.println(intList);

        //использование вспомогательного класса Arrays и его метода parallelSort
        int[] arr3 = {85, -6, 40, -53, 74, -145, 49, -3, 919, 311};
        Arrays.parallelSort(arr3);
        System.out.println(Arrays.toString(arr));

        //использование StreamAPI
        int[] arr4 = {2, -6, 3, -99, 73, 45, -999, -43, 88, 1};
        int[] sortStreamAPI = Arrays.stream(arr4)
                .sorted()
                .toArray();
        System.out.println(Arrays.toString(sortStreamAPI));
        List<Integer> listInt = new ArrayList<>();
    }
}
