package Recursion;

public class PowerOfTwo {
    public static void main(String[] args) {
        int power = 10;
        System.out.println(powerOfTwo(power));
    }

    private static int powerOfTwo(int power) {
        if(power == 1) {
            return 2;
        } else if(power == 0) {
            return 1;
        } else {
            return 2 * powerOfTwo(power - 1);
        }
    }
}
