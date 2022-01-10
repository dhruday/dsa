package problems.BinarySearch;

public class FirstAndLastOccuranceBinarySearch {
    public static void main(String[] args) {
        int[] item = {2, 4, 6, 8, 8, 8, 8, 8};
        System.out.print(firstOcurance(item , 8));
        System.out.print(lastOcurance(item , 8));
    }

    private static int lastOcurance(int[] item, int i) {
        int start = 0;
        int end = item.length -1;
        int res = -1;
        while(start <= end) {
            int mid = start + (end - start) /2;
            if(item[mid] == i) {
                res = mid;
                start = mid + 1;
            } else if(i > item[mid]) {
                start = mid + 1;
            } else {
                end = mid -1;
            }
        }
        return res;
    }

    private static int firstOcurance(int[] item, int i) {
        int start = 0;
        int end = item.length -1;
        int res = -1;
        while( start<= end) {
            int mid = start + (end - start)/2;
            if(item[mid] == i) {
                res = mid;
                end = mid - 1;
            } else if(i > item[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1 ;
            }
        }
        return res;
    }
}
