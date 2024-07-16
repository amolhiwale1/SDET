package core_Java_practice;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean result = isPrime(num);
        if(result){
            System.out.println("It is a Prime Number");
        }else {
            System.out.println("It is not a Prime Number");
        }

    }

    public static boolean isPrime(int num){
        if(num<=1){
            return false;
        }

        for (int i = 2; i<=Math.sqrt(num); i++){
            if (num % i ==0)
                return false;
        }
        return true;
    }
}
