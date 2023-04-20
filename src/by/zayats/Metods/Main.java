package by.zayats.Metods;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        Calculator calculator = new Calculator();
        user.userCalculator(calculator);




        sayHello();
        dayWeek(0);
        int b = even(3);
        System.out.println(b);

    }

    //Домашнее задание
    static void sayHello() { //Выводит слово Hello!
        System.out.println("Hello!");
    }

    static void dayWeek(int x) { //Выводит дни недели
        switch (x) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Неверный ввод");
                break;
        }
    }

    static int even(int a) {  // Выводит только четные, нечетные делает четными прибавляя 1.
        if (a % 2 == 0)
            a = a;
        else {
            a += 1;
        }
        return a;
    }
}
