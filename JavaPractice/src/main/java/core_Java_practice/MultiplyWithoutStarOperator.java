package core_Java_practice;

public class MultiplyWithoutStarOperator {

    public static void main(String[] args) {
        int result= multiply(4, 60);
        System.out.println(result);
    }

    public static int multiply(int a, int b){
        int k = 0;
        int sum = 0;
        while(k<b){
            sum += a;
            k++;
        }
        return sum;
    }
}
