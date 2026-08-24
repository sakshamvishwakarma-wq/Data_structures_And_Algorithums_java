package array;

public class product_of_array {
  public static void main(String[] args) {
    int[] arr = {10,20};
    int pro=1;
    for(int i=0;i<arr.length;i++){
      pro*=arr[i];
    }
    System.out.println("The product of arr:"+ pro);
  }
}
