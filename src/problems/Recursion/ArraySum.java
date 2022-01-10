package problems.Recursion;

public class ArraySum {
    public static int sumArray(int[] numArray, int length) {
        if(length == 0) {
            return 0;
        } else {
           return numArray[length-1] + sumArray(numArray, length-1);
        }
    }
    
  public static void main(String[] args) {
      int[] sumArrayEl= {1, 2, 3, 4};
      System.out.println(sumArray(sumArrayEl, sumArrayEl.length));
  }  
}
