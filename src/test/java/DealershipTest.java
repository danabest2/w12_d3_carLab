import components.Engine;
import components.Tyres;
import org.junit.Before;
import org.junit.Test;
import sales.Customer;
import sales.Till;
import vehicle.Electric;
import vehicle.Hybrid;
import vehicle.Petrol;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Petrol petrol;
    Hybrid hybrid;
    Electric electric;
    Dealership dealership;
    Engine engine;
    Tyres tyres;
    Customer customer1;
    Customer customer2;
    Till till;

    @Before
    public void setUp() {
        engine = new Engine(100);
        tyres = new Tyres(4);
        petrol = new Petrol("Blue", 10000.00, "Ford", engine, tyres);
        dealership = new Dealership();
        customer1 = new Customer(20000.00);
        customer2 = new Customer(5000.00);
        till = new Till(10000.00);
    }


    @Test
    public void canAddToStock() {
        dealership.addVehicleToStock(petrol);
        assertEquals(1, dealership.getStockCount());
    }

    @Test
    public void stockCountStartsAtZero(){
        assertEquals(0, dealership.getStockCount());
    }

    @Test
    public void customerCanBuyCar(){
        dealership.sellCar(customer1, petrol, till);
        assertEquals(20000.00, till.getBalance(), 0.01);

    }

    @Test
    public void canSellCar(){
        dealership.addVehicleToStock(petrol);
        dealership.sellCar(customer1, petrol, till);
        assertEquals(10000.00, customer1.getBudget(), 0.01);
        assertEquals(20000.00, till.getBalance(), 0.01);
    }

    @Test
    public void cannot__sellCar(){
        dealership.addVehicleToStock(petrol);
        dealership.sellCar(customer2, petrol, till);
        assertEquals(5000, customer2.getBudget(), 0.01);
        assertEquals(10000.00, till.getBalance(), 0.01);
    }

}