package edu.berkeley.ischool.aep;
import java.util.*;
/**
 * Created by sonali on 2/7/14.
 */
public class RomanNumeral {

    HashMap<Character,Integer> hm;


    public RomanNumeral()
    {
        hm = new HashMap<Character,Integer>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
    }
    public int convert_to_integer(String s)
    {

        int calculation = 0;
        char[] ch = s.toCharArray();
        System.out.println(ch);

        for (int i=0 ;i<s.length(); i++)
        {
            // need to put put check for cases when I is before V, in this case we subtract
             calculation = calculation + hm.get(ch[i]);

        }
        return calculation;
    }

    // This is the method to test all characters should be valid roman numerals
    public boolean get_valid_character_set(String s)
    {

        char[] ch = s.toUpperCase().toCharArray();
        boolean flag = true;
        for (int i=0 ;i<ch.length; i++)
        {
            if (hm.get(ch[i])==null)
            {
                flag = false;
            }
        }
        return flag;
    }

    //This method tests that the input
    public static void main(String args[])
    {
        RomanNumeral rn = new RomanNumeral();
        System.out.println(rn.convert_to_integer("IX"));

    }
}
