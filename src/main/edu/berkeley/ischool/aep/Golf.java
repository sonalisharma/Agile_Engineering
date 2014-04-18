package edu.berkeley.ischool.aep;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by sonali on 3/21/14.
 */
public class Golf {

    private ArrayList<Integer> inputArray;
    public Golf(Integer[] inputArray) {
        this.inputArray = new ArrayList<Integer>(Arrays.asList(inputArray));
    }

    public int getNumberofGroups()
    {
        int grpcounter = 0;
        int acc = 0;
        int partySize = 0;
        int tempcounter = 0;
        //return inputArray.size();

        Iterator<Integer>  iterator = inputArray.iterator();

        // {3,1,2,4}
        while(iterator.hasNext())
        {
            Integer element = iterator.next();
            Iterator<Integer> it = iterator;
            partySize = element.intValue();
            if(partySize == 4)
            {
                grpcounter++;
                iterator.remove();
            }
            else
            {
                while(acc<=4)
                {
                    acc += it.next().intValue();
                    it.remove();
                }
                grpcounter++;

            }
        }
         return grpcounter++;
    }
}
