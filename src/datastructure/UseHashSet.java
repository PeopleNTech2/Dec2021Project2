package datastructure;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UseHashSet {
    public static void main(String[] args) {

        Set<String> hashSet = new HashSet<>();

        hashSet.add("john");
        hashSet.add("jack");
        hashSet.add("sean");

        System.out.println(hashSet);

        hashSet.add("sean");

        System.out.println(hashSet);

        List<Integer> num = new ArrayList<>();

        num.add(9);
        num.add(4);
        num.add(9);
        num.add(1);
        num.add(9);
        num.add(10);
        num.add(15);
        num.add(10);

        System.out.println(num);

        Set<Integer> newList = new HashSet<>();

        for (int a: num){
            newList.add(a);
        }

        System.out.println(newList);

    }
}
