package vehicle;

import components.Engine;
import components.Tyres;
import behaviours.IRent;

public class Petrol extends Vehicle implements IRent{

    public Petrol(String colour, double price, String make, Engine engine, Tyres tyres){
        super(colour, price, make, engine, tyres);
    }

    public double rentalPrice(Vehicle vehicle){
        return getPrice() * 0.01;
    }

}
