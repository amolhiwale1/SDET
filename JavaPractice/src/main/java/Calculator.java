import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double num1 = sc.nextDouble();

        System.out.println("Enter the operator: ");
        char operator = sc.next().charAt(0);

        System.out.println("Enter the second number: ");
        double num2 = sc.nextDouble();

        double result = 0;

        switch(operator){
            case '+':
                result = num1+num2;
                break;

            case '*':
                result = num1*num2;
                break;

            case '-':
                result = num1-num2;
                break;

            case '/':
                if (num2!=0){
                    result = num1/num2;
                }else {
                    System.out.println("ERROR");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operator");

        }
        System.out.println("Results: "+result);

    }
}
