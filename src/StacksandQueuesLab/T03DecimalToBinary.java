package StacksandQueuesLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class T03DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int decimal = Integer.parseInt(scanner.nextLine());


        ArrayDeque<Integer> binary = new ArrayDeque<>();

        if (decimal == 0) {
            System.out.print("0");
            return;

        }

        while (decimal != 0) {


            binary.push(decimal % 2);

            decimal /= 2;


        }

//        for (int i = binary.size() - 1; i >= 0; i--) {
//
//            System.out.print(binary.pop());
//
//        }

        for (Integer integer : binary) {
            System.out.print(integer);

        }

    }
}
