package StacksandQueuesLab;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class Stack {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();


        //double ended que - стек функционалност
        ArrayDeque<Integer> stack = new ArrayDeque<>();


        stack.push(13);
        stack.push(42);
        stack.push(69);

        for (Integer integer : stack) { //iter

            System.out.println(integer);

        }

        int topElement = stack.pop();//премахване на последния елемент

        System.out.println(topElement);

        Integer peek = stack.peek();//показване на последния елемент

        System.out.println(peek);

        System.out.println(stack.size());//размер на структурата

        System.out.println(stack.isEmpty());

        stack.contains(2);




    }
}
