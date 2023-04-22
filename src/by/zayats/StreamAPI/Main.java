package by.zayats.StreamAPI;

//
// (->) - Лямда выражение, это часть кода которя выносится в пременную
//  и предоставляет возможность переиспользования.
// (->) он служит для разделения
// список параметров -> телео функции
// Функциональный интерфейс - интерфейс с единственным методом,
// лямда выражение реализует метод описанный в этом интерфейсе.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        //ДЗ
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Hello");
        list2.add("New");
        list2.add("HardSkills");
        list2.add("Belarus");
        list2.add("Best");
        list2.add("Academy");
        list2.add("It");
        list2.add("Language");
        list2.add("Java");
        list2.stream().filter(str -> str.length() > 5)
                .forEach(System.out::println);
        

//        Operation sum = (x, y) -> x + y; // с параметрами
//        Operation sub = (x, y) -> x - y;
//        Operation mul = (x, y) -> x * y;
//        Operation div = (x, y) -> x / y;
//
//        System.out.println(sub.calculate(2, 2));
//        System.out.println(sum.calculate(2, 2));
//        System.out.println(mul.calculate(2, 2));
//        System.out.println(div.calculate(2, 2));
//        System.out.println();
//
//        TaskOperations taskOperations = () -> 9 / 3; // без параметров
//        System.out.println(taskOperations.divOperations());
//        System.out.println();
//
//
//        Oper oper = ((x, y) -> System.out.println(x + y + " ")); // терминальное лямда выражение,
//        // которое не возвращает ни каких значений
//        oper.printToConsole(5, 4);
//        System.out.println();


//        int[] numbers = {10, 4, 7, 31, 6, 45, 13, 74};
//        int counter = 0;
//        for (int number : numbers) {
//            if (number > 10)
//                counter++;
//        }
//        System.out.println(counter);
//        System.out.println();
//
//
//        Arrays.stream(numbers).filter(x -> x > 10) // укорочення запись
//                .forEach(System.out::println);




        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("Hello");
        list.add("Java");
        list.stream().filter(str -> str.length() > 4)
                .forEach(System.out::println); // три стадии потока
        // 1. создание потока list.stream()
        // 2. применение к потоку промежуточных операций (может быть несколько) .filter
        // 3. применение к потоку терминальной операции и получение результата
        // (может быть только одна) .forEach(System.out::println)





        //вывод всех элементов массива
        Stream<String> words = Arrays.stream(new String[]{
                "Hello", "World", "Hello", "Java"
        });
        words.forEach(System.out::println);
        System.out.println();

        Stream<String> names = Stream.of("Vasya", "Petya", "Yan");
        names.filter(str -> str.length() == 5)
                .forEach(System.out::println);
        System.out.println();


        // фильтрация с болле сложными данными

        Stream<ProfessionalStream> professionalStreamStream = Stream.of(new ProfessionalStream("Java", 5000),
                new ProfessionalStream("Python", 2000));
        professionalStreamStream.filter(prof -> prof.getSalary() > 4000)
                .forEach(s -> System.out.println(s.getName() + " " + s.getSalary()));

        // ДЗ что такое метод - Map
        // - flatMap

    }
}
