package by.zayats.OOP.Interfacee;

public class Main {
    public static void main(String[] args) {

        Fly plane = new Plane("Боинг-747", 12);
        Go planego = new Plane("Иду на взлет");
        Fly bee = new Bee(3);


        Fly[] maslet = {bee, plane,};
        for (Fly object: maslet) {
            object.fly();
        }

        Go[] masgo = {planego};
        for (Go object2: masgo){
            object2.go();
        }

    }
}
