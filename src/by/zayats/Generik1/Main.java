package by.zayats.Generik1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        list.add("Hello");
//        System.out.println(list.get(0));
//
//        List list1 = new ArrayList();
//        list1.add("Hello");
//        list1.add(123);
//        for (Object o : list1) {
//            System.out.println((String) o);
//        }

//        List<String> list2 = new ArrayList<>();
//        list2.add("Hello");
//        list2.add("World");
//        List<Integer> integerList = new ArrayList(list2); // если поставить дженерики будет конфликт идеи
//        System.out.println(integerList.get(0));
//        System.out.println(integerList.get(1));

//        Integer[] integers = {1, 2, 3, 4, 5};
//        Double[] doubles = {1.1, 1.2, 1.3, 1.4};
//        Character[] characters = {'H', 'E', 'L', 'L', 'O'};
//        String[] strings = {"Hello", "World"};
//
//        printToConsole(integers);
//        printToConsole(doubles);
//        printToConsole(characters);
//        printToConsole(strings);

        ////////////////////////////////////////////////////////////

//        Value1 integerValue1 = new Value1();
//        Value1 stringValue1 = new Value1();
//
//        integerValue1.add(10);
//        stringValue1.add("Hello World");
//
//        System.out.println(integerValue1.getT());
//        System.out.println(stringValue1.getT());

/////////////////////////////////////////////////////////////////////////////////

        //ДЗ

        Double[] doubleArray = {1.2, 4.6, 3.6, 4.9, 7.0, 9.5};
        Average<Double> doubleAverage = new Average<>(doubleArray);
        System.out.println("Avg from Integer " + doubleAverage.average());

//        Integer[] intArray = {1, 2, 3, 4, 5, 6, 7};    // среденее арифметическое
//        Average<Integer> integerAverage = new Average<>(intArray);
//        System.out.println("Avg from Integer " + integerAverage.average());


    }

//    public static <T> void printToConsole(T[] array) {
//        for (T element : array) {
//            System.out.println(element);
//        }
//    }

}
