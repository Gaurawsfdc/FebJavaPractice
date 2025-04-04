package collectionframework;

import java.util.Stack;

public class StackExamples {
    public static void main(String[] args) {

        // Stack syntax
        Stack <Integer> stack = new Stack<>();

        // adding the elements in the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("Print Integer Stack =" + stack);

        // create stack of string
        Stack <String> string = new Stack<>();
        string.push("Java");
        string.push("Apex");
        string.push("Python");
        string.push("C++");

        System.out.println("Print String Stack = " + string);

        // print top element
        System.out.println("Print last element = "+string.peek());

        // remove elements from stack
        System.out.println("Removed last element = "+string.pop());
        System.out.println("Stack after removed last element = "+string);

        // checking if stack is empty or not
        System.out.println("Checking stack is empty or not = "+ string.isEmpty());




    }
}
