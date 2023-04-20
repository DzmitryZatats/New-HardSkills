package by.zayats.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ArrLinList {

    public static void main(String[] args) {

        // ДЗ
        // лоторея премешивание чисел и выпадение рандомных чисел
        ArrayList<Integer> lottery = new ArrayList<>(36);
        for (int i = 1; i <= 36; i++) {
            lottery.add(i);
        }
        Collections.shuffle(lottery); // перемешивает коллекцию
        System.out.println("Победил номер: " + lottery.get(1));

        //Вариант 2
//        Random random = new Random();
//        int number = random.nextInt(36);
//        System.out.println(lottery.get(number));



        /////////////////////////////////////////////////////////////////
        //    ArrayList
        //    // Коллекция содержащая обычный массив
        //    // используется в приоритете доступ по индексу, тк эти операции выполняются за константное время
        //    // добавление в конец списка в среднем выполняется за конст время. Нет доп. расходов на хранение связки между элементами.
        //    // Минусы в скорости вставки, удаления элемнтов не конце списка, тк при этой операции все элементы которые будут Правее
        //    // добовляемого и удаляемого они будут сдвигится.
        //    // (-) Удаление и добавление элементов для коллекций ресерсоемкий (медленный) процесс
        //    // (+) Хранение списков с малым числом подобных действий (добавление,удаление) навигация по скиску происходит быстро
        //
        //    // LinkedList
        //    // Коллекция ввиде двусвязного списка( каждый объект имеет ссылки на седующий и предыдущий)
        //    // испльзуется когда нужно быстрота действия нашей операции, те вставки или удаления они будут выполняться за константное время
        //    // операции доступа по индексу будут производится перебором с начала или конца, смотря что ближе до нужного элемента.
        //    // Дополнительные затраты на хранения связки между элементами они присутствуют поэтому будет небольшая задержка во времени.
        //    // (-) Навигация по скиску происходит медленно
        //    // (+) Удаление и добавление элементов для коллекций быстрый процесс (Двунаправленный список (хранит ссылки на обекты
        //    // отдельно от ссылок на след и на предыдущий)

//        ArrayList<Integer> list1 = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            list1.add(i);
//        }
//        System.out.println(list1);
//        System.out.println();
//
//
//        // присвоение индексу элемент
//        ArrayList<Integer> list2 = new ArrayList<>(10);
//        list2.add(0, 2);
//        list2.add(1, 3);
//        list2.add(2, 4);
//        list2.add(3, 5);
//        list2.add(4, 6);
//        list2.add(5, 7);
//        list2.add(6, 8);
//        list2.add(7, 9);
//
//        list2.remove(3); // удаление
//
//        System.out.println(list2);
//        System.out.println();
//
//        list2.trimToSize(); // метод урезает до текущего размера списка
//
//        for (Integer integer : list2) {    // перебор через for each
//            // (Если места в массиве не достаточно,
//            // то он будет расчитываться по формуле:
//            //  (Старый размер массива * 3) / 2 + 1
//            System.out.println("number " + integer);
//        }
//        System.out.println();
//
//        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
//
//        ArrayList<String> arrayList1 = new ArrayList<>(Arrays.asList("Pasha", "Petya", "Vasya"));
//
//        System.out.println(arrayList);
//        System.out.println();
//        System.out.println(arrayList1);
//        System.out.println();
//
//        ArrayList<String> mounts = new ArrayList<>();
//        mounts.add("Январь");
//        mounts.add("Февраль");
//        mounts.add("Март");
//        mounts.add("Апрель");
//        mounts.add("Май");
//        mounts.add("Июнь");
//        mounts.add("Июль");
//        mounts.add("Август");
//        mounts.add("Сентябрь");
//        mounts.add("Октябрь");
//        mounts.add("Ноябрь");
//        mounts.add("Декабрь");
//
//        System.out.println(mounts.size()); // узнать количество элемнтов
//        System.out.println();
//
//        System.out.println(mounts);
//        mounts.set(1, "Декабрь"); // Замена элемента по индексу
//
//        System.out.println();
//        System.out.println(mounts);
//
//        System.out.println();
//        mounts.remove("Январь"); // удаление элемента
//        System.out.println(mounts);
//
//        System.out.println();
//        System.out.println(mounts.get(5)); // вывод через индекс
//
//        System.out.println();
//        int p1 = mounts.indexOf("Май"); // узнать индекс
//        System.out.println(p1);
//
//        System.out.println();
//        boolean p2 = mounts.contains("МАРТ");// есть ли такой элемент
//        System.out.println(p2);
//        System.out.println();



        //////////////////////////////////////////////////////////////////////////


//        LinkedList<Integer> linkedList = new LinkedList<>();
//        for (int i = 1; i <= 10; i++) {
//            linkedList.add(i);
//        }
//        System.out.println(linkedList);
//        System.out.println();
//        System.out.println(linkedList.getFirst() + " " + linkedList.getLast()); // получение первого и последнего элемента
//
//        System.out.println();
//        // удаление первого и последнего элемента
////        linkedList.removeFirst();
////        linkedList.removeLast();
//
//        System.out.println(linkedList.removeFirst() + " " + linkedList.removeLast()); // удаление с выводом удаленных
//        System.out.println(linkedList);
//
//        System.out.println();
//
//        String mitsybishi = "Outlender";
//        String mazda = "Mazda 6";
//        String honda = "Honda X";
//        String toyota = "RAW 4";
//
//        LinkedList<String> cars = new LinkedList<>();
//        cars.add(mitsybishi);
//        cars.add(mazda);
//        cars.add(honda);
//        cars.add(toyota);
//        System.out.println(cars);

    }
}
