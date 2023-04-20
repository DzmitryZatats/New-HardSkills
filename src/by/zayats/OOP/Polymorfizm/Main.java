package by.zayats.OOP.Polymorfizm;

public class Main {
    public static void main(String[] args) {

        Person person = new PersonDay("Alexei", 25);
        person.goToStreet();

        Person person1 = new PersonNight("Andrey", 12);
        person1.goToStreet();

        Person person2 = new PersonDay("Vasya", 32);
        person2.goToStreet();

        System.out.println();

        Person[] mas = {person1, person2};
        for (Person object : mas) {
            object.goToStreet();
        }


    }
}
