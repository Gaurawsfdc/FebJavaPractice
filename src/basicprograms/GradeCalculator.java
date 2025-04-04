package basicprograms;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks: ");

        int marks = sc.nextInt();

        switch(marks/10) {
            case 9:
                System.out.println("Grade : A");
                break;
            case 8:

        }

    }
}
