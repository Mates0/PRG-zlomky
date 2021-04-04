package cz.educanet;

public class MathUtils {

    /**
     * Calculates the greatest common divisor.
     * https://www.bbc.co.uk/bitesize/guides/z9hb97h/revision/5
     * ie. for 8 and 12 => 4.
     * ie. for 10 and 5 => 5.
     * ect.
     * @param a first number
     * @param b second number
     * @return GCD
     */
    public static int findGreatestCommonDenominator(int a, int b) {
        int x;

        while (b != 0) {
            x = a % b;
            a = b;
            b = x;
        }
        return a;
    }

    /**
     * Calculates the lowest common multiple.
     * https://www.bbc.co.uk/bitesize/guides/z9hb97h/revision/5
     * ie. for 5 and 6 => 30.
     * multiples for 5: 5, 10, 15, 20, 25, *30*, 35...
     * multiples for 6: 6, 12, 18, 24, *30*...
     * @param a first number
     * @param b second number
     * @return GCD
     */
    public static int findLowestCommonMultiple(int a, int b) {
        int max;
        int min;
        int x;
        int lcm = 0;
        if (a > b) {
            max = a;
            min = b;
        } else {
            min = a;
            max = b;
        }
        for (int i = 1; i <= min; i++) {
            x = max*i;
            if (x%min == 0) {
                lcm = x;
                break;
            }
        }
        return lcm;
    }
}
