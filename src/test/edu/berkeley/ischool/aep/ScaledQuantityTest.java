package edu.berkeley.ischool.aep;

import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;


/**
 * Created by sonali on 2/14/14.
 */
public class ScaledQuantityTest{


   /* @Test
    public void testConvertFeetToYard()
    {
        assertEquals(new ScaledQuantity(Unit.YARD, 1.0), new ScaledQuantity(Unit.FEET,3.0));
    }*/

    @Test
    public void testThousandSomethingYardsEqualToOneMile()
    {
        assertEquals(new ScaledQuantity(Unit.YARD, 1760), new ScaledQuantity(Unit.MILES,1.0));
    }

    @Test
    public void testOneOunceEqualsTwoTablespoons()
    {
        assertEquals(new ScaledQuantity(Unit.OZ, 1), new ScaledQuantity(Unit.TBSP,2.0));
    }

    @Test
    public void testOneTbspEqualsThreeTablespoons()
    {
        assertEquals(new ScaledQuantity(Unit.TBSP, 1), new ScaledQuantity(Unit.TSP,3.0));
    }

    @Test
      public void testEightOunceEqualsOneCup()
    {
        assertEquals(new ScaledQuantity(Unit.OZ, 8), new ScaledQuantity(Unit.CUP,1.0));
    }

    @Test
    public void twoInchPlusTwoInchesEqualsFourInches()
    {
        assertEquals(new ScaledQuantity(Unit.INCHES, 4), new ScaledQuantity(Unit.INCHES, 2.0).add(new ScaledQuantity(Unit.INCHES,2.0)));
    }

    @Test
    public void twoTbspPlusOneOunceEquals12Tsp()
    {
        assertEquals(new ScaledQuantity(Unit.TSP, 12), new ScaledQuantity(Unit.TBSP, 2).add(new ScaledQuantity(Unit.OZ,1.0)));
    }


   /* @Test
    //Here the class should have a check mechanism because we are adding ounce with inch
    public void twoInchesPlus8OunceEquals12Tsp()
    {
        assertEquals(new ScaledQuantity(Unit.TSP, 12), new ScaledQuantity(Unit.TBSP, 2).add(new ScaledQuantity(Unit.OZ,1.0)));
    }*/

    @Test(expected = RuntimeException.class)
    public void twoOzOneFootShouldThrowException()
    {
        assertEquals( new ScaledQuantity(Unit.FEET, 1),new ScaledQuantity(Unit.FEET, 1).add(new ScaledQuantity(Unit.OZ, 2)));
    }

    @Test
    public void test100CelsiusEquals212Fahrenheit()
    {
        assertEquals(new ScaledQuantity(Unit.CELSIUS, 100), new ScaledQuantity(Unit.FAHRENHEIT,212.0));
    }

    @Test
    public void test0CelsiusEquals32Fahrenheit()
    {
        assertEquals(new ScaledQuantity(Unit.CELSIUS, 0), new ScaledQuantity(Unit.FAHRENHEIT,32.0));
    }

    @Test
    public void testConvertFeetToYard()
    {
        assertEquals(new Arithmetic(Unit.YARD, 1.0), new Arithmetic(Unit.FEET,3.0));
    }

    @Test
    //Here the class should have a check mechanism because we are adding ounce with inch
    public void twoInchesPlus8OunceEquals12Tsp()
    {
        assertEquals(new Arithmetic(Unit.TSP, 12), new Arithmetic(Unit.TBSP, 2).add(new Arithmetic(Unit.OZ,1.0)));
    }

    @Test
    public void ninetyFahrenheitIsBetterThan0Celsius()
    {
        assertEquals(new ScaledQuantity(Unit.FAHRENHEIT, 80.0), new ScaledQuantity(Unit.FAHRENHEIT, 20.0).better(new ScaledQuantity(Unit.FAHRENHEIT,100.0)));
    }


    @Test
    public void TenMilesBestQuantity()
    {
        ScaledQuantity[] quantities =  {
        new ScaledQuantity(Unit.INCHES,10),
        new ScaledQuantity(Unit.FEET,10),
        new ScaledQuantity(Unit.MILES,10),
        new ScaledQuantity(Unit.YARD,10),
        new ScaledQuantity(Unit.INCHES,20)};

        Bester bestQuantity = new Bester(quantities);



        assertEquals(new ScaledQuantity(Unit.MILES,10),bestQuantity.best() );
    }


}
