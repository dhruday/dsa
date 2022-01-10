package problems.Recursion;

import java.util.Arrays;

public class ArraySum {
    public static void main(String[] args) {
      int[] arr =  {1,2, 3, 4};
      System.out.println(arrSum(arr));
    }

    private static int arrSum(int[] arr) {
        if(arr.length == 0 ) {
            return 0;
        } else if(arr.length == 1) {
            return arr[0];
        }else {
            int sum = arr[0] + arrSum(Arrays.copyOfRange(arr, 1, arr.length));
            return sum;
        }
    }
}
