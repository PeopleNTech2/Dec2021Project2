package datastructure;

import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.add("john");
        queue.add("sean");
        queue.add("jack");

        System.out.println(queue.poll());

    }
}
