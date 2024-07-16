package core_Java_practice;

public class AdjacentArray {

    public static void main(String[] args) {
        int[] arr = {2,4,6,8,9,17};
        System.out.println(adjacentArrayMaxNumber(arr));

    }

    public static int adjacentArrayMaxNumber(int [] arr){
        int diff = 0;
        for (int i = 0; i<arr.length-1; i++){
            if(arr[i+1]-arr[i]>diff){
                diff = arr[i+1]-arr[i];
            }
        }
        return diff;
    }
}
