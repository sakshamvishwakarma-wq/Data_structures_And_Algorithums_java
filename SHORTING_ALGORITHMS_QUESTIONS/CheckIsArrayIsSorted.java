package SHORTING_ALGORITHMS_QUESTIONS;

public class CheckIsArrayIsSorted {

    public static boolean isSorted(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        boolean result = isSorted(arr);

        System.out.println(result);
    }
}
