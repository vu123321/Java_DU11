package Q4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) throws IOException {

        inputData();

    }

    private static void inputData() throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter number of Cakes: ");

        int n = Integer.parseInt(in.readLine());
        List<Cake> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter name of cake: ");
            String name = in.readLine();

            System.out.print("Enter price of cake: ");
            double price = Double.parseDouble(in.readLine());

            System.out.print("Enter imported tax of cake (in percentage): ");
            double itax = Double.parseDouble(in.readLine());
            a.add(new Cake(name, price, itax));
        }
        ICake i = new MyCake();
        System.out.println("OUTPUT:");
        System.out.println(i.count(a));
        System.out.println(i.getHighestPrice(a));
    }
}
