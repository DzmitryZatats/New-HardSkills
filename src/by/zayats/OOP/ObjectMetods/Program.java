package by.zayats.OOP.ObjectMetods;

public class Program {
    public static void main(String[] args) {
        Person kate = new Person("Kate");
        System.out.println(kate.getName());
        chengName(kate);
        System.out.println(kate.getName());

    }

    static void chengPerson(Person p) {
        p = new Person("Alice");
        p.setName("Anya");
    }

    static void chengName(Person p) {
        p.setName("Alice");
    }
}
