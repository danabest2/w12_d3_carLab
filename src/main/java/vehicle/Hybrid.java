package vehicle;

import components.Engine;
import components.Tyres;

public class Hybrid extends Vehicle{
    public Hybrid(String colour, double price, String make, Engine engine, Tyres tyres){
        super(colour, price, make, engine, tyres);
    }
}
