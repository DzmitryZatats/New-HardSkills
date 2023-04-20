package by.zayats.OOP.ObjectConstructor;

public class Program {
    public static void main(String[] args) {

        Person bob = new Person();
        bob.displayInfo();

        Person tom = new Person("Tom");
        tom.displayInfo();

        Person sam = new Person("Sam", 25);
        sam.displayInfo();

        tom.name = "Tom";
        tom.age = 34;
        tom.displayInfo();


    }
}
