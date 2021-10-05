package pythagorean_triplet;

/**
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 * <p>
 * a^2 + b^2 = c^2
 * For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
 * <p>
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 */
public class SpecialPythagoreanTriplet {
    public static void main(String[] args) {
        int a;
        int sum = 1000;

        for (a = 1; a <= sum / 3; a++) {
            int b;
            for (b = a + 1; b <= sum / 2; b++) {
                int c = sum - a - b;
                if (a * a + b * b == c * c) {
                    System.out.println(a * b * c);

                }

            }

        }


    }
}
