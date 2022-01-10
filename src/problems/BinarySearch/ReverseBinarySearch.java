package problems.BinarySearch;

public class ReverseBinarySearch {

    public ReverseBinarySearch() {
    }
    public static void main(String[] args) {
        int[] min = {90, 80, 70, 60, 50, 40, 30, 20, 9, 8, 7, 6, 5};
        System.out.print(RverseBinarySearch(min, 50));
    }
    private static int RverseBinarySearch(int[] min, int i) {
        int start = 0;
        int end = min.length -1;
        while(start<=end) {
            int mid = start +(end - start)/2;
            if(min[mid] == i) {
                return mid;
            } else if(min[mid] > i) {
                start = mid + 1;
            } else {
                end = mid -1;
            }
        }
        return -1;
    }
}
