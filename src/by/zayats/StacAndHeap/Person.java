package by.zayats.StacAndHeap;

public class Person {
    int id;
    String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class PersonBuilder {
    private static Person buildPerson(int id, String name) {
        return new Person(id, name);
    }

    public static void main(String[] args) {
        int id = 23;
        String name = "Jon"; // String pool (куча "пул стрингов")
        Person person = null; // в памяти Stack, но будет указывать на объект расположенный в памяти (кучи).
        person = buildPerson(id, name); // Выделен блок память в Stack поверх предыдущего вызова.
    }
}
