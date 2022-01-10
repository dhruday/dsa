package problems.Recursion;

public class Factorial {
    static int factorial(int factorialNumber) {
        if(factorialNumber == 0) {
            return 1;
        } else {
            return factorialNumber * factorial(factorialNumber - 1);
        }
    }
    public static void main(String[] args) {
        System.out.println(factorial(3));
    }
}
