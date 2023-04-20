package by.zayats.OOP.Interfacee;

public class Bee implements Fly {

    int age;

    public Bee(int age){
        this.age = age;
    }

    @Override
    public void fly() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Я пчелка и мне " + age  + " Лет";
    }
}
