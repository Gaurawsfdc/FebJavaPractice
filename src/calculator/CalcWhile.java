package calculator;

import java.util.Scanner;

public class CalcWhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Simple Calculator program");
            System.out.println("Enter the first number = ");
            double num1 = sc.nextDouble();
            System.out.println("Enter the second number = ");
            double num2 = sc.nextDouble();

            System.out.println("Choose operators = ");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulo");
            int operator = sc.nextInt();

            switch(operator) {
                case 1:
                    System.out.println("result of the addition = " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("result of the subtraction = " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("result of the multiplication = " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("result of the division = " + (num1 / num2));
                    break;
                case 5:
                    System.out.println("result of the modulo = " + (num1 % num2));
                    break;
                default:
                    System.out.println("please enter the correct operator for arithmetic operation");
                    continue;
            }
            System.out.println("If you want to perform the operation again please enter Y/N = ");
            String again = sc.next(); // directly taken the value in the string only
            if(again.equals("y") || again.equals("Y")) {
                continue;
            }else if (again.equals("N") || again.equals("n")){
                System.out.println("Thank you for using basic calculator");
                break;
            } else {
                System.out.println("Wrong input Thank you for using basic calculator");
                break;
            }

        }
        sc.close();

    }
}
