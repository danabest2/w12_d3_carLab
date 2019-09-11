package vehicle;

import components.Engine;
import components.Tyres;

public class Electric extends Vehicle {
    public Electric(String colour, double price, String make, Engine engine, Tyres tyres){
        super(colour, price, make, engine, tyres);
    }
}
