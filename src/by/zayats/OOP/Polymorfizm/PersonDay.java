package by.zayats.OOP.Polymorfizm;

public class PersonDay extends Person {
    public PersonDay(String name, int age) {
        super(name, age);
    }

    @Override
    public void goToStreet() {
        System.out.println(toString() + " я гуляю утром");
    }
}
