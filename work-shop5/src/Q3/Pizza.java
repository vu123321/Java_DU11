package Q3;

public class Pizza {
    private Double diameter;
    private int slice;

    public Pizza() {
    }

    public Pizza(double diameter, int slice) {
        this.diameter = diameter;
        this.slice = slice;
    }

    @Override
    public String toString() {
        return diameter + " " + slice;
    }
}
