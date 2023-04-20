package by.zayats.OOP.ObjectConstructor_2;

//Модификаторы доступа

//public - публичный и общедоступный класс, поля и методы видны другим
// классам из текущего пакета и из внешних пакетов.

//private - закрытый класс противоположность классу public,
// доступен только из кода в этом же классе.

//protected - доступен из любого места в текущем классе или пакете

//default - отсутствие модификатора доступа, по умолчанию.
// Видны всем классам и видны в текущем пакете.

public class Person2 {
    String name;
    protected int age;
    public String address;
    private String phone;

    public Person2(String name, int age, String address, String phone) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
    }

    public void displayName() {
        System.out.printf("Name: %s \n", name);
    }

    void displayAge() {
        System.out.printf("Age: %s \n", age);
    }

    private void displayAddress() {
        System.out.printf("Address: %s \n", address);
    }

    protected void displayPhone() {
        System.out.printf("Phone: %s \n", phone);
    }
}
