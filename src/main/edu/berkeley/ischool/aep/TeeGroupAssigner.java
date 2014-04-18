package edu.berkeley.ischool.aep;
import java.util.*;
/**
 * Created by sonali on 3/21/14.
 */
public class TeeGroupAssigner {

    private final List<Integer> parties;

    public TeeGroupAssigner(Integer[] parties)
    {
        this.parties = new ArrayList<Integer>(Arrays.asList(parties));
    }

    public int getNumberofGroups()
    {
        int temp =0;
        int numgrp = 0;
        int space = 0;
        int diff = 4;
        // {3,1,2,4}
        Iterator itr = parties.iterator();

        while (itr.hasNext())
        {
           // if itr.
        }
        for(int i=0; i<parties.size();i++)
        {

            if (parties.get(i) < diff)
            {
                numgrp ++;
                parties.remove(i);
                space = 4 - parties.get(i);
            }


        }

        return 0;
    }



}
