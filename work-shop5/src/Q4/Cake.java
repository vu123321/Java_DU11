package Q4;


public class Cake {
    private String name;
    private double price;
    private double iTax;


    public Cake(String name, double price, double itax) {
        this.name = name;
        this.price = price;
        this.iTax = itax;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getiTax() {
        return iTax;
    }

    public void setiTax(double iTax) {
        this.iTax = iTax;
    }
}
