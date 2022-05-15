package work_shop_07;

import java.util.Scanner;

public class Exercises {

    private static Scanner sc = new Scanner(System.in);

    private static int a ;
    private static int b ;
    private static int c ;

    public static void main(String[] args) {
        inputData();
    }

    private static void inputData() {
        while (true) {
            System.out.println("Enter a: ");
            a = sc.nextInt();
            System.out.println("Enter b: ");
            b = sc.nextInt();
            System.out.println("Enter c: ");
            c = sc.nextInt();

            try {
                //call constructor of RightTriangle class
                RightTriangle rt = new RightTriangle(a, b, c);
                System.out.println("This is a right triangle!");
            } catch (IllegalTriangleException e1) {
                System.out.println("This is not a triangle!");
            } catch (IllegalRightTriangleException e2) {
                System.out.println("This is not a right triangle");
            }

            System.out.print("Continue?(Y/N):");

            char choose = sc.next().charAt(0);
            if (choose != 'Y') {
                break;
            }
        }
    }
}
