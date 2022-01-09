package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class UseLinkedList {//number 4
    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();

        list.add(5);
        list.add(10);
        list.add(7);
        list.add(12);
        list.add(15);

//        list.add(1, 17);

        Iterator it = list.iterator();

        System.out.println(it.next());

        System.out.println(it.next());

//        while (it.hasNext()){
//            System.out.println(it.next());
//        }

//        for (int a: list) {
//            System.out.println(a);
//        }

    }
}
