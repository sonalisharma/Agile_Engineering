package edu.berkeley.ischool.aep;

import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.*;
/**
 * Created by sonali on 3/21/14.
 */
public class GolfTest {


    @Test
    public void ShouldReturnNumberOfGroupsAs3()
    {
        Integer[] inputArray ={4,3,2,1};
        assertEquals(3,new Golf(inputArray).getNumberofGroups());
    }

    @Test
    public void shouldReturnNumberofGroupsAsOne()
    {
        Integer[] inputArray = {3};
        assertEquals(1,new Golf(inputArray).getNumberofGroups());
    }


}
