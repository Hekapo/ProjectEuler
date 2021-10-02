package even_fibonacci_numbers;

import java.util.Arrays;

/*
 * Each new term in the Fibonacci sequence is generated by adding the previous two terms.
 * By starting with 1 and 2, the first 10 terms will be:
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million,
 * find the sum of the even-valued terms.
 */

public class EvenFibonacciNumbers {
    private static final int n = 20;
    private static final long[] cash = new long[n + 1];

    public static void main(String[] args) {
        Arrays.fill(cash, -1);

        System.out.println(n + " even fib number: " + fib(n, cash));

        System.out.println(Arrays.stream(cash).filter(x -> x < 4000000).sum());

    }

    private static long fib(int n, long[] cash) {
        long result;
        cash[0] = 0;
        cash[1] = 2;

        if (cash[n] != -1)
            return cash[n];
        if (n < 1) {
            return n;
        }

        result = ((4 * fib(n - 1, cash)) + fib(n - 2, cash));
        cash[n] = result;

        return result;
    }
}
