package problems.Recursion;

public class PowerOf2 {
    static int powerOfTwo(int n) {
        if(n == 1) {
            return 2;
        } else {
            return 2 * powerOfTwo(n -1);
        }
    }
    public static void main(String[] args) {
        System.out.println(powerOfTwo(10));
    }
}
