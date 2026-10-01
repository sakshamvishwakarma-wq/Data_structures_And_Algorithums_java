package pattern_printing;

public class print_alphabet {
  public static void main(String[] args) {
    int row = 4;
    int col = 4;
    for(int i=1; i<=row; i++){
      for(int j=1; j<=col; j++){
        System.out.print((char)(64+j)+" ");
      }
      System.out.println();
    }
  }
}
