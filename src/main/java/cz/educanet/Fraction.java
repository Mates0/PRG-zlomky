package cz.educanet;

public class Fraction {

    private final int numerator;
    private final int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    //region: basic operations (+, -, *, /)
    /**
     * Adds the fraction to the other fraction. Returns a new fraction.
     * @param other
     * @return new fraction
     */
    public Fraction plus(Fraction other) {
        int num1 = numerator;
        int num2 = denominator;
        int numother1 = other.getNumerator();
        int numother2 = other.getDenominator();
        int num3;
        int num4;
        int numfinal;
        int lcm = MathUtils.findLowestCommonMultiple(num2, numother2);
        num3 = (lcm / num2) * num1;
        num4 = (lcm / numother2) * numother1;
        numfinal = num3 + num4;
        return new Fraction(numfinal, lcm);
    }

    /**
     * Subtracts other from the fraction. Returns a new fraction.
     * @param other
     * @return new fraction
     */
    public Fraction minus(Fraction other) {
        int num1 = numerator;
        int num2 = denominator;
        int numother1 = other.getNumerator();
        int numother2 = other.getDenominator();
        int num3;
        int num4;
        int numfinal;
        int lcm = MathUtils.findLowestCommonMultiple(num2, numother2);
        num3 = (lcm / num2) * num1;
        num4 = (lcm / numother2) * numother1;
        numfinal = num3 - num4;
        return new Fraction(numfinal, lcm);
    }

    /**
     * Multiplies the two fractions. Returns a new fraction.
     * @param other
     * @return new fraction
     */
    public Fraction times(Fraction other) {
        int num1 = numerator * other.getNumerator();
        int num2 = denominator * other.getDenominator();
        return new Fraction(num1,num2);
    }

    /**
     * Divides the two fractions (this / other). Returns a new fraction.
     * @param other
     * @return new fraction
     */
    public Fraction dividedBy(Fraction other) {
        int num1 = numerator;
        int num2 = denominator;
        int numother1 = other.getDenominator();
        int numother2 = other.getNumerator();

        int newfraction1 = num1 * numother1;
        int newfraction2 = num2 * numother2;

        return new Fraction(newfraction1,newfraction2);
    }
    //endregion

    //region: other operations
    /**
     * Gets the reciprocal (flipped) of the fraction. ie. reciprocal of 1/2 is 2/1
     * @return new fraction
     */
    public Fraction getReciprocal() {
        int num1 = denominator;
        int num2 = numerator;
        return new Fraction(num1,num2);
    }

    /**
     * Simplifies the fraction
     * @return new fraction
     */
    public Fraction simplify() {
        int num1 = numerator;
        int num2 = denominator;
        if (num1 % 2 == 0 && num2 % 2 == 0) {
            num1 = num1 / 2;
            num2 = num2 / 2;
        }
        return new Fraction(num1, num2);
    }

    /**
     * Calculates the floating value of the fraction.
     * @return float
     */
    public float toFloat() {
        return (float)numerator / (float)denominator;
    }
    //endregion

    //region: getters
    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }
    //endregion
}
