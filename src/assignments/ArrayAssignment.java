package assignments;

import java.util.Scanner;

public class ArrayAssignment {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no of students = ");

        int size = scanner.nextInt();
        System.out.println("The number of student is = " + size);

        int[] array = new int[size];

        int indexnumber = 0;
        for(int i = indexnumber; i<size; i++){
            System.out.println("Enter the marks of " + size + " student = ");
            array[i] = scanner.nextInt();
        }
        System.out.println("The length of the array is = " + array.length);
        for(int student : array){
            System.out.println("Marks of the student is = " + student);
        }
        scanner.close();

    }




}
