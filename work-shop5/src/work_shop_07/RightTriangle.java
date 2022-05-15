package work_shop_07;

public class RightTriangle {

    int a;
    int b;
    int c;

    // Constructor
    public RightTriangle(int a, int b, int c) throws IllegalTriangleException, IllegalRightTriangleException {
        if (!isRightTriangle(a, b, c)) {
            throw new IllegalTriangleException();
        } else {
            throw new IllegalRightTriangleException();
        }
    }


    private boolean isRightTriangle(int a, int b, int c) {
        return Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(b, 2)
                || Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b, 2)
                || Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a, 2);
    }

    private boolean isTriangle(int a, int b, int c) {
        return a + b > c && a + c > b && b + c > a;
    }
}
