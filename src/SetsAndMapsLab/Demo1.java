package SetsAndMapsLab;

import java.util.*;

public class Demo1 {
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
                : String.join(System.lineSeparator(), cars);

        System.out.println(output);

    }
}
