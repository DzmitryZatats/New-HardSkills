package by.zayats.OOP.Abstract;

public class Exployer extends Person {
    String company;
    private String bank;

    public Exployer(String name, String company) {
        super(name);
        this.company = company;
    }

    public void name() {
        System.out.printf("%s work in %s \n", getName(), company);
    }

    public void display() {
        System.out.printf("Exployer Name: %s \t Bank: %s \n", super.getName(), bank);
    }


}
