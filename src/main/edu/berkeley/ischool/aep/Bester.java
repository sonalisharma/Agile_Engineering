package edu.berkeley.ischool.aep;

/**
 * Created by sonali on 3/7/14.
 */
public class Bester {

    private final ScaledQuantity[] thingsToCompare;

    public Bester(ScaledQuantity... thingsToCompare)
    {
        if(thingsToCompare ==null) throw new NullPointerException();
        this.thingsToCompare = thingsToCompare;
    }



    public ScaledQuantity best()
    {
        ScaledQuantity max = thingsToCompare[0];
        for (int i =1; i<thingsToCompare.length-1; i++)
        {
            if (max != thingsToCompare[i].better(max))
            {
                max = thingsToCompare[i];
            }
        }
        return max;
        //Write code to compare
    }

}
