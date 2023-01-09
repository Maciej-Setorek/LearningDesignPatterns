package flueantInterface.learningGenericType;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 10; i < 100; i=i+10) {
            list.add(i);
        }
        System.out.println(list);
        list.remove(1);

        System.out.println("List after removing element with index 1. " +list);

        list.remove(new Integer(30));
        System.out.println("List after removing element of value 30. " +list);

        list.clear(); //This will remove all the elements from the list.
        System.out.println(list);
    }
}
