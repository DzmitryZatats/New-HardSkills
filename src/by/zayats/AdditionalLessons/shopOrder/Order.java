package by.zayats.AdditionalLessons.shopOrder;

import java.util.ArrayList;


//Задачи на ООП:
//№1
//Создайте класс "Заказ" (Order), который имеет следующие свойства: список товаров (Product) и общую сумму заказа.
// Создайте методы, которые могут добавлять новый товар в список, удалять существующий товар из списка, выводить на экран все товары в списке,
// а также вычислять общую сумму заказа. Создайте объект класса "Заказ" и продемонстрируйте работу его методов на нескольких товарах.
public class Order {


    private final ArrayList<Product> product = new ArrayList<>();


    public String name;

    public Order(String name) {
        this.name = name;
    }

    void displayInfo (){
        System.out.println(name);
    }

    public String printProducts() {
        StringBuilder sb = new StringBuilder();
        for (Product prod : product) {
            sb.append(prod).append("\n");
        }
        return sb.toString();
    }

    public int printOrderSum() {
        int sum = 0;
        for (Product prod : product) {
            sum += prod.getPrice();
        }
        return sum;
    }


    public static void main(String[] args) {
        Order order1 = new Order("Заказ 1");
        Product product1 = new Product("яйца", 250);
        Product product2 = new Product("яблоко", 100);
        Product product3 = new Product("курица", 600);
        Product product4 = new Product("майонез", 30);
        Product product5 = new Product("сахар", 70);
        Product product6 = new Product("печенье", 180);



// добавление
        order1.product.add(product1);
        order1.product.add(product2);
        order1.product.add(product3);
        order1.product.add(product4);
        order1.product.add(product5);
        order1.product.add(product6);

// удаление
        order1.product.remove(product3);


        order1.displayInfo();

// вывод списка
        System.out.println(order1.printProducts());

        // вывод общей суммы заказа
        System.out.println("Общая сумма закза = " + order1.printOrderSum());
    }

}
