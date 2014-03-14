package edu.berkeley.ischool.aep;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

/**
 * Created by sonali on 2/7/14.
 */
public class RomanNumeralTest {

    @Test
    public void  valid_character_set()
    {
        RomanNumeral rn = new RomanNumeral();
        rn.hm.keySet();
        assertTrue(rn.get_valid_character_set("XXI"));


    }

}
