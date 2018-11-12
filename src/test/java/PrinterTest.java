import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(4,20);
    }

    @Test
    public void printerCanPrint(){
        assertEquals(2, printer.print(1, 2));

    }

    @Test
    public void printerHasNoPaper(){
        assertEquals(4, printer.print(4, 3));
    }

    @Test
    public void refillPaper(){
        assertEquals(14, printer.refill(10));
    }

    @Test
    public void canAdjustToner(){
        printer.print(5, 2);
        assertEquals(10, printer.getToner()); // unable to reduce toner levels

    }

}

