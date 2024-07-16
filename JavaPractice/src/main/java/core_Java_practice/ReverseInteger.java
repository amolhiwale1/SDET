package core_Java_practice;

public class ReverseInteger {

    public static void main(String[] args) {

        int a = 56734;
        int reverse = 0;
        while(a!=0){
            int digit = a%10;
            reverse = digit+reverse*10;
            a = a/10;

        }
        System.out.println(reverse);
    }
}
