package sum_square_difference;

import java.util.stream.IntStream;

/**
 * The sum of the squares of the first ten natural numbers is, 1^2 + 2^2 + ... + 10^2 = 385
 * The square of the sum of the first ten natural numbers is, (1 + 2 + ... + 10)^2 = 55^2 = 3025
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is
 * 3025 − 385 = 2640.
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */
public class SumSquareDifference {
    public static void main(String[] args) {
        int sumOfSquares = IntStream.rangeClosed(1, 100).map(operand -> operand * operand).sum();

        int sum = IntStream.rangeClosed(1, 100).sum();
        int squareOfSum = sum * sum;

        System.out.println(squareOfSum- sumOfSquares);

    }
}
