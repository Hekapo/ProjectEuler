package multiples_of_3_or_5;

import java.util.stream.IntStream;

/*
    If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
    The sum of these multiples is 23.
    Find the sum of all the multiples of 3 or 5 below 1000.
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = IntStream.range(1, 10000).toArray();
        int count = 0;
        for (int j : arr) {
            if (j % 3 == 0 || j % 5 == 0) {
                count += j;

            }

        }
        System.out.println(count);

    }
}
