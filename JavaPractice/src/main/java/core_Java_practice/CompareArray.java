package core_Java_practice;

import java.util.ArrayList;

public class CompareArray {

    public static void main(String[] args) {

        int[] a = {1,3,4,5,6};
        int[] b = {2,3,5,4,6};
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i<= a.length-1;i++){
            if (a[i] == b[i]){
                arrayList.add(a[i]);
            }
        }

        System.out.println(arrayList.toString());
    }
}
