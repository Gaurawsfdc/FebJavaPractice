package calculator;

import java.util.Scanner;

public class ScannerCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number = ");
        double num1 = sc.nextDouble();

        System.out.println("Enter the operation = ");
        char operator = sc.next().charAt(0);

        System.out.println("Enter the second number = ");
        double num2 = sc.nextDouble();

        double result = 0;

        switch (operator){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if( num2 == 0){
                    System.out.println("Cannot divide by 0 ");
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid Operator");

        }
        System.out.println("Result " + result);
        sc.close();

    }
}
