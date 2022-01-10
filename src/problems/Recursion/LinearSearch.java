package problems.Recursion;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 7};
        System.out.println(linearSearch(arr, 3, 0));
    }

    private static int linearSearch(int[] arr, int target, int index) {
        if(index == arr.length || arr.length == 0) {
            return -1;
        } else if(arr[index] == target ) {
            return index;
        } else {
            return linearSearch(arr, target, index+1);
        }
    }
}
