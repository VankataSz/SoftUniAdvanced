package StacksandQueuesLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class T05PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ArrayDeque<String> printerQue = new ArrayDeque<>();


        while (!input.equals("print")) {

            if (input.equals("cancel")) {


//                                                    //тернарен оператор
//               String output = printerQue.isEmpty() ? "Printer is on standby" : "Canceled" + printerQue.poll();


                if (printerQue.isEmpty()) {

                    System.out.println("Printer is on standby");

                } else {

                    System.out.println("Canceled " + printerQue.poll());
                }


            } else {

                printerQue.offer(input);

            }


            input = scanner.nextLine();
        }


        for (String file : printerQue) {

            System.out.println(file);

        }


    }
}
