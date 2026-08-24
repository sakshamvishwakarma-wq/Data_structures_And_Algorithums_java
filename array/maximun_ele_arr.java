package array;

public class maximun_ele_arr {

    public static void main(String[] args) {

        int[] arr = {45, 12, 89, 34, 67, 23, 91, 56};

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Maximum element: " + max);
    }
}
