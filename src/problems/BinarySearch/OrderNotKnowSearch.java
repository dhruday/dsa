package problems.BinarySearch;

public class OrderNotKnowSearch {
 public static void main(String[] args) {
     int[] descItem = {90, 80, 70, 60, 50, 40, 30, 20, 9, 8, 7, 6, 5};
     int[] ascItem = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
     System.out.print(orderNotKnowSearch(descItem, 50));
     System.out.print(orderNotKnowSearch(ascItem, 5));

 }

private static int orderNotKnowSearch(int[] item, int i) {
    int start = 0;
    int end = item.length -1;
    while(start<=end) {
        int mid = start + (end - start)/2;
        if(item[mid] == i) {
            return mid;
        } else if(item[0] > item[1]) {
            if(i > item[mid]) {
                end = mid -1;
            } else {
                start = mid + 1;
            }
        } else {
            if(i > item[mid]) {
                start = mid + 1;
            } else {
                end = mid -1;
            }
        }
    }
    return -1;
}   
}
