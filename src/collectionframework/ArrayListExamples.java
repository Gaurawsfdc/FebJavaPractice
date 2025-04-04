package collectionframework;

import java.util.ArrayList;

public class ArrayListExamples {

    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<Integer>();
        System.out.println("ArrayList = " + array);

        array.add(10);
        System.out.println(array);
        System.out.println(array.size());
        System.out.println(array.add(20));
        System.out.println(array);
    }
}
