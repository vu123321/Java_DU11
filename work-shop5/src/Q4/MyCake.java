package Q4;


import java.util.ArrayList;
import java.util.List;


public class MyCake implements ICake {

    @Override
    public String getHighestPrice(List<Cake> a) {
        String nameCake = "";
        double soldPrice;
        double maxPrice = 0.0d;
        for (int i = a.size() - 1; i >= 0; i--) {
            Cake cake = (Cake) a.get(i);
            soldPrice = cake.getPrice() * cake.getiTax();
            if (soldPrice > maxPrice) {
                maxPrice = soldPrice;
                nameCake = cake.getName();
            }
        }
        return nameCake;
    }

    @Override
    public int count(List<Cake> a) {
        int count = 0;
        Cake firstCake = (Cake) a.get(0);
        double itax = firstCake.getiTax();
        for (int i = 1; i < a.size(); i++) {
            Cake cake = (Cake) a.get(i);
            if (cake.getiTax() < itax) {
                count++;
            }
        }
        return count;
    }
}
