package Q3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {

    public static void main(String[] args) throws IOException {
        input();

    }

    private static void input() throws IOException {
        BufferedReader inputData = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("ENTER ADDED TOPPING ");
        String addedToppings = inputData.readLine();

        System.out.print("ENTER DIAMETER: ");

        double diameter = Double.parseDouble(inputData.readLine());
        System.out.print("ENTER NUMBER OF SLICES: ");

        int slices = Integer.parseInt(inputData.readLine());
        System.out.println("OUTPUT:");

        Pizza pizza = new Pizza(diameter, slices);
        System.out.println(pizza);

        pizza = new DeluxePizza(addedToppings, diameter, slices);
        System.out.println(pizza);
    }
}
