package edu.berkeley.ischool.aep;
import org.junit.Test;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;
import java.util.*;


/**
 * Created by sonali on 1/31/14.
 */
public class ChanceTest {

    @Test
    public void  oneChanceShouldNotBeEqualToAnother()
    {
        Chance chance = new Chance(0.5);
        Chance coinToss = new Chance(0.5);
        Chance dieThrow = new Chance((double)1/6);
        assertEquals(coinToss,coinToss);
        //To make this pass, override the equals method
        assertFalse(dieThrow.equals(coinToss));

        assertFalse(dieThrow.equals(new Boolean(false)));

        assertTrue(chance.equals(coinToss));

        /* The equals method was not overriding */
        assertEquals(new Chance(0.5), coinToss);

        assertEquals((double)5/6,dieThrow.not());




    }

    @Test
    public void probabilityOfOneAndOneShouldBeOne() {
        assertEquals(new Chance(0.25), new Chance(0.5).and(new Chance(0.5)));
    }

    @Test
    public void equalsShouldWorkAccordingToContract(){
        Chance coinToss = new Chance(0.5);
        Chance dieThrow = new Chance(1/6);
        assertFalse(dieThrow.equals(null));
        assertFalse(dieThrow.equals(coinToss));
        Map<Chance, String> map =  new HashMap<Chance,String>();

        map.put(new Chance(0.5), "Coin Toss");
        // reason why you should also override hashcode also while overriding equals
        assertEquals("Coin Toss", map.get(new Chance(0.5)));
    }

    @Test
    public void SeventyPercentIsBetterThanThirtyPercent()
    {
        ArrayList<Chance> chanceList = new ArrayList<Chance>();

        chanceList.add(new Chance(.70));
        chanceList.add(new Chance(.30));


        //Bester bestObj = new Bester(chanceList.toArray());
        //bestObj.best();
    }

    }

