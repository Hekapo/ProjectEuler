package largest_palindrome_product;

/*
 * A palindromic number reads the same both ways.
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 * */
public class LargestPalindromeProduct {
    public static void main(String[] args) {
        int max = 0;
        for (int i = 100; i < 1000; i++) {
            for (int j = 100; j < 1000; j++) {
                int ml = i * j;

                if (isPalindrome(ml) && ml > 10000) {
                    if (max < ml) {
                        max = ml;

                    }

                }

            }

        }
        System.out.println(max);

    }

    private static boolean isPalindrome(int num) {
        String number = String.valueOf(num);
        String clean = number.replaceAll("\\s+", "").toLowerCase();
        StringBuilder plain = new StringBuilder(clean);
        StringBuilder reverse = plain.reverse();
        return (reverse.toString()).equals(clean);
    }

}
