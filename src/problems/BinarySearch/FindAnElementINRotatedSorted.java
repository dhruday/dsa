package problems.BinarySearch;

public class FindAnElementINRotatedSorted {
    public static void main(String[] args) {
        int[] item = {4, 5, 6, 6, 7, 8, 1, 1, 1, 2, 3};
        System.out.println(findAnElementINRotatedSorted(item, 6));
    }

    

    private static int findAnElementINRotatedSorted(int[] item, int i) {
        int pivot = numberOfTimesSortedArray(item);
        int leastSorted = binarySearh(item, pivot, item.length -1, i);
        int highestSorted = binarySearh(item, 0, pivot -1, i);
        return leastSorted == -1 && highestSorted == -1 ? -1 : (leastSorted > highestSorted ? leastSorted:  highestSorted);
    }
    

    private static int binarySearh(int[] item, int start, int end, int target) {
        while(start <= end) {
            int mid = start + (end - start) /2;
            if(item[mid] == target) {
                return mid;
            } else if(target > item[mid]) {
                start = mid + 1;
            } else {
                end = mid -1;
            }
        }
        return -1;
    }

    private static int numberOfTimesSortedArray(int[] item) {
        int start = 0;
        int end = item.length -1;
        while(start < end) {
            int mid = start + (end - start) / 2;
            if(item[mid] >  item[end]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }

    public static int duplicatePivots(int[] nums) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        
        while (low < high) {
            int mid = low + (high - low) / 2;
            
            if (nums[mid] < nums[high])
                high = mid;
            else if (nums[mid] > nums[high])
                low = mid + 1;
            else 
                high--;
        }
        
        return low;
    }
}
