package test;

import cls.numerosRomanos;
import org.junit.Assert;

import static org.junit.Assert.*;

public class numerosRomanosTest {

    @org.junit.Test
    public void Decimal_1_result_null() throws Exception {
        numerosRomanos numRomano = new numerosRomanos();
        numRomano.obtenDecimalEnRomano(1);
        Assert.assertEquals(null, numRomano.obtenDecimalEnRomano(1));
    }
}