package array;

public class search_in_arr {
  public static void main(String[] args) {
    int[] arr = { 45, 12, 89, 34, 67, 23, 91, 56 };
    boolean flag = false;

    int target = 34;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == target) {
        flag = true;
        break;
      }

    }
    if (flag == true) {
      System.out.println("Target exist");
    } else {
      System.out.println("Target not available");
    }

  }

}
