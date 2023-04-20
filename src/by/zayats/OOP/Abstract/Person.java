package by.zayats.OOP.Abstract;

abstract class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public Person() {

    }

    public String getName() {
        return name;
    }


    public abstract void display();
}
