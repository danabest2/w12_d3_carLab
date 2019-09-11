package vehicle;

import components.Engine;
import components.Tyres;

public abstract class Vehicle {
    private String colour;
    private double price;
    private String make;
    private Engine engine;
    private Tyres tyres;

    public Vehicle(String colour, double price, String make, Engine engine, Tyres tyres){
        this.colour = colour;
        this.price = price;
        this.make = make;
        this.engine = engine;
        this.tyres = tyres;
    }

    public String getColour() {
        return colour;
    }

    public double getPrice() {
        return price;
    }

    public String getMake() {
        return make;
    }

    public Engine getEngine() {
        return engine;
    }

    public Tyres getTyres() {
        return tyres;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }
}
