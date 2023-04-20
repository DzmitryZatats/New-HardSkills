package by.zayats.OOP.Polymorfizm;

public class PersonNight extends Person {
    public PersonNight(String name, int age) {
        super(name, age);
    }

    @Override
    public void goToStreet() {
        System.out.println(toString() + " я гуляю ночью");
    }
}
