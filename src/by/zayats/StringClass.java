package by.zayats;

import java.sql.Struct;

public class StringClass {
    public static void main(String[] args) {

        //Домашнее задание

        //.concat соединяет строки
        String str1 = "My name is ";
        String str2 = str1.concat("Dmitry");
        System.out.println(str2);

        //.valueOf выводит из строк цифры
        String str3 = str1.valueOf(9.2);
        System.out.println(str3);

        System.out.println(str1.valueOf(4));

        //.join соединяет строки указанным символом
        String str4 = String.join("#", str1, str2);
        System.out.println(str4);

        String str5 = String.join("^ ", str1, str1, str1);
        System.out.println(str5);


        //.charAt выводит порядковый номер символа в строке начиная с 0
        String str6 = "abcdefghijklmnopqrstuvwxyz";
        System.out.println(str6.charAt(3));

        //.equals сравнивает строки булеан значением
        String str7 = "AbcdefghijklmnopqrstuvwxyZ";

        boolean str8 = str6.equals(str7);
        boolean str9 = str6.equals(str6);
        System.out.println(str8);
        System.out.println(str9);

        //.indexOf ищет в строке символ и его индекс
        String hello = "Hello";
        int ind1 = hello.indexOf('H');
        int ind2 = hello.indexOf('e');
        System.out.println(ind1);
        System.out.println(ind2);

        //.replace заменяет сивол в строке
        String name = "KOLYA";
        String newName = name.replace('K', ' ');
        System.out.println(name);
        System.out.println(newName);

        //.trim удаляет пробелы в начале и конце строки
        String str11 = new String("   Hello, friends!   ");
        System.out.println(str11);
        System.out.println(str11.trim());


//        String teext1 = new String("quarty");
//        String text = "querty";
//        System.out.println(text);
//
//        String s = "Hello";
//        String s1 = "World";
//        System.out.println(s + s1);
//
//        String str = "Hello World!";
//        System.out.println(str.length());
//
//        String str1 = new String(new char[] {'h', 'e', 'l', 'l', 'o'});
//        char[] helloMas = str1.toCharArray();
//        System.out.println(helloMas);
//
//        String s2 = "";
//        if (s2.isEmpty())
//            System.out.println("String is empty");
//
    }
}
