package edu.berkeley.ischool.aep;

/**
 * Created by sonali on 3/7/14.
 */
public class Reverse {
    private String str;

    public Reverse(String str) {
        this.str=str;


    }

    public static String reverser(String str)
    {
        if(str.length()==1)
            return str;

        return reverser(str.substring(1))+str.charAt(0);

    }
}
