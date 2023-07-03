package by.zayats.AdditionalLessons;

import java.util.Arrays;
import java.util.Scanner;

public class ClassArrays {
    public static void main(String[] args) {




        //Напишите класс, который заполняет случайными четырехзначными числами массив, размер которого при инициализации вводится с клавиатуры.
        //После заполнения класс должен вывести на экран значения массива в одной строке, начиная с «конца>> массива (с последней ячейки).

//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        int min = 1000;
//        int max = 9999;
//        int[] arr = new int[num];
//        for (int i = 0; i < arr.length; i++) {
//            int random = (int) ((Math.random() * (max - min)) + min);
//            arr[i] = random;
//            //System.out.print(arr[i] + " "); // для проверки обычная последовательность
//        }
//
//        //System.out.println();
//
//        for (int i = arr.length - 1; i >= 0; i--) {
//            System.out.print(arr[i] + " "); // обратная последовательность
//        }




        //Напишите класс, который заполняет случайными трехзначными числами массив, размер которого при инициализации вводится с клавиатуры.
        //После заполнения класс должен вывести на экран значения массива следующим образом:
        //•в первой строке -первую половину массива;
        //•во второй строке -вторую половину массива.
        //В случае если массив имеет нечетный размер, центральную ячейку следует выводить в первой строке.


//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        int min = 100;
//        int max = 999;
//        int[] arr = new int[num];
//        int half = (int) Math.ceil( num / (float) 2);
//        for (int i = 0; i < arr.length; i++) {
//            int random = (int) ((Math.random() * (max - min)) + min);
//            arr[i] = random;
//        }
//        //System.out.println(Arrays.toString(arr)); // проверка
//        //System.out.println();
//        for (int i = 0; i < half; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//        for (int i = half; i < num; i ++){
//            System.out.print(arr[i] + " ");
//        }




        //        Напишите класс, который заполняет случайными двузначными числами массив, размер которого при инициализации вводится с клавиатуры.
        //        После заполнения класс должен вывести на экран значения массива следующим образом:
        //        •в первой строке -значения из четных ячеек массива;
        //        •во второй строке - значения из нечетных ячеек массива.


//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        int min = 10;
//        int max = 99;
//        int[] arr = new int[num];
//        for (int i = 0; i < arr.length; i++) {
//            int random = (int) ((Math.random() * (max - min)) + min);
//            arr[i] = random;
//        }
//        //System.out.println(Arrays.toString(arr)); // проверка
//
//        for (int i = 0; i < arr.length; i++) {
//            if (i % 2 == 0){
//                System.out.print(arr[i] + " ");
//            }
//        }
//        System.out.println();
//
//        for (int i = 0; i < arr.length; i++) {
//            if(i % 2 == 1){
//                System.out.print(arr[i] + " ");
//            }
//
//        }




        //        Напишите класс, который заполняет случайными двузначными числами массив, размер которого при инициализации вводится с клавиатуры.
        //        После заполнения класс должен вывести на экран значения массива следующим образом:
        //        •в первой строке - четные значения, содержащиеся в массиве;
        //        •во второй строке - нечетные значения, содержащиеся в массиве.


//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        int min = 10;
//        int max = 99;
//        int[] arr = new int[num];
//        for (int i = 0; i < arr.length; i++) {
//            int random = (int) ((Math.random() * (max - min)) + min);
//            arr[i] = random;
//        }
//        System.out.println(Arrays.toString(arr)); // проверка
//
//        for (int k : arr) {
//            if (k % 2 == 0) {
//                System.out.print(k + " ");
//            }
//        }
//        System.out.println();
//
//        for (int j : arr) {
//            if (j % 2 == 1) {
//                System.out.print(j + " ");
//            }
//
//        }




        //Напишите класс, который заполняет случайными трехзначными числами массив, размер которого при инициализации вводится с клавиатуры.
        //После заполнения класс должен вывести на экран значения массива следующим образом: в каждой строке выводится значения из двух ячеек,
        //симметрично расположенных по отношению к середине массива.
        //В случае если массив имеет нечетный размер, центральную ячейку следует выводить в отдельной строке.
        //Например, массив 345, 455, 677, 175, 985 выводится на экран следующим образом:
        //345 и 985
        //455и175
        //677


//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        int min = 100;
//        int max = 999;
//        int[] arr = new int[num];
//        int half = (int) Math.ceil(num / (float) 2);
//        for (int i = 0; i < arr.length; i++) {
//            int random = (int) ((Math.random() * (max - min)) + min);
//            arr[i] = random;
//        }
//        //System.out.println(Arrays.toString(arr)); // Проверка
//
//
//        for (int i = 0, j = num - 1; i < half; i++, j--) {
//            System.out.print(arr[i] + " ");
//            if(j >= half) {
//                System.out.print(arr[j]);
//            }
//            System.out.println();
//        }




        //Напишите класс, который заполняет случайными трехзначными числами массив, размер которого при инициализации вводится с клавиатуры.
        //После заполнения класс должен вывести на экран минимальное, максимальное и среднее значение заданного массива.


//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        int sum = 0;
//        int min = 100;
//        int max = 999;
//        int[] arr = new int[num];
//        for (int i = 0; i < arr.length; i++) {
//            int random = (int) ((Math.random() * (max - min)) + min);
//            arr[i] = random;
//            sum += arr[i];
//        }
//
//        //System.out.println(Arrays.toString(arr)); // проверка
//
//        int minNum = 999;
//        int maxNum = 0;
//        for (int j : arr) {
//            if (j < minNum)
//                minNum = j;
//
//            if (j > maxNum)
//                maxNum = j;
//
//        }
//        System.out.println("Минимальное значение: " + minNum);
//        System.out.println("Максимальное значение: " + maxNum);
//        System.out.println("Среднее значение: " + sum / (float) num);
    }

}
