package by.zayats.OOP.Polymorfizm;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void goToStreet() {
        System.out.println(toString() + " я гуляю по утрам");
    }

    @Override
    public String toString() {
        return "я " + name + " мне " + age + " лет ";
    }
}
