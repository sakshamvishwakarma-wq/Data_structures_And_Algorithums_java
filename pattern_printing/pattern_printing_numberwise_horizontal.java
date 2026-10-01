package pattern_printing;

public class pattern_printing_numberwise_horizontal {
  public static void main(String[] args) {
    int row = 4;
    int col = 4;
    for(int i=1; i<=row; i++){
      for(int j=1; j<=col; j++){
        System.out.print(i+" ");
      }
      System.out.println();
    }
  }
}
