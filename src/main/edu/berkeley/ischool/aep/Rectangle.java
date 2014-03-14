package edu.berkeley.ischool.aep;

/**
 * Created by sonali on 1/24/14.
 * Understands a four-sided figure with sides at right angles
 *
 */
public class Rectangle {
    int width;
    int height;
    public final int angle = 90;
    public final int sides = 4;

    /* Constructor */
    public Rectangle(int width,int height )
    {
        this.width = width;
        this.height = height;
    }
    /* Returns area of the rectangle */
    public int area()
    {
       return this.width*this.height;
    }
    /* Returns perimeter of the rectangle */
    public int perimeter()
    {
        return 2*(this.width+this.height);
    }
    /*Shouldn't reveal width and height
    * Allowing getter people have to know the underlying data structure e.g. int, string */

    public static void main()
    {
        Rectangle r = new Rectangle(10,4);
        System.out.println("Area:"+r.area());
        System.out.println("Perimeter:"+r.perimeter());
    }
}
