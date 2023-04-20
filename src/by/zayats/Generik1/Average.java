package by.zayats.Generik1;

public class Average<T extends Number> {

    private final T[] array;


    public Average(T[] array) {
        this.array = array;
    }

    public double average() {
        double sub = 0.0;

        for (T value : array) {
            sub += value.doubleValue();

        }
        return sub / array.length;

    }
}
