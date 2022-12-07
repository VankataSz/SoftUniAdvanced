package SetsAndMapsLab;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class T01ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();

        Set<String> cars = new LinkedHashSet<>();

        while (!input.equals("END")) {

            String[] info = input.split(", ");

            String command = info[0];
            String registration = info[1];

            if (command.equals("IN")) {

                cars.add(registration);

            } else {

                cars.remove(registration);

            }


            input = scanner.nextLine();
        }

        String output = cars.isEmpty()
                ? "Parking Lot is Empty"
                : String.join(System.lineSeparator(), cars);//работи само със стринг колекция

        System.out.println(output);

//            if(cars.isEmpty()){
//
//                System.out.println("Parking Lot is Empty");
//
//            } else {
//
//                for (String car : cars) {
//
//                    System.out.println(car);
//                }
//
//            }

    }
}
