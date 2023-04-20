package by.zayats.OOP.staticClassConst2;

public class Person {
    private int id;
    static int counter = 1;

    Person() {
        id = counter++;
    }

    public static void displayCounter() {
        System.out.printf("Counter: %d \n", counter);
    }

    public void displayId() {
        System.out.printf("Id: %d \n", id);
    }

}
