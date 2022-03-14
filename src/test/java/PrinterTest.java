import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(100, 3, 3, 0, 500);
    }

    @Test
    public void hasPaper(){
        assertEquals(100, printer.hasPaper());
    }

    @Test
    public void print(){
        assertEquals(91, printer.print());
        assertEquals(491, printer.checkToner());
    }

    @Test
    public void emptyStock(){
        Printer lowPrinter = new Printer(5, 3, 3, 0, 500);
        assertEquals(5, lowPrinter.print());
    }
}
