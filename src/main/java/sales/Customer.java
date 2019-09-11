package sales;

import vehicle.Vehicle;

public class Customer {

    private double budget;

    public Customer(double budget){
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    public double buyCar(Vehicle vehicle){
        return this.budget = getBudget() - vehicle.getPrice();
    }
}
