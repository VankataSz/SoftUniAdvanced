package SetsAndMapsEx;

import java.util.*;

public class T03PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfCompounds = Integer.parseInt(scanner.nextLine());

        Set<String> elements = new TreeSet<>();

        for (int i = 0; i < numberOfCompounds; i++) {

            String[] compound = scanner.nextLine().split(" ");


            Collections.addAll(elements,compound);//добавя всички елементи от колекцията в Set-a


        }

//        for (String element : elements) {
//            System.out.print(element + " ");
//        }

        //вариант за принтиране на колекция от стрингове

        //elements.stream().forEach(s -> System.out.print(s + " ");
        String result = String.join(" ", elements);

        System.out.print(result);

    }
}
