package SetsAndMapsEx;

import java.util.*;

public class T02SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] setSeizes = scanner.nextLine().split(" ");

        int firstSetSize = Integer.parseInt(setSeizes[0]);
        int secondSetSize = Integer.parseInt(setSeizes[1]);


        LinkedHashSet<String> firstSet = new LinkedHashSet<>();

        for (int i = 0; i < firstSetSize; i++) {

            String element = scanner.nextLine();

            firstSet.add(element);

        }

        LinkedHashSet<String> secondSet = new LinkedHashSet<>();

        for (int i = 0; i < secondSetSize; i++) {

            String element = scanner.nextLine();

            secondSet.add(element);

        }

        //метод, който сравнява елементите в сета- и ако не се съдържат в 2та сета, ги премахва
        firstSet.retainAll(secondSet);

        for (String element : firstSet) {
            System.out.print(element + " ");
        }


//        for (String element : firstSet) {
//
//            if(secondSet.contains(element)){
//
//                System.out.print(element + " ");
//
//            }
//        }


    }
}
