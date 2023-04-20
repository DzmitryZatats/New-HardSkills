package by.zayats.OOP.ObjectConstructor;

public class Person {
    String name;
    int age;
    void displayInfo(){
        System.out.printf("Name: %s \tAge: %d\n", name, age);
    }

    Person(){
        this("undefined", 18);
    }

    Person(String name){
        this(name, 18);
    }

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
}
