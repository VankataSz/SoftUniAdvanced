package SetsAndMapsLab;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> cars = new HashMap<>();

        cars.put("Bmw", 10);
        cars.put("Audi", 10);
        cars.put("Ducati", 10);

            //var entry : cars.entrySet()
        for (Map.Entry<String,Integer> entry : cars.entrySet()) { //обхождане на мап с итер

            String key = entry.getKey();
            Integer value = entry.getValue();

        }

        for (var key : cars.keySet()) { //взема само key

        }

        for (var value : cars.values()) { //взема само value - don't use!!!!!

        }

    }
}
