package by.zayats.OOP.EncapsulationSetGet;

import javax.lang.model.element.Name;

public class Person_3 {
    private String name;
        protected int age = 1;

        public Person_3(String name, int age){
            setName(name);
            setAge(age);

        }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
            if(age > 0 && age < 100)
        this.age = age;
    }
}
