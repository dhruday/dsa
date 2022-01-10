package problems.Recursion;

import java.util.Arrays;

public class IsArraySorted {
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        System.out.println(isSorted(arr));
    }

    private static boolean isSorted(int[] arr) {
        if(arr.length == 0 || arr.length == 1) {
            return true;
        } else if(arr[0] > arr[1]) {
            return false;
        } else {
            return isSorted(Arrays.copyOfRange(arr, 1, arr.length));
        }
    } 
}
