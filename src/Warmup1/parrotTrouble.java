package Warmup1;

/**
 * Created by aponte on 9/17/16.
 *
 We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23. We are in trouble
 if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.
 *
 */
public class parrotTrouble {

    public boolean parrotTrouble(boolean talking, int hour) {

        if (talking && ((hour > 20 || hour < 7)))
        {
            return true;
        }
        else
        {
            return false;
        }

    }

}
