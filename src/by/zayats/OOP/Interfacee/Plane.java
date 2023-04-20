package by.zayats.OOP.Interfacee;

public class Plane implements Fly, Go {

    String name;
    int age;

    String did;

    public Plane(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public Plane(String did) {
        this.did = did;
    }

    @Override
    public void fly() {
        System.out.println(toString());
    }

    @Override
    public void go() {
        System.out.println(toStr());

    }

    public String toStr() {
        return "Я самолет " + did;
    }

    @Override
    public String toString() {
        return "Я " + name + " Мне " + age + " Лет ";
    }


}
