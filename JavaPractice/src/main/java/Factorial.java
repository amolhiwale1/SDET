import java.util.Scanner;

public class Factorial {

    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        long factorial = 1;
//        for (int i = 1;i<=num;i++){
//            factorial *= i;
//        }


        System.out.println("The factorial for "+num+" is: "+facto(num));
    }

    public static int facto(int num){
        if(num==0)
            return 1;
        return num*facto(num-1);
    }
}
