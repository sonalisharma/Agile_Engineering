package edu.berkeley.ischool.aep;

/**
 * Created by sonali on 1/31/14.
 * Understands the probability on an event occuring
 */
public class Chance {

    private final double probability;
    private final double notprobability;



    public Chance(double probability)
    {
        this.probability = probability;
        this.notprobability = (double)(1 - probability);
    }

    public double not()
    {
        return (double)this.notprobability;
    }
    @Override
    public boolean equals(Object c)
    {
        //return (this.probability == ((Chance) c).probability);
        // comparing memory reference
        if (c == this) return true;
        if (!(c instanceof Chance)) return false;
        return (this.probability == ((Chance) c).probability);
        // Guard class, if pre condition are not met then return soemthing
    }

    @Override
    public int hashCode(){
        // you can give any value here
        // return 42;
        long longBits = Double.doubleToLongBits(probability);
        return (int) (longBits ^ (longBits >>> 32));

    }


    public Chance and(Chance chance) {
        return new Chance(this.probability*chance.probability);
    }
}
