package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        //List<Integer> list = new ArrayList<>();
        List<Integer> list = new LinkedList<>();

        list.add(1);
        // 1
        list.add(2);
        // 1, 2
        list.add(3);
        // 1, 2, 3
        list.add(0, 100);
        // 100, 1, 2, 3

        //size = 4;
        int size = list.size();
        System.out.println("size = " + size);
        // isEmpty = false
        boolean isEmpty = list.isEmpty();
        System.out.println("isEmpty = " + isEmpty);
        //get
        int number = list.get(1);
        System.out.println("number = " + number);
        // contains
        boolean contains = list.contains(100);
        System.out.println("contains = " + contains);
        //indexOf
        int index = list.indexOf(100);
        System.out.println("index = " + index);
        //clear
        list.clear();

    }
}
