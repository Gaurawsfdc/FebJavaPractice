package collectionframework;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class HashTableExamples {
    public static void main(String[] args) {
        Hashtable<Integer, String> students = new Hashtable<>();
        System.out.println("Initial hastable " + students);
        students.put(101, "A");
        students.put(102, "B");
        students.put(103, "C");


        System.out.println("After put hashtable " + students);
        System.out.println("Containskey : " + students.containsKey(101));
        System.out.println("get : " + students.get(101));
        System.out.println("contain values : " + students.containsValue("F"));



        for(Integer key : students.keySet()){
            System.out.println("Key : " + key + " " + "values : " + students.get(key));
        }
        // entrySet(): Returns a Set view of the key-value mappings (entries) in the Hashtable.
        // You can iterate through the entries using a for-each loop. Each element in the Set is a Map.Entry
        // object, which has getKey() and getValue() methods.

        Iterator<Map.Entry<Integer, String>> iterator = students.entrySet().iterator();

        while(iterator.hasNext()){
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println("whileKeys : " + entry.getKey() + " " + "whilevalues : " + entry.getValue());
        }



    }
}
