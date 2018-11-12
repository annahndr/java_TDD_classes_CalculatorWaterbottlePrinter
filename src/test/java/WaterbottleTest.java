import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterbottleTest {

    Waterbottle waterbottle;

    @Before
    public void before(){
        waterbottle = new Waterbottle(100);
    }

    @Test
    public void takesDrink(){
        assertEquals(90, waterbottle.drink());
    }

    @Test
    public void emptyBottle(){
        assertEquals(0, waterbottle.empty());
    }

    @Test
    public void fillBottle(){
        assertEquals(100, waterbottle.fill());
    }

    }

