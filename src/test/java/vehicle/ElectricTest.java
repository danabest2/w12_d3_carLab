package vehicle;

import components.Engine;
import components.Tyres;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectricTest {
    Electric electric;
    Engine engine;
    Tyres tyres;


    @Before
    public void setUp(){
        electric = new Electric("red", 15000.00, "BMW", engine, tyres);
    }

    @Test
    public void hasColour(){
        assertEquals("red", electric.getColour());
    }

    @Test
    public void hasPrice(){
        assertEquals(15000.00, electric.getPrice(),0.01);
    }

    @Test
    public void hasMake(){
        assertEquals("BMW", electric.getMake());
    }

    @Test
    public void hasEngine(){
        assertEquals(engine, electric.getEngine());
    }

    @Test
    public void hasTyres(){
        assertEquals(tyres, electric.getTyres());
    }
}
