package org.example.SortArray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSort {
    public static List<Integer> sortCollInt(int[] arr){
        List<Integer> listInt = new ArrayList<>();
        for(Integer i : arr){
            listInt.add(i);
        }
        Collections.sort(listInt);
        return listInt;
    }
}
