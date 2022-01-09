package datastructure;

import java.util.ArrayList;
import java.util.List;

public class UseArrayList {//ArrayList is a class --> java.util -------------- number 2
    public static void main(String[] args) {

        List<String> lunch = new ArrayList();//**************************dynamic list

        lunch.add("Hummus");
        lunch.add("Steak");
        lunch.add("Chocolate mousse");
        lunch.add("coffee");
        lunch.add("Hummus");
        lunch.add("Hummus");

        System.out.println(lunch);

//        lunch.remove(0);
//        lunch.set(1, "soupe");

        System.out.println(lunch.get(0));

        //access prop with for each loop
        for (String a: lunch) {
            System.out.println(a);
        }

        //access prop with for loop
//        for (int i = 0; i < lunch.size() ; i++) {
//            System.out.println(lunch.get(i));
//        }

        List<Integer> num = new ArrayList<>();

        num.add(2);
        num.add(5);
        num.add(8);
        num.add(0);




    }
}
