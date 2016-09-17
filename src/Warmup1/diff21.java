package Warmup1;

/**
 * Created by aponte on 9/17/16.
 *
 Given an int n, return the absolute difference between n and 21,
 except return double the absolute difference if n is over 21
 */
public class diff21 {

    public int diff21(int n) {

        int diff21;
        if ( n >21)
        {
            diff21 = 2 * (n-21);
            return diff21;
        }
        else
        {
            diff21 = 21 - n;
            return diff21;

        }
    }
}
