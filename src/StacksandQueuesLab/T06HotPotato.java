package StacksandQueuesLab;

import java.util.*;
import java.util.stream.Collectors;

public class T06HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] players = scanner.nextLine().split(" ");
        int n = Integer.parseInt(scanner.nextLine());

        ArrayDeque<String> que = new ArrayDeque<>();
        Collections.addAll(que, players);


        while (que.size() > 1) {

            for (int i = 1; i < n; i++) {

                que.offer(que.poll());

            }


            System.out.println("Removed " + que.poll());

        }


        System.out.println("Last is " + que.poll());

    }


}
