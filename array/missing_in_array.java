package array;

public class missing_in_array {
  public static void main(String[] args) {
    int[] arr  ={1, 2, 3, 5};
    long n= arr.length+1;
        long sum = n*(n+1)/2;
        long arraysum = 0;
        for(int ele : arr){
            arraysum +=ele;
        }
        System.out.println( (int)(sum-arraysum));
  }
}
