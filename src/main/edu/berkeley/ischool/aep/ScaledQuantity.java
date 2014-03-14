package edu.berkeley.ischool.aep;
import java.util.ArrayList;

/**
 * Created by Sonali on 2/14/14.
 */

// ScaledQuantity understands unit equivalence.
public class ScaledQuantity  {
    //private final double value;
    //private Unit unit;
    protected final double value;
    protected Unit unit;

    public ScaledQuantity(Unit unit, double value)
    {
        this.value=value;
        this.unit = unit;
    }

    @Override
    public String toString()
    {
        return value+ " "+unit;
    }

    @Override
    public boolean equals(Object other)
    {
        if (other == this) return true;
        if (!(other instanceof ScaledQuantity)) return false;
        ScaledQuantity otherScaledQuantity = (ScaledQuantity)other;
        double Othervalue =  otherScaledQuantity.unit.convertTo(otherScaledQuantity.value, this.unit);
        return this.value == Othervalue;
    }

    @Override
    public int hashCode(){
        // you can give any value here
        return 42;
    }

    public boolean isCompatible(ScaledQuantity other)
    {
        if(!this.unit.isConvertible(other.unit))
        {
            return false;
        }
        else
        {
            return true;
        }

    }


    public ScaledQuantity better(ScaledQuantity other)
    {
        if(!this.unit.isConvertible(other.unit))
        {
            throw new RuntimeException("Oops wrong units!!");
        }
        else
        {
            if (other.value < this.unit.convertTo(this.value,other.unit))
            {
                return this;
            }
            else
            {
                return other;
            }
        }
    }
    //public abstract ScaledQuantity add(ScaledQuantity other);

    public ScaledQuantity add(ScaledQuantity other)
    { // 2inch.add(2 inch)
            if(!this.unit.isConvertible(other.unit))
            {
                throw new RuntimeException("Oops wrong units!!");
            }
            else
            {
                double result = this.value + other.unit.convertTo(other.value,this.unit);
                return (new ScaledQuantity(this.unit, result));
            }

    }

    /*
    @Override
    public static ScaledQuantity betterThan( ScaledQuantity arr)
    {
        int n = arr.size();
        for (int i =0;i<arr.size();i++)
        {
            for(int j=i+1; j<=n-1;j++)
            {
                if (arr.get(i).better((arr.get(j))) == arr.get(i))
                {
                    ScaledQuantity temp = arr.get(i);
                    arr.set(i,arr.get(j));
                    arr.set(j,temp);
                }
            }
        }
        return arr.get(arr.size()-1);
    }
*/



}

