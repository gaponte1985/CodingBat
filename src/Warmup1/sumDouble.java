package Warmup1;

/**
 * Created by aponte on 9/17/16.
 * Given two int values, return their sum. Unless the two values are the same, then return double their sum.
 *
 */
public class sumDouble {
    public int sumDouble(int a, int b) {

        int sumDouble;
        if ( a == b)
        {
            sumDouble = 2 * (a+b);
            return sumDouble;
        }
        else
        {
            sumDouble = a+b;
            return sumDouble;
        }

    }

}
