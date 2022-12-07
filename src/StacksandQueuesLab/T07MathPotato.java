package StacksandQueuesLab;


import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;


public class T07MathPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] players = scanner.nextLine().split(" ");
        int n = Integer.parseInt(scanner.nextLine());

        ArrayDeque<String> que = new ArrayDeque<>();
        Collections.addAll(que, players);

        int counter = 0;

        while (que.size() > 1) {


            for (int i = 1; i < n; i++) {

                que.offer(que.poll());


            }
            counter = counter + 1;

            if (isPrime(counter)) {

                System.out.println("Prime " + que.peek());

            } else {

                System.out.println("Removed " + que.poll());
            }


        }


        System.out.println("Last is " + que.poll());

    }

    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if ((num % i) == 0)
                return false;
        }
        return true;
    }

}



