package core_Java_practice;

import java.util.*;


public class Fibonacci {

    public static void main(String[] args) {
        int n = 8;
        int a = 0;
        int b = 1;
        for(int i = 0; i<n; i++){
            System.out.println("value of a is: "+a+ " ");
            int next = a+b;
            a=b;
            b=next;
        }
    }

}
