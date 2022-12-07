package SetsAndMapsLab;


import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class T02SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Set<String> vip = new TreeSet<>();
        Set<String> regular = new TreeSet<>();


        while (!input.equals("PARTY")) {

            boolean isVip = Character.isDigit(input.charAt(0));

            if (isVip) {

                vip.add(input);

            } else {

                regular.add(input);
            }


            input = scanner.nextLine();

        }

        input = scanner.nextLine();


        while (!input.equals("END")) {

            boolean isVip = Character.isDigit(input.charAt(0));

            if (isVip) {

                vip.remove(input);

            } else {

                regular.remove(input);
            }

            input = scanner.nextLine();
        }

        System.out.println(regular.size() + vip.size());


        for (String vips : vip) {
            System.out.println(vips);
        }


        for (String reg : regular) {
            System.out.println(reg);

        }
    }
}
