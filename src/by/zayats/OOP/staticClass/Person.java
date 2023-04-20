package by.zayats.OOP.staticClass;

public class Person {
    private int id;
    static int counter = 1;

    Person() {
        id = counter++;
    }

    public void displayId() {
        System.out.printf("id: %d \n", id);
    }
}
