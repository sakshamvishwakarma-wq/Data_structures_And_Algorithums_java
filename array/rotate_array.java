package array;

public class rotate_array {

    public static void main(String[] args) {

        int[] arr = {45, 12, 89, 34, 67, 23, 91, 56};

        int n = arr.length;
        int d = 3;

        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);

        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }

    static void reverse(int[] arr, int i, int j) {

        while (i < j) {

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }
}

