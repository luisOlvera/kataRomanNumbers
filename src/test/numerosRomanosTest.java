package test;

import cls.numerosRomanos;
import org.junit.Assert;

import static org.junit.Assert.*;

public class numerosRomanosTest {

    @org.junit.Test
    public void testObtenDecimalEnRomano() throws Exception {
        numerosRomanos numRomano = new numerosRomanos();
        numRomano.obtenDecimalEnRomano(1);
        Assert.assertEquals(null, numRomano.obtenDecimalEnRomano(1));
    }
}