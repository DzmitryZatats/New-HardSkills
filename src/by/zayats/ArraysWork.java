package by.zayats;

import java.util.Arrays;
import java.util.Random;

public class ArraysWork {
    public static void main(String[] args) {

//        int[] mas = new int[10];
//        mas[1] = 34;
//        mas[8] = 45;
//        System.out.println(Arrays.toString(mas));
//
//
//        int[] num = {1, 2, 3, 4, 5};
//        int langth = num.length;           //Длина массива
//        System.out.println(langth);
//
//        int last = num[num.length - 1];     //Последний индекс
//        System.out.println(last);
//
//
//        Объявление многомерного массива
//        int[][] mas2 = new int[12][5];
//        int[][] mas2 = {{1, 2, 3}, {4, 5, 6}};
//        //Вывод многомерного массива
//        System.out.println(Arrays.deepToString(mas2));
//
//        mas2[1][0] = 34; //Инициализация ячейки значением
//        System.out.println(Arrays.deepToString(mas2));


//        int[] array = new int[]{1, 2, 3, 4, 5};
//        for (int i : array) {    //Цикл for each
//            System.out.println(i);
//        }


//        int[] array = new int[]{1, 2, 3, 4, 5};
//        for (int i = 0; i < array.length; i++) {  // Цикл for
//            System.out.println(array[i]);
//        }

//
//        int[] array = new int[]{1, 2, 3, 4, 5};
//        for (int i = 0; i < array.length; i++) {
//            array[i] *= 3; // Изменение элементов массива
//            System.out.println(array[i]);
//        }


//        int[][] array = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.printf("%d", array[i][j]);
//            }
//            System.out.println();
//        }


        //Вывод от 1 до 100 через массив (мой способ)
//        int[] array = new int[100];
//        for (int i = 1; i <= array.length; i++) {
//            System.out.println(i);
//        }


        //Вывод от 1 до 100 через массив (способ из видео) ВЫВОДИТ БРЕД!!!
//        int[] array = new int[100];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = i;
//            System.out.println(Arrays.toString(array));
//        }


//        int[] mas = {101, 23, 12, 66, 24, 9, 100, 56}; //выводим индекс макс и мин элемента массива
//        int max = 0;
//        int min = 0;
//        for (int i = 0; i < mas.length; i++) {
//            if (mas[i] > mas[max])
//                max = i;
//            if (mas[i] < mas[min])
//                min = i;
//        }
//        System.out.println(min);
//        System.out.println(max);

//        int[] mas = {101, 23, 12, 66, 24, 9, 100, 56}; //макс и мин элемента массива
//        int max = 0;
//        int min = 200;
//        for (int i = 0; i < mas.length; i++) {
//            if (mas[i] > max)
//                max = mas[i];
//            if (mas[i] < min) {
//                min = mas[i];
//            }
//        }
//        System.out.println(min);
//        System.out.println(max);


        // ДОМАШНЕЕ ЗАДАНИЕ

//        int[] array = {4, 12, 5, 3, 18, 19, 33, 66, 78, 91, 15, 84, 1};
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 2 == 0)
//                System.out.print(array[i] + " ");
//        }
//        System.out.println();
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 2 == 1)
//                System.out.print(array[i] + " ");
//        }


//        int[] arr = {3, 33, 14, 23, 76, 5, 4, 23, 6, 50, 65, 22, 11, 56, 89, 7, 10, 91, 19, 1};
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] % 2 == 1)
//                System.out.print(arr[i] + " ");
//        }


//        int[] arr = new int[20];
//        Random random = new Random();
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = 1 + random.nextInt(20); // Рандом
//            if (i % 2 == 1)
//                arr[i] *= 0;
//        }
//        System.out.println(Arrays.toString(arr));


//        int [] array = new int[20];
//        for (int i = 1; i < array.length; i++) {
//            array[i] = i;
//        }
//            System.out.println(Arrays.toString(array));



    }
}
