import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Enter a number: ");
        String result = (num % 2 ==0)? "Even": "Odd";
        System.out.println(num + " is "+ result);
    }
}
