package SetsAndMapsLab;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DemoHashSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Set<Integer> numbers = new HashSet<>();



        if(numbers.add(13)){

            System.out.println("13 added");

        } else {

            System.out.println("13 not added");
        }


        if(numbers.add(13)){

            System.out.println("13 added");

        } else {

            System.out.println("13 duplicated");
        }

        numbers.add(42);
        numbers.add(69);
        numbers.add(73);

        //обхождане на Set
        for (int number : numbers) {
            System.out.println(number);
        }




        System.out.println("Contains 13?" + numbers.contains(13));//проверка за съдържание на елемент -> boolean резулат
        System.out.println("Contains 42?" + numbers.contains(42));

        System.out.println("Removed 42"+  numbers.remove(42));;//премахваме елемент по инт, ако е стринг - задаваме стринг за премахване
                                                                   //връща булева стойност

        System.out.println("Removed 13"+  numbers.remove(13));


        String name = "Ivan";
        String name2 = "Todor";

        System.out.println(name.hashCode());//Hash code -> връща int number
        System.out.println(name2.hashCode());

    }
}
