package array;

public class multiply_odd_add_even {

    public static void main(String[] args) {

        int[] arr = {45, 12, 89, 34, 67, 23, 91, 56};

        for (int i = 0; i < arr.length; i++) {

            if (i % 2 != 0) {
                arr[i] = arr[i] * 2;
            } 
            else {
                arr[i] = arr[i] + 10;
            }
        }

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
