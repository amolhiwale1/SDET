package core_Java_practice;

public class SumOfAllElements {

    public static void main(String[] args) {
        int[] arr = {2,2,2,4,4};
        System.out.println(sumOfElements(arr));
    }

    public static int sumOfElements(int[] arr){
        int sum = 0;
        for(int i = 0; i<=arr.length-1; i++){
            sum = sum +arr[i];
        }
        return sum;
    }
}
