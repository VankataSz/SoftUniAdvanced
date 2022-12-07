package SetsAndMapsEx;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DemoSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String,Integer> map = new HashMap<>();


        map.put("Anton",3);
        map.put("Boris",5);
        map.put("Cristina",4);
        map.put("Dimitar",6);
        map.put("Spexter",6);

 //       //сравнение по value - оценка
//        map.entrySet().stream().sorted(
//
//                (left,right) -> {
//
//             return  right.getValue() - left.getValue();
//        }
//        ).forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));




            //сравнение по key - String
            map.entrySet().stream().sorted(
                    (left,right) -> {

                        return left.getKey().compareTo(right.getKey());

                    }
            ).forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));



        //сортиране по оценка и име

        map.entrySet().stream().sorted(
                (left,right) -> {

                    //сравняване на оценки
                    int result = left.getValue() - right.getValue();//вземаме оценката на левия и сравняваме с оценката на десния


                    //ако оценките са еднакви -> сравняване на имената
                    if(result == 0){

                        result = left.getKey().compareTo(right.getKey());

                    }
                    //връщане на резултат
                    return result;
                }
        ).forEach(e -> System.out.println(e.getKey() + " " + e.getValue() ));




        }
}




