package SetsAndMapsLab;

import java.util.Scanner;
import java.util.TreeSet;

public class DemoTreeSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(69);
        treeSet.add(42);
        treeSet.add(73);
        treeSet.add(13);

        for (int num : treeSet) {
            System.out.println(num);

        }
    }
}
