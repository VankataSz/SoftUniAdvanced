package StacksandQueuesLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class DemoQueue {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        ArrayDeque<Integer> stack = new ArrayDeque<>();

        stack.push(13);     //adds element to the top of the stack
        stack.peek();   //return the top element without removing it
        stack.pop();    //returns the top element and removes it

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        queue.offer(13);//add new element to the end of the queue //
        queue.peek(); // return the first element in the queue without removing it
        queue.poll(); // return the first element in the queue and removes it

        queue.offer(13);
        queue.offer(42);
        queue.offer(69);


        System.out.println(queue.poll());
        System.out.println(queue.peek());

    }

}
