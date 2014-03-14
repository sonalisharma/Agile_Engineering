package edu.berkeley.ischool.aep;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by sonali on 1/24/14.
 */
public class RectangleTest {

    @Test
    /* Attribute or annotation, decorator in python. Override methods*/
    public void  shouldreturnAreaOfTenforTwoByFiveRectangle()
    {
        Rectangle rectangle = new Rectangle(5,2);
        assertEquals(10,rectangle.area());
        assertEquals(12,rectangle.area());
    }
}
