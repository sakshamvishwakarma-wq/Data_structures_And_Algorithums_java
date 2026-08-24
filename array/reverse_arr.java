package array;

public class reverse_arr {

    public static void main(String[] args) {

        int[] arr = {6, 8, 1, 2, 4, 9};

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        for (int ele : arr) {
            System.out.println(ele);
        }
    }
}
