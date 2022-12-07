package StacksAndQueuesEx;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


            //On -> 1 for loop = 1 -> 2 -> 3
            //On2 -> 2 for loops
            //On3 -> 3 for loops
            //O(1) -> 1 linear operation , constant complexity
            //O Log -> if the array elements are sorted by size -> tree - left, right

            //priority queue

            ArrayDeque<Integer> queue = new ArrayDeque<>();

            queue.offer(1);
            queue.offer(2);
            queue.offer(3);




    }
}
