package core_Java_practice;

import java.util.ArrayList;

public class PrintUniqueNumbers {

    public static void main(String[] args) {

        int[] arr = {1,1,2,3,2,3,2,4,5,5,7,6,5,6};
        ArrayList<Integer> al = new ArrayList<>();

        for(int i = 0; i<arr.length;i++){
            int k = 0;
            if(!al.contains(arr[i])){
                al.add(arr[i]);
                k++;

                for (int j = i+1; j<arr.length;j++){
                    if (arr[i]==arr[j]){
                        k++;
                    }
                }
                System.out.println("The number: "+arr[i]+" presents "+k+" times.");
            }

        }
    }
}
