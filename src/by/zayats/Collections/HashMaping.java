package by.zayats.Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMaping {
    public static void main(String[] args) {

        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Январь");
        hashMap.put(2, "Февраль");
        hashMap.put(3, "Март");
        hashMap.put(4, "Апрель");
        hashMap.put(5, "Май");
        hashMap.put(3, "Май");

        System.out.println(hashMap);

        System.out.println();

        String value = hashMap.get(5); // получение значения по ключу (поучить ключ по значения нельзя, тк ключи всегда уникальный)
        System.out.println(value);

        System.out.println();

        Set<Integer> keys = hashMap.keySet(); // список всех ключей в отдельной колекции
        System.out.println(keys);

        System.out.println();

        ArrayList<String> list = new ArrayList<>(hashMap.values());//получение всех значений
        System.out.println(list);

        System.out.println();

        if (hashMap.isEmpty()){
            System.out.println(hashMap);
        }

        for(Map.Entry<Integer, String> valye1 : hashMap.entrySet()){
            System.out.println(valye1);
        }
        System.out.println();

        Map<Integer, String> hashMap2 = new HashMap<>();
        hashMap2.put(5, "111");
        hashMap2.put(6, "31");
        hashMap2.put(7, "3");

        hashMap.putAll(hashMap2);
        System.out.println(hashMap2);
        System.out.println();

        Map<Integer, Person> people = new HashMap<>();
        people.put(1, new Person("Petya"));
        people.put(123, new Person("Victor"));
        people.put(1234, new Person("Misha"));

        for(Map.Entry<Integer, Person> person : people.entrySet()){
            System.out.println(person.getKey()+" --> " + person.getValue());
//            System.out.println(person.getValue());
        }

    }
}
