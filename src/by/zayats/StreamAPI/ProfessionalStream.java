package by.zayats.StreamAPI;

public class ProfessionalStream {
    private String name;
    private int salary;

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public ProfessionalStream(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}
