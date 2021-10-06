package summation_of_primes;

/**
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * <p>
 * Find the sum of all the primes below two million.
 */
public class SummationOfPrimes {
    public static void main(String[] args) {
        long l = 2000000;
        long sum = 0;
        boolean[] pr = new boolean[(int) l + 1];

        for (int p = 2; p <= l; p++) pr[p] = true;
        for (int p = 2; p <= l; p++) {
            if (pr[p]) {
                sum += p;
                for (int j = 2 * p; j <= l; j += p)
                    pr[j] = false;

            }
        }
        System.out.println(sum);
    }


}
