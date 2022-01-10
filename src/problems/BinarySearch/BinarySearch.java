package problems.BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] item = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(binarySeach(item, 100));
    }

    private static int binarySeach(int[] item, int i) {
        
        int start = 0;
        int end = item.length -1;
        while(start <= end) {
            int mid = start + (end - start)/2;
            if(item[mid] == i) {
                return mid;
            } else if(i > item[mid]) {
                start = mid +1;
            } else {
                end = end -1;
            }
        }
        return -1;
    }
}
