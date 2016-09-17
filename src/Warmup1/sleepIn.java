package Warmup1;

/**
 * Created by aponte on 9/17/16.
 *
 The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
 We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
 */
public class sleepIn {

    public boolean sleepIn(boolean weekday, boolean vacation) {

        sleepIn(false, false);
        //sleepIn(true, false) ;
      //  sleepIn(false, true);

        if (!weekday || vacation)
  {
      System.out.println(" Is sleeping time");

      return true;

  }

  else {
            System.out.println(" Wakeup");
            return false;


  }
    }
/*
    public static void main (String [] args)
    {
        System.out.println(sleepIn(false, false));
    }
*/
}


