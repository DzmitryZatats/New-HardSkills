package by.zayats.OOP.ObjectConstructor_2;

import by.zayats.OOP.ObjectConstructor.Person;

public class Program2 {
    public static void main(String[] args) {

        Person2 kate = new Person2("Kate", 32,"Sity str.", "23443545");
        kate.displayName();
        kate.displayAge();
        kate.displayPhone();

        System.out.println(kate.name);
        System.out.println(kate.age);
        System.out.println(kate.address);
    }
}
