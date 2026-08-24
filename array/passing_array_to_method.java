package array;

public class passing_array_to_method {
  public static void main(String[] args) {
    int x[] = {10,2,29,38}; //the first execution
    System.out.println(x[2]);//the second execution
    change(x);
    System.out.println(x[2]);
  }
  public static void change(int[] x) {
    x[2] = 99; 
  }
}
