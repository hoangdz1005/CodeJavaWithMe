package methodGeneric;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class Programing {
    public static <E> E getFirst(ArrayList<E> arrayList) {
        if(arrayList.isEmpty()) return null;
        else {
            return arrayList.get(0);
        }
    }

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Java");
        arrayList.add("Python");
        arrayList.add("JavaScript");
        arrayList.add("C++");
        String course = Programing.getFirst(arrayList);
        System.out.println(course);
    }
}
