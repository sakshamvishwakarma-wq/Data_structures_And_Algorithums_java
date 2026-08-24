package array;

public class minimun_array {
    public static void main(String[] args) {

        int[] arr = {45, 12, 89, 34, 67, 23, 91, 56};

        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Minimum element: " + min);
    }
}
