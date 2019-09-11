import sales.Customer;
import sales.Till;
import vehicle.Vehicle;

import java.util.ArrayList;


public class Dealership {
    private ArrayList<Vehicle> vehicleStock;

    public Dealership() {
        this.vehicleStock = new ArrayList<Vehicle>();
    }


    public void addVehicleToStock(Vehicle vehicle) {
        this.vehicleStock.add(vehicle);
    }

    public int getStockCount() {
        return this.vehicleStock.size();
    }

    public void sellCar(Customer customer, Vehicle vehicle, Till till) {
        double price = vehicle.getPrice();
        if (customer.getBudget() >= price) {
            customer.buyCar(vehicle);
            till.add(price);

        }

    }
}


