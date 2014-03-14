package edu.berkeley.ischool.aep;

import java.util.ArrayList;

/**
 * Created by sonali on 3/6/14.
 */
public class Sorting {

public void bubbleSort( ArrayList<ScaledQuantity> arr)
{
    int n = arr.size();
    boolean flag= false;
    for (int i =0;i<arr.size();i++)
    {   flag=true;
        for(int j=i+1; j<=n-1;j++)
        {
            if (arr.get(i).better((arr.get(j))) == arr.get(i))
            {
                ScaledQuantity temp = arr.get(i);
                arr.set(i,arr.get(j));
                arr.set(j,temp);
                flag = true;
            }
        }
    }
    System.out.println(arr);
}


  public static void main(String args[])

  {
      Sorting s = new Sorting();
      ArrayList<ScaledQuantity> quantities =  new ArrayList<ScaledQuantity>();
      quantities.add(new ScaledQuantity(Unit.INCHES,10));
      quantities.add(new ScaledQuantity(Unit.FEET,10));
      quantities.add(new ScaledQuantity(Unit.MILES,10));
      quantities.add(new ScaledQuantity(Unit.YARD,10));
      quantities.add(new ScaledQuantity(Unit.INCHES,20));
      s.bubbleSort(quantities);

  }
}
