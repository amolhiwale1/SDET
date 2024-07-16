package core_Java_practice;

public class SwapVariables {

    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        System.out.println("a value: "+a);
        System.out.println("b value: "+b);
        System.out.println("**************************");

        //1st way
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("a value: "+a);
        System.out.println("b value: "+b);
        System.out.println("**************************");

        //2nd way
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("a value: "+a);
        System.out.println("b value: "+b);
        System.out.println("**************************");

        //3rd way
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("a value: "+a);
        System.out.println("b value: "+b);
        System.out.println("**************************");


    }
}
