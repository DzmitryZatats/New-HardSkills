package by.zayats;

public class ForClass {
    public static void main(String[] args) {
//
//        // Домашнее задание
//
//        //Нечетные от 1 до 100
//        for (int i = 0; i <= 100; i++) {
//            if (i % 2 == 1)
//                System.out.println(i);
//        }
//
//        System.out.println(); // разделитель
//
//        //Нечетные от 100 до 1
//        for (int i = 100; i >= 1; i--) {
//            if (i % 2 == 1)
//                System.out.println(i);
//        }
//
//        System.out.println(); // разделитель
//
//        //Числа от 20 до 40
//        for (int i = 20; i <= 40; i++) {
//            System.out.println(i);
//        }
//
//        System.out.println(); // разделитель
//
//        //Нечетные числа от 20 до 40
//        for (int i = 20; i <= 40; i++) {
//            if (i % 2 == 1) // четные if (i % 2 == 0)
//                System.out.println(i);
//        }
//
//        System.out.println(); // разделитель
//
//        //Числа от 50 до 80
//        for (int i = 50; i <= 80; i++) {
//            System.out.println(i);
//        }
//
//        System.out.println(); // разделитель
//
//        //Четные числа от 50 до 80
//        for (int i = 50; i <= 80; i++) {
//            if (i % 2 == 0) // нечетные if (i % 2 == 0)
//                System.out.println(i);
//        }
//
//        System.out.println(); // разделитель
//
//        // Таблица умнажения
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i + " * " + 1 + " = " + i * 1);
//        }
//
//        System.out.println(); // разделитель
//
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i + " * " + 2 + " = " + i * 2);
//        }
//
//        System.out.println(); // разделитель
//
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i + " * " + 3 + " = " + i * 3);
//        }
//
//        System.out.println(); // разделитель
//
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i + " * " + 4 + " = " + i * 4);
//        }
//
//        System.out.println(); // разделитель
//
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i + " * " + 5 + " = " + i * 5);
//        }
//
//        System.out.println(); // разделитель
//
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i + " * " + 6 + " = " + i * 6);
//        }
//
//        System.out.println(); // разделитель
//
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i + " * " + 7 + " = " + i * 7);
//        }
//
//        System.out.println(); // разделитель
//
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i + " * " + 8 + " = " + i * 8);
//        }
//
//        System.out.println(); // разделитель
//
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i + " * " + 9 + " = " + i * 9);
//        }
//
//        System.out.println(); // разделитель
//
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i + " * " + 10 + " = " + i * 10);
//        }
//
//        System.out.println(); // разделитель
//
//        //Последовательность чисел 2, 4, 8, 16 ... 1024
//        for (int i = 2; i <= 1024; i = i * 2) {
//            System.out.println(i);
//        }
//
//        System.out.println(); // разделитель
//
//        //Числа кратные 7
//        for (int i = 1; i <= 100; i++) {
//            if (i % 7 == 0)
//                System.out.println(i);
//        }
//
//        System.out.println(); // разделитель
//
//        // Поле из звездочек 3x5
//        for (int i = 1; i <= 3; i++) {
//            for (int j = 1; j <= 5; j++) {
//                System.out.print(" * " + '\t');
//            }
//            System.out.println();
//        }
//
///*
//        System.out.println(); // разделитель
//
//        for (int i = 1; i <= 7; i++) {
//            System.out.println(i);
//        }
//
//        System.out.println(); // разделитель
//
//        for (int a = 1; a <= 100; a++) {
//            System.out.println(a);
//        }
//
//        System.out.println(); // разделитель
//
//        for (int a = 50; a <= 100; a++) {
//            System.out.println(a);
//        }
//
//        System.out.println(); // разделитель
//
//        for(int i = 100; i >= 1; i--){
//            System.out.println(i);
//        }
//
//        System.out.println(); // разделитель
//
//        for (int i = 0; i <= 100 ; i++) {
//            if(i % 2 == 0)
//                System.out.println(i);
//        }
//
//        System.out.println(); // разделитель
//
//        for (int i = 0; i <= 100 ;i = i + 10) {
//            System.out.println(i);
//        }
//
//        System.out.println(); // разделитель
//
//        for (int i = 1; i <= 10 ; i++) {
//            System.out.println(i + " * " + 3 + " = " + i * 3);
//        }
//
//        System.out.println(); // разделитель
//
//        for (int i = 1; i <= 10 ; i++) {
//            for (int j = 1; j <= 10 ; j++) {
//                System.out.print(i * j + " " + '\t');
//            }
//            System.out.println();
//        }
//
//        System.out.println(); // разделитель
//
//        for (int i = 0; i < 10; i++) {
//            if (i == 7)
//                break;
//            System.out.println(i);
//        }
//
//        System.out.println(); // разделитель
//
//        for (int i = 0; i < 10; i++) {
//            if (i == 7)
//                continue;
//            System.out.println(i);
//        }
//
// */
    }
}
