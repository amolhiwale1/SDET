package core_Java_practice;

import java.util.Arrays;

public class SortArray {

    public static void main(String[] args) {

        int[] arr = {2,4,8,6,3,5};
        int temp;

        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j< arr.length; j++){
                if (arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
