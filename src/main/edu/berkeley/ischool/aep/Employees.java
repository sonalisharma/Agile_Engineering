package edu.berkeley.ischool.aep;
import java.util.ArrayList;
import java.util.Collection;


/**
 * Created by sonali on 3/21/14.
 */
public class Employees {
    //If you extend arraylist then all the stuff in the arraylist class by default comes floating around in the code
    //things that you didn't not really want to make available to other classes. Encapsulation- makes less
    //stuff to expose.
    private Collection<Employees>  group = new ArrayList<Employees>();
    /*This you are assigning to, make it most abstract, so that later when you want to change the implementation  you do it
    only at one place */

       private void add(Employees employee)
       {
           //Delegation, delegates method on underlying class
           group.add(employee);
       }
}
