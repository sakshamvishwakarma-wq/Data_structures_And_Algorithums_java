package Recursion;

public class power {

    public static void main(String[] args) {
        System.out.println(power(2, 5));
    }

    public static int power(int x, int n) {

        if (n == 0) {
            return 1;
        }

        int call = power(x, n / 2);

        if (n % 2 == 0) {
            return call * call;
        }

        return call * call * x;
    }
}



