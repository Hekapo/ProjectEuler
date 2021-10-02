package smallest_multiple;

import java.math.BigInteger;

/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
public class SmallestMultiple {
    public static void main(String[] args) {

        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;

        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int temp = gcd(arr[i], arr[j]);
                arr[j] = arr[j] / temp;

            }
        }
        BigInteger res = new BigInteger("1");

        for (int j : arr) {
            res = res.multiply(BigInteger.valueOf(j));
        }
        System.out.println(res);

    }

    public static int gcd(int a, int b) {
        return (b == 0) ? a : gcd(b, a % b);

    }

}
