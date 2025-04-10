package collectionframework;

import java.util.HashMap;

public class HashMapExamples {
    public static void main(String[] args) {
        HashMap <Integer, String> student = new HashMap<>();
        student.put(101, "Q");
        student.put(102, "W");
        student.put(103, "E");

        System.out.println("Students : " + student);
        System.out.println("get : " + student.get(101));
        System.out.println(" keys : " + student.containsKey(101));
        System.out.println(" values : " + student.containsValue(101));
        System.out.println("put: "+ student.put(101, "R"));
        System.out.println("new put: "+ student.put(104, "R"));
        System.out.println("afterput : " + student);


    }
}
