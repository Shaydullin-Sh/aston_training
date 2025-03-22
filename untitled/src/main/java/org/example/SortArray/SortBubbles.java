package org.example.SortArray;

public class SortBubbles {
    public static int[] sortBubbles(int[] arr){
        int temp;
        for(int i = 1; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(arr[i] < arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
