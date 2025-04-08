package collectionframework;

import java.util.HashSet;

public class HashSetExamples {
    public static void main(String[] args) {
        HashSet <String> fruits = new HashSet<>();
        fruits.add("Mango");

        System.out.println("Hashset = " + fruits);
        for(String fruit : fruits){
            System.out.println(fruit);
        }
        fruits.remove("Mango");
        System.out.println(fruits);
    }
}
