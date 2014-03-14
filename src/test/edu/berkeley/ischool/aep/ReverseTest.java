package edu.berkeley.ischool.aep;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by sonali on 3/7/14.
 */
public class ReverseTest {

    @Test
    public void singleCharactereShouldReturnSingleCharactere()
    {
        assertEquals("e",Reverse.reverser("e"));
        //assertEquals("elgnatcer",Reverse.reverser("rectangle"));
    }

    @Test
    public void rectangleShouldReturnelgnatcer()
    {
        assertEquals("elgnatcer",Reverse.reverser("rectangle"));
    }
}
