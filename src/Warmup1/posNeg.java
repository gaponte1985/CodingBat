package Warmup1;

/**
 * Created by aponte on 9/17/16.
 * Given 2 int values, return true if one is negative and one is positive.
 * Except if the parameter "negative" is true, then return true only if both are negative.
 *
 */
public class posNeg {

    public boolean posNeg(int a, int b, boolean negative) {
        if (negative) {
            return (a < 0 && b < 0);
        }
        else {
            return ((a < 0 && b > 0) || (a > 0 && b < 0));
        }
    }

}