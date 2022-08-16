import java.util.*;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> vec  = new Vector<String>(4);

        vec.add("one");
        vec.add("two");
        vec.add("three");
        vec.add("four");

        System.out.println("Size is: " + vec.size());
        System.out.println("Default capacity is: " + vec.capacity());
        System.out.println("Vector elements are: " + vec);

        vec.add("five");
        vec.add("six");

        System.out.println("Size after addition: " + vec.size());
        System.out.println("Capacity after addition is: " + vec.capacity());
        System.out.println("Vector elements are: " + vec);
        System.out.println("Vector contains two..?: " + vec.contains("two"));
        System.out.println("two is present at the index: " + vec.indexOf("two"));
        System.out.println("The first element of the vector is: " + vec.firstElement());
        System.out.println("The last element of the vector is: " + vec.lastElement());
    }
}
