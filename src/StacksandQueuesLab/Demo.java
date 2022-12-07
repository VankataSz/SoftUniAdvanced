package StacksandQueuesLab;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] arr = {13,42,73,69};

        // N = arr.length

        int number = 69;

        boolean containsNumber = false;

        for (int i = 0; i < arr.length; i++) {

            int currentElement = arr[i];

            if(currentElement == number){

                containsNumber = true;
            }

        }

        System.out.println(containsNumber);

       int memory = arr.length * Integer.BYTES;//общата памет в която се съхраняват нашите елементи

        System.out.println(memory);

    }
}
