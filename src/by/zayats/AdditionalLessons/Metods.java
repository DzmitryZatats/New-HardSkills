package by.zayats.AdditionalLessons;

import java.lang.reflect.Array;

public class Metods {
    public static void main(String[] args) {


//        metod1(2,10);
//        System.out.println(metod2(2355));
//        System.out.println(metod3(34567));
//        System.out.println(metod4(5234912));
//        System.out.println(metod5(234,222));
//        System.out.println(metod6(22239, 444));
//        System.out.println(metod7(13));
//        System.out.println(metod8(-24501));
//        System.out.println(metod9(8310923, 923498));
//        metod10(90);
//        System.out.println(metod11(123));
        metod12(6);


    }

    //метод, который получает в качестве параметра два числа (А и В)
    // и выводит на экран все четные числа из диапазона А ... В
//    static void metod1(int a, int b) {
//
//        for (int i = a + 1; i < b; i++) {
//            System.out.println(i);
//        }
//    }

    // метод, который принимает в качестве параметров целое число и возвращает сумму его цифр.
//    static int metod2(int a) {
//        int sum = 0;
//        for (int i = a; i != 0; i = i / 10){
//            sum += i % 10;
//        }
//        return (sum);
//    }

    // метод, который принимает в качестве параметра целое число и возвращает количество цифр в этом числе.

//     static int metod3 (int a){
//        int length = String.valueOf(a).length();
//        return length;
//    }


    // метод, который принимает в качестве параметра целое число и возвращает самую большую цифру в этом числе.

//    static int metod4(int a){
//     int number = 0;
//        for (int i = a; i != 0 ; i = i / 10) {
//            if (number < i % 10) {
//                number = i % 10;
//            }
//        }
//        return number;
//    }


    //метод, который принимает в качестве параметра два целых числа и возвращает значение true,
    // если в числах одинаковое количестсво цифр; в ином случае метод возвращает значение false.

//    static boolean metod5(int a, int b){
//        boolean tf;
//        int number1 = String.valueOf(a).length();
//        int number2 = String.valueOf(b).length();
//        if (number1 == number2){
//            tf = true;
//        }else tf = false;
//        return tf;
//    }


    //метод, который принимает в качестве параметра два целых числа и возвращает среднее арифметическое сумм цифр в этих числах.

//    static String metod6(int a, int b) {
//        int sumA = 0;
//        for (int i = a; i != 0; i = i / 10) {
//            sumA += i % 10;
//        }
//        int lengthA = String.valueOf(a).length();
//
//        double averageA = (double) sumA / (double) lengthA;
//
//        int sumB = 0;
//        for (int i = b; i != 0; i = i / 10) {
//            sumB += i % 10;
//        }
//        int lengthB = String.valueOf(b).length();
//
//        double averageB = (double) sumB / (double) lengthB;
//
//        String averageInDisplay = averageA + "\n" + averageB;
//
//        return averageInDisplay;
//    }


    //метод, который принимает в качестве параметра целое число и возвращает значение true, если это число простое;
    // в ином случае метод возвращает значение false.

//    static boolean metod7(int a) {
//        if (a < 2) return false;
//        for (int i = 2; i < a / 2; i++) {
//            if (a % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }

    //метод, который получает в качестве параметра целое положительное число.
    // Метод возвращает крайнюю левую цифру числа.

//    static int metod8(int a) {
//        int numb = 0;
//        if (a > 0) {
//            for (int i = a; i != 0; i = i / 10) {
//                numb = i;
//            }
//        }else System.out.println("Ошибка: введите положительное число");
//        return numb;
//    }


    //метод, который получает в качестве параметров два целых числа. Метод возвращает значение true,
    //если первая цифра в первом параметре равна последней цифре во втором параметре.
    //В ином случае метод возвращает значение false.

//    static boolean metod9(int a, int b) {
//        int numbA = 0;
//        for (int i = a; i != 0; i = i / 10) {
//            numbA = i;
//        }
//        int numbB = b % 10;
//        boolean tf = numbA == numbB;
//        return tf;
//    }

    //метод, который принимает в качестве параметра целое число и
    //выводит на экран в одну строку через пробел все делители этого числа (не считая 1 и самого числа).
    //В случае если у числа нет ни одного делителя сообщение.

//    static void metod10(int a) {
//        String divNumber = "";
//        for (int i = 2; i < a; i++) {
//            if (0 == (a % i))
//                divNumber += i + " ";
//        }
//        if (divNumber == "") {
//            System.out.println("Нет делителя");
//        } else
//            System.out.println(divNumber);
//    }

    //метод, который принимает в качестве параметра целое положительное число N.
    //Метод возвращает количество простых чисел, находящихся в диапазоне 1... N.

//    static int metod11(int a){
//        int amount = 0;
//        for (int i = 0; i < a - 1; i++) {
//            amount = i;
//        }
//        return amount;
//    }


    //метод, который принимает в качестве параметра целое положительное число N.
    // Метод возвращает общее количество делителей для всех чисел из диапазона N... 2N.

    static void metod12(int a){
        int sumDivNumber = 0;
        for (int i = a; i < (a * 2); i++) {
            if (0 == (a % i))
                sumDivNumber++;
        }
        System.out.println(sumDivNumber);
    }

}