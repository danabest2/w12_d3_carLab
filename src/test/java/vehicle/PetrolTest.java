package vehicle;

import components.Engine;
import components.Tyres;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PetrolTest {

    Petrol petrol;
    Engine engine;
    Tyres tyres;

    @Before
    public void setUp(){
        petrol = new Petrol("red", 15000.00, "BMW", engine, tyres);
    }

    @Test
    public void hasColour(){
        assertEquals("red", petrol.getColour());
    }

    @Test
    public void hasPrice(){
        assertEquals(15000.00, petrol.getPrice(),0.01);
    }

    @Test
    public void hasMake(){
        assertEquals("BMW", petrol.getMake());
    }

    @Test
    public void hasEngine(){
        assertEquals(engine, petrol.getEngine());
    }

    @Test
    public void hasTyres(){
        assertEquals(tyres, petrol.getTyres());
    }

    @Test
    public void checkRentalPrice(){
        assertEquals(150.00, petrol.rentalPrice(petrol), 0.01);
    }

}
