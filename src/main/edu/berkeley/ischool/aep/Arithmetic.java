package edu.berkeley.ischool.aep;

/**
 * Created by sonali on 2/21/14.
 */
public class Arithmetic extends ScaledQuantity {

    public Arithmetic(Unit unit,double value)
    {
       super(unit,value);

    }

    public ScaledQuantity add(ScaledQuantity other)
    { // 2inch.add(2 inch)
        if(!this.unit.isConvertible(other.unit))
        {
            throw new RuntimeException("Oops wrong units!!");
        }
        else
        {
            double result = this.value + other.unit.convertTo(other.value,this.unit);
            return (new Arithmetic(this.unit, result));
        }

    }
}
