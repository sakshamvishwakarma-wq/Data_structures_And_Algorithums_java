package Selection;

public class selct {
  public static void main(String[] args) {
   int[] arr ={5,-2,6,7,2,0,7,2};
   int n = arr.length;
   for(int i=0;i<n-1;i++){
    int min  = Integer.MAX_VALUE;
    int minIndex = -1;
    for(int j=i;j<n;j++){
      if(arr[j]<min){
        min = arr[j];
        minIndex = j;
      }
    }
    // Swap the found minimum element with the first element
    int temp = arr[minIndex];
    arr[minIndex] = arr[i];
    arr[i] = temp;
   }
   System.out.println("Sorted array: ");
   for (int num : arr) {
     System.out.print(num + " ");
   }
  }
}
