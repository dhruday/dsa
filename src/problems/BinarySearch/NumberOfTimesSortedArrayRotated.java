package problems.BinarySearch;

public class NumberOfTimesSortedArrayRotated {
    public static void main(String[] args) {
        int[] item = {4, 5, 6, 7, 8, 1, 2, 3};
        System.out.print(numberOfTimesSortedArrayRotated(item, 4));
    }

    private static int numberOfTimesSortedArrayRotated(int[] item, int i) {
        int start = 0;
        int end = item.length -1;
        // approch 1
        while(start< end) {
            int mid = start + (end - start)/2;
            if(item[mid] < item[end]) {
                end = mid;
            } else {
                start = mid +1;
            }
        }
        return item[start];
    }
}
