package datastructure;

import java.util.Stack;

public class UseStack {
    public static void main(String[] args) {

        Stack<String> list = new Stack<>();

        list.push("A");
        list.push("B");
        list.push("C");
        list.push("D");
        list.push("F");

        System.out.println(list.pop());

    }
}
