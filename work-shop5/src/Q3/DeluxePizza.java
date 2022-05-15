package Q3;

public class DeluxePizza extends Pizza {


    private String addedTopping;

    public DeluxePizza() {
    }

    public DeluxePizza(String addedTopping, double diameter, int slice) {
        super(diameter, slice);
        this.addedTopping = addedTopping;
    }

    @Override
    public String toString() {
        return "DeluxePizza{" +
                "addedTopping='" + addedTopping + '\'' +
                "} " + super.toString();
    }

}


