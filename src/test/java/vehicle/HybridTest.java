package vehicle;

import components.Engine;
import components.Tyres;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HybridTest {

    Hybrid hybrid;
    Engine engine;
    Tyres tyres;

    @Before
    public void setUp(){
        hybrid = new Hybrid("red", 15000.00, "BMW", engine, tyres);
    }

    @Test
    public void hasColour(){
        assertEquals("red", hybrid.getColour());
    }

    @Test
    public void hasPrice(){
        assertEquals(15000.00, hybrid.getPrice(),0.01);
    }

    @Test
    public void hasMake(){
        assertEquals("BMW", hybrid.getMake());
    }

    @Test
    public void hasEngine(){
        assertEquals(engine, hybrid.getEngine());
    }

    @Test
    public void hasTyres(){
        assertEquals(tyres, hybrid.getTyres());
    }

}
