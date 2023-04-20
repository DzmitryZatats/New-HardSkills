package by.zayats;

public class Operations {
    public static void main(String[] args) {

        //Сложение
        int a = 10;
        int b = 13;
        int result = a + b;
        System.out.println(result);
        int c = 15 + a;
        int d = -3 + b;
        System.out.println(c);
        System.out.println(d);

        //Вычетание
        int a1 = 22;
        int b1 = 12;
        int c1 = a1 - b1;
        System.out.println(c1);
        System.out.println(c1 + b1);

        //Умнажение
        int a2 = 6;
        int b2 = 8;
        int c2 = a2 * b2;
        int d2 = c2 * 12 * a2;
        System.out.println(c2);
        System.out.println(d2);

        //Деление
        double a3 = 17;
        int b3 = 8;
        double c3 = a3 / b3;
        System.out.println(c3);
        int d3 = 3;
        double f3 = b3 / d3;
        System.out.println(f3);
        int j3 = b3 / d3;
        System.out.println(j3);
        System.out.println((f3 / b3) / a3);

        //Остаток от деления
        int a4 = 121;
        int b4 = 20;
        int c4 = a4 % b4;
        int f4 = b4 % 3;
        System.out.println(c4);
        System.out.println(f4);
        System.out.println(f4 % 6);
        System.out.println(c4 % f4);

        //Посфиксный инкримент
        int i1 = 8;
        //int j1 = i++;
        i1++;
        System.out.println(i1);
        int i3 = 112;
        i3++;
        System.out.println(i3);

        //Префиксный инкримент
        int i2 = 7;
        int j2 = ++i2;
        System.out.println(j2);
        int i4 = 0;
        ++i4;
        System.out.println(i4);

        // Постфисный дикримент
        int k1 = 34;
        k1--;
        int n1 = k1--;
        System.out.println(n1);
        System.out.println(k1);

        //Префиксный дикремент
        int k = 22;
        --k;
        int kk = 133;
        --kk;
        System.out.println(kk);
        System.out.println(k);

        //Приоритет
        int result2 = (a + c) * 4 * ++b1;
        int result3 = result2 - 6 * k1 / ++b1;
        System.out.println(result2);
        System.out.println(result3);

        //Сравнение
        int a6 = 10;
        int b6 = 9;
        double d6 = 10;
        boolean c6 = a6 == b6;
        System.out.println(c6);
        System.out.println(a6 + "!= " + b6);
        System.out.println(b6 == d6);
        System.out.println(d6 == a6);
        System.out.println(a6 - b6 == d6);

        int a7 = 10;
        int b7 = 0;
        int f7 = 1;
        boolean e7 = a7 == 9 + 1;
        boolean c7 = a7 != b7;
        boolean d7 = a7 != 10;
        System.out.println(c7);
        System.out.println(d7);
        System.out.println(e7 + "\n");

        // < , > , <= , >=

        boolean a8 = 9 > 3;
        boolean b8 = 10 >= 10;
        boolean c8 = 11 > 12;
        boolean d8 = 190 >= 191;
        boolean f8 = 13 > 0;
        System.out.println(a8);
        System.out.println(b8);
        System.out.println(c8);
        System.out.println(d8);
        System.out.println(f8);

        int a9 = 7;
        int b9 = 12;
        boolean c9 = a9 >= b9;
        System.out.println(c9 + "\n");

        boolean a10 = 9 < 3;
        boolean b10 = 10 <= 10;
        boolean c10 = 11 < 12;
        boolean d10 = 190 <= 191;
        boolean f10 = 13 < 0;
        System.out.println(a10);
        System.out.println(b10);
        System.out.println(c10);
        System.out.println(d10);
        System.out.println(f10);

        int a11 = 7;
        int b11 = 12;
        boolean c11 = a11 <= b11;
        System.out.println(c11);

        System.out.println();

        /* Логическое "ИЛИ" => ||
        true || true = true
        true || false = true
        false || true = true
        false || false = false
        */
        boolean value = (1 > 3) || (-3 > 5);
        System.out.println(value);
        boolean value2 = (6 / 2 > 9 / 3) || (0 <= 10 - 10);
        System.out.println(value2);
        boolean value4 = (6 == 6) || (6 != 6);
        System.out.println(value4);
        System.out.println();


        /* Логическое "И" => &&
        true && true = true
        true && false = false
        false && true = false
        false && false = false
         */

        boolean value1 = (1 > 3) && (-3 > 5);
        System.out.println(value1);
        boolean value3 = (1 != 5) && (12 != 3);
        System.out.println(value3);
        boolean value5 = (3>2)&&(3!=2);
        System.out.println(value5);


        /* Конъюнкция => ^
        true ^ true = false
        true ^ false = true
        false ^ true = true
        false ^ false = false
         */
    }
}
