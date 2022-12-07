package SetsAndMapsEx;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String cardPower ="J";
        int power = Integer.parseInt(scanner.nextLine());;

        try {

            power = Integer.parseInt(cardPower);

        } catch (Exception e){

           switch (cardPower){

               case "J":

                   power = 11;

                   break;

               case "Q":

                   power = 12;
           }

        }


        System.out.println(power);
    }
}
