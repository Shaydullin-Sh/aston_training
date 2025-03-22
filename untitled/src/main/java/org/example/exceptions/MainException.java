package org.example.exceptions;

import java.util.Arrays;

public class MainException {
    public static void main(String[] args) {
        Integer[] array = new Integer[5];
        fillArray(array, 3, 1, 3);
        System.out.println(Arrays.toString(array));
    }

    public static void fillArray(Integer[] array, int value, int begin, int end) {
        for(int i = 0; i < array.length; i++){
            if(i == end){
                break;
            }
            if(begin <= i){
                array[i] = value;
            }
        }
    }
}
