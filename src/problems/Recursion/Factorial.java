package Recursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(3000));
    }

    private static int factorial(int num) {
        if(num == 1) {
            return 1;
        } else if(num == 0) {
            return 0;
        } else {
            return num * factorial(num -1);
        }
    }
}
