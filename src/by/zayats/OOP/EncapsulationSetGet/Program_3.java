package by.zayats.OOP.EncapsulationSetGet;

public class Program_3 {
    public static void main(String[] args) {


        Person_3 kate = new Person_3("Kate", 32);
        System.out.println(kate.getAge());
        kate.setAge(33);
        System.out.println(kate.getAge());
        kate.setAge(123456);
        System.out.println(kate.getAge());
    }
}
